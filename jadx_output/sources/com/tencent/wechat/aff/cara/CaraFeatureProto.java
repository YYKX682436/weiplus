package com.tencent.wechat.aff.cara;

/* loaded from: classes16.dex */
public final class CaraFeatureProto {

    /* renamed from: com.tencent.wechat.aff.cara.CaraFeatureProto$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[com.google.protobuf.l5.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[3] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[4] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[2] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[5] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[6] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[0] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[1] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class CaraAccountDiscoverTab extends com.google.protobuf.n5 implements com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder {
        public static final int CHANNELS_FIELD_NUMBER = 2;
        private static final com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab DEFAULT_INSTANCE;
        public static final int GAMES_FIELD_NUMBER = 9;
        public static final int LIVE_FIELD_NUMBER = 3;
        public static final int MINIPROGRAMS_FIELD_NUMBER = 11;
        public static final int MOMENTS_FIELD_NUMBER = 1;
        public static final int NEARBY_FIELD_NUMBER = 8;
        private static volatile com.google.protobuf.e9 PARSER = null;
        public static final int SCAN_FIELD_NUMBER = 4;
        public static final int SEARCH_FIELD_NUMBER = 7;
        public static final int SHAKE_FIELD_NUMBER = 5;
        public static final int SHOPPING_FIELD_NUMBER = 10;
        public static final int TOPSTORIES_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean channels_;
        private boolean games_;
        private boolean live_;
        private byte memoizedIsInitialized = 2;
        private boolean miniPrograms_;
        private boolean moments_;
        private boolean nearby_;
        private boolean scan_;
        private boolean search_;
        private boolean shake_;
        private boolean shopping_;
        private boolean topStories_;

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder {
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearChannels() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearChannels();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearGames() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearGames();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearLive() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearLive();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearMiniPrograms() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearMiniPrograms();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearMoments() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearMoments();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearNearby() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearNearby();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearScan() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearScan();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearSearch() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearSearch();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearShake() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearShake();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearShopping() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearShopping();
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder clearTopStories() {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).clearTopStories();
                return this;
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getChannels() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getChannels();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getGames() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getGames();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getLive() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getLive();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getMiniPrograms() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getMiniPrograms();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getMoments() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getMoments();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getNearby() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getNearby();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getScan() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getScan();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getSearch() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getSearch();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getShake() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getShake();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getShopping() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getShopping();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean getTopStories() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).getTopStories();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasChannels() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasChannels();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasGames() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasGames();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasLive() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasLive();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasMiniPrograms() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasMiniPrograms();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasMoments() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasMoments();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasNearby() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasNearby();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasScan() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasScan();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasSearch() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasSearch();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasShake() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasShake();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasShopping() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasShopping();
            }

            @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
            public boolean hasTopStories() {
                return ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).hasTopStories();
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setChannels(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setChannels(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setGames(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setGames(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setLive(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setLive(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setMiniPrograms(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setMiniPrograms(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setMoments(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setMoments(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setNearby(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setNearby(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setScan(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setScan(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setSearch(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setSearch(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setShake(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setShake(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setShopping(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setShopping(z17);
                return this;
            }

            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder setTopStories(boolean z17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) this.instance).setTopStories(z17);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.DEFAULT_INSTANCE);
            }
        }

        static {
            com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab caraAccountDiscoverTab = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab();
            DEFAULT_INSTANCE = caraAccountDiscoverTab;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.class, caraAccountDiscoverTab);
        }

        private CaraAccountDiscoverTab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChannels() {
            this.bitField0_ &= -3;
            this.channels_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGames() {
            this.bitField0_ &= -257;
            this.games_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLive() {
            this.bitField0_ &= -5;
            this.live_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMiniPrograms() {
            this.bitField0_ &= -1025;
            this.miniPrograms_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMoments() {
            this.bitField0_ &= -2;
            this.moments_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNearby() {
            this.bitField0_ &= -129;
            this.nearby_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScan() {
            this.bitField0_ &= -9;
            this.scan_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSearch() {
            this.bitField0_ &= -65;
            this.search_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShake() {
            this.bitField0_ &= -17;
            this.shake_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearShopping() {
            this.bitField0_ &= -513;
            this.shopping_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTopStories() {
            this.bitField0_ &= -33;
            this.topStories_ = false;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder newBuilder() {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChannels(boolean z17) {
            this.bitField0_ |= 2;
            this.channels_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGames(boolean z17) {
            this.bitField0_ |= 256;
            this.games_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLive(boolean z17) {
            this.bitField0_ |= 4;
            this.live_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMiniPrograms(boolean z17) {
            this.bitField0_ |= 1024;
            this.miniPrograms_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoments(boolean z17) {
            this.bitField0_ |= 1;
            this.moments_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNearby(boolean z17) {
            this.bitField0_ |= 128;
            this.nearby_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScan(boolean z17) {
            this.bitField0_ |= 8;
            this.scan_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSearch(boolean z17) {
            this.bitField0_ |= 64;
            this.search_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShake(boolean z17) {
            this.bitField0_ |= 16;
            this.shake_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setShopping(boolean z17) {
            this.bitField0_ |= 512;
            this.shopping_ = z17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTopStories(boolean z17) {
            this.bitField0_ |= 32;
            this.topStories_ = z17;
        }

        @Override // com.google.protobuf.n5
        public final java.lang.Object dynamicMethod(com.google.protobuf.l5 l5Var, java.lang.Object obj, java.lang.Object obj2) {
            switch (l5Var) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return java.lang.Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                case BUILD_MESSAGE_INFO:
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u000b\u0001ᔇ\u0000\u0002ᔇ\u0001\u0003ᔇ\u0002\u0004ᔇ\u0003\u0005ᔇ\u0004\u0006ᔇ\u0005\u0007ᔇ\u0006\bᔇ\u0007\tᔇ\b\nᔇ\t\u000bᔇ\n", new java.lang.Object[]{"bitField0_", "moments_", "channels_", "live_", "scan_", "shake_", "topStories_", "search_", "nearby_", "games_", "shopping_", "miniPrograms_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.class) {
                            e9Var = PARSER;
                            if (e9Var == null) {
                                e9Var = new com.google.protobuf.i5(DEFAULT_INSTANCE);
                                PARSER = e9Var;
                            }
                        }
                    }
                    return e9Var;
                default:
                    throw new java.lang.UnsupportedOperationException();
            }
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getChannels() {
            return this.channels_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getGames() {
            return this.games_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getLive() {
            return this.live_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getMiniPrograms() {
            return this.miniPrograms_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getMoments() {
            return this.moments_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getNearby() {
            return this.nearby_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getScan() {
            return this.scan_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getSearch() {
            return this.search_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getShake() {
            return this.shake_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getShopping() {
            return this.shopping_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean getTopStories() {
            return this.topStories_;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasChannels() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasGames() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasLive() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasMiniPrograms() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasMoments() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasNearby() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasScan() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasSearch() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasShake() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasShopping() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTabOrBuilder
        public boolean hasTopStories() {
            return (this.bitField0_ & 32) != 0;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder newBuilder(com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab caraAccountDiscoverTab) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab.Builder) DEFAULT_INSTANCE.createBuilder(caraAccountDiscoverTab);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.cara.CaraFeatureProto.CaraAccountDiscoverTab) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface CaraAccountDiscoverTabOrBuilder extends com.google.protobuf.p8 {
        boolean getChannels();

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        boolean getGames();

        boolean getLive();

        boolean getMiniPrograms();

        boolean getMoments();

        boolean getNearby();

        boolean getScan();

        boolean getSearch();

        boolean getShake();

        boolean getShopping();

        boolean getTopStories();

        boolean hasChannels();

        boolean hasGames();

        boolean hasLive();

        boolean hasMiniPrograms();

        boolean hasMoments();

        boolean hasNearby();

        boolean hasScan();

        boolean hasSearch();

        boolean hasShake();

        boolean hasShopping();

        boolean hasTopStories();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes16.dex */
    public enum CaraFinderContactAuthType implements com.google.protobuf.p6 {
        CARA_FINDER_CONTACT_AUTH_UNKNOWN(0),
        CARA_FINDER_CONTACT_AUTH_DEFAULT(1),
        CARA_FINDER_CONTACT_AUTH_PERSONAL(2),
        CARA_FINDER_CONTACT_AUTH_ENTERPRISE(3),
        CARA_FINDER_CONTACT_AUTH_REALNAME(4);

        public static final int CARA_FINDER_CONTACT_AUTH_DEFAULT_VALUE = 1;
        public static final int CARA_FINDER_CONTACT_AUTH_ENTERPRISE_VALUE = 3;
        public static final int CARA_FINDER_CONTACT_AUTH_PERSONAL_VALUE = 2;
        public static final int CARA_FINDER_CONTACT_AUTH_REALNAME_VALUE = 4;
        public static final int CARA_FINDER_CONTACT_AUTH_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraFinderContactAuthTypeVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType.CaraFinderContactAuthTypeVerifier();

            private CaraFinderContactAuthTypeVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType.forNumber(i17) != null;
            }
        }

        CaraFinderContactAuthType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType forNumber(int i17) {
            if (i17 == 0) {
                return CARA_FINDER_CONTACT_AUTH_UNKNOWN;
            }
            if (i17 == 1) {
                return CARA_FINDER_CONTACT_AUTH_DEFAULT;
            }
            if (i17 == 2) {
                return CARA_FINDER_CONTACT_AUTH_PERSONAL;
            }
            if (i17 == 3) {
                return CARA_FINDER_CONTACT_AUTH_ENTERPRISE;
            }
            if (i17 != 4) {
                return null;
            }
            return CARA_FINDER_CONTACT_AUTH_REALNAME;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType.CaraFinderContactAuthTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderContactAuthType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraFinderPOIType implements com.google.protobuf.p6 {
        CARA_FINDER_POI_TYPE_NULL_POI(0),
        CARA_FINDER_POI_TYPE_DEFAULT_POI(1),
        CARA_FINDER_POI_TYPE_SELECT_POI(2),
        CARA_FINDER_POI_TYPE_CANCEL_POI(3),
        CARA_FINDER_POI_TYPE_SEARCH_POI(4),
        CARA_FINDER_POI_TYPE_RECOMMEND_POI(5);

        public static final int CARA_FINDER_POI_TYPE_CANCEL_POI_VALUE = 3;
        public static final int CARA_FINDER_POI_TYPE_DEFAULT_POI_VALUE = 1;
        public static final int CARA_FINDER_POI_TYPE_NULL_POI_VALUE = 0;
        public static final int CARA_FINDER_POI_TYPE_RECOMMEND_POI_VALUE = 5;
        public static final int CARA_FINDER_POI_TYPE_SEARCH_POI_VALUE = 4;
        public static final int CARA_FINDER_POI_TYPE_SELECT_POI_VALUE = 2;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraFinderPOITypeVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType.CaraFinderPOITypeVerifier();

            private CaraFinderPOITypeVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType.forNumber(i17) != null;
            }
        }

        CaraFinderPOIType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType forNumber(int i17) {
            if (i17 == 0) {
                return CARA_FINDER_POI_TYPE_NULL_POI;
            }
            if (i17 == 1) {
                return CARA_FINDER_POI_TYPE_DEFAULT_POI;
            }
            if (i17 == 2) {
                return CARA_FINDER_POI_TYPE_SELECT_POI;
            }
            if (i17 == 3) {
                return CARA_FINDER_POI_TYPE_CANCEL_POI;
            }
            if (i17 == 4) {
                return CARA_FINDER_POI_TYPE_SEARCH_POI;
            }
            if (i17 != 5) {
                return null;
            }
            return CARA_FINDER_POI_TYPE_RECOMMEND_POI;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType.CaraFinderPOITypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPOIType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraFinderPatMusicType implements com.google.protobuf.p6 {
        CARA_FINDER_PAT_MUSIC_TYPE_NULL(0),
        CARA_FINDER_PAT_MUSIC_TYPE_ONLY_PAT_MUSIC(1),
        CARA_FINDER_PAT_MUSIC_TYPE_ONLY_ORIGINAL(2),
        CARA_FINDER_PAT_MUSIC_TYPE_PAT_AND_ORIGINAL(3),
        CARA_FINDER_PAT_MUSIC_TYPE_MUSIC_MV_PLAYER(4);

        public static final int CARA_FINDER_PAT_MUSIC_TYPE_MUSIC_MV_PLAYER_VALUE = 4;
        public static final int CARA_FINDER_PAT_MUSIC_TYPE_NULL_VALUE = 0;
        public static final int CARA_FINDER_PAT_MUSIC_TYPE_ONLY_ORIGINAL_VALUE = 2;
        public static final int CARA_FINDER_PAT_MUSIC_TYPE_ONLY_PAT_MUSIC_VALUE = 1;
        public static final int CARA_FINDER_PAT_MUSIC_TYPE_PAT_AND_ORIGINAL_VALUE = 3;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraFinderPatMusicTypeVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType.CaraFinderPatMusicTypeVerifier();

            private CaraFinderPatMusicTypeVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType.forNumber(i17) != null;
            }
        }

        CaraFinderPatMusicType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType forNumber(int i17) {
            if (i17 == 0) {
                return CARA_FINDER_PAT_MUSIC_TYPE_NULL;
            }
            if (i17 == 1) {
                return CARA_FINDER_PAT_MUSIC_TYPE_ONLY_PAT_MUSIC;
            }
            if (i17 == 2) {
                return CARA_FINDER_PAT_MUSIC_TYPE_ONLY_ORIGINAL;
            }
            if (i17 == 3) {
                return CARA_FINDER_PAT_MUSIC_TYPE_PAT_AND_ORIGINAL;
            }
            if (i17 != 4) {
                return null;
            }
            return CARA_FINDER_PAT_MUSIC_TYPE_MUSIC_MV_PLAYER;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType.CaraFinderPatMusicTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderPatMusicType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraFinderVideoSourceType implements com.google.protobuf.p6 {
        CARA_FINDER_VIDEO_SOURCE_TYPE_UNKONW(0),
        CARA_FINDER_VIDEO_SOURCE_TYPE_ALBUM(1),
        CARA_FINDER_VIDEO_SOURCE_TYPE_FRONT_CAMERA(2),
        CARA_FINDER_VIDEO_SOURCE_TYPE_BACK_CAMERA(3),
        CARA_FINDER_VIDEO_SOURCE_TYPE_OTHER_SHARE(4);

        public static final int CARA_FINDER_VIDEO_SOURCE_TYPE_ALBUM_VALUE = 1;
        public static final int CARA_FINDER_VIDEO_SOURCE_TYPE_BACK_CAMERA_VALUE = 3;
        public static final int CARA_FINDER_VIDEO_SOURCE_TYPE_FRONT_CAMERA_VALUE = 2;
        public static final int CARA_FINDER_VIDEO_SOURCE_TYPE_OTHER_SHARE_VALUE = 4;
        public static final int CARA_FINDER_VIDEO_SOURCE_TYPE_UNKONW_VALUE = 0;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraFinderVideoSourceTypeVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType.CaraFinderVideoSourceTypeVerifier();

            private CaraFinderVideoSourceTypeVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType.forNumber(i17) != null;
            }
        }

        CaraFinderVideoSourceType(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType forNumber(int i17) {
            if (i17 == 0) {
                return CARA_FINDER_VIDEO_SOURCE_TYPE_UNKONW;
            }
            if (i17 == 1) {
                return CARA_FINDER_VIDEO_SOURCE_TYPE_ALBUM;
            }
            if (i17 == 2) {
                return CARA_FINDER_VIDEO_SOURCE_TYPE_FRONT_CAMERA;
            }
            if (i17 == 3) {
                return CARA_FINDER_VIDEO_SOURCE_TYPE_BACK_CAMERA;
            }
            if (i17 != 4) {
                return null;
            }
            return CARA_FINDER_VIDEO_SOURCE_TYPE_OTHER_SHARE;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType.CaraFinderVideoSourceTypeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraFinderVideoSourceType valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraGender implements com.google.protobuf.p6 {
        CARA_GENDER_UNKNOWN(0),
        CARA_GENDER_MALE(1),
        CARA_GENDER_FEMALE(2);

        public static final int CARA_GENDER_FEMALE_VALUE = 2;
        public static final int CARA_GENDER_MALE_VALUE = 1;
        public static final int CARA_GENDER_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraGenderVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.CaraGenderVerifier();

            private CaraGenderVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.forNumber(i17) != null;
            }
        }

        CaraGender(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender forNumber(int i17) {
            if (i17 == 0) {
                return CARA_GENDER_UNKNOWN;
            }
            if (i17 == 1) {
                return CARA_GENDER_MALE;
            }
            if (i17 != 2) {
                return null;
            }
            return CARA_GENDER_FEMALE;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender.CaraGenderVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraGender valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraLiveNetworkQuality implements com.google.protobuf.p6 {
        CARA_LIVE_NETWORK_QUALITY_UNKNOWN(0),
        CARA_LIVE_NETWORK_QUALITY_EXCELLENT(1),
        CARA_LIVE_NETWORK_QUALITY_GOOD(2),
        CARA_LIVE_NETWORK_QUALITY_POOR(3),
        CARA_LIVE_NETWORK_QUALITY_BAD(4),
        CARA_LIVE_NETWORK_QUALITY_VERY_BAD(5),
        CARA_LIVE_NETWORK_QUALITY_DOWN(6);

        public static final int CARA_LIVE_NETWORK_QUALITY_BAD_VALUE = 4;
        public static final int CARA_LIVE_NETWORK_QUALITY_DOWN_VALUE = 6;
        public static final int CARA_LIVE_NETWORK_QUALITY_EXCELLENT_VALUE = 1;
        public static final int CARA_LIVE_NETWORK_QUALITY_GOOD_VALUE = 2;
        public static final int CARA_LIVE_NETWORK_QUALITY_POOR_VALUE = 3;
        public static final int CARA_LIVE_NETWORK_QUALITY_UNKNOWN_VALUE = 0;
        public static final int CARA_LIVE_NETWORK_QUALITY_VERY_BAD_VALUE = 5;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraLiveNetworkQualityVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.CaraLiveNetworkQualityVerifier();

            private CaraLiveNetworkQualityVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.forNumber(i17) != null;
            }
        }

        CaraLiveNetworkQuality(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality forNumber(int i17) {
            switch (i17) {
                case 0:
                    return CARA_LIVE_NETWORK_QUALITY_UNKNOWN;
                case 1:
                    return CARA_LIVE_NETWORK_QUALITY_EXCELLENT;
                case 2:
                    return CARA_LIVE_NETWORK_QUALITY_GOOD;
                case 3:
                    return CARA_LIVE_NETWORK_QUALITY_POOR;
                case 4:
                    return CARA_LIVE_NETWORK_QUALITY_BAD;
                case 5:
                    return CARA_LIVE_NETWORK_QUALITY_VERY_BAD;
                case 6:
                    return CARA_LIVE_NETWORK_QUALITY_DOWN;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality.CaraLiveNetworkQualityVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveNetworkQuality valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes15.dex */
    public enum CaraLiveUserActiveLevel implements com.google.protobuf.p6 {
        CARA_LIVE_USER_ACTIVE_LEVEL_UNKNOWN(0),
        CARA_LIVE_USER_ACTIVE_LEVEL_NEW_USER(1),
        CARA_LIVE_USER_ACTIVE_LEVEL_ULTRA_LOW(2),
        CARA_LIVE_USER_ACTIVE_LEVEL_LOW(3),
        CARA_LIVE_USER_ACTIVE_LEVEL_MID(4),
        CARA_LIVE_USER_ACTIVE_LEVEL_HIGH(5);

        public static final int CARA_LIVE_USER_ACTIVE_LEVEL_HIGH_VALUE = 5;
        public static final int CARA_LIVE_USER_ACTIVE_LEVEL_LOW_VALUE = 3;
        public static final int CARA_LIVE_USER_ACTIVE_LEVEL_MID_VALUE = 4;
        public static final int CARA_LIVE_USER_ACTIVE_LEVEL_NEW_USER_VALUE = 1;
        public static final int CARA_LIVE_USER_ACTIVE_LEVEL_ULTRA_LOW_VALUE = 2;
        public static final int CARA_LIVE_USER_ACTIVE_LEVEL_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes15.dex */
        public static final class CaraLiveUserActiveLevelVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel.CaraLiveUserActiveLevelVerifier();

            private CaraLiveUserActiveLevelVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel.forNumber(i17) != null;
            }
        }

        CaraLiveUserActiveLevel(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel forNumber(int i17) {
            if (i17 == 0) {
                return CARA_LIVE_USER_ACTIVE_LEVEL_UNKNOWN;
            }
            if (i17 == 1) {
                return CARA_LIVE_USER_ACTIVE_LEVEL_NEW_USER;
            }
            if (i17 == 2) {
                return CARA_LIVE_USER_ACTIVE_LEVEL_ULTRA_LOW;
            }
            if (i17 == 3) {
                return CARA_LIVE_USER_ACTIVE_LEVEL_LOW;
            }
            if (i17 == 4) {
                return CARA_LIVE_USER_ACTIVE_LEVEL_MID;
            }
            if (i17 != 5) {
                return null;
            }
            return CARA_LIVE_USER_ACTIVE_LEVEL_HIGH;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel.CaraLiveUserActiveLevelVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveUserActiveLevel valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraLiveVideoQuality implements com.google.protobuf.p6 {
        CARA_LIVE_VIDEO_QUALITY_UNKNOWN(0),
        CARA_LIVE_VIDEO_QUALITY_SMOOTH(1),
        CARA_LIVE_VIDEO_QUALITY_SD(2),
        CARA_LIVE_VIDEO_QUALITY_HD(3),
        CARA_LIVE_VIDEO_QUALITY_FULL_HD(4),
        CARA_LIVE_VIDEO_QUALITY_ULTRA_HD_4K(5),
        CARA_LIVE_VIDEO_QUALITY_ORIGINAL(6);

        public static final int CARA_LIVE_VIDEO_QUALITY_FULL_HD_VALUE = 4;
        public static final int CARA_LIVE_VIDEO_QUALITY_HD_VALUE = 3;
        public static final int CARA_LIVE_VIDEO_QUALITY_ORIGINAL_VALUE = 6;
        public static final int CARA_LIVE_VIDEO_QUALITY_SD_VALUE = 2;
        public static final int CARA_LIVE_VIDEO_QUALITY_SMOOTH_VALUE = 1;
        public static final int CARA_LIVE_VIDEO_QUALITY_ULTRA_HD_4K_VALUE = 5;
        public static final int CARA_LIVE_VIDEO_QUALITY_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraLiveVideoQualityVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality.CaraLiveVideoQualityVerifier();

            private CaraLiveVideoQualityVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality.forNumber(i17) != null;
            }
        }

        CaraLiveVideoQuality(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality forNumber(int i17) {
            switch (i17) {
                case 0:
                    return CARA_LIVE_VIDEO_QUALITY_UNKNOWN;
                case 1:
                    return CARA_LIVE_VIDEO_QUALITY_SMOOTH;
                case 2:
                    return CARA_LIVE_VIDEO_QUALITY_SD;
                case 3:
                    return CARA_LIVE_VIDEO_QUALITY_HD;
                case 4:
                    return CARA_LIVE_VIDEO_QUALITY_FULL_HD;
                case 5:
                    return CARA_LIVE_VIDEO_QUALITY_ULTRA_HD_4K;
                case 6:
                    return CARA_LIVE_VIDEO_QUALITY_ORIGINAL;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality.CaraLiveVideoQualityVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraLiveVideoQuality valueOf(int i17) {
            return forNumber(i17);
        }
    }

    /* loaded from: classes16.dex */
    public enum CaraMomentPrivacy implements com.google.protobuf.p6 {
        CARA_MOMENT_PRIVACY_UNKNOWN(0),
        CARA_MOMENT_PRIVACY_LAST_3_DAYS(1),
        CARA_MOMENT_PRIVACY_LAST_MONTH(2),
        CARA_MOMENT_PRIVACY_LAST_6_MONTHS(3),
        CARA_MOMENT_PRIVACY_ALL(4);

        public static final int CARA_MOMENT_PRIVACY_ALL_VALUE = 4;
        public static final int CARA_MOMENT_PRIVACY_LAST_3_DAYS_VALUE = 1;
        public static final int CARA_MOMENT_PRIVACY_LAST_6_MONTHS_VALUE = 3;
        public static final int CARA_MOMENT_PRIVACY_LAST_MONTH_VALUE = 2;
        public static final int CARA_MOMENT_PRIVACY_UNKNOWN_VALUE = 0;
        private static final com.google.protobuf.q6 internalValueMap = new com.google.protobuf.q6() { // from class: com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.1
            @Override // com.google.protobuf.q6
            public com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy findValueByNumber(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.forNumber(i17);
            }
        };
        private final int value;

        /* loaded from: classes16.dex */
        public static final class CaraMomentPrivacyVerifier implements com.google.protobuf.r6 {
            static final com.google.protobuf.r6 INSTANCE = new com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CaraMomentPrivacyVerifier();

            private CaraMomentPrivacyVerifier() {
            }

            @Override // com.google.protobuf.r6
            public boolean isInRange(int i17) {
                return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.forNumber(i17) != null;
            }
        }

        CaraMomentPrivacy(int i17) {
            this.value = i17;
        }

        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy forNumber(int i17) {
            if (i17 == 0) {
                return CARA_MOMENT_PRIVACY_UNKNOWN;
            }
            if (i17 == 1) {
                return CARA_MOMENT_PRIVACY_LAST_3_DAYS;
            }
            if (i17 == 2) {
                return CARA_MOMENT_PRIVACY_LAST_MONTH;
            }
            if (i17 == 3) {
                return CARA_MOMENT_PRIVACY_LAST_6_MONTHS;
            }
            if (i17 != 4) {
                return null;
            }
            return CARA_MOMENT_PRIVACY_ALL;
        }

        public static com.google.protobuf.q6 internalGetValueMap() {
            return internalValueMap;
        }

        public static com.google.protobuf.r6 internalGetVerifier() {
            return com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy.CaraMomentPrivacyVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.p6
        public final int getNumber() {
            return this.value;
        }

        @java.lang.Deprecated
        public static com.tencent.wechat.aff.cara.CaraFeatureProto.CaraMomentPrivacy valueOf(int i17) {
            return forNumber(i17);
        }
    }

    private CaraFeatureProto() {
    }

    public static void registerAllExtensions(com.google.protobuf.t4 t4Var) {
    }
}
