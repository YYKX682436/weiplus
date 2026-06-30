package dr4;

/* loaded from: classes14.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.p1 f242760d;

    public x0(dr4.p1 p1Var) {
        this.f242760d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dr4.p1 p1Var;
        xq4.a aVar;
        dr4.i iVar = this.f242760d.f242720s;
        if (iVar != null) {
            final com.tencent.mm.plugin.voip.model.d0 d0Var = (com.tencent.mm.plugin.voip.model.d0) iVar;
            if (d0Var.C || d0Var.f176376g == null || d0Var.f176376g.J4() == null || (p1Var = d0Var.f176375f) == null || (aVar = p1Var.f242704c) == null || ((zq4.b) aVar).f475050j) {
                return;
            }
            if (android.os.Build.MANUFACTURER.equalsIgnoreCase("meizu") && !zo.e.d() && fp.h.a(29)) {
                return;
            }
            if (fp.h.c(28)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.NewVoipMgr", "api level: %s, in keyguard, ignore", java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11306, 0, 0);
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(d0Var.f176376g.J4(), "android.permission.CAMERA", 19, "", "", new j35.b0() { // from class: com.tencent.mm.plugin.voip.model.d0$$e
                @Override // j35.b0
                public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
                    final com.tencent.mm.plugin.voip.model.d0 d0Var2 = com.tencent.mm.plugin.voip.model.d0.this;
                    d0Var2.getClass();
                    if (iArr[0] != 0) {
                        db5.e1.C(d0Var2.f176376g.J4(), d0Var2.f176376g.J4().getResources().getString(com.tencent.mm.R.string.hh8), d0Var2.f176376g.J4().getResources().getString(com.tencent.mm.R.string.f490774aq2), d0Var2.f176376g.J4().getResources().getString(com.tencent.mm.R.string.kct), d0Var2.f176376g.J4().getResources().getString(com.tencent.mm.R.string.f490454vi), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$g
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                com.tencent.mm.plugin.voip.model.d0 d0Var3 = com.tencent.mm.plugin.voip.model.d0.this;
                                d0Var3.getClass();
                                dialogInterface.dismiss();
                                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                                android.content.Context J4 = d0Var3.f176376g.J4();
                                ((sb0.f) jVar).getClass();
                                j35.u.g(J4);
                            }
                        }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$h
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                                com.tencent.mm.plugin.voip.model.d0.this.t0(4103);
                                gq4.v.Bi().k();
                                dialogInterface.dismiss();
                            }
                        });
                    }
                }
            })) {
                d0Var.C = true;
                return;
            }
            com.tencent.mm.ui.widget.dialog.j0 j0Var = null;
            try {
                j0Var = db5.e1.y(d0Var.f176376g.J4(), d0Var.f176376g.J4().getString(com.tencent.mm.R.string.kcm), null, d0Var.f176376g.J4().getString(com.tencent.mm.R.string.f490454vi), new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.voip.model.d0$$f
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
                        com.tencent.mm.plugin.voip.model.d0.this.t0(4103);
                        gq4.v.Bi().k();
                        dialogInterface.dismiss();
                    }
                });
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.NewVoipMgr", e17, "failed to show alert", new java.lang.Object[0]);
            }
            if (j0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.NewVoipMgr", "new dialog failed");
                return;
            }
            j0Var.setCancelable(false);
            j0Var.setCanceledOnTouchOutside(false);
            j0Var.show();
            d0Var.C = true;
        }
    }
}
