package nj3;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f337880a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f337881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f337882c;

    /* renamed from: d, reason: collision with root package name */
    public final long f337883d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f337884e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f337885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nj3.b f337886g;

    public a(nj3.b bVar, byte[] bArr, java.nio.ByteBuffer byteBuffer, int i17, kotlin.jvm.internal.i iVar) {
        bArr = (i17 & 1) != 0 ? null : bArr;
        byteBuffer = (i17 & 2) != 0 ? null : byteBuffer;
        this.f337886g = bVar;
        this.f337880a = bArr;
        this.f337881b = byteBuffer;
        int i18 = byteBuffer != null ? 1 : 0;
        this.f337882c = i18;
        bVar.f337890g += i18;
        this.f337883d = java.lang.System.currentTimeMillis();
        this.f337884e = true;
    }

    public final synchronized void a() {
        if (this.f337885f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "already recyclered");
            return;
        }
        this.f337886g.f337890g -= this.f337882c;
        this.f337885f = true;
        this.f337884e = false;
        byte[] bArr = this.f337880a;
        if (bArr != null) {
            this.f337886g.b(bArr);
        } else {
            java.nio.ByteBuffer byteBuffer = this.f337881b;
            if (byteBuffer != null) {
                this.f337886g.c(byteBuffer);
            }
        }
    }
}
