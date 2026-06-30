package k84;

/* loaded from: classes4.dex */
public final class q2 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.r f305207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305208f;

    public q2(k84.d4 d4Var, mb4.r rVar, android.content.Context context) {
        this.f305206d = d4Var;
        this.f305207e = rVar;
        this.f305208f = context;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        i64.p pVar = (i64.p) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        k84.d4 d4Var = this.f305206d;
        java.lang.String j17 = d4Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe CountTitle = ");
        java.lang.String str = null;
        sb6.append(pVar != null ? pVar.a() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (pVar == null || (a17 = pVar.a()) == null) {
            mb4.v i17 = this.f305207e.i();
            if (i17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                str = i17.f325481b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
            }
        } else {
            str = a17;
        }
        android.widget.TextView Y = d4Var.Y();
        if (Y != null) {
            if (str == null) {
                str = "";
            }
            Y.setText(str);
        }
        android.widget.TextView Y2 = d4Var.Y();
        android.content.Context context = this.f305208f;
        float b17 = i65.a.b(context, 14) * i65.a.q(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        ca4.m0.b(context, Y2, b17, d4Var.f305002s);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        return f0Var;
    }
}
