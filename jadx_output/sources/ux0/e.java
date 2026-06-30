package ux0;

/* loaded from: classes5.dex */
public final class e implements com.tencent.maas.camstudio.frame.TextureVideoFrame {

    /* renamed from: a, reason: collision with root package name */
    public long f431791a = Long.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public final int f431792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f431793c;

    /* renamed from: d, reason: collision with root package name */
    public final int f431794d;

    public e(int i17, int i18, int i19) {
        this.f431792b = i17;
        this.f431793c = i18;
        this.f431794d = i19;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int accessibility() {
        return 0;
    }

    @Override // com.tencent.maas.camstudio.frame.TextureVideoFrame
    public long getFenceSyncObj() {
        return 0L;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getFrameCWAngle() {
        return 0;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getHeight() {
        return this.f431794d;
    }

    @Override // com.tencent.maas.camstudio.frame.TextureVideoFrame
    public int getTextureName() {
        return this.f431792b;
    }

    @Override // com.tencent.maas.camstudio.frame.Frame
    public long getTimestamp() {
        return this.f431791a;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public int getWidth() {
        return this.f431793c;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public boolean isMirrored() {
        return false;
    }

    @Override // com.tencent.maas.camstudio.frame.VideoFrame
    public void release() {
    }

    @Override // com.tencent.maas.camstudio.frame.TextureVideoFrame
    public void release(long j17) {
    }
}
