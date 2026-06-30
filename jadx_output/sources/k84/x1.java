package k84;

/* loaded from: classes4.dex */
public final class x1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f305325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f305326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305327f;

    public x1(k84.d4 d4Var, kotlinx.coroutines.y0 y0Var, android.content.Context context) {
        this.f305325d = d4Var;
        this.f305326e = y0Var;
        this.f305327f = context;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4$1");
        k84.d4 d4Var = this.f305325d;
        com.tencent.mars.xlog.Log.i(d4Var.j(), " observe canChange=" + ((java.lang.Boolean) obj));
        kotlinx.coroutines.y0 y0Var = this.f305326e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDispatcherInUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        kotlinx.coroutines.p0 R = d4Var.R();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDispatcherInUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        kotlinx.coroutines.l.d(y0Var, R, null, new k84.w1(d4Var, this.f305327f, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindComponentModel$4$1");
        return f0Var;
    }
}
