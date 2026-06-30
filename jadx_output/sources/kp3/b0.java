package kp3;

/* loaded from: classes14.dex */
public final class b0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI f310965d;

    public b0(com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI) {
        this.f310965d = palmPrintFrontUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        dialog.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI = this.f310965d;
        androidx.appcompat.app.AppCompatActivity context = palmPrintFrontUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        jp3.g gVar = jp3.g.f301000a;
        androidx.appcompat.app.AppCompatActivity context2 = palmPrintFrontUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        gVar.i(context2, com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION, "ERR_PALM_CAMERA_PERSSION_CHECK", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
    }
}
