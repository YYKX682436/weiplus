package yt3;

/* loaded from: classes10.dex */
public final class v3 implements com.tencent.mm.plugin.mmsight.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.w3 f465701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f465702b;

    public v3(yt3.w3 w3Var, ju3.d0 d0Var) {
        this.f465701a = w3Var;
        this.f465702b = d0Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
        this.f465702b.w(ju3.c0.f301873e, bundle);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
        bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
        bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
        this.f465702b.w(ju3.c0.f301873e, bundle);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void c(float f17, float f18) {
        android.os.Bundle bundle = new android.os.Bundle();
        yt3.w3 w3Var = this.f465701a;
        bundle.putInt("PARAM_WIDTH_INT", w3Var.f465710f.getWidth());
        bundle.putInt("PARAM_HEIGHT_INT", w3Var.f465710f.getHeight());
        bundle.putFloat("PARAM_POINT_X", f17);
        bundle.putFloat("PARAM_POINT_Y", f18);
        this.f465702b.w(ju3.c0.f301879h, bundle);
        w3Var.f465709e.a(f17, f18);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void d() {
        yt3.w3 w3Var = this.f465701a;
        long j17 = w3Var.f465711g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 1000) {
            return;
        }
        w3Var.f465711g = android.os.SystemClock.elapsedRealtime();
        ju3.d0.k(this.f465702b, ju3.c0.f301875f, null, 2, null);
    }
}
