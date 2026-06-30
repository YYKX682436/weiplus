package e06;

/* loaded from: classes10.dex */
public final class m extends kz5.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final long f246220d;

    /* renamed from: e, reason: collision with root package name */
    public final long f246221e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f246222f;

    /* renamed from: g, reason: collision with root package name */
    public long f246223g;

    public m(long j17, long j18, long j19) {
        this.f246220d = j19;
        this.f246221e = j18;
        boolean z17 = true;
        if (j19 <= 0 ? j17 < j18 : j17 > j18) {
            z17 = false;
        }
        this.f246222f = z17;
        this.f246223g = z17 ? j17 : j18;
    }

    @Override // kz5.y0
    public long b() {
        long j17 = this.f246223g;
        if (j17 != this.f246221e) {
            this.f246223g = this.f246220d + j17;
        } else {
            if (!this.f246222f) {
                throw new java.util.NoSuchElementException();
            }
            this.f246222f = false;
        }
        return j17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f246222f;
    }
}
