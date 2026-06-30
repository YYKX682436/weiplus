package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class FinderTipsShowInfo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.FinderTipsShowInfo DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.FinderTipsShowInfo();
    public int show_type = 0;
    public int count = 0;
    public java.lang.String title = "";
    public java.lang.String icon_url = "";
    public int clear_type = 0;
    public java.lang.String path = "";
    public java.lang.String parent = "";
    public int show_ext_info_type = 0;
    public com.tencent.mm.protobuf.g show_ext_info = com.tencent.mm.protobuf.g.f192155b;
    public java.util.LinkedList<java.lang.String> multi_icon_urls = new java.util.LinkedList<>();
    public com.tencent.wechat.aff.newlife.ClientStatsInfo client_stats_info = com.tencent.wechat.aff.newlife.ClientStatsInfo.getDefaultInstance();
    public int show_live_tab_id = 0;
    public int ignore_freq_limit = 0;
    public int expose_count_limit = 0;
    public int expose_limit_strategy = 0;
    public int cold_time = 0;
    public com.tencent.wechat.aff.newlife.IconConfig iconConfig = com.tencent.wechat.aff.newlife.IconConfig.getDefaultInstance();
    public com.tencent.wechat.aff.newlife.AttributeTitle attributeTitle = com.tencent.wechat.aff.newlife.AttributeTitle.getDefaultInstance();
    public int cacheChangeTabOption = 0;
    public java.lang.String username = "";
    public int coldTimeLevel = 0;
    public com.tencent.wechat.aff.newlife.DSLRender dslRender = com.tencent.wechat.aff.newlife.DSLRender.getDefaultInstance();

    public static com.tencent.wechat.aff.newlife.FinderTipsShowInfo create() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowInfo();
    }

    public static com.tencent.wechat.aff.newlife.FinderTipsShowInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.FinderTipsShowInfo newBuilder() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowInfo();
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo addAllElementMultiIconUrls(java.util.Collection<java.lang.String> collection) {
        this.multi_icon_urls.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo addAllElementMulti_icon_urls(java.util.Collection<java.lang.String> collection) {
        this.multi_icon_urls.addAll(collection);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo addElementMultiIconUrls(java.lang.String str) {
        this.multi_icon_urls.add(str);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo addElementMulti_icon_urls(java.lang.String str) {
        this.multi_icon_urls.add(str);
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.FinderTipsShowInfo)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.FinderTipsShowInfo finderTipsShowInfo = (com.tencent.wechat.aff.newlife.FinderTipsShowInfo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.show_type), java.lang.Integer.valueOf(finderTipsShowInfo.show_type)) && n51.f.a(java.lang.Integer.valueOf(this.count), java.lang.Integer.valueOf(finderTipsShowInfo.count)) && n51.f.a(this.title, finderTipsShowInfo.title) && n51.f.a(this.icon_url, finderTipsShowInfo.icon_url) && n51.f.a(java.lang.Integer.valueOf(this.clear_type), java.lang.Integer.valueOf(finderTipsShowInfo.clear_type)) && n51.f.a(this.path, finderTipsShowInfo.path) && n51.f.a(this.parent, finderTipsShowInfo.parent) && n51.f.a(java.lang.Integer.valueOf(this.show_ext_info_type), java.lang.Integer.valueOf(finderTipsShowInfo.show_ext_info_type)) && n51.f.a(this.show_ext_info, finderTipsShowInfo.show_ext_info) && n51.f.a(this.multi_icon_urls, finderTipsShowInfo.multi_icon_urls) && n51.f.a(this.client_stats_info, finderTipsShowInfo.client_stats_info) && n51.f.a(java.lang.Integer.valueOf(this.show_live_tab_id), java.lang.Integer.valueOf(finderTipsShowInfo.show_live_tab_id)) && n51.f.a(java.lang.Integer.valueOf(this.ignore_freq_limit), java.lang.Integer.valueOf(finderTipsShowInfo.ignore_freq_limit)) && n51.f.a(java.lang.Integer.valueOf(this.expose_count_limit), java.lang.Integer.valueOf(finderTipsShowInfo.expose_count_limit)) && n51.f.a(java.lang.Integer.valueOf(this.expose_limit_strategy), java.lang.Integer.valueOf(finderTipsShowInfo.expose_limit_strategy)) && n51.f.a(java.lang.Integer.valueOf(this.cold_time), java.lang.Integer.valueOf(finderTipsShowInfo.cold_time)) && n51.f.a(this.iconConfig, finderTipsShowInfo.iconConfig) && n51.f.a(this.attributeTitle, finderTipsShowInfo.attributeTitle) && n51.f.a(java.lang.Integer.valueOf(this.cacheChangeTabOption), java.lang.Integer.valueOf(finderTipsShowInfo.cacheChangeTabOption)) && n51.f.a(this.username, finderTipsShowInfo.username) && n51.f.a(java.lang.Integer.valueOf(this.coldTimeLevel), java.lang.Integer.valueOf(finderTipsShowInfo.coldTimeLevel)) && n51.f.a(this.dslRender, finderTipsShowInfo.dslRender);
    }

    public com.tencent.wechat.aff.newlife.AttributeTitle getAttributeTitle() {
        return this.attributeTitle;
    }

    public int getCacheChangeTabOption() {
        return this.cacheChangeTabOption;
    }

    public int getClearType() {
        return this.clear_type;
    }

    public int getClear_type() {
        return this.clear_type;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo getClientStatsInfo() {
        return this.client_stats_info;
    }

    public com.tencent.wechat.aff.newlife.ClientStatsInfo getClient_stats_info() {
        return this.client_stats_info;
    }

    public int getColdTime() {
        return this.cold_time;
    }

    public int getColdTimeLevel() {
        return this.coldTimeLevel;
    }

    public int getCold_time() {
        return this.cold_time;
    }

    public int getCount() {
        return this.count;
    }

    public com.tencent.wechat.aff.newlife.DSLRender getDslRender() {
        return this.dslRender;
    }

    public int getExposeCountLimit() {
        return this.expose_count_limit;
    }

    public int getExposeLimitStrategy() {
        return this.expose_limit_strategy;
    }

    public int getExpose_count_limit() {
        return this.expose_count_limit;
    }

    public int getExpose_limit_strategy() {
        return this.expose_limit_strategy;
    }

    public com.tencent.wechat.aff.newlife.IconConfig getIconConfig() {
        return this.iconConfig;
    }

    public java.lang.String getIconUrl() {
        return this.icon_url;
    }

    public java.lang.String getIcon_url() {
        return this.icon_url;
    }

    public int getIgnoreFreqLimit() {
        return this.ignore_freq_limit;
    }

    public int getIgnore_freq_limit() {
        return this.ignore_freq_limit;
    }

    public java.util.LinkedList<java.lang.String> getMultiIconUrls() {
        return this.multi_icon_urls;
    }

    public java.util.LinkedList<java.lang.String> getMulti_icon_urls() {
        return this.multi_icon_urls;
    }

    public java.lang.String getParent() {
        return this.parent;
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public com.tencent.mm.protobuf.g getShowExtInfo() {
        return this.show_ext_info;
    }

    public int getShowExtInfoType() {
        return this.show_ext_info_type;
    }

    public int getShowLiveTabId() {
        return this.show_live_tab_id;
    }

    public int getShowType() {
        return this.show_type;
    }

    public com.tencent.mm.protobuf.g getShow_ext_info() {
        return this.show_ext_info;
    }

    public int getShow_ext_info_type() {
        return this.show_ext_info_type;
    }

    public int getShow_live_tab_id() {
        return this.show_live_tab_id;
    }

    public int getShow_type() {
        return this.show_type;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.FinderTipsShowInfo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.show_type);
            fVar.e(2, this.count);
            java.lang.String str = this.title;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.icon_url;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.clear_type);
            java.lang.String str3 = this.path;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.parent;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.show_ext_info_type);
            com.tencent.mm.protobuf.g gVar = this.show_ext_info;
            if (gVar != null) {
                fVar.b(9, gVar);
            }
            fVar.g(10, 1, this.multi_icon_urls);
            com.tencent.wechat.aff.newlife.ClientStatsInfo clientStatsInfo = this.client_stats_info;
            if (clientStatsInfo != null) {
                fVar.i(11, clientStatsInfo.computeSize());
                this.client_stats_info.writeFields(fVar);
            }
            fVar.e(12, this.show_live_tab_id);
            fVar.e(13, this.ignore_freq_limit);
            fVar.e(14, this.expose_count_limit);
            fVar.e(15, this.expose_limit_strategy);
            fVar.e(16, this.cold_time);
            com.tencent.wechat.aff.newlife.IconConfig iconConfig = this.iconConfig;
            if (iconConfig != null) {
                fVar.i(17, iconConfig.computeSize());
                this.iconConfig.writeFields(fVar);
            }
            com.tencent.wechat.aff.newlife.AttributeTitle attributeTitle = this.attributeTitle;
            if (attributeTitle != null) {
                fVar.i(18, attributeTitle.computeSize());
                this.attributeTitle.writeFields(fVar);
            }
            fVar.e(19, this.cacheChangeTabOption);
            java.lang.String str5 = this.username;
            if (str5 != null) {
                fVar.j(20, str5);
            }
            fVar.e(21, this.coldTimeLevel);
            com.tencent.wechat.aff.newlife.DSLRender dSLRender = this.dslRender;
            if (dSLRender != null) {
                fVar.i(22, dSLRender.computeSize());
                this.dslRender.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.show_type) + 0 + b36.f.e(2, this.count);
            java.lang.String str6 = this.title;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.icon_url;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.clear_type);
            java.lang.String str8 = this.path;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.parent;
            if (str9 != null) {
                e18 += b36.f.j(7, str9);
            }
            int e19 = e18 + b36.f.e(8, this.show_ext_info_type);
            com.tencent.mm.protobuf.g gVar2 = this.show_ext_info;
            if (gVar2 != null) {
                e19 += b36.f.b(9, gVar2);
            }
            int g17 = e19 + b36.f.g(10, 1, this.multi_icon_urls);
            com.tencent.wechat.aff.newlife.ClientStatsInfo clientStatsInfo2 = this.client_stats_info;
            if (clientStatsInfo2 != null) {
                g17 += b36.f.i(11, clientStatsInfo2.computeSize());
            }
            int e27 = g17 + b36.f.e(12, this.show_live_tab_id) + b36.f.e(13, this.ignore_freq_limit) + b36.f.e(14, this.expose_count_limit) + b36.f.e(15, this.expose_limit_strategy) + b36.f.e(16, this.cold_time);
            com.tencent.wechat.aff.newlife.IconConfig iconConfig2 = this.iconConfig;
            if (iconConfig2 != null) {
                e27 += b36.f.i(17, iconConfig2.computeSize());
            }
            com.tencent.wechat.aff.newlife.AttributeTitle attributeTitle2 = this.attributeTitle;
            if (attributeTitle2 != null) {
                e27 += b36.f.i(18, attributeTitle2.computeSize());
            }
            int e28 = e27 + b36.f.e(19, this.cacheChangeTabOption);
            java.lang.String str10 = this.username;
            if (str10 != null) {
                e28 += b36.f.j(20, str10);
            }
            int e29 = e28 + b36.f.e(21, this.coldTimeLevel);
            com.tencent.wechat.aff.newlife.DSLRender dSLRender2 = this.dslRender;
            return dSLRender2 != null ? e29 + b36.f.i(22, dSLRender2.computeSize()) : e29;
        }
        if (i17 == 2) {
            this.multi_icon_urls.clear();
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
        switch (intValue) {
            case 1:
                this.show_type = aVar2.g(intValue);
                return 0;
            case 2:
                this.count = aVar2.g(intValue);
                return 0;
            case 3:
                this.title = aVar2.k(intValue);
                return 0;
            case 4:
                this.icon_url = aVar2.k(intValue);
                return 0;
            case 5:
                this.clear_type = aVar2.g(intValue);
                return 0;
            case 6:
                this.path = aVar2.k(intValue);
                return 0;
            case 7:
                this.parent = aVar2.k(intValue);
                return 0;
            case 8:
                this.show_ext_info_type = aVar2.g(intValue);
                return 0;
            case 9:
                this.show_ext_info = aVar2.d(intValue);
                return 0;
            case 10:
                this.multi_icon_urls.add(aVar2.k(intValue));
                return 0;
            case 11:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.tencent.wechat.aff.newlife.ClientStatsInfo clientStatsInfo3 = new com.tencent.wechat.aff.newlife.ClientStatsInfo();
                    if (bArr != null && bArr.length > 0) {
                        clientStatsInfo3.parseFrom(bArr);
                    }
                    this.client_stats_info = clientStatsInfo3;
                }
                return 0;
            case 12:
                this.show_live_tab_id = aVar2.g(intValue);
                return 0;
            case 13:
                this.ignore_freq_limit = aVar2.g(intValue);
                return 0;
            case 14:
                this.expose_count_limit = aVar2.g(intValue);
                return 0;
            case 15:
                this.expose_limit_strategy = aVar2.g(intValue);
                return 0;
            case 16:
                this.cold_time = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.wechat.aff.newlife.IconConfig iconConfig3 = new com.tencent.wechat.aff.newlife.IconConfig();
                    if (bArr2 != null && bArr2.length > 0) {
                        iconConfig3.parseFrom(bArr2);
                    }
                    this.iconConfig = iconConfig3;
                }
                return 0;
            case 18:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    com.tencent.wechat.aff.newlife.AttributeTitle attributeTitle3 = new com.tencent.wechat.aff.newlife.AttributeTitle();
                    if (bArr3 != null && bArr3.length > 0) {
                        attributeTitle3.parseFrom(bArr3);
                    }
                    this.attributeTitle = attributeTitle3;
                }
                return 0;
            case 19:
                this.cacheChangeTabOption = aVar2.g(intValue);
                return 0;
            case 20:
                this.username = aVar2.k(intValue);
                return 0;
            case 21:
                this.coldTimeLevel = aVar2.g(intValue);
                return 0;
            case 22:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    com.tencent.wechat.aff.newlife.DSLRender dSLRender3 = new com.tencent.wechat.aff.newlife.DSLRender();
                    if (bArr4 != null && bArr4.length > 0) {
                        dSLRender3.parseFrom(bArr4);
                    }
                    this.dslRender = dSLRender3;
                }
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setAttributeTitle(com.tencent.wechat.aff.newlife.AttributeTitle attributeTitle) {
        this.attributeTitle = attributeTitle;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setCacheChangeTabOption(int i17) {
        this.cacheChangeTabOption = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setClearType(int i17) {
        this.clear_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setClear_type(int i17) {
        this.clear_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setClientStatsInfo(com.tencent.wechat.aff.newlife.ClientStatsInfo clientStatsInfo) {
        this.client_stats_info = clientStatsInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setClient_stats_info(com.tencent.wechat.aff.newlife.ClientStatsInfo clientStatsInfo) {
        this.client_stats_info = clientStatsInfo;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setColdTime(int i17) {
        this.cold_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setColdTimeLevel(int i17) {
        this.coldTimeLevel = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setCold_time(int i17) {
        this.cold_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setCount(int i17) {
        this.count = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setDslRender(com.tencent.wechat.aff.newlife.DSLRender dSLRender) {
        this.dslRender = dSLRender;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setExposeCountLimit(int i17) {
        this.expose_count_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setExposeLimitStrategy(int i17) {
        this.expose_limit_strategy = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setExpose_count_limit(int i17) {
        this.expose_count_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setExpose_limit_strategy(int i17) {
        this.expose_limit_strategy = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setIconConfig(com.tencent.wechat.aff.newlife.IconConfig iconConfig) {
        this.iconConfig = iconConfig;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setIconUrl(java.lang.String str) {
        this.icon_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setIcon_url(java.lang.String str) {
        this.icon_url = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setIgnoreFreqLimit(int i17) {
        this.ignore_freq_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setIgnore_freq_limit(int i17) {
        this.ignore_freq_limit = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setMultiIconUrls(java.util.LinkedList<java.lang.String> linkedList) {
        this.multi_icon_urls = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setMulti_icon_urls(java.util.LinkedList<java.lang.String> linkedList) {
        this.multi_icon_urls = linkedList;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setParent(java.lang.String str) {
        this.parent = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setPath(java.lang.String str) {
        this.path = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShowExtInfo(com.tencent.mm.protobuf.g gVar) {
        this.show_ext_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShowExtInfoType(int i17) {
        this.show_ext_info_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShowLiveTabId(int i17) {
        this.show_live_tab_id = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShowType(int i17) {
        this.show_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShow_ext_info(com.tencent.mm.protobuf.g gVar) {
        this.show_ext_info = gVar;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShow_ext_info_type(int i17) {
        this.show_ext_info_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShow_live_tab_id(int i17) {
        this.show_live_tab_id = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setShow_type(int i17) {
        this.show_type = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setTitle(java.lang.String str) {
        this.title = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo setUsername(java.lang.String str) {
        this.username = str;
        return this;
    }

    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.FinderTipsShowInfo parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.FinderTipsShowInfo) super.parseFrom(bArr);
    }
}
