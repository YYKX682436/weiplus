package com.tencent.wechat.aff.misc;

/* loaded from: classes16.dex */
public final class WebViewProto {

    /* renamed from: com.tencent.wechat.aff.misc.WebViewProto$1, reason: invalid class name */
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
    public static final class DynamicMenuConfig extends com.google.protobuf.n5 implements com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder {
        private static final com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig DEFAULT_INSTANCE;
        public static final int DOMAINS_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.e9 PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private java.lang.String name_ = "";
        private com.google.protobuf.v6 domains_ = com.google.protobuf.n5.emptyProtobufList();
        private com.google.protobuf.v6 items_ = com.google.protobuf.n5.emptyProtobufList();

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder {
            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addAllDomains(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addAllDomains(iterable);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addAllItems(java.lang.Iterable<? extends com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> iterable) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addAllItems(iterable);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addDomains(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addDomains(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addDomainsBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addDomainsBytes(yVar);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addItems(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addItems(dynamicMenuItem);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder clearDomains() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).clearDomains();
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder clearItems() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).clearItems();
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder clearName() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).clearName();
                return this;
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public java.lang.String getDomains(int i17) {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getDomains(i17);
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public com.google.protobuf.y getDomainsBytes(int i17) {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getDomainsBytes(i17);
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public int getDomainsCount() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getDomainsCount();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public java.util.List<java.lang.String> getDomainsList() {
                return java.util.Collections.unmodifiableList(((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getDomainsList());
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem getItems(int i17) {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getItems(i17);
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public int getItemsCount() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getItemsCount();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> getItemsList() {
                return java.util.Collections.unmodifiableList(((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getItemsList());
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public java.lang.String getName() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getName();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public com.google.protobuf.y getNameBytes() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).getNameBytes();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
            public boolean hasName() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).hasName();
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder removeItems(int i17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).removeItems(i17);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder setDomains(int i17, java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).setDomains(i17, str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder setItems(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).setItems(i17, dynamicMenuItem);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder setName(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).setName(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder setNameBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).setNameBytes(yVar);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.DEFAULT_INSTANCE);
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addItems(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addItems(i17, dynamicMenuItem);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder setItems(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder builder) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).setItems(i17, (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) builder.build());
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addItems(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder builder) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addItems((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) builder.build());
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder addItems(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder builder) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.instance).addItems(i17, (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) builder.build());
                return this;
            }
        }

        static {
            com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig = new com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig();
            DEFAULT_INSTANCE = dynamicMenuConfig;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.class, dynamicMenuConfig);
        }

        private DynamicMenuConfig() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDomains(java.lang.Iterable<java.lang.String> iterable) {
            ensureDomainsIsMutable();
            com.google.protobuf.f.addAll((java.lang.Iterable) iterable, (java.util.List) this.domains_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllItems(java.lang.Iterable<? extends com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> iterable) {
            ensureItemsIsMutable();
            com.google.protobuf.f.addAll((java.lang.Iterable) iterable, (java.util.List) this.items_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDomains(java.lang.String str) {
            str.getClass();
            ensureDomainsIsMutable();
            this.domains_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDomainsBytes(com.google.protobuf.y yVar) {
            ensureDomainsIsMutable();
            this.domains_.add(yVar.r());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
            dynamicMenuItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(dynamicMenuItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDomains() {
            this.domains_ = com.google.protobuf.n5.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearItems() {
            this.items_ = com.google.protobuf.n5.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        private void ensureDomainsIsMutable() {
            com.google.protobuf.v6 v6Var = this.domains_;
            if (((com.google.protobuf.h) v6Var).f45145d) {
                return;
            }
            this.domains_ = com.google.protobuf.n5.mutableCopy(v6Var);
        }

        private void ensureItemsIsMutable() {
            com.google.protobuf.v6 v6Var = this.items_;
            if (((com.google.protobuf.h) v6Var).f45145d) {
                return;
            }
            this.items_ = com.google.protobuf.n5.mutableCopy(v6Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder newBuilder() {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeItems(int i17) {
            ensureItemsIsMutable();
            this.items_.remove(i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDomains(int i17, java.lang.String str) {
            str.getClass();
            ensureDomainsIsMutable();
            this.domains_.set(i17, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setItems(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
            dynamicMenuItem.getClass();
            ensureItemsIsMutable();
            this.items_.set(i17, dynamicMenuItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameBytes(com.google.protobuf.y yVar) {
            this.name_ = yVar.r();
            this.bitField0_ |= 1;
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
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001ᔈ\u0000\u0002\u001a\u0003Л", new java.lang.Object[]{"bitField0_", "name_", "domains_", "items_", com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.class});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.class) {
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

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public java.lang.String getDomains(int i17) {
            return (java.lang.String) this.domains_.get(i17);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public com.google.protobuf.y getDomainsBytes(int i17) {
            return com.google.protobuf.y.h((java.lang.String) this.domains_.get(i17));
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public int getDomainsCount() {
            return this.domains_.size();
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public java.util.List<java.lang.String> getDomainsList() {
            return this.domains_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem getItems(int i17) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.items_.get(i17);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> getItemsList() {
            return this.items_;
        }

        public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder getItemsOrBuilder(int i17) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder) this.items_.get(i17);
        }

        public java.util.List<? extends com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public java.lang.String getName() {
            return this.name_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public com.google.protobuf.y getNameBytes() {
            return com.google.protobuf.y.h(this.name_);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder newBuilder(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder) DEFAULT_INSTANCE.createBuilder(dynamicMenuConfig);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addItems(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
            dynamicMenuItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(i17, dynamicMenuItem);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface DynamicMenuConfigOrBuilder extends com.google.protobuf.p8 {
        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        java.lang.String getDomains(int i17);

        com.google.protobuf.y getDomainsBytes(int i17);

        int getDomainsCount();

        java.util.List<java.lang.String> getDomainsList();

        com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem getItems(int i17);

        int getItemsCount();

        java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem> getItemsList();

        java.lang.String getName();

        com.google.protobuf.y getNameBytes();

        boolean hasName();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes16.dex */
    public static final class DynamicMenuItem extends com.google.protobuf.n5 implements com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder {
        private static final com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile com.google.protobuf.e9 PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 3;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private java.lang.String id_ = "";
        private java.lang.String title_ = "";
        private java.lang.String url_ = "";

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder {
            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder clearId() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).clearId();
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder clearTitle() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).clearTitle();
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder clearUrl() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).clearUrl();
                return this;
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public java.lang.String getId() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).getId();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public com.google.protobuf.y getIdBytes() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).getIdBytes();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public java.lang.String getTitle() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).getTitle();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public com.google.protobuf.y getTitleBytes() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).getTitleBytes();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public java.lang.String getUrl() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).getUrl();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public com.google.protobuf.y getUrlBytes() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).getUrlBytes();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public boolean hasId() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).hasId();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public boolean hasTitle() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).hasTitle();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
            public boolean hasUrl() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).hasUrl();
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder setId(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).setId(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder setIdBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).setIdBytes(yVar);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder setTitle(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).setTitle(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder setTitleBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).setTitleBytes(yVar);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder setUrl(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).setUrl(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder setUrlBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) this.instance).setUrlBytes(yVar);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.DEFAULT_INSTANCE);
            }
        }

        static {
            com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem = new com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem();
            DEFAULT_INSTANCE = dynamicMenuItem;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.class, dynamicMenuItem);
        }

        private DynamicMenuItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -3;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -5;
            this.url_ = getDefaultInstance().getUrl();
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder newBuilder() {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(com.google.protobuf.y yVar) {
            this.id_ = yVar.r();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitle(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.title_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTitleBytes(com.google.protobuf.y yVar) {
            this.title_ = yVar.r();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(com.google.protobuf.y yVar) {
            this.url_ = yVar.r();
            this.bitField0_ |= 4;
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
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003ᔈ\u0002", new java.lang.Object[]{"bitField0_", "id_", "title_", "url_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.class) {
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

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public java.lang.String getId() {
            return this.id_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public com.google.protobuf.y getIdBytes() {
            return com.google.protobuf.y.h(this.id_);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public java.lang.String getTitle() {
            return this.title_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public com.google.protobuf.y getTitleBytes() {
            return com.google.protobuf.y.h(this.title_);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public java.lang.String getUrl() {
            return this.url_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public com.google.protobuf.y getUrlBytes() {
            return com.google.protobuf.y.h(this.url_);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItemOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder newBuilder(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem dynamicMenuItem) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem.Builder) DEFAULT_INSTANCE.createBuilder(dynamicMenuItem);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuItem) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface DynamicMenuItemOrBuilder extends com.google.protobuf.p8 {
        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        java.lang.String getId();

        com.google.protobuf.y getIdBytes();

        java.lang.String getTitle();

        com.google.protobuf.y getTitleBytes();

        java.lang.String getUrl();

        com.google.protobuf.y getUrlBytes();

        boolean hasId();

        boolean hasTitle();

        boolean hasUrl();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes16.dex */
    public static final class ReadDynamicMenuConfigReq extends com.google.protobuf.n5 implements com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder {
        public static final int CONFIG_FILE_PATH_FIELD_NUMBER = 1;
        private static final com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq DEFAULT_INSTANCE;
        public static final int MENU_CONFIG_NAMES_FIELD_NUMBER = 2;
        private static volatile com.google.protobuf.e9 PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private java.lang.String configFilePath_ = "";
        private com.google.protobuf.v6 menuConfigNames_ = com.google.protobuf.n5.emptyProtobufList();

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder {
            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder addAllMenuConfigNames(java.lang.Iterable<java.lang.String> iterable) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).addAllMenuConfigNames(iterable);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder addMenuConfigNames(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).addMenuConfigNames(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder addMenuConfigNamesBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).addMenuConfigNamesBytes(yVar);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder clearConfigFilePath() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).clearConfigFilePath();
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder clearMenuConfigNames() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).clearMenuConfigNames();
                return this;
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public java.lang.String getConfigFilePath() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).getConfigFilePath();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public com.google.protobuf.y getConfigFilePathBytes() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).getConfigFilePathBytes();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public java.lang.String getMenuConfigNames(int i17) {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).getMenuConfigNames(i17);
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public com.google.protobuf.y getMenuConfigNamesBytes(int i17) {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).getMenuConfigNamesBytes(i17);
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public int getMenuConfigNamesCount() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).getMenuConfigNamesCount();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public java.util.List<java.lang.String> getMenuConfigNamesList() {
                return java.util.Collections.unmodifiableList(((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).getMenuConfigNamesList());
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
            public boolean hasConfigFilePath() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).hasConfigFilePath();
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder setConfigFilePath(java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).setConfigFilePath(str);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder setConfigFilePathBytes(com.google.protobuf.y yVar) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).setConfigFilePathBytes(yVar);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder setMenuConfigNames(int i17, java.lang.String str) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) this.instance).setMenuConfigNames(i17, str);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.DEFAULT_INSTANCE);
            }
        }

        static {
            com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq readDynamicMenuConfigReq = new com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq();
            DEFAULT_INSTANCE = readDynamicMenuConfigReq;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.class, readDynamicMenuConfigReq);
        }

        private ReadDynamicMenuConfigReq() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMenuConfigNames(java.lang.Iterable<java.lang.String> iterable) {
            ensureMenuConfigNamesIsMutable();
            com.google.protobuf.f.addAll((java.lang.Iterable) iterable, (java.util.List) this.menuConfigNames_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMenuConfigNames(java.lang.String str) {
            str.getClass();
            ensureMenuConfigNamesIsMutable();
            this.menuConfigNames_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMenuConfigNamesBytes(com.google.protobuf.y yVar) {
            ensureMenuConfigNamesIsMutable();
            this.menuConfigNames_.add(yVar.r());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigFilePath() {
            this.bitField0_ &= -2;
            this.configFilePath_ = getDefaultInstance().getConfigFilePath();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMenuConfigNames() {
            this.menuConfigNames_ = com.google.protobuf.n5.emptyProtobufList();
        }

        private void ensureMenuConfigNamesIsMutable() {
            com.google.protobuf.v6 v6Var = this.menuConfigNames_;
            if (((com.google.protobuf.h) v6Var).f45145d) {
                return;
            }
            this.menuConfigNames_ = com.google.protobuf.n5.mutableCopy(v6Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder newBuilder() {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigFilePath(java.lang.String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.configFilePath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigFilePathBytes(com.google.protobuf.y yVar) {
            this.configFilePath_ = yVar.r();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMenuConfigNames(int i17, java.lang.String str) {
            str.getClass();
            ensureMenuConfigNamesIsMutable();
            this.menuConfigNames_.set(i17, str);
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
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0002\u001a", new java.lang.Object[]{"bitField0_", "configFilePath_", "menuConfigNames_"});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.class) {
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

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public java.lang.String getConfigFilePath() {
            return this.configFilePath_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public com.google.protobuf.y getConfigFilePathBytes() {
            return com.google.protobuf.y.h(this.configFilePath_);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public java.lang.String getMenuConfigNames(int i17) {
            return (java.lang.String) this.menuConfigNames_.get(i17);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public com.google.protobuf.y getMenuConfigNamesBytes(int i17) {
            return com.google.protobuf.y.h((java.lang.String) this.menuConfigNames_.get(i17));
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public int getMenuConfigNamesCount() {
            return this.menuConfigNames_.size();
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public java.util.List<java.lang.String> getMenuConfigNamesList() {
            return this.menuConfigNames_;
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReqOrBuilder
        public boolean hasConfigFilePath() {
            return (this.bitField0_ & 1) != 0;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder newBuilder(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq readDynamicMenuConfigReq) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq.Builder) DEFAULT_INSTANCE.createBuilder(readDynamicMenuConfigReq);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigReq) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface ReadDynamicMenuConfigReqOrBuilder extends com.google.protobuf.p8 {
        java.lang.String getConfigFilePath();

        com.google.protobuf.y getConfigFilePathBytes();

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        java.lang.String getMenuConfigNames(int i17);

        com.google.protobuf.y getMenuConfigNamesBytes(int i17);

        int getMenuConfigNamesCount();

        java.util.List<java.lang.String> getMenuConfigNamesList();

        boolean hasConfigFilePath();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes16.dex */
    public static final class ReadDynamicMenuConfigResp extends com.google.protobuf.n5 implements com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder {
        public static final int CONFIGS_FIELD_NUMBER = 1;
        private static final com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.e9 PARSER;
        private byte memoizedIsInitialized = 2;
        private com.google.protobuf.v6 configs_ = com.google.protobuf.n5.emptyProtobufList();

        /* loaded from: classes16.dex */
        public static final class Builder extends com.google.protobuf.h5 implements com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder {
            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder addAllConfigs(java.lang.Iterable<? extends com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> iterable) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).addAllConfigs(iterable);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder addConfigs(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).addConfigs(dynamicMenuConfig);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder clearConfigs() {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).clearConfigs();
                return this;
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder
            public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig getConfigs(int i17) {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).getConfigs(i17);
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder
            public int getConfigsCount() {
                return ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).getConfigsCount();
            }

            @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder
            public java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> getConfigsList() {
                return java.util.Collections.unmodifiableList(((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).getConfigsList());
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder removeConfigs(int i17) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).removeConfigs(i17);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder setConfigs(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).setConfigs(i17, dynamicMenuConfig);
                return this;
            }

            private Builder() {
                super(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.DEFAULT_INSTANCE);
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder addConfigs(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).addConfigs(i17, dynamicMenuConfig);
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder setConfigs(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder builder) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).setConfigs(i17, (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) builder.build());
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder addConfigs(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder builder) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).addConfigs((com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) builder.build());
                return this;
            }

            public com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder addConfigs(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.Builder builder) {
                copyOnWrite();
                ((com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) this.instance).addConfigs(i17, (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) builder.build());
                return this;
            }
        }

        static {
            com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp readDynamicMenuConfigResp = new com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp();
            DEFAULT_INSTANCE = readDynamicMenuConfigResp;
            com.google.protobuf.n5.registerDefaultInstance(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.class, readDynamicMenuConfigResp);
        }

        private ReadDynamicMenuConfigResp() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllConfigs(java.lang.Iterable<? extends com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> iterable) {
            ensureConfigsIsMutable();
            com.google.protobuf.f.addAll((java.lang.Iterable) iterable, (java.util.List) this.configs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigs(com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
            dynamicMenuConfig.getClass();
            ensureConfigsIsMutable();
            this.configs_.add(dynamicMenuConfig);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigs() {
            this.configs_ = com.google.protobuf.n5.emptyProtobufList();
        }

        private void ensureConfigsIsMutable() {
            com.google.protobuf.v6 v6Var = this.configs_;
            if (((com.google.protobuf.h) v6Var).f45145d) {
                return;
            }
            this.configs_ = com.google.protobuf.n5.mutableCopy(v6Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder newBuilder() {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseDelimitedFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(java.nio.ByteBuffer byteBuffer) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static com.google.protobuf.e9 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeConfigs(int i17) {
            ensureConfigsIsMutable();
            this.configs_.remove(i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigs(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
            dynamicMenuConfig.getClass();
            ensureConfigsIsMutable();
            this.configs_.set(i17, dynamicMenuConfig);
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
                    return com.google.protobuf.n5.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new java.lang.Object[]{"configs_", com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig.class});
                case NEW_MUTABLE_INSTANCE:
                    return new com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp();
                case NEW_BUILDER:
                    return new com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder();
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    com.google.protobuf.e9 e9Var = PARSER;
                    if (e9Var == null) {
                        synchronized (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.class) {
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

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder
        public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig getConfigs(int i17) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig) this.configs_.get(i17);
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder
        public int getConfigsCount() {
            return this.configs_.size();
        }

        @Override // com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigRespOrBuilder
        public java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> getConfigsList() {
            return this.configs_;
        }

        public com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder getConfigsOrBuilder(int i17) {
            return (com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder) this.configs_.get(i17);
        }

        public java.util.List<? extends com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfigOrBuilder> getConfigsOrBuilderList() {
            return this.configs_;
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder newBuilder(com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp readDynamicMenuConfigResp) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp.Builder) DEFAULT_INSTANCE.createBuilder(readDynamicMenuConfigResp);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseDelimitedFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(java.nio.ByteBuffer byteBuffer, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, byteBuffer, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(com.google.protobuf.y yVar) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addConfigs(int i17, com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig dynamicMenuConfig) {
            dynamicMenuConfig.getClass();
            ensureConfigsIsMutable();
            this.configs_.add(i17, dynamicMenuConfig);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(com.google.protobuf.y yVar, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, yVar, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(byte[] bArr) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(byte[] bArr, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, bArr, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(java.io.InputStream inputStream) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(java.io.InputStream inputStream, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, inputStream, t4Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(com.google.protobuf.d0 d0Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var);
        }

        public static com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp parseFrom(com.google.protobuf.d0 d0Var, com.google.protobuf.t4 t4Var) {
            return (com.tencent.wechat.aff.misc.WebViewProto.ReadDynamicMenuConfigResp) com.google.protobuf.n5.parseFrom(DEFAULT_INSTANCE, d0Var, t4Var);
        }
    }

    /* loaded from: classes16.dex */
    public interface ReadDynamicMenuConfigRespOrBuilder extends com.google.protobuf.p8 {
        com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig getConfigs(int i17);

        int getConfigsCount();

        java.util.List<com.tencent.wechat.aff.misc.WebViewProto.DynamicMenuConfig> getConfigsList();

        @Override // com.google.protobuf.p8, com.google.protobuf.r8
        /* synthetic */ com.google.protobuf.o8 getDefaultInstanceForType();

        @Override // com.google.protobuf.p8
        /* synthetic */ boolean isInitialized();
    }

    private WebViewProto() {
    }

    public static void registerAllExtensions(com.google.protobuf.t4 t4Var) {
    }
}
