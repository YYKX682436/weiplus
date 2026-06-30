package w6;

/* loaded from: classes13.dex */
public class r0 implements w6.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f443193d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f443194e;

    /* renamed from: f, reason: collision with root package name */
    public final w6.z0 f443195f;

    /* renamed from: g, reason: collision with root package name */
    public final w6.q0 f443196g;

    /* renamed from: h, reason: collision with root package name */
    public final t6.h f443197h;

    /* renamed from: i, reason: collision with root package name */
    public int f443198i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f443199m;

    public r0(w6.z0 z0Var, boolean z17, boolean z18, t6.h hVar, w6.q0 q0Var) {
        q7.n.b(z0Var);
        this.f443195f = z0Var;
        this.f443193d = z17;
        this.f443194e = z18;
        this.f443197h = hVar;
        q7.n.b(q0Var);
        this.f443196g = q0Var;
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return this.f443195f.a();
    }

    public synchronized void b() {
        if (this.f443199m) {
            throw new java.lang.IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f443198i++;
    }

    public void c() {
        boolean z17;
        synchronized (this) {
            int i17 = this.f443198i;
            if (i17 <= 0) {
                throw new java.lang.IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z17 = true;
            int i18 = i17 - 1;
            this.f443198i = i18;
            if (i18 != 0) {
                z17 = false;
            }
        }
        if (z17) {
            ((w6.g0) this.f443196g).c(this.f443197h, this);
        }
    }

    @Override // w6.z0
    public java.lang.Object get() {
        return this.f443195f.get();
    }

    @Override // w6.z0
    public int getSize() {
        return this.f443195f.getSize();
    }

    @Override // w6.z0
    public synchronized void recycle() {
        if (this.f443198i > 0) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f443199m) {
            throw new java.lang.IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f443199m = true;
        if (this.f443194e) {
            this.f443195f.recycle();
        }
    }

    public synchronized java.lang.String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f443193d + ", listener=" + this.f443196g + ", key=" + this.f443197h + ", acquired=" + this.f443198i + ", isRecycled=" + this.f443199m + ", resource=" + this.f443195f + '}';
    }
}
