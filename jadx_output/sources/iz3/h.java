package iz3;

/* loaded from: classes12.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.j f296081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry3.r f296082e;

    public h(iz3.j jVar, ry3.r rVar) {
        this.f296081d = jVar;
        this.f296082e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry3.p pVar;
        iz3.j jVar = this.f296081d;
        ry3.r rVar = this.f296082e;
        if (jVar == null || (pVar = jVar.f296084a) == null) {
            return;
        }
        long j17 = pVar.f401527a;
        boolean z17 = pVar.f401528b != 2;
        if (!com.tencent.mm.vfs.w6.j(pVar.f401531e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), 999, "image not exist");
            ry3.q qVar = new ry3.q();
            qVar.f401543a = j17;
            qVar.f401544b = false;
            qVar.f401545c = 3;
            qVar.f401546d = 999;
            qVar.f401547e = "image not exist";
            ((ku5.t0) ku5.t0.f312615d).B(new iz3.t(rVar, j17, qVar));
            return;
        }
        if (pVar.f401537k == null && pVar.f401538l) {
            com.tencent.mm.plugin.scanner.model.o1 o1Var = com.tencent.mm.plugin.scanner.model.o1.f158972a;
            java.lang.String imagePath = pVar.f401531e;
            kotlin.jvm.internal.o.f(imagePath, "imagePath");
            pVar.f401537k = o1Var.a(imagePath);
        }
        if (z17) {
            f04.l.b(pVar.f401531e, 0, hz3.i.a(pVar.f401528b), new iz3.g(jVar, j17, pVar, rVar));
            return;
        }
        com.tencent.mm.plugin.scanner.model.w wVar = new com.tencent.mm.plugin.scanner.model.w(j17, 0, pVar.f401537k, 2, null);
        jVar.f296085b = wVar.hashCode();
        gm0.j1.d().g(wVar);
    }
}
