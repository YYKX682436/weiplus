package it3;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI f294580d;

    public s(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI) {
        this.f294580d = finderRedPacketCoverEditUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.mb4 mb4Var = new r45.mb4();
        com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI = this.f294580d;
        mb4Var.set(0, finderRedPacketCoverEditUI.f155612d);
        i95.m c17 = i95.n0.c(bg0.v.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        finderRedPacketCoverEditUI.f155620o = ((b92.u2) ((bg0.v) c17)).Zi(mb4Var, 0, 0, null);
        java.util.List c18 = kz5.b0.c(java.lang.Long.valueOf(finderRedPacketCoverEditUI.f155621p));
        rm5.k kVar = finderRedPacketCoverEditUI.f155620o;
        if (kVar != null) {
            kVar.a(c18, new it3.r(finderRedPacketCoverEditUI));
        }
    }
}
