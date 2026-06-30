package t9;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f416517a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f416518b = new long[32];

    public long a(int i17) {
        if (i17 >= 0 && i17 < this.f416517a) {
            return this.f416518b[i17];
        }
        throw new java.lang.IndexOutOfBoundsException("Invalid index " + i17 + ", size is " + this.f416517a);
    }
}
