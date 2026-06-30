package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class EntranceReportSwitch extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.EntranceReportSwitch DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.EntranceReportSwitch();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig discovery_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig fg_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public boolean is_merge = false;
    public com.tencent.wechat.aff.newlife.EntranceReportConfig enter_sns_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig exit_sns_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig sns_expose_last_feed_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig sns_expose_n_feed_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig reddot_session_report_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig sns_delivery_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig global_search_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.EntranceReportConfig enter_finder_config = com.tencent.wechat.aff.newlife.EntranceReportConfig.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.EntranceReportSwitch create() {
        return new com.tencent.wechat.aff.newlife.EntranceReportSwitch();
    }

    public static com.tencent.wechat.aff.newlife.EntranceReportSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.EntranceReportSwitch newBuilder() {
        return new com.tencent.wechat.aff.newlife.EntranceReportSwitch();
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.EntranceReportSwitch)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.EntranceReportSwitch entranceReportSwitch = (com.tencent.wechat.aff.newlife.EntranceReportSwitch) fVar;
        return n51.f.a(this.discovery_config, entranceReportSwitch.discovery_config) && n51.f.a(this.fg_config, entranceReportSwitch.fg_config) && n51.f.a(java.lang.Boolean.valueOf(this.is_merge), java.lang.Boolean.valueOf(entranceReportSwitch.is_merge)) && n51.f.a(this.enter_sns_config, entranceReportSwitch.enter_sns_config) && n51.f.a(this.exit_sns_config, entranceReportSwitch.exit_sns_config) && n51.f.a(this.sns_expose_last_feed_config, entranceReportSwitch.sns_expose_last_feed_config) && n51.f.a(this.sns_expose_n_feed_config, entranceReportSwitch.sns_expose_n_feed_config) && n51.f.a(this.reddot_session_report_config, entranceReportSwitch.reddot_session_report_config) && n51.f.a(this.sns_delivery_config, entranceReportSwitch.sns_delivery_config) && n51.f.a(this.global_search_config, entranceReportSwitch.global_search_config) && n51.f.a(this.enter_finder_config, entranceReportSwitch.enter_finder_config);
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getDiscoveryConfig() {
        return this.discovery_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getDiscovery_config() {
        return this.discovery_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getEnterFinderConfig() {
        return this.enter_finder_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getEnterSnsConfig() {
        return this.enter_sns_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getEnter_finder_config() {
        return this.enter_finder_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getEnter_sns_config() {
        return this.enter_sns_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getExitSnsConfig() {
        return this.exit_sns_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getExit_sns_config() {
        return this.exit_sns_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getFgConfig() {
        return this.fg_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getFg_config() {
        return this.fg_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getGlobalSearchConfig() {
        return this.global_search_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getGlobal_search_config() {
        return this.global_search_config;
    }

    public boolean getIsMerge() {
        return this.is_merge;
    }

    public boolean getIs_merge() {
        return this.is_merge;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getReddotSessionReportConfig() {
        return this.reddot_session_report_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getReddot_session_report_config() {
        return this.reddot_session_report_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getSnsDeliveryConfig() {
        return this.sns_delivery_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getSnsExposeLastFeedConfig() {
        return this.sns_expose_last_feed_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getSnsExposeNFeedConfig() {
        return this.sns_expose_n_feed_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getSns_delivery_config() {
        return this.sns_delivery_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getSns_expose_last_feed_config() {
        return this.sns_expose_last_feed_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig getSns_expose_n_feed_config() {
        return this.sns_expose_n_feed_config;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.EntranceReportSwitch();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig = this.discovery_config;
            if (entranceReportConfig != null) {
                fVar.i(1, entranceReportConfig.computeSize());
                this.discovery_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig2 = this.fg_config;
            if (entranceReportConfig2 != null) {
                fVar.i(2, entranceReportConfig2.computeSize());
                this.fg_config.writeFields(fVar);
            }
            fVar.a(3, this.is_merge);
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig3 = this.enter_sns_config;
            if (entranceReportConfig3 != null) {
                fVar.i(4, entranceReportConfig3.computeSize());
                this.enter_sns_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig4 = this.exit_sns_config;
            if (entranceReportConfig4 != null) {
                fVar.i(5, entranceReportConfig4.computeSize());
                this.exit_sns_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig5 = this.sns_expose_last_feed_config;
            if (entranceReportConfig5 != null) {
                fVar.i(6, entranceReportConfig5.computeSize());
                this.sns_expose_last_feed_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig6 = this.sns_expose_n_feed_config;
            if (entranceReportConfig6 != null) {
                fVar.i(7, entranceReportConfig6.computeSize());
                this.sns_expose_n_feed_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig7 = this.reddot_session_report_config;
            if (entranceReportConfig7 != null) {
                fVar.i(8, entranceReportConfig7.computeSize());
                this.reddot_session_report_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig8 = this.sns_delivery_config;
            if (entranceReportConfig8 != null) {
                fVar.i(9, entranceReportConfig8.computeSize());
                this.sns_delivery_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig9 = this.global_search_config;
            if (entranceReportConfig9 != null) {
                fVar.i(14, entranceReportConfig9.computeSize());
                this.global_search_config.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig10 = this.enter_finder_config;
            if (entranceReportConfig10 != null) {
                fVar.i(17, entranceReportConfig10.computeSize());
                this.enter_finder_config.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig11 = this.discovery_config;
            int i18 = entranceReportConfig11 != null ? 0 + b36.f.i(1, entranceReportConfig11.computeSize()) : 0;
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig12 = this.fg_config;
            if (entranceReportConfig12 != null) {
                i18 += b36.f.i(2, entranceReportConfig12.computeSize());
            }
            int a17 = i18 + b36.f.a(3, this.is_merge);
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig13 = this.enter_sns_config;
            if (entranceReportConfig13 != null) {
                a17 += b36.f.i(4, entranceReportConfig13.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig14 = this.exit_sns_config;
            if (entranceReportConfig14 != null) {
                a17 += b36.f.i(5, entranceReportConfig14.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig15 = this.sns_expose_last_feed_config;
            if (entranceReportConfig15 != null) {
                a17 += b36.f.i(6, entranceReportConfig15.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig16 = this.sns_expose_n_feed_config;
            if (entranceReportConfig16 != null) {
                a17 += b36.f.i(7, entranceReportConfig16.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig17 = this.reddot_session_report_config;
            if (entranceReportConfig17 != null) {
                a17 += b36.f.i(8, entranceReportConfig17.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig18 = this.sns_delivery_config;
            if (entranceReportConfig18 != null) {
                a17 += b36.f.i(9, entranceReportConfig18.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig19 = this.global_search_config;
            if (entranceReportConfig19 != null) {
                a17 += b36.f.i(14, entranceReportConfig19.computeSize());
            }
            com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig20 = this.enter_finder_config;
            return entranceReportConfig20 != null ? a17 + b36.f.i(17, entranceReportConfig20.computeSize()) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 14) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig21 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                if (bArr != null && bArr.length > 0) {
                    entranceReportConfig21.parseFrom(bArr);
                }
                this.global_search_config = entranceReportConfig21;
            }
            return 0;
        }
        if (intValue == 17) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig22 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                if (bArr2 != null && bArr2.length > 0) {
                    entranceReportConfig22.parseFrom(bArr2);
                }
                this.enter_finder_config = entranceReportConfig22;
            }
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig23 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr3 != null && bArr3.length > 0) {
                        entranceReportConfig23.parseFrom(bArr3);
                    }
                    this.discovery_config = entranceReportConfig23;
                }
                return 0;
            case 2:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig24 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr4 != null && bArr4.length > 0) {
                        entranceReportConfig24.parseFrom(bArr4);
                    }
                    this.fg_config = entranceReportConfig24;
                }
                return 0;
            case 3:
                this.is_merge = aVar2.c(intValue);
                return 0;
            case 4:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig25 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr5 != null && bArr5.length > 0) {
                        entranceReportConfig25.parseFrom(bArr5);
                    }
                    this.enter_sns_config = entranceReportConfig25;
                }
                return 0;
            case 5:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig26 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr6 != null && bArr6.length > 0) {
                        entranceReportConfig26.parseFrom(bArr6);
                    }
                    this.exit_sns_config = entranceReportConfig26;
                }
                return 0;
            case 6:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig27 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr7 != null && bArr7.length > 0) {
                        entranceReportConfig27.parseFrom(bArr7);
                    }
                    this.sns_expose_last_feed_config = entranceReportConfig27;
                }
                return 0;
            case 7:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig28 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr8 != null && bArr8.length > 0) {
                        entranceReportConfig28.parseFrom(bArr8);
                    }
                    this.sns_expose_n_feed_config = entranceReportConfig28;
                }
                return 0;
            case 8:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig29 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr9 != null && bArr9.length > 0) {
                        entranceReportConfig29.parseFrom(bArr9);
                    }
                    this.reddot_session_report_config = entranceReportConfig29;
                }
                return 0;
            case 9:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig30 = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
                    if (bArr10 != null && bArr10.length > 0) {
                        entranceReportConfig30.parseFrom(bArr10);
                    }
                    this.sns_delivery_config = entranceReportConfig30;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setDiscoveryConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.discovery_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setDiscovery_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.discovery_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setEnterFinderConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.enter_finder_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setEnterSnsConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.enter_sns_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setEnter_finder_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.enter_finder_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setEnter_sns_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.enter_sns_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setExitSnsConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.exit_sns_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setExit_sns_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.exit_sns_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setFgConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.fg_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setFg_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.fg_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setGlobalSearchConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.global_search_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setGlobal_search_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.global_search_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setIsMerge(boolean z17) {
        this.is_merge = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setIs_merge(boolean z17) {
        this.is_merge = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setReddotSessionReportConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.reddot_session_report_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setReddot_session_report_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.reddot_session_report_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setSnsDeliveryConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.sns_delivery_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setSnsExposeLastFeedConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.sns_expose_last_feed_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setSnsExposeNFeedConfig(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.sns_expose_n_feed_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setSns_delivery_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.sns_delivery_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setSns_expose_last_feed_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.sns_expose_last_feed_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch setSns_expose_n_feed_config(com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig) {
        this.sns_expose_n_feed_config = entranceReportConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportSwitch mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.EntranceReportSwitch parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.EntranceReportSwitch) super.parseFrom(bArr);
    }
}
