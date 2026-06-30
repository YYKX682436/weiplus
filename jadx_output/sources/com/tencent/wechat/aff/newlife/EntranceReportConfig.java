package com.tencent.wechat.aff.newlife;

/* loaded from: classes8.dex */
public class EntranceReportConfig extends com.tencent.mm.protobuf.f {
    private static final com.tencent.wechat.aff.newlife.EntranceReportConfig DEFAULT_INSTANCE = new com.tencent.wechat.aff.newlife.EntranceReportConfig();
    public int report_switch = 0;
    public int report_ts_interval = 0;
    public int sns_expose_feed_threshold = 0;
    public int reddot_session_report_sync_delay = 0;
    public int sns_delivery_update_n_feed = 0;
    public int sns_delivery_before_m_feed = 0;
    public boolean sns_delivery_disable_cache = false;
    public boolean sns_delivery_disable_preload = false;
    public int sns_delivery_back_page = 0;
    public int report_delay_time = 0;

    public static com.tencent.wechat.aff.newlife.EntranceReportConfig create() {
        return new com.tencent.wechat.aff.newlife.EntranceReportConfig();
    }

    public static com.tencent.wechat.aff.newlife.EntranceReportConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.wechat.aff.newlife.EntranceReportConfig newBuilder() {
        return new com.tencent.wechat.aff.newlife.EntranceReportConfig();
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.newlife.EntranceReportConfig)) {
            return false;
        }
        com.tencent.wechat.aff.newlife.EntranceReportConfig entranceReportConfig = (com.tencent.wechat.aff.newlife.EntranceReportConfig) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.report_switch), java.lang.Integer.valueOf(entranceReportConfig.report_switch)) && n51.f.a(java.lang.Integer.valueOf(this.report_ts_interval), java.lang.Integer.valueOf(entranceReportConfig.report_ts_interval)) && n51.f.a(java.lang.Integer.valueOf(this.sns_expose_feed_threshold), java.lang.Integer.valueOf(entranceReportConfig.sns_expose_feed_threshold)) && n51.f.a(java.lang.Integer.valueOf(this.reddot_session_report_sync_delay), java.lang.Integer.valueOf(entranceReportConfig.reddot_session_report_sync_delay)) && n51.f.a(java.lang.Integer.valueOf(this.sns_delivery_update_n_feed), java.lang.Integer.valueOf(entranceReportConfig.sns_delivery_update_n_feed)) && n51.f.a(java.lang.Integer.valueOf(this.sns_delivery_before_m_feed), java.lang.Integer.valueOf(entranceReportConfig.sns_delivery_before_m_feed)) && n51.f.a(java.lang.Boolean.valueOf(this.sns_delivery_disable_cache), java.lang.Boolean.valueOf(entranceReportConfig.sns_delivery_disable_cache)) && n51.f.a(java.lang.Boolean.valueOf(this.sns_delivery_disable_preload), java.lang.Boolean.valueOf(entranceReportConfig.sns_delivery_disable_preload)) && n51.f.a(java.lang.Integer.valueOf(this.sns_delivery_back_page), java.lang.Integer.valueOf(entranceReportConfig.sns_delivery_back_page)) && n51.f.a(java.lang.Integer.valueOf(this.report_delay_time), java.lang.Integer.valueOf(entranceReportConfig.report_delay_time));
    }

    public int getReddotSessionReportSyncDelay() {
        return this.reddot_session_report_sync_delay;
    }

    public int getReddot_session_report_sync_delay() {
        return this.reddot_session_report_sync_delay;
    }

    public int getReportDelayTime() {
        return this.report_delay_time;
    }

    public int getReportSwitch() {
        return this.report_switch;
    }

    public int getReportTsInterval() {
        return this.report_ts_interval;
    }

    public int getReport_delay_time() {
        return this.report_delay_time;
    }

    public int getReport_switch() {
        return this.report_switch;
    }

    public int getReport_ts_interval() {
        return this.report_ts_interval;
    }

    public int getSnsDeliveryBackPage() {
        return this.sns_delivery_back_page;
    }

    public int getSnsDeliveryBeforeMFeed() {
        return this.sns_delivery_before_m_feed;
    }

    public boolean getSnsDeliveryDisableCache() {
        return this.sns_delivery_disable_cache;
    }

    public boolean getSnsDeliveryDisablePreload() {
        return this.sns_delivery_disable_preload;
    }

    public int getSnsDeliveryUpdateNFeed() {
        return this.sns_delivery_update_n_feed;
    }

    public int getSnsExposeFeedThreshold() {
        return this.sns_expose_feed_threshold;
    }

    public int getSns_delivery_back_page() {
        return this.sns_delivery_back_page;
    }

    public int getSns_delivery_before_m_feed() {
        return this.sns_delivery_before_m_feed;
    }

    public boolean getSns_delivery_disable_cache() {
        return this.sns_delivery_disable_cache;
    }

    public boolean getSns_delivery_disable_preload() {
        return this.sns_delivery_disable_preload;
    }

    public int getSns_delivery_update_n_feed() {
        return this.sns_delivery_update_n_feed;
    }

    public int getSns_expose_feed_threshold() {
        return this.sns_expose_feed_threshold;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.newlife.EntranceReportConfig();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.report_switch);
            fVar.e(2, this.report_ts_interval);
            fVar.e(3, this.sns_expose_feed_threshold);
            fVar.e(4, this.reddot_session_report_sync_delay);
            fVar.e(5, this.sns_delivery_update_n_feed);
            fVar.e(6, this.sns_delivery_before_m_feed);
            fVar.a(7, this.sns_delivery_disable_cache);
            fVar.a(8, this.sns_delivery_disable_preload);
            fVar.e(9, this.sns_delivery_back_page);
            fVar.e(17, this.report_delay_time);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.report_switch) + 0 + b36.f.e(2, this.report_ts_interval) + b36.f.e(3, this.sns_expose_feed_threshold) + b36.f.e(4, this.reddot_session_report_sync_delay) + b36.f.e(5, this.sns_delivery_update_n_feed) + b36.f.e(6, this.sns_delivery_before_m_feed) + b36.f.a(7, this.sns_delivery_disable_cache) + b36.f.a(8, this.sns_delivery_disable_preload) + b36.f.e(9, this.sns_delivery_back_page) + b36.f.e(17, this.report_delay_time);
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
        if (intValue == 17) {
            this.report_delay_time = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.report_switch = aVar2.g(intValue);
                return 0;
            case 2:
                this.report_ts_interval = aVar2.g(intValue);
                return 0;
            case 3:
                this.sns_expose_feed_threshold = aVar2.g(intValue);
                return 0;
            case 4:
                this.reddot_session_report_sync_delay = aVar2.g(intValue);
                return 0;
            case 5:
                this.sns_delivery_update_n_feed = aVar2.g(intValue);
                return 0;
            case 6:
                this.sns_delivery_before_m_feed = aVar2.g(intValue);
                return 0;
            case 7:
                this.sns_delivery_disable_cache = aVar2.c(intValue);
                return 0;
            case 8:
                this.sns_delivery_disable_preload = aVar2.c(intValue);
                return 0;
            case 9:
                this.sns_delivery_back_page = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReddotSessionReportSyncDelay(int i17) {
        this.reddot_session_report_sync_delay = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReddot_session_report_sync_delay(int i17) {
        this.reddot_session_report_sync_delay = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReportDelayTime(int i17) {
        this.report_delay_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReportSwitch(int i17) {
        this.report_switch = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReportTsInterval(int i17) {
        this.report_ts_interval = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReport_delay_time(int i17) {
        this.report_delay_time = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReport_switch(int i17) {
        this.report_switch = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setReport_ts_interval(int i17) {
        this.report_ts_interval = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSnsDeliveryBackPage(int i17) {
        this.sns_delivery_back_page = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSnsDeliveryBeforeMFeed(int i17) {
        this.sns_delivery_before_m_feed = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSnsDeliveryDisableCache(boolean z17) {
        this.sns_delivery_disable_cache = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSnsDeliveryDisablePreload(boolean z17) {
        this.sns_delivery_disable_preload = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSnsDeliveryUpdateNFeed(int i17) {
        this.sns_delivery_update_n_feed = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSnsExposeFeedThreshold(int i17) {
        this.sns_expose_feed_threshold = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSns_delivery_back_page(int i17) {
        this.sns_delivery_back_page = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSns_delivery_before_m_feed(int i17) {
        this.sns_delivery_before_m_feed = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSns_delivery_disable_cache(boolean z17) {
        this.sns_delivery_disable_cache = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSns_delivery_disable_preload(boolean z17) {
        this.sns_delivery_disable_preload = z17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSns_delivery_update_n_feed(int i17) {
        this.sns_delivery_update_n_feed = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig setSns_expose_feed_threshold(int i17) {
        this.sns_expose_feed_threshold = i17;
        return this;
    }

    public com.tencent.wechat.aff.newlife.EntranceReportConfig mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.wechat.aff.newlife.EntranceReportConfig parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.newlife.EntranceReportConfig) super.parseFrom(bArr);
    }
}
