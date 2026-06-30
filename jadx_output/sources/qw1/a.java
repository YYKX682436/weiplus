package qw1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f367068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f367069b;

    /* renamed from: c, reason: collision with root package name */
    public final long f367070c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f367071d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f367072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qw1.b f367073f;

    public a(qw1.b bVar, byte[] bArr, java.nio.ByteBuffer byteBuffer, int i17, kotlin.jvm.internal.i iVar) {
        bArr = (i17 & 1) != 0 ? null : bArr;
        byteBuffer = (i17 & 2) != 0 ? null : byteBuffer;
        this.f367073f = bVar;
        this.f367068a = bArr;
        this.f367069b = byteBuffer;
        this.f367070c = java.lang.System.currentTimeMillis();
        this.f367071d = true;
    }

    public final synchronized void a() {
        if (this.f367072e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "already recyclered");
            return;
        }
        this.f367072e = true;
        this.f367071d = false;
        byte[] bArr = this.f367068a;
        if (bArr != null) {
            this.f367073f.a(bArr);
        } else {
            java.nio.ByteBuffer byteBuffer = this.f367069b;
            if (byteBuffer != null) {
                this.f367073f.b(byteBuffer);
            }
        }
    }
}
