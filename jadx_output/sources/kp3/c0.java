package kp3;

/* loaded from: classes14.dex */
public final class c0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI f310968d;

    public c0(com.tencent.mm.plugin.palm.ui.PalmPrintFrontUI palmPrintFrontUI) {
        this.f310968d = palmPrintFrontUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        dialog.dismiss();
        jp3.g gVar = jp3.g.f301000a;
        androidx.appcompat.app.AppCompatActivity context = this.f310968d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gVar.i(context, com.tencent.thumbplayer.tmediacodec.codec.CodecError.RESET_CODECEXCEPTION, "ERR_PALM_CAMERA_PERSSION_CHECK", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
    }
}
