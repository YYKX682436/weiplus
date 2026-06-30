package it3;

/* loaded from: classes10.dex */
public final class u implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294582d;

    public u(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        this.f294582d = finderRedPacketCoverEditUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.f155611t;
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294582d;
        finderRedPacketCoverEditUI.getClass();
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[cancelUpload]");
        pm0.v.K(null, new it3.h(finderRedPacketCoverEditUI));
        java.lang.String string = finderRedPacketCoverEditUI.getResources().getString(com.tencent.mm.R.string.cn8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.appcompat.app.AppCompatActivity context = finderRedPacketCoverEditUI.getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
