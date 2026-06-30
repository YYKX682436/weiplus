package rd3;

/* loaded from: classes7.dex */
public final class e extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showActionSheet";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.content.Context context;
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("headTitle", "");
        java.lang.String optString2 = data.optString("headIconUrl", "");
        java.lang.String optString3 = data.optString("cancelText", "");
        com.tencent.mars.xlog.Log.i("MBJsApiShowActionSheet", "headTitle: " + optString + ", headIconUrl: " + optString2 + ", cancelText: " + optString3);
        lc3.e eVar = this.f317890a;
        if (eVar == null || (context = eVar.B0()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
            k0Var2.q(optString, 17);
            k0Var = k0Var2;
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b_e, (android.view.ViewGroup) null);
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ocb);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            o11.f fVar = new o11.f();
            fVar.f342079c = true;
            n11.a.b().h(optString2, (android.widget.ImageView) findViewById, fVar.a());
            android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.odf);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            ((android.widget.TextView) findViewById2).setText(optString);
            k0Var3.s(inflate, false);
            k0Var = k0Var3;
        }
        k0Var.f211872n = new rd3.a(data, this);
        k0Var.f211881s = new rd3.b(this);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            k0Var.m(optString3);
        }
        k0Var.C = new rd3.c(this);
        k0Var.p(new rd3.d(this));
        k0Var.v();
    }
}
