package it3;

/* loaded from: classes10.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294583d;

    public v(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        this.f294583d = finderRedPacketCoverEditUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294583d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = finderRedPacketCoverEditUI.f155624s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.String string = finderRedPacketCoverEditUI.getResources().getString(com.tencent.mm.R.string.f492305g01);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(finderRedPacketCoverEditUI, "", string, true, true, new it3.u(finderRedPacketCoverEditUI));
        finderRedPacketCoverEditUI.f155624s = Q;
        if (Q != null) {
            Q.show();
        }
    }
}
