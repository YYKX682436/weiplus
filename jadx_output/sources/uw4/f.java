package uw4;

/* loaded from: classes8.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f431727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f431728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uw4.n f431729f;

    public f(uw4.n nVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f431729f = nVar;
        this.f431727d = str;
        this.f431728e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*com.tencent.mm.ui.widget.MMWebView*/.evaluateJavascript(this.f431727d, this.f431728e);
    }
}
