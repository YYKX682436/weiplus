package i9;

/* loaded from: classes15.dex */
public abstract class j extends o8.h implements i9.d {

    /* renamed from: f, reason: collision with root package name */
    public i9.d f289671f;

    /* renamed from: g, reason: collision with root package name */
    public long f289672g;

    @Override // i9.d
    public long a(int i17) {
        return this.f289671f.a(i17) + this.f289672g;
    }

    @Override // i9.d
    public int h() {
        return this.f289671f.h();
    }

    @Override // i9.d
    public int i(long j17) {
        return this.f289671f.i(j17 - this.f289672g);
    }

    @Override // i9.d
    public java.util.List j(long j17) {
        return this.f289671f.j(j17 - this.f289672g);
    }

    public abstract void l();
}
