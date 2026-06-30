package dz4;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f245418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f245419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245420f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245421g;

    public u(dz4.j0 j0Var, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f245418d = j0Var;
        this.f245419e = z17;
        this.f245420f = str;
        this.f245421g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih0.p pVar = this.f245418d.f245309a;
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "onClickSetChatTop: holder null");
            return;
        }
        dz4.b1 b1Var = (dz4.b1) ((jz5.n) ((ez4.u) pVar).f257963v).getValue();
        b1Var.getClass();
        o72.g4 zj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        ez4.u uVar = (ez4.u) b1Var.f245169a;
        java.lang.ref.WeakReference weakReference = uVar.f257944c;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = b1Var.f245170b;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e(str, "onClickSetChatTop: activity null");
            return;
        }
        dz4.i iVar = uVar.f257942a;
        if (!this.f245419e) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14790, 1, 2);
            s72.p0 p0Var = (s72.p0) zj6;
            if (!p0Var.X6() || !p0Var.f404133s) {
                mz4.b0.c().d(null);
                com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.l_g), null, activity, null, null);
                return;
            }
            java.lang.ref.WeakReference weakReference2 = uVar.f257944c;
            android.app.Activity activity2 = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
            if (activity2 == null) {
                com.tencent.mars.xlog.Log.e(str, "handlePinOnTop: activity null");
                return;
            }
            long j17 = iVar.f245293d;
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
            o72.g4 zj7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
            if (F == null || !((s72.p0) zj7).T6(F)) {
                com.tencent.mars.xlog.Log.e(str, "handleCancelPinOnTop failed with localId=%d", java.lang.Long.valueOf(j17));
                return;
            }
            int i17 = F.field_id;
            ((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).f404129o = true;
            ((s72.p0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj()).Y6(i17, false, new dz4.x0(activity2));
            com.tencent.mars.xlog.Log.i(str, "handleCancelPinOnTop send request with favId=%d", java.lang.Integer.valueOf(i17));
            return;
        }
        iz4.r rVar = new iz4.r();
        boolean z17 = iVar instanceof dz4.f;
        rVar.f296139d = z17;
        rVar.f296145m = this.f245420f;
        java.lang.String str2 = this.f245421g;
        if (str2 == null || r26.n0.N(str2)) {
            rVar.f296144i = activity.getString(com.tencent.mm.R.string.l_l);
        } else {
            rVar.f296144i = str2;
        }
        if (z17) {
            dz4.f fVar = (dz4.f) iVar;
            rVar.f296141f = java.lang.Long.parseLong(fVar.f245232m);
            rVar.f296142g = fVar.f245233n;
            if (fVar.f245237r) {
                rVar.f296143h = true;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14790, 3, 1);
            } else {
                rVar.f296143h = false;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14790, 2, 1);
            }
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14790, 1, 1);
            rVar.f296140e = iVar.f245293d;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18728, 1);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_WENOTE_KEEP_TOP_DATA_LAST_REPORT_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        s72.p0 p0Var2 = (s72.p0) zj6;
        if (!p0Var2.X6() || !p0Var2.f404133s || z17) {
            mz4.b0.c().d(rVar);
            com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.l_m), null, activity, null, null);
            return;
        }
        o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(iVar.f245293d);
        if (F2 == null || F2.field_id == -1) {
            gm0.j1.d().a(401, new dz4.a1(rVar, b1Var));
        } else {
            b1Var.a(rVar);
        }
    }
}
