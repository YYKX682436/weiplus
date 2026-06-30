package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class x0 implements com.tencent.mm.plugin.sight.decode.model.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f169429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.z0 f169430c;

    public x0(com.tencent.mm.plugin.sns.ui.item.z0 z0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, long j17) {
        this.f169430c = z0Var;
        this.f169428a = snsInfo;
        this.f169429b = j17;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.l
    public void a(com.tencent.mm.plugin.sight.decode.model.s sVar, long j17) {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
        long j18 = this.f169429b;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169428a;
        if (snsInfo == null || !snsInfo.isAd()) {
            ca4.z0.t0(j18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
            return;
        }
        com.tencent.mm.plugin.sns.ui.item.z0 z0Var = this.f169430c;
        com.tencent.mm.plugin.sns.ui.bs bsVar = z0Var.f169251h;
        if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
            return;
        }
        b1Var.s(snsInfo.field_snsId);
        z0Var.f169251h.f168036b.f169702c.v(snsInfo.field_snsId, j17 * 1000);
        if (!z0Var.f169251h.f168036b.f169702c.m(j18)) {
            double videoDuration = sVar.f162449e == -1 ? 0.0d : ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getVideoDuration(sVar.f162449e);
            i64.b1 b1Var2 = z0Var.f169251h.f168036b.f169702c;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            b1Var2.w(j18, android.os.SystemClock.elapsedRealtime());
            z0Var.f169251h.f168036b.f169702c.x(j18, (int) videoDuration, true);
            z0Var.f169251h.f168036b.f169702c.d(j18, j18);
            ca4.z0.t0(j18);
        }
        ca4.z0.t0(j18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$5");
    }
}
