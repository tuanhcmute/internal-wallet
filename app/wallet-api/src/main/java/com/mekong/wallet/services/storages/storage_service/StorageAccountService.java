package com.mekong.wallet.services.storages.storage_service;

import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageAccountService implements IStorageService<DomainAccountModel> {
    @Override
    public DomainAccountModel create(DomainAccountModel storageModel) {
        return null;
    }

    @Override
    public List<DomainAccountModel> bulkCreate(List<DomainAccountModel> storageModel) {
        return List.of();
    }

    @Override
    public DomainAccountModel retrieve(String attribute) {
        return null;
    }

    @Override
    public List<DomainAccountModel> retrieveAll() {
        return List.of();
    }

    @Override
    public DomainAccountModel update(String attribute, DomainAccountModel storageModel) {
        return null;
    }

    @Override
    public DomainAccountModel delete(String attribute) {
        return null;
    }
}
