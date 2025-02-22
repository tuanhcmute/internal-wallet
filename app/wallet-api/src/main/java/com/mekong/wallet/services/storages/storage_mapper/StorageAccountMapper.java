package com.mekong.wallet.services.storages.storage_mapper;

import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import com.mekong.wallet.services.storages.storage_model.StorageAccountModel;

public class StorageAccountMapper implements IStorageMapper<StorageAccountModel, DomainAccountModel> {
    @Override
    public DomainAccountModel toDomain(StorageAccountModel dataModel) {
        return null;
    }

    @Override
    public StorageAccountModel toStorage(DomainAccountModel domainModel) {
        return null;
    }
}
