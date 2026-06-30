package su4;

/* loaded from: classes8.dex */
public class y2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f413145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f413146b;

    public y2(su4.d3 d3Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f413146b = d3Var;
        this.f413145a = mMWebView;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f413146b.f412858a, "loadJavaScript, jsContent evaluateJavascript cb, ret = %s, view %s", (java.lang.String) obj, this.f413145a.toString());
    }
}
