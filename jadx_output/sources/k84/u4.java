package k84;

/* loaded from: classes4.dex */
public final class u4 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.c6 f305279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f305280e;

    public u4(k84.c6 c6Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f305279d = c6Var;
        this.f305280e = snsInfo;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        k84.c6 c6Var = this.f305279d;
        java.lang.String j17 = c6Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f305280e;
        sb6.append(snsInfo.getSnsId());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView E = k84.c6.E(c6Var);
        android.content.Context context = E != null ? E.getContext() : null;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        } else {
            if (e0Var == l44.e0.f316093d) {
                k84.c6.F(c6Var, context);
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView E2 = k84.c6.E(c6Var);
                if (E2 != null) {
                    E2.q(false);
                }
                k84.q4.f305212d.a(a84.d0.c(snsInfo), java.lang.Boolean.TRUE);
            } else if (e0Var == l44.e0.f316094e) {
                com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView E3 = k84.c6.E(c6Var);
                if (E3 != null) {
                    E3.q(true);
                }
                k84.q4.f305212d.a(a84.d0.c(snsInfo), java.lang.Boolean.FALSE);
            } else if (e0Var == l44.e0.f316098i) {
                k84.c6.y(c6Var, 1550);
            } else if (e0Var == l44.e0.f316099m) {
                k84.c6.y(c6Var, 1552);
            } else if (e0Var == l44.e0.f316100n) {
                k84.c6.y(c6Var, 1551);
            } else if (e0Var == l44.e0.f316101o) {
                k84.c6.y(c6Var, 1553);
                if (k84.f4.e()) {
                    ca4.m0.v0();
                }
                k84.c6.F(c6Var, context);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
