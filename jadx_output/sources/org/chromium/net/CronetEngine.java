package org.chromium.net;

/* loaded from: classes16.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final java.lang.String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    /* loaded from: classes16.dex */
    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final java.lang.String TAG = "CronetEngine.Builder";
        protected final org.chromium.net.ICronetEngineBuilder mBuilderDelegate;

        /* loaded from: classes13.dex */
        public static abstract class LibraryLoader {
            public abstract void loadLibrary(java.lang.String str);
        }

        public Builder(android.content.Context context) {
            this(createBuilderDelegate(context));
        }

        public static int compareVersions(java.lang.String str, java.lang.String str2) {
            if (str == null || str2 == null) {
                throw new java.lang.IllegalArgumentException("The input values cannot be null");
            }
            java.lang.String[] split = str.split("\\.");
            java.lang.String[] split2 = str2.split("\\.");
            for (int i17 = 0; i17 < split.length && i17 < split2.length; i17++) {
                try {
                    int parseInt = java.lang.Integer.parseInt(split[i17]);
                    int parseInt2 = java.lang.Integer.parseInt(split2[i17]);
                    if (parseInt != parseInt2) {
                        return java.lang.Integer.signum(parseInt - parseInt2);
                    }
                } catch (java.lang.NumberFormatException e17) {
                    throw new java.lang.IllegalArgumentException("Unable to convert version segments into integers: " + split[i17] + " & " + split2[i17], e17);
                }
            }
            return java.lang.Integer.signum(split.length - split2.length);
        }

        private static org.chromium.net.ICronetEngineBuilder createBuilderDelegate(android.content.Context context) {
            org.chromium.net.CronetProvider cronetProvider = getEnabledCronetProviders(context, new java.util.ArrayList(org.chromium.net.CronetProvider.getAllProviders(context))).get(0);
            if (android.util.Log.isLoggable(TAG, 3)) {
                java.lang.String.format("Using '%s' provider for creating CronetEngine.Builder.", cronetProvider);
            }
            return cronetProvider.createBuilder().mBuilderDelegate;
        }

        public static java.util.List<org.chromium.net.CronetProvider> getEnabledCronetProviders(android.content.Context context, java.util.List<org.chromium.net.CronetProvider> list) {
            if (list.isEmpty()) {
                throw new java.lang.RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            java.util.Iterator<org.chromium.net.CronetProvider> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().isEnabled()) {
                    it.remove();
                }
            }
            if (list.isEmpty()) {
                throw new java.lang.RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            java.util.Collections.sort(list, new java.util.Comparator<org.chromium.net.CronetProvider>() { // from class: org.chromium.net.CronetEngine.Builder.1
                @Override // java.util.Comparator
                public int compare(org.chromium.net.CronetProvider cronetProvider, org.chromium.net.CronetProvider cronetProvider2) {
                    if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
                        return 1;
                    }
                    if (org.chromium.net.CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
                        return -1;
                    }
                    return -org.chromium.net.CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
                }
            });
            return list;
        }

        private int getImplementationApiLevel() {
            try {
                return ((java.lang.Integer) this.mBuilderDelegate.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod("getApiLevel", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).intValue();
            } catch (java.lang.Exception unused) {
                return -1;
            }
        }

        private int getMaximumApiLevel() {
            return org.chromium.net.ApiVersion.getMaximumAvailableApiLevel();
        }

        public org.chromium.net.CronetEngine.Builder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z17, java.util.Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z17, date);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder addQuicHint(java.lang.String str, int i17, int i18) {
            this.mBuilderDelegate.addQuicHint(str, i17, i18);
            return this;
        }

        public org.chromium.net.CronetEngine build() {
            if (getImplementationApiLevel() != -1) {
                getMaximumApiLevel();
            }
            return this.mBuilderDelegate.build();
        }

        public org.chromium.net.CronetEngine.Builder enableBrotli(boolean z17) {
            this.mBuilderDelegate.enableBrotli(z17);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableHttp2(boolean z17) {
            this.mBuilderDelegate.enableHttp2(z17);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableHttpCache(int i17, long j17) {
            this.mBuilderDelegate.enableHttpCache(i17, j17);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableNetworkQualityEstimator(boolean z17) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z17);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z17) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z17);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder enableQuic(boolean z17) {
            this.mBuilderDelegate.enableQuic(z17);
            return this;
        }

        @java.lang.Deprecated
        public org.chromium.net.CronetEngine.Builder enableSdch(boolean z17) {
            return this;
        }

        public java.lang.String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public org.chromium.net.CronetEngine.Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
            this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setDnsOptions(org.chromium.net.DnsOptions dnsOptions) {
            this.mBuilderDelegate.setDnsOptions(dnsOptions);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
            this.mBuilderDelegate.setLibraryLoader(libraryLoader);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setQuicOptions(org.chromium.net.QuicOptions quicOptions) {
            this.mBuilderDelegate.setQuicOptions(quicOptions);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setStoragePath(java.lang.String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setThreadPriority(int i17) {
            this.mBuilderDelegate.setThreadPriority(i17);
            return this;
        }

        public org.chromium.net.CronetEngine.Builder setUserAgent(java.lang.String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(org.chromium.net.ICronetEngineBuilder iCronetEngineBuilder) {
            if (iCronetEngineBuilder instanceof org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder) {
                this.mBuilderDelegate = iCronetEngineBuilder;
            } else {
                this.mBuilderDelegate = new org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder(iCronetEngineBuilder);
            }
        }

        public org.chromium.net.CronetEngine.Builder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        public org.chromium.net.CronetEngine.Builder setDnsOptions(org.chromium.net.DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        public org.chromium.net.CronetEngine.Builder setQuicOptions(org.chromium.net.QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }
    }

    public void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j17) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z17, boolean z18, boolean z19) {
    }

    public abstract java.net.URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract java.lang.String getVersionString();

    public org.chromium.net.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    public abstract org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor);

    public abstract java.net.URLConnection openConnection(java.net.URL url);

    public void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public abstract void shutdown();

    public void startNetLogToDisk(java.lang.String str, boolean z17, int i17) {
    }

    public abstract void startNetLogToFile(java.lang.String str, boolean z17);

    public abstract void stopNetLog();
}
