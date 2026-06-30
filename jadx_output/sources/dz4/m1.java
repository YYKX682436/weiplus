package dz4;

/* loaded from: classes5.dex */
public final class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.o1 f245349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f245350e;

    public m1(dz4.o1 o1Var, kotlin.jvm.internal.h0 h0Var) {
        this.f245349d = o1Var;
        this.f245350e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.o1 o1Var = this.f245349d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = o1Var.f245362c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        o1Var.f245362c = null;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.h0 h0Var = this.f245350e;
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onMediaFileExportSaved: path null");
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.h_w), 1).show();
        } else {
            q75.c.f((java.lang.String) h0Var.f310123d, context);
            java.lang.String string = context.getString(com.tencent.mm.R.string.f492304g00, q75.c.e());
            kotlin.jvm.internal.o.f(string, "getString(...)");
            dp.a.makeText(context, string, 1).show();
        }
    }
}
