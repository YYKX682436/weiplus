package v56;

/* loaded from: classes14.dex */
public final class c extends v56.a {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.Integer f433371m = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f433372f;

    /* renamed from: g, reason: collision with root package name */
    public long f433373g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f433374h;

    /* renamed from: i, reason: collision with root package name */
    public final int f433375i;

    public c(int i17) {
        super(i17);
        this.f433372f = new java.util.concurrent.atomic.AtomicLong();
        this.f433374h = new java.util.concurrent.atomic.AtomicLong();
        this.f433375i = java.lang.Math.min(i17 / 4, f433371m.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f433372f.get() == this.f433374h.get();
    }

    @Override // java.util.Queue
    public boolean offer(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f433368d;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f433372f;
        long j17 = atomicLong.get();
        int i17 = this.f433369e;
        int i18 = ((int) j17) & i17;
        if (j17 >= this.f433373g) {
            long j18 = this.f433375i + j17;
            if (atomicReferenceArray.get(i17 & ((int) j18)) == null) {
                this.f433373g = j18;
            } else if (atomicReferenceArray.get(i18) != null) {
                return false;
            }
        }
        atomicReferenceArray.lazySet(i18, obj);
        atomicLong.lazySet(j17 + 1);
        return true;
    }

    @Override // java.util.Queue
    public java.lang.Object peek() {
        return this.f433368d.get(((int) this.f433374h.get()) & this.f433369e);
    }

    @Override // java.util.Queue
    public java.lang.Object poll() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f433374h;
        long j17 = atomicLong.get();
        int i17 = ((int) j17) & this.f433369e;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f433368d;
        java.lang.Object obj = atomicReferenceArray.get(i17);
        if (obj == null) {
            return null;
        }
        atomicReferenceArray.lazySet(i17, null);
        atomicLong.lazySet(j17 + 1);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.f433374h;
        long j17 = atomicLong.get();
        while (true) {
            long j18 = this.f433372f.get();
            long j19 = atomicLong.get();
            if (j17 == j19) {
                return (int) (j18 - j19);
            }
            j17 = j19;
        }
    }
}
