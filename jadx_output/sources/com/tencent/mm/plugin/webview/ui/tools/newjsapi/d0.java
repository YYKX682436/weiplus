package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.i0 f186020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f186021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.r1 f186022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.ui.widget.dialog.i0 i0Var, org.json.JSONObject jSONObject, java.lang.String str, com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var) {
        super(0);
        this.f186020d = i0Var;
        this.f186021e = jSONObject;
        this.f186022f = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.j0 a17 = this.f186020d.a();
        org.json.JSONObject jSONObject = this.f186021e;
        if (jSONObject.has("msgIconUrl")) {
            android.widget.ImageView imageView = a17.f211839t;
            n11.a b17 = n11.a.b();
            java.lang.String string = jSONObject.getString("msgIconUrl");
            o11.f fVar = new o11.f();
            fVar.f342078b = true;
            b17.h(string, imageView, fVar.a());
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.r1 r1Var = this.f186022f;
        if (r1Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.m1) r1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "onJsApiConfirmDialogShow");
            int i17 = (((int) ((com.tencent.mm.ui.bk.C() ? 0.8f : 0.5f) * 255)) << 24) | 0;
            android.view.View view = m1Var.f281402h;
            if (view != null) {
                view.setBackgroundColor(i17);
            }
            android.view.View view2 = m1Var.f281401g;
            if (view2 != null) {
                view2.setBackgroundColor(i17);
            }
            m1Var.F = true;
        }
        a17.show();
        return jz5.f0.f302826a;
    }
}
