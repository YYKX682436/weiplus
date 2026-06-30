package ew2;

/* loaded from: classes14.dex */
public final class h implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final ew2.f f257060d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f257061e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.Surface f257062f;

    public h(ew2.f render, int i17) {
        kotlin.jvm.internal.o.g(render, "render");
        this.f257060d = render;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(i17);
        this.f257061e = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f257062f = new android.view.Surface(surfaceTexture);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        surfaceTexture.updateTexImage();
        this.f257060d.a();
    }
}
