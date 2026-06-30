package o21;

/* loaded from: classes.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f342404d;

    public a(android.os.Bundle bundle) {
        this.f342404d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.String string = this.f342404d.getString("mm_event_class");
            android.support.v4.media.f.a(java.lang.Class.forName(string).newInstance());
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMMReportUtil", "webview callback report className[%s]", string);
            throw null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewMMReportUtil", e17, "receiveWebViewCallback error", new java.lang.Object[0]);
        }
    }
}
