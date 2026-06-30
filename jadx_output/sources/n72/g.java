package n72;

/* loaded from: classes14.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.SurfaceTexture f335257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n72.q f335258e;

    public g(n72.q qVar, android.graphics.SurfaceTexture surfaceTexture) {
        this.f335258e = qVar;
        this.f335257d = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            n72.q.a(this.f335258e, this.f335257d);
            n72.q qVar = this.f335258e;
            qVar.e(qVar.P);
            vz2.c.j("openCamera");
        } catch (java.lang.Exception unused) {
            vz2.c.k("openCamera", -1);
            if (this.f335258e.G == 1) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceReflectCam", "preview error");
            com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI faceActionUI = this.f335258e.f335289x;
            faceActionUI.getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new l72.b(faceActionUI));
        }
    }
}
