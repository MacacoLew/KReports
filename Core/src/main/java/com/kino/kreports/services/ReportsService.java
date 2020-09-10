package com.kino.kreports.services;

import com.kino.kore.utils.service.Service;
import com.kino.kore.utils.storage.Storage;
import com.kino.kreports.storage.reports.Report;
import team.unnamed.inject.Inject;

import java.util.UUID;

public class ReportsService implements Service {

    @Inject
    private Storage<UUID, Report> reportStorage;

    @Override
    public void start() {
        reportStorage.loadAll();
    }

    @Override
    public void stop() {
        reportStorage.saveAll();
    }
}