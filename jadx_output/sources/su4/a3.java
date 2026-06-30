package su4;

/* loaded from: classes8.dex */
public class a3 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMWebView f412812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f412813b;

    public a3(su4.d3 d3Var, com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f412813b = d3Var;
        this.f412812a = mMWebView;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i(this.f412813b.f412858a, "loadJS, sys:bridged callback %s,view %s", (java.lang.String) obj, this.f412812a.toString());
    }
}
