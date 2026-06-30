package z25;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z25.f f469774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z25.d f469775e;

    public c(z25.d dVar, z25.f fVar) {
        this.f469775e = dVar;
        this.f469774d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(1431, 0);
        z25.f fVar = this.f469774d;
        int i17 = fVar.f469791b;
        if (i17 == 1) {
            g0Var.A(1431, 3);
        } else if (i17 == 2) {
            g0Var.A(1431, 6);
        } else if (i17 == 3) {
            g0Var.A(1431, 9);
        }
        z25.d dVar = this.f469775e;
        dVar.f469777b = fVar;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fVar.f469800k = java.lang.System.currentTimeMillis();
        dVar.e(3);
    }

    public java.lang.String toString() {
        return super.toString() + "|addUploadTask";
    }
}
