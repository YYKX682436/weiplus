package qa1;

/* loaded from: classes14.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.o f360967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f360968e;

    public b0(qa1.f0 f0Var, qa1.o oVar) {
        this.f360968e = f0Var;
        this.f360967d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        qa1.o oVar = this.f360967d;
        qa1.f0 f0Var = this.f360968e;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: onSurfaceTextureDestroyed in thread! can preview: %b", java.lang.Boolean.valueOf(f0Var.f360990n.get()));
        try {
            if (f0Var.f360990n.get()) {
                f0Var.f360990n.getAndSet(false);
                ms0.c cVar = f0Var.f360988i;
                if (cVar != null) {
                    cVar.n(true);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "hy: no renderer!");
                }
                rs0.h hVar = f0Var.f360987h;
                if (hVar != null) {
                    android.opengl.EGL14.eglDestroyContext(hVar.f399292a, hVar.f399294c);
                    rs0.h hVar2 = f0Var.f360987h;
                    android.opengl.EGL14.eglDestroySurface(hVar2.f399292a, hVar2.f399293b);
                    qa1.p pVar = f0Var.f360983d;
                    pVar.f(pVar.f361012h);
                }
            }
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRecordableSurfaceView.RecordableImp", th6, "hy: error in surface destroy!!", new java.lang.Object[0]);
            } finally {
                f0Var.f360983d.b(oVar);
            }
        }
    }
}
