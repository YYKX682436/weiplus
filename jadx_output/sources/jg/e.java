package jg;

/* loaded from: classes5.dex */
public class e implements com.tencent.maas.camstudio.frame.Plane {

    /* renamed from: a, reason: collision with root package name */
    public final int f299534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f299535b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f299536c;

    public e(int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        this.f299534a = i17;
        this.f299535b = i18;
        this.f299536c = byteBuffer;
    }

    @Override // com.tencent.maas.camstudio.frame.Plane
    public java.nio.ByteBuffer getBuffer() {
        return this.f299536c;
    }

    @Override // com.tencent.maas.camstudio.frame.Plane
    public int getPixelStride() {
        return this.f299535b;
    }

    @Override // com.tencent.maas.camstudio.frame.Plane
    public int getRowStride() {
        return this.f299534a;
    }
}
