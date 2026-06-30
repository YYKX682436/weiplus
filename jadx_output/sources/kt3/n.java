package kt3;

/* loaded from: classes10.dex */
public final class n extends bi3.g implements di3.o, ei3.k, com.tencent.mm.plugin.api.recordView.h {

    /* renamed from: d, reason: collision with root package name */
    public kt3.l f312007d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f312008e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f312009f;

    /* renamed from: i, reason: collision with root package name */
    public float f312012i;

    /* renamed from: m, reason: collision with root package name */
    public int f312013m;

    /* renamed from: p, reason: collision with root package name */
    public float[] f312016p;

    /* renamed from: q, reason: collision with root package name */
    public android.util.Size f312017q;

    /* renamed from: g, reason: collision with root package name */
    public long f312010g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f312011h = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    public boolean f312014n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f312015o = true;

    @Override // di3.o
    public boolean a(byte[] bArr) {
        kt3.l lVar = this.f312007d;
        if (lVar != null) {
            return lVar.y(bArr);
        }
        return false;
    }

    public void b(float f17, float f18) {
        if (this.f312015o) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("PARAM_POINT_X", f17);
            bundle.putFloat("PARAM_POINT_Y", f18);
            kt3.l lVar = this.f312007d;
            if (lVar != null) {
                lVar.w(ju3.c0.f301879h, bundle);
            }
        }
    }

    public void c() {
        if (this.f312014n) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", false);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            kt3.l lVar = this.f312007d;
            if (lVar != null) {
                lVar.w(ju3.c0.f301873e, bundle);
            }
        }
    }

    public void d() {
        if (this.f312014n) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN", true);
            bundle.putBoolean("PARAM_PREPARE_CAMERA_ZOOM_SCROLL_BOOLEAN", false);
            bundle.putInt("PARAM_PREPARE_CAMERA_ZOOM_FACTOR_INT", 1);
            kt3.l lVar = this.f312007d;
            if (lVar != null) {
                lVar.w(ju3.c0.f301873e, bundle);
            }
        }
    }

    @Override // ei3.k
    public void j(int i17) {
        kt3.l lVar = this.f312007d;
        if (lVar != null) {
            lVar.reset();
        }
    }
}
