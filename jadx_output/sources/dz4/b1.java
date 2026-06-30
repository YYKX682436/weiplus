package dz4;

/* loaded from: classes12.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0.p f245169a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245170b;

    public b1(ih0.p holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f245169a = holder;
        this.f245170b = "MicroMsg.WeNoteFlutterChatTopHelper";
    }

    public final void a(iz4.r rVar) {
        java.lang.String str = this.f245170b;
        if (rVar == null) {
            com.tencent.mars.xlog.Log.e(str, "handlePinOnTop: topItem null");
            return;
        }
        ih0.p pVar = this.f245169a;
        java.lang.ref.WeakReference weakReference = ((ez4.u) pVar).f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e(str, "handlePinOnTop: activity null");
            return;
        }
        long j17 = ((ez4.u) pVar).f257942a.f245293d;
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        o72.g4 zj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (F == null || !((s72.p0) zj6).T6(F)) {
            com.tencent.mars.xlog.Log.e(str, "handlePinOnTop failed with localId=%d", java.lang.Long.valueOf(j17));
            return;
        }
        int i17 = F.field_id;
        ((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).f404129o = true;
        ((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).Y6(i17, true, new dz4.z0(rVar, activity));
        com.tencent.mars.xlog.Log.i(str, "handlePinOnTop send request with favId=%d", java.lang.Integer.valueOf(i17));
    }

    public final boolean b() {
        iz4.r a17 = mz4.b0.c().a();
        dz4.i iVar = ((ez4.u) this.f245169a).f257942a;
        boolean z17 = iVar instanceof dz4.f;
        if (a17 == null || a17.f296139d != z17) {
            return false;
        }
        if (!z17) {
            return a17.f296140e == iVar.f245293d;
        }
        dz4.f fVar = (dz4.f) iVar;
        return a17.f296141f == java.lang.Long.parseLong(fVar.f245232m) && kotlin.jvm.internal.o.b(a17.f296142g, fVar.f245233n);
    }
}
