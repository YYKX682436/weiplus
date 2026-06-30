package nw4;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.webkit.ValueCallback f340858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340859f;

    public j2(nw4.n nVar, java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f340859f = nVar;
        this.f340857d = str;
        this.f340858e = valueCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f340859f.f340887a.evaluateJavascript(this.f340857d, this.f340858e);
    }
}
