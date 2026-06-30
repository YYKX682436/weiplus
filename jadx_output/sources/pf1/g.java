package pf1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf1.h f353772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f353774f;

    public g(pf1.h hVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f353772d = hVar;
        this.f353773e = str;
        this.f353774f = valueCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f353772d.f353775a.getWebView().evaluateJavascript(this.f353773e, this.f353774f);
    }
}
