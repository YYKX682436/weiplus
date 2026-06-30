package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.jj4 f166003a;

    @za4.k1(resType = 5)
    private final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo;

    public g1(r45.jj4 media, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo clickActionInfo) {
        kotlin.jvm.internal.o.g(media, "media");
        kotlin.jvm.internal.o.g(clickActionInfo, "clickActionInfo");
        this.f166003a = media;
        this.clickActionInfo = clickActionInfo;
    }

    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.GridItemInfo");
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.clickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getClickActionInfo", "com.tencent.mm.plugin.sns.storage.GridItemInfo");
        return adClickActionInfo;
    }

    public final r45.jj4 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.GridItemInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.GridItemInfo");
        return this.f166003a;
    }
}
