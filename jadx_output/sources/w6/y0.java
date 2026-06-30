package w6;

/* loaded from: classes13.dex */
public final class y0 implements w6.z0, r7.f {

    /* renamed from: h, reason: collision with root package name */
    public static final m3.e f443246h = r7.h.a(20, new w6.x0());

    /* renamed from: d, reason: collision with root package name */
    public final r7.k f443247d = new r7.j();

    /* renamed from: e, reason: collision with root package name */
    public w6.z0 f443248e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443249f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f443250g;

    @Override // w6.z0
    public java.lang.Class a() {
        return this.f443248e.a();
    }

    public synchronized void b() {
        this.f443247d.a();
        if (!this.f443249f) {
            throw new java.lang.IllegalStateException("Already unlocked");
        }
        this.f443249f = false;
        if (this.f443250g) {
            recycle();
        }
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f443248e.get();
    }

    @Override // w6.z0
    public int getSize() {
        return this.f443248e.getSize();
    }

    @Override // r7.f
    public r7.k h() {
        return this.f443247d;
    }

    @Override // w6.z0
    public synchronized void recycle() {
        this.f443247d.a();
        this.f443250g = true;
        if (!this.f443249f) {
            this.f443248e.recycle();
            this.f443248e = null;
            ((r7.e) f443246h).b(this);
        }
    }
}
