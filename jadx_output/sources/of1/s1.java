package of1;

/* loaded from: classes7.dex */
public final class s1 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f345004a;

    public s1(of1.w1 w1Var) {
        this.f345004a = w1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.o6 runtime;
        com.tencent.mm.plugin.appbrand.service.c0 C0;
        java.lang.String str = (java.lang.String) obj;
        if ((str == null || str.length() == 0) || (runtime = this.f345004a.m533getPageView().getRuntime()) == null || (C0 = runtime.C0()) == null) {
            return;
        }
        C0.g("onDumpWebviewDom", str);
    }
}
