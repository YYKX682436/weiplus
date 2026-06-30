package u94;

/* loaded from: classes4.dex */
public class o implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425878d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f425879e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f425880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f425881g;

    /* renamed from: h, reason: collision with root package name */
    public final w64.k f425882h;

    public o(u94.p pVar, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, w64.k kVar) {
        this.f425878d = new java.lang.ref.WeakReference(pVar);
        this.f425879e = adClickActionInfo;
        this.f425880f = snsInfo;
        this.f425881g = i17;
        this.f425882h = kVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
        com.tencent.mars.xlog.Log.i("HalfSubscribeController", "onSceneEnd errType %d,errCode %d,errMsg %s,scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        try {
            if (m1Var instanceof ib4.j) {
                java.lang.ref.WeakReference weakReference = this.f425878d;
                if (weakReference != null && weakReference.get() != null) {
                    u94.p pVar = (u94.p) weakReference.get();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    pVar.f425883a = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    com.tencent.mm.sdk.platformtools.u3.h(new u94.l(this, pVar));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    android.content.Context context = pVar.f425886d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    int i19 = this.f425881g;
                    com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f425879e;
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425880f;
                    if (i17 == 0 && i18 == 0) {
                        com.tencent.mars.xlog.Log.i("HalfSubscribeController", "subscribe is success");
                        com.tencent.mm.sdk.platformtools.u3.h(new u94.m(this, context));
                        com.tencent.mm.plugin.sns.storage.w2.k(ca4.z0.t0(snsInfo.field_snsId), java.lang.String.valueOf(1));
                        o94.c.b(snsInfo, i19, new com.tencent.mm.plugin.sns.storage.x2(adClickActionInfo.f162597o, adClickActionInfo.f162583h, 1, 0));
                    } else {
                        com.tencent.mars.xlog.Log.e("HalfSubscribeController", "subscribe is failed");
                        com.tencent.mm.sdk.platformtools.u3.h(new u94.n(this, context));
                        o94.c.b(snsInfo, i19, new com.tencent.mm.plugin.sns.storage.x2(adClickActionInfo.f162597o, adClickActionInfo.f162583h, 1, -3));
                    }
                    gm0.j1.d().q(m1Var.getType(), this);
                }
                gm0.j1.d().q(m1Var.getType(), this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                return;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfSubscribeController", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
    }
}
