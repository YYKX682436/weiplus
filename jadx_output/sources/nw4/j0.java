package nw4;

/* loaded from: classes8.dex */
public class j0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340856a;

    public j0(nw4.n nVar, java.lang.String str) {
        this.f340856a = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "handle url %s, re %s", this.f340856a, (java.lang.String) obj);
    }
}
