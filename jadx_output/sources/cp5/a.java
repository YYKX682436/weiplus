package cp5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f221106a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f221107b;

    /* renamed from: c, reason: collision with root package name */
    public int f221108c;

    /* renamed from: d, reason: collision with root package name */
    public final long f221109d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f221110e = true;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f221111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp5.b f221112g;

    public a(cp5.b bVar, java.nio.ByteBuffer byteBuffer, boolean z17) {
        this.f221112g = bVar;
        this.f221106a = byteBuffer;
        this.f221107b = z17;
    }

    public final java.nio.ByteBuffer a() {
        boolean z17;
        if (this.f221112g.f221113d || !this.f221107b || java.lang.System.currentTimeMillis() - this.f221109d <= 200) {
            z17 = this.f221110e;
        } else {
            b();
            z17 = false;
        }
        if (z17) {
            return this.f221106a;
        }
        return null;
    }

    public final synchronized void b() {
        if (!this.f221107b) {
            int i17 = this.f221108c;
            this.f221108c = i17 + 1;
            if (i17 % 50 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "current byte not allow to recycle");
            }
            return;
        }
        if (this.f221111f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.BufferManager", "already recyclered");
            return;
        }
        this.f221111f = true;
        this.f221110e = false;
        java.nio.ByteBuffer byteBuffer = this.f221106a;
        if (byteBuffer != null) {
            this.f221112g.b(byteBuffer);
        }
    }
}
