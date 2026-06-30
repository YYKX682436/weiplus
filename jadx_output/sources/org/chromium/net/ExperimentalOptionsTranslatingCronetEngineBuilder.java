package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class ExperimentalOptionsTranslatingCronetEngineBuilder extends org.chromium.net.ICronetEngineBuilder {
    private static final java.util.Set<java.lang.Integer> SUPPORTED_OPTIONS = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(1, 2, 3)));
    private final org.chromium.net.ICronetEngineBuilder mDelegate;
    private final java.util.List<org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch> mExperimentalOptionsPatches = new java.util.ArrayList();
    private org.json.JSONObject mParsedExperimentalOptions;

    @java.lang.FunctionalInterface
    /* loaded from: classes16.dex */
    public interface ExperimentalOptionsPatch {
        void applyTo(org.json.JSONObject jSONObject);
    }

    public ExperimentalOptionsTranslatingCronetEngineBuilder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
        this.mDelegate = iCronetEngineBuilder;
    }

    private static org.json.JSONObject createDefaultIfAbsent(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(str, optJSONObject);
            } catch (org.json.JSONException e17) {
                throw new java.lang.IllegalArgumentException("Failed adding a default object for key [" + str + "]", e17);
            }
        }
        return optJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setConnectionMigrationOptions$2(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions, org.json.JSONObject jSONObject) {
        org.json.JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
        if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
            createDefaultIfAbsent.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
        }
        if (connectionMigrationOptions.getAllowServerMigration() != null) {
            createDefaultIfAbsent.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
        }
        if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
            createDefaultIfAbsent.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
        }
        if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
            createDefaultIfAbsent.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
        }
        if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
            createDefaultIfAbsent.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
        }
        if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
            createDefaultIfAbsent.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
        }
        if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
            createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
            createDefaultIfAbsent.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
            boolean booleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
            boolean z17 = false;
            if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                boolean booleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                if (!booleanValue && booleanValue2) {
                    throw new java.lang.IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                if (booleanValue && booleanValue2) {
                    z17 = true;
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", true);
                } else {
                    createDefaultIfAbsent.put("migrate_sessions_early_v2", false);
                }
            }
            if (z17) {
                return;
            }
            createDefaultIfAbsent.put("allow_port_migration", booleanValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDnsOptions$1(org.chromium.net.DnsOptions dnsOptions, org.json.JSONObject jSONObject) {
        org.json.JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "AsyncDNS");
        if (dnsOptions.getUseBuiltInDnsResolver() != null) {
            createDefaultIfAbsent.put("enable", dnsOptions.getUseBuiltInDnsResolver());
        }
        org.json.JSONObject createDefaultIfAbsent2 = createDefaultIfAbsent(jSONObject, "StaleDNS");
        if (dnsOptions.getEnableStaleDns() != null) {
            createDefaultIfAbsent2.put("enable", dnsOptions.getEnableStaleDns());
        }
        if (dnsOptions.getPersistHostCache() != null) {
            createDefaultIfAbsent2.put("persist_to_disk", dnsOptions.getPersistHostCache());
        }
        if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
            createDefaultIfAbsent2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
        }
        if (dnsOptions.getStaleDnsOptions() != null) {
            org.chromium.net.DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
            if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                createDefaultIfAbsent2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
            }
            if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                createDefaultIfAbsent2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
            }
            if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                createDefaultIfAbsent2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
            }
            if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                createDefaultIfAbsent2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
            }
        }
        org.json.JSONObject createDefaultIfAbsent3 = createDefaultIfAbsent(jSONObject, "QUIC");
        if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
            createDefaultIfAbsent3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setQuicOptions$0(org.chromium.net.QuicOptions quicOptions, org.json.JSONObject jSONObject) {
        org.json.JSONObject createDefaultIfAbsent = createDefaultIfAbsent(jSONObject, "QUIC");
        if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
            java.util.Set<java.lang.String> quicHostAllowlist = quicOptions.getQuicHostAllowlist();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator<T> it = quicHostAllowlist.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb6.append((java.lang.CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb6.append((java.lang.CharSequence) ",");
                    }
                }
            }
            createDefaultIfAbsent.put("host_whitelist", sb6.toString());
        }
        if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
            java.util.Set<java.lang.String> enabledQuicVersions = quicOptions.getEnabledQuicVersions();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.util.Iterator<T> it6 = enabledQuicVersions.iterator();
            if (it6.hasNext()) {
                while (true) {
                    sb7.append((java.lang.CharSequence) it6.next());
                    if (!it6.hasNext()) {
                        break;
                    } else {
                        sb7.append((java.lang.CharSequence) ",");
                    }
                }
            }
            createDefaultIfAbsent.put("quic_version", sb7.toString());
        }
        if (!quicOptions.getConnectionOptions().isEmpty()) {
            java.util.Set<java.lang.String> connectionOptions = quicOptions.getConnectionOptions();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            java.util.Iterator<T> it7 = connectionOptions.iterator();
            if (it7.hasNext()) {
                while (true) {
                    sb8.append((java.lang.CharSequence) it7.next());
                    if (!it7.hasNext()) {
                        break;
                    } else {
                        sb8.append((java.lang.CharSequence) ",");
                    }
                }
            }
            createDefaultIfAbsent.put("connection_options", sb8.toString());
        }
        if (!quicOptions.getClientConnectionOptions().isEmpty()) {
            java.util.Set<java.lang.String> clientConnectionOptions = quicOptions.getClientConnectionOptions();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            java.util.Iterator<T> it8 = clientConnectionOptions.iterator();
            if (it8.hasNext()) {
                while (true) {
                    sb9.append((java.lang.CharSequence) it8.next());
                    if (!it8.hasNext()) {
                        break;
                    } else {
                        sb9.append((java.lang.CharSequence) ",");
                    }
                }
            }
            createDefaultIfAbsent.put("client_connection_options", sb9.toString());
        }
        if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
            java.util.Set<java.lang.String> extraQuicheFlags = quicOptions.getExtraQuicheFlags();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            java.util.Iterator<T> it9 = extraQuicheFlags.iterator();
            if (it9.hasNext()) {
                while (true) {
                    sb10.append((java.lang.CharSequence) it9.next());
                    if (!it9.hasNext()) {
                        break;
                    } else {
                        sb10.append((java.lang.CharSequence) ",");
                    }
                }
            }
            createDefaultIfAbsent.put("set_quic_flags", sb10.toString());
        }
        if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
            createDefaultIfAbsent.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
        }
        if (quicOptions.getHandshakeUserAgent() != null) {
            createDefaultIfAbsent.put("user_agent_id", quicOptions.getHandshakeUserAgent());
        }
        if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
            createDefaultIfAbsent.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (quicOptions.getEnableTlsZeroRtt() != null) {
            createDefaultIfAbsent.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
        }
        if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
        }
        if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
            createDefaultIfAbsent.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
        }
        if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
            createDefaultIfAbsent.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
        }
        if (quicOptions.getCloseSessionsOnIpChange() != null) {
            createDefaultIfAbsent.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
        }
        if (quicOptions.getGoawaySessionsOnIpChange() != null) {
            createDefaultIfAbsent.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
        }
        if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
            createDefaultIfAbsent.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
        }
        if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
            createDefaultIfAbsent.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
        }
        if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
            createDefaultIfAbsent.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
        }
    }

    private static org.json.JSONObject parseExperimentalOptions(java.lang.String str) {
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e17) {
            throw new java.lang.IllegalArgumentException("Experimental options parsing failed", e17);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
        this.mDelegate.addPublicKeyPins(str, set, z17, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i17, int i18) {
        this.mDelegate.addQuicHint(str, i17, i18);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ExperimentalCronetEngine build() {
        if (this.mParsedExperimentalOptions == null && this.mExperimentalOptionsPatches.isEmpty()) {
            return this.mDelegate.build();
        }
        if (this.mParsedExperimentalOptions == null) {
            this.mParsedExperimentalOptions = new org.json.JSONObject();
        }
        java.util.Iterator<org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch> it = this.mExperimentalOptionsPatches.iterator();
        while (it.hasNext()) {
            try {
                it.next().applyTo(this.mParsedExperimentalOptions);
            } catch (org.json.JSONException e17) {
                throw new java.lang.IllegalStateException("Unable to apply JSON patch!", e17);
            }
        }
        this.mDelegate.setExperimentalOptions(this.mParsedExperimentalOptions.toString());
        return this.mDelegate.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z17) {
        this.mDelegate.enableBrotli(z17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z17) {
        this.mDelegate.enableHttp2(z17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enableHttpCache(int i17, long j17) {
        this.mDelegate.enableHttpCache(i17, j17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z17) {
        this.mDelegate.enableNetworkQualityEstimator(z17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z17) {
        this.mDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enableQuic(boolean z17) {
        this.mDelegate.enableQuic(z17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder enableSdch(boolean z17) {
        this.mDelegate.enableSdch(z17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public java.lang.String getDefaultUserAgent() {
        return this.mDelegate.getDefaultUserAgent();
    }

    public org.chromium.net.ICronetEngineBuilder getDelegate() {
        return this.mDelegate;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public java.util.Set<java.lang.Integer> getSupportedConfigOptions() {
        return SUPPORTED_OPTIONS;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setConnectionMigrationOptions(final org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
        if (this.mDelegate.getSupportedConfigOptions().contains(1)) {
            this.mDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$$c
            @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
            public final void applyTo(org.json.JSONObject jSONObject) {
                org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.lambda$setConnectionMigrationOptions$2(org.chromium.net.ConnectionMigrationOptions.this, jSONObject);
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setDnsOptions(final org.chromium.net.DnsOptions dnsOptions) {
        if (this.mDelegate.getSupportedConfigOptions().contains(2)) {
            this.mDelegate.setDnsOptions(dnsOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$$a
            @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
            public final void applyTo(org.json.JSONObject jSONObject) {
                org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.lambda$setDnsOptions$1(org.chromium.net.DnsOptions.this, jSONObject);
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            this.mParsedExperimentalOptions = null;
        } else {
            this.mParsedExperimentalOptions = parseExperimentalOptions(str);
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.mDelegate.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setQuicOptions(final org.chromium.net.QuicOptions quicOptions) {
        if (this.mDelegate.getSupportedConfigOptions().contains(3)) {
            this.mDelegate.setQuicOptions(quicOptions);
            return this;
        }
        this.mExperimentalOptionsPatches.add(new org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch() { // from class: org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$$b
            @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.ExperimentalOptionsPatch
            public final void applyTo(org.json.JSONObject jSONObject) {
                org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder.lambda$setQuicOptions$0(org.chromium.net.QuicOptions.this, jSONObject);
            }
        });
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str) {
        this.mDelegate.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setThreadPriority(int i17) {
        this.mDelegate.setThreadPriority(i17);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str) {
        this.mDelegate.setUserAgent(str);
        return this;
    }
}
