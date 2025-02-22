package com.mekong.wallet.domains.controllers;

import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import com.mekong.wallet.services.storages.storage_service.StorageAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Component
public class AccountController implements IController<DomainAccountModel> {
    private final StorageAccountService storageAccountService;

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
