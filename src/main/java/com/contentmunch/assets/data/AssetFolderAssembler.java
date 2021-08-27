package com.contentmunch.assets.data;

import com.contentmunch.assets.controller.AssetFolderController;
import com.contentmunch.assets.data.drive.DriveFolder;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class AssetFolderAssembler extends RepresentationModelAssemblerSupport<DriveFolder, AssetFolder> {
    public AssetFolderAssembler() {
        super(AssetFolderController.class, AssetFolder.class);
    }

    @Override
    public AssetFolder toModel(DriveFolder driveFolder) {
        AssetFolder assetFolder = createModelWithId(driveFolder.getId(), driveFolder);
        assetFolder.setId(driveFolder.getId());
        assetFolder.setName(driveFolder.getName());
        return assetFolder;
    }
}
