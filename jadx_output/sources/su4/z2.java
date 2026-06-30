package su4;

/* loaded from: classes8.dex */
public class z2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f413155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f413156b;

    public z2(su4.d3 d3Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f413156b = d3Var;
        this.f413155a = mMWebView;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f413156b.f412858a, "loadJS, sys:init callback %s,view %s", (java.lang.String) obj, this.f413155a.toString());
    }
}
