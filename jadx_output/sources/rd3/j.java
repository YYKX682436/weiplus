package rd3;

/* loaded from: classes7.dex */
public final class j extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showModal";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String optString2 = data.optString("content");
        java.lang.String optString3 = data.optString("confirmText");
        java.lang.String optString4 = data.optString("cancelText");
        boolean optBoolean = data.optBoolean("showCancel", true);
        java.lang.String optString5 = data.optString("confirmColor", "");
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478734fp);
        try {
            color = ik1.w.l(optString5);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String optString6 = data.optString("cancelColor", "");
        int color2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478714f5);
        try {
            color2 = ik1.w.l(optString6);
        } catch (java.lang.Exception unused2) {
        }
        kotlin.jvm.internal.o.d(optString);
        if (optString.length() == 0) {
            kotlin.jvm.internal.o.d(optString2);
            if (optString2.length() == 0) {
                s().invoke(h(1, "modal title and content null"));
            }
        }
        lc3.e eVar = this.f317890a;
        if (eVar == null || (context = eVar.B0()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.util.Objects.toString(context);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(optString);
        u1Var.g(optString2);
        com.tencent.mm.ui.widget.dialog.i0 i0Var = u1Var.f211996a;
        i0Var.f211821b.V = color2;
        u1Var.k(color);
        u1Var.n(optString3);
        u1Var.j(optString4);
        u1Var.a(optBoolean);
        u1Var.l(new rd3.f(this));
        u1Var.i(new rd3.g(this));
        i0Var.f211821b.G = new rd3.h(this);
        u1Var.e(rd3.i.f394244d);
        u1Var.q(false);
    }
}
