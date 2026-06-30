package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class w0 implements com.tencent.mm.plugin.sight.decode.model.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f169426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.z0 f169427c;

    public w0(com.tencent.mm.plugin.sns.ui.item.z0 z0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, long j17) {
        this.f169427c = z0Var;
        this.f169425a = snsInfo;
        this.f169426b = j17;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.k
    public void a(com.tencent.mm.plugin.sight.decode.model.s sVar, int i17) {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
        if (i17 != -1) {
            long j17 = this.f169426b;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169425a;
            if (snsInfo == null || !snsInfo.isAd()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.VideoTimeLineItem", "onCompletion, !isAd,  snsId=" + ca4.z0.t0(j17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
                return;
            }
            com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169427c.f169251h;
            if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
                return;
            } else {
                b1Var.b(j17);
                ca4.z0.t0(j17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$4");
    }
}
