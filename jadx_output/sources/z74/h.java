package z74;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f470605a;

    /* renamed from: b, reason: collision with root package name */
    public i64.b1 f470606b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f470607c;

    /* renamed from: d, reason: collision with root package name */
    public r45.jj4 f470608d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f470609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470611g;

    /* renamed from: h, reason: collision with root package name */
    public z74.c f470612h;

    /* renamed from: i, reason: collision with root package name */
    public z74.a f470613i;

    public h(java.lang.String str) {
        this.f470605a = android.text.TextUtils.isEmpty(str) ? "OnlineVideoPlayBuilder" : str;
    }

    public z74.h a(android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        this.f470609e = viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        return this;
    }

    public z74.h b(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        this.f470608d = jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        return this;
    }

    public z74.h c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        this.f470607c = snsInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        return this;
    }

    public z74.h d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        this.f470611g = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r17, xd4.e0 r18) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z74.h.e(int, xd4.e0):void");
    }

    public z74.h f(i64.b1 b1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        this.f470606b = b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        return this;
    }

    public z74.h g(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timelineId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        this.f470610f = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timelineId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
        return this;
    }
}
