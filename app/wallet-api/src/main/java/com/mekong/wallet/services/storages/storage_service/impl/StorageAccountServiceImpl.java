package com.mekong.wallet.services.storages.storage_service.impl;

import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import com.mekong.wallet.infrastructure.persistence.AccountRepository;
import com.mekong.wallet.services.storages.storage_service.StorageAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class StorageAccountServiceImpl implements StorageAccountService {

    private final AccountRepository accountRepository;
}
