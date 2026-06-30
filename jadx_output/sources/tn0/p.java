package tn0;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f420732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f420733f;

    public p(tn0.w0 w0Var, android.graphics.SurfaceTexture surfaceTexture, int i17) {
        this.f420731d = w0Var;
        this.f420732e = surfaceTexture;
        this.f420733f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ft0.d dVar;
        ms0.c cVar;
        kn0.f fVar;
        tn0.w0 w0Var = this.f420731d;
        int r17 = tn0.w0.r(w0Var);
        ts0.r rVar = w0Var.f420775v;
        if (rVar != null) {
            kn0.i iVar = w0Var.C;
            rVar.p(this.f420732e, (iVar == null || (fVar = iVar.f309560d) == null) ? false : fVar.f309531c, r17);
        }
        ts0.r rVar2 = w0Var.f420775v;
        if (!(rVar2 != null && ((ts0.b) rVar2).G())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", "start preview fail");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start preview success, mirrorMode:");
        go0.f0 f0Var = w0Var.f420771r;
        go0.f1 f1Var = f0Var.f273767p;
        sb6.append(f1Var != null ? f1Var.Q : 0);
        sb6.append(" resolution:");
        sb6.append(r17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCore", sb6.toString());
        xn0.b b17 = vn0.b.f438174a.b();
        ts0.r rVar3 = w0Var.f420775v;
        b17.f455410a = rVar3 != null ? rVar3.e() : 0;
        ts0.r rVar4 = w0Var.f420775v;
        ts0.c z17 = rVar4 != null ? rVar4.z() : null;
        kotlin.jvm.internal.o.d(z17);
        int i17 = this.f420733f;
        ts0.c.f421545e = i17;
        f0Var.w(z17);
        ts0.r rVar5 = w0Var.f420775v;
        if ((rVar5 != null && rVar5.b() == 2) && i17 == 90 && (dVar = f0Var.f273764m) != null && (cVar = dVar.f266462c) != null) {
            cVar.r(0);
        }
        w0Var.f420777x = true;
        f0Var.setOnDrawListener(new tn0.o(w0Var));
    }
}
