package k54;

/* loaded from: classes8.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f304453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f304456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f304457h;

    public u(zg0.v2 v2Var, java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        this.f304453d = v2Var;
        this.f304454e = str;
        this.f304455f = str2;
        this.f304456g = bundle;
        this.f304457h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onHandleEnd$1");
        try {
            zg0.v2 v2Var = this.f304453d;
            if (v2Var != null) {
                ((nw4.n) v2Var).O(this.f304454e, this.f304455f, nw4.a.a(this.f304456g), this.f304457h);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.WebViewStubCallback", "In jsapi onHandleEnd method, it happens something unwanted!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.web.WebViewStubCallback$onHandleEnd$1");
    }
}
