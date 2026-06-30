package dk2;

/* loaded from: classes3.dex */
public final class tc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f234129d;

    public tc(java.lang.String str) {
        this.f234129d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        qf2.y1 y1Var;
        dk2.u4 u4Var;
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.o4 o4Var = (mm2.o4) efVar.i(mm2.o4.class);
        if (com.tencent.mm.sdk.platformtools.t8.D0(this.f234129d, (o4Var == null || (u4Var = o4Var.Z) == null) ? null : u4Var.f234154a)) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null && (y1Var = (qf2.y1) liveRoomControllerStore.controller(qf2.y1.class)) != null) {
                y1Var.l7();
                ((mm2.y2) y1Var.business(mm2.y2.class)).c7();
            }
            no0.g gVar = no0.k.f338729a;
            if (gVar != null) {
                gVar.onBattleDismiss();
            }
            mm2.o4 o4Var2 = (mm2.o4) efVar.i(mm2.o4.class);
            if (o4Var2 == null) {
                return;
            }
            o4Var2.Z = null;
        }
    }
}
