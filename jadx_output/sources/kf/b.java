package kf;

/* loaded from: classes7.dex */
public final class b extends android.graphics.SurfaceTexture {

    /* renamed from: a, reason: collision with root package name */
    public int f307159a;

    /* renamed from: b, reason: collision with root package name */
    public int f307160b;

    /* renamed from: c, reason: collision with root package name */
    public kf.a f307161c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.view.TextureRegistry.OnFrameConsumedListener f307162d;

    @Override // android.graphics.SurfaceTexture
    public void setDefaultBufferSize(int i17, int i18) {
        if (this.f307159a == i17 && this.f307160b == i18) {
            return;
        }
        this.f307159a = i17;
        this.f307160b = i18;
        super.setDefaultBufferSize(i17, i18);
        kf.a aVar = this.f307161c;
        if (aVar != null) {
            ((com.tencent.mm.plugin.appbrand.skyline.nativeview.m0) aVar).a(i17, i18);
        }
    }

    @Override // android.graphics.SurfaceTexture
    public void updateTexImage() {
        super.updateTexImage();
        io.flutter.view.TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = this.f307162d;
        if (onFrameConsumedListener != null) {
            onFrameConsumedListener.onFrameConsumed();
        }
    }
}
