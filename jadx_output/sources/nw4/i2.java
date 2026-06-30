package nw4;

/* loaded from: classes.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340854e;

    public i2(nw4.n nVar, java.lang.String str) {
        this.f340854e = nVar;
        this.f340853d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f340854e.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + this.f340853d + ")", null);
        } catch (java.lang.Exception unused) {
        }
    }
}
