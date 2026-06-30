package tn0;

/* loaded from: classes3.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f420787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420788f;

    public y(tn0.w0 w0Var, android.graphics.SurfaceTexture surfaceTexture, int i17) {
        this.f420786d = w0Var;
        this.f420787e = surfaceTexture;
        this.f420788f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ts0.c z17;
        ft0.d dVar;
        ms0.c cVar;
        ts0.r rVar;
        kn0.f fVar;
        kn0.f fVar2;
        kn0.f fVar3;
        kn0.f fVar4;
        kn0.f fVar5;
        tn0.w0 w0Var = this.f420786d;
        int r17 = tn0.w0.r(w0Var);
        ts0.r rVar2 = w0Var.f420775v;
        if (rVar2 != null) {
            kn0.i iVar = w0Var.C;
            rVar2.p(this.f420787e, (iVar == null || (fVar5 = iVar.f309560d) == null) ? false : fVar5.f309531c, r17);
        }
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_camera_ratio_4_3, 0) == 1) && (rVar = w0Var.f420775v) != null) {
            kn0.i iVar2 = w0Var.C;
            int i17 = 1080;
            ts0.b bVar = (ts0.b) rVar;
            android.util.Size C = bVar.C(new android.graphics.Point((iVar2 == null || (fVar4 = iVar2.f309560d) == null) ? 1080 : fVar4.f309532d, (int) ((((iVar2 == null || (fVar3 = iVar2.f309560d) == null) ? 1080 : fVar3.f309532d) * 16.0f) / 9.0f)));
            kn0.i iVar3 = w0Var.C;
            int i18 = (iVar3 == null || (fVar2 = iVar3.f309560d) == null) ? 1080 : fVar2.f309532d;
            if (iVar3 != null && (fVar = iVar3.f309560d) != null) {
                i17 = fVar.f309532d;
            }
            android.util.Size C2 = bVar.C(new android.graphics.Point(i18, (int) ((i17 * 4.0f) / 3.0f)));
            if (kotlin.jvm.internal.o.b(C != null ? java.lang.Integer.valueOf(C.getWidth()) : null, C2 != null ? java.lang.Integer.valueOf(C2.getWidth()) : null)) {
                if (kotlin.jvm.internal.o.b(C != null ? java.lang.Integer.valueOf(C.getHeight()) : null, C2 != null ? java.lang.Integer.valueOf(C2.getHeight()) : null)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("same camera config, ");
                    sb6.append(C != null ? java.lang.Integer.valueOf(C.getWidth()) : null);
                    sb6.append(", ");
                    sb6.append(C2 != null ? java.lang.Integer.valueOf(C2.getHeight()) : null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb6.toString());
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[8];
                    objArr[0] = 20230922;
                    objArr[1] = 0;
                    objArr[2] = "same camera config1";
                    objArr[3] = java.lang.Integer.valueOf(C != null ? C.getWidth() : 0);
                    objArr[4] = "";
                    objArr[5] = "";
                    objArr[6] = "";
                    objArr[7] = java.lang.Integer.valueOf(C != null ? C.getHeight() : 0);
                    g0Var.d(22021, objArr);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("diff camera config, old:");
            sb7.append(C != null ? java.lang.Integer.valueOf(C.getWidth()) : null);
            sb7.append(", ");
            sb7.append(C != null ? java.lang.Integer.valueOf(C.getHeight()) : null);
            sb7.append(", new:");
            sb7.append(C2 != null ? java.lang.Integer.valueOf(C2.getWidth()) : null);
            sb7.append(", ");
            sb7.append(C2 != null ? java.lang.Integer.valueOf(C2.getHeight()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb7.toString());
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr2 = new java.lang.Object[10];
            objArr2[0] = 20230922;
            objArr2[1] = 0;
            objArr2[2] = "diff camera config1";
            objArr2[3] = java.lang.Integer.valueOf(C != null ? C.getWidth() : 0);
            objArr2[4] = "";
            objArr2[5] = "";
            objArr2[6] = "";
            objArr2[7] = java.lang.Integer.valueOf(C != null ? C.getHeight() : 0);
            objArr2[8] = java.lang.Integer.valueOf(C2 != null ? C2.getWidth() : 0);
            objArr2[9] = java.lang.Integer.valueOf(C2 != null ? C2.getHeight() : 0);
            g0Var2.d(22021, objArr2);
        }
        ts0.r rVar3 = w0Var.f420775v;
        if (!(rVar3 != null && ((ts0.b) rVar3).G())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "start preview fail");
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("start preview success, mirrorMode:");
        go0.f0 f0Var = w0Var.f420771r;
        go0.f1 f1Var = f0Var.f273767p;
        sb8.append(f1Var != null ? f1Var.Q : 0);
        sb8.append(" resolution:");
        sb8.append(r17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb8.toString());
        xn0.b b17 = vn0.b.f438174a.b();
        ts0.r rVar4 = w0Var.f420775v;
        b17.f455410a = rVar4 != null ? rVar4.e() : 0;
        ts0.r rVar5 = w0Var.f420775v;
        if (rVar5 == null || (z17 = rVar5.z()) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "cameraConfig null");
            pm0.z.b(xy2.b.f458155b, "startPreviewButCameraConfigNull", false, null, null, false, false, null, 124, null);
            return;
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("start preview systemRoate: ");
        int i19 = this.f420788f;
        sb9.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb9.toString());
        ts0.c.f421545e = i19;
        f0Var.w(z17);
        ts0.r rVar6 = w0Var.f420775v;
        w0Var.B((rVar6 == null || rVar6.z() == null) ? null : java.lang.Boolean.valueOf(ts0.c.f421548h));
        ts0.r rVar7 = w0Var.f420775v;
        if ((rVar7 != null && rVar7.b() == 2) && i19 == 90 && (dVar = f0Var.f273764m) != null && (cVar = dVar.f266462c) != null) {
            cVar.r(0);
        }
        w0Var.f420777x = true;
        f0Var.setOnDrawListener(new tn0.x(w0Var));
    }
}
