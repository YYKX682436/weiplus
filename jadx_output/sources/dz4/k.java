package dz4;

/* loaded from: classes12.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.l f245316d;

    public k(dz4.l lVar) {
        this.f245316d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        dz4.j jVar;
        dz4.j jVar2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dz4.l lVar = this.f245316d;
        long j17 = lVar.f245336g + (currentTimeMillis - lVar.f245335f);
        lVar.f245338i = j17;
        long j18 = lVar.f245337h;
        double d17 = j18 > 0 ? e06.p.d(j17 / j18, 0.0d, 1.0d) : 0.0d;
        if (lVar.f245332c) {
            if (d17 >= 1.0d) {
                java.lang.String str = lVar.f245334e;
                if (str != null && (jVar2 = lVar.f245333d) != null) {
                    ((dz4.d0) jVar2).a(1.0d, str);
                }
                lVar.b();
                return;
            }
            java.lang.String str2 = lVar.f245334e;
            if (str2 != null && (jVar = lVar.f245333d) != null) {
                long j19 = lVar.f245338i;
                dz4.d0 d0Var = (dz4.d0) jVar;
                com.tencent.wechat.aff.favorites.p pVar = d0Var.f245192a;
                if (kotlin.jvm.internal.o.b(str2, pVar.b())) {
                    dz4.j0.a(d0Var.f245193b, d0Var.f245194c, str2, (float) d17, (float) j19);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FlutterWeNoteNativeHelperImpl", "onProgressUpdate: skip, " + str2 + ", " + pVar.b());
                }
            }
            if (lVar.f245332c) {
                lVar.f245330a.postDelayed(this, lVar.f245331b);
            }
        }
    }
}
