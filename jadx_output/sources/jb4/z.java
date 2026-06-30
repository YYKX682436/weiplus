package jb4;

/* loaded from: classes14.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f298858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView f298860f;

    public z(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView sphereImageView, android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f298860f = sphereImageView;
        this.f298858d = bitmap;
        this.f298859e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateImage in GLThread, bmp.w=");
        android.graphics.Bitmap bitmap = this.f298858d;
        sb6.append(bitmap == null ? 0 : bitmap.getWidth());
        sb6.append(", h=");
        sb6.append(bitmap == null ? 0 : bitmap.getHeight());
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", sb6.toString());
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView sphereImageView = this.f298860f;
        jb4.e0 g17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView.g(sphereImageView);
        g17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = g17.f298795j;
            if (i17 != 0) {
                android.opengl.GLES20.glDeleteTextures(1, new int[]{i17}, 0);
                com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "delete old texture");
            }
            int b17 = jb4.f0.b(bitmap);
            com.tencent.mars.xlog.Log.i("SphereImageView.SphereRender", "updateImage, oldId=" + g17.f298795j + ", newId=" + b17 + ", timeCost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            g17.f298795j = b17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SphereImageView.SphereRender", "updateImage, exp:" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereRender");
        sphereImageView.d();
        if (sphereImageView.V != null) {
            sphereImageView.I.post(new jb4.y(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3");
    }
}
