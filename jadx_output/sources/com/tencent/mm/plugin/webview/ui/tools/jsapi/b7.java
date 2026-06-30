package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f184960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 f184961e;

    public b7(com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var) {
        this.f184961e = h7Var;
        this.f184960d = new java.lang.ref.WeakReference(h7Var.f185174g.f184975d);
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = (android.content.Context) this.f184960d.get();
        if (context != null) {
            com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var = this.f184961e;
            if (h7Var.f185174g.f184980i && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                h7Var.f185174g.f184979h = db5.e1.Q(context, null, context.getString(com.tencent.mm.R.string.f492565gz5), true, false, null);
            }
        }
    }
}
