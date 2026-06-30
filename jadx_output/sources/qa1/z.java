package qa1;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f361030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa1.o f361031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qa1.f0 f361032f;

    public z(qa1.f0 f0Var, android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        this.f361032f = f0Var;
        this.f361030d = surfaceHolder;
        this.f361031e = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f361032f.f360986g = this.f361030d.getSurface();
        android.view.Surface surface = this.f361032f.f360986g;
        if (surface == null || !surface.isValid()) {
            android.view.Surface surface2 = this.f361032f.f360986g;
            if (surface2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface is null!");
            } else if (!surface2.isValid()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface is disable!");
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "surface switch to record!");
            this.f361032f.f360992p = true;
            qa1.f0 f0Var = this.f361032f;
            f0Var.f360987h = rs0.i.f399296a.m(f0Var.f360986g, null, 0, 0, android.opengl.EGL14.EGL_NO_CONTEXT);
            ms0.c cVar = this.f361032f.f360988i;
            if (cVar != null) {
                cVar.onSurfaceCreated(null, null);
                android.graphics.Rect surfaceFrame = this.f361030d.getSurfaceFrame();
                this.f361032f.f360988i.t(surfaceFrame.width(), surfaceFrame.height());
                this.f361032f.f360988i.u(surfaceFrame.width(), surfaceFrame.height());
                this.f361032f.f360988i.k(true);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameRecordableSurfaceView.RecordableImp", "renderer is null!");
            }
        }
        this.f361032f.f360983d.e(this.f361030d);
        this.f361032f.f360983d.b(this.f361031e);
    }
}
