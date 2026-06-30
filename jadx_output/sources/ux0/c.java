package ux0;

/* loaded from: classes14.dex */
public final class c implements com.tencent.maas.camstudio.frame.TextureVideoFrame {

    /* renamed from: a, reason: collision with root package name */
    public final is0.c f431785a;

    /* renamed from: b, reason: collision with root package name */
    public long f431786b;

    /* renamed from: c, reason: collision with root package name */
    public long f431787c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f431788d;

    /* renamed from: e, reason: collision with root package name */
    public ux0.f f431789e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f431790f;

    public c(is0.c textureObj, long j17) {
        kotlin.jvm.internal.o.g(textureObj, "textureObj");
        this.f431785a = textureObj;
        this.f431786b = j17;
        this.f431790f = new java.lang.Object();
    }

    public final void a() {
        synchronized (this.f431790f) {
            while (this.f431788d && this.f431789e == null) {
                this.f431790f.wait();
            }
            ux0.f fVar = this.f431789e;
            if (fVar != null) {
                long j17 = fVar.f431795a;
                if (j17 != 0 && android.opengl.GLES30.glIsSync(j17)) {
                    android.opengl.GLES30.glWaitSync(j17, 0, -1L);
                }
                long j18 = fVar.f431795a;
                if (j18 != 0 && android.opengl.GLES30.glIsSync(j18)) {
                    android.opengl.GLES30.glDeleteSync(j18);
                }
                this.f431788d = true;
                this.f431789e = null;
            }
        }
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int accessibility() {
        return 0;
    }

    @Override // com.tencent.maas.camstudio.frame.TextureVideoFrame
    public long getFenceSyncObj() {
        return this.f431787c;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getFrameCWAngle() {
        return 0;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getHeight() {
        return this.f431785a.f294401n;
    }

    @Override // com.tencent.maas.camstudio.frame.TextureVideoFrame
    public int getTextureName() {
        return this.f431785a.f294395e;
    }

    @Override // com.tencent.maas.camstudio.frame.Frame
    public long getTimestamp() {
        return this.f431786b;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getWidth() {
        return this.f431785a.f294400m;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public boolean isMirrored() {
        return false;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public void release() {
        com.tencent.mars.xlog.Log.i("CamSessionTextureVideoFrame", "release");
        synchronized (this.f431790f) {
            this.f431788d = false;
            this.f431790f.notifyAll();
        }
    }

    @Override // com.tencent.maas.camstudio.frame.TextureVideoFrame
    public void release(long j17) {
        com.tencent.mars.xlog.Log.i("CamSessionTextureVideoFrame", "release with syncObj " + j17);
        synchronized (this.f431790f) {
            ux0.f fVar = this.f431789e;
            if (fVar != null) {
                long j18 = fVar.f431795a;
                if (j18 != 0 && android.opengl.GLES30.glIsSync(j18)) {
                    android.opengl.GLES30.glDeleteSync(j18);
                }
                this.f431789e = null;
            }
            this.f431789e = new ux0.f(j17);
            this.f431790f.notifyAll();
        }
    }
}
