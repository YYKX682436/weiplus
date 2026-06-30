package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f187186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f187188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187189g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187190h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187191i;

    public e3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        this.f187191i = p3Var;
        this.f187186d = i17;
        this.f187187e = i18;
        this.f187188f = i19;
        this.f187189g = str;
        this.f187190h = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = this.f187191i.f187495f;
            int i17 = this.f187186d;
            int i18 = this.f187187e;
            int i19 = this.f187188f;
            java.lang.String str = this.f187189g;
            android.os.Bundle bundle = this.f187190h;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            com.tencent.mm.plugin.webview.ui.tools.widget.u3.C(u3Var, i17, i18, i19, str, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", e17.getMessage());
        }
    }
}
