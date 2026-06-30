package vf1;

/* loaded from: classes7.dex */
public class g extends vf1.a implements tf1.k {
    private static final int CTRL_INDEX = 806;
    public static final java.lang.String NAME = "insertXWebCamera";

    /* renamed from: g, reason: collision with root package name */
    public boolean f436321g;

    /* renamed from: h, reason: collision with root package name */
    public mi1.w0 f436322h;

    public final boolean F(com.tencent.mm.plugin.appbrand.jsapi.l lVar, tb1.a0 a0Var, vf1.f fVar) {
        si1.e1.a(java.lang.String.valueOf(lVar.getAppId()), new vf1.e(this, lVar, a0Var, fVar));
        android.app.Activity activity = (android.app.Activity) lVar.getContext();
        if (activity == null) {
            return false;
        }
        boolean b17 = nf.t.b(activity, lVar, "android.permission.WRITE_EXTERNAL_STORAGE");
        tb1.c cVar = tb1.b.f416889a;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraMrg", "has external storage permission: %b", java.lang.Boolean.valueOf(b17));
        boolean a17 = nf.t.a(activity, lVar, "android.permission.CAMERA", 16, "", "");
        cVar.f416890a = a17;
        if (!a17) {
            return false;
        }
        si1.e1.c(lVar.getAppId());
        if (!this.f436321g) {
            if (fVar != null) {
                uf1.d dVar = (uf1.d) fVar;
                dVar.f427153a.a(dVar.f427154b, dVar.f427155c.o("ok"));
            }
            ((com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView) a0Var).h();
            this.f436321g = true;
        }
        return true;
    }
}
