package x44;

/* loaded from: classes4.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f451811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x44.e0 f451812f;

    public d0(java.lang.String str, android.app.Activity activity, x44.e0 e0Var) {
        this.f451810d = str;
        this.f451811e = activity;
        this.f451812f = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo$doAction$2");
        eb4.s.c("", this.f451810d, this.f451811e, true, false, null, new x44.c0(this.f451812f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.GetLocationGeo$doAction$2");
    }
}
