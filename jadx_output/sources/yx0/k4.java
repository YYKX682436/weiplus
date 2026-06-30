package yx0;

/* loaded from: classes5.dex */
public final class k4 implements com.tencent.maas.camstudio.r {

    /* renamed from: a, reason: collision with root package name */
    public static final yx0.k4 f467416a = new yx0.k4();

    @Override // com.tencent.maas.camstudio.r
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        if (mJError == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "LoadMaterialAsync complete, materialId: publisher_text_389");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "LoadMaterialAsync failed: " + mJError + ", materialId: publisher_text_389");
    }
}
