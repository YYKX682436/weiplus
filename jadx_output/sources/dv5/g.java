package dv5;

/* loaded from: classes16.dex */
public final class g extends dv5.a {

    /* renamed from: c, reason: collision with root package name */
    public final short[] f244063c;

    public g(short[] sArr) {
        if (sArr == null) {
            throw new java.lang.NullPointerException("array == null");
        }
        this.f244063c = sArr;
    }

    public int b() {
        try {
            short[] sArr = this.f244063c;
            int i17 = this.f244036b;
            short s17 = sArr[i17];
            this.f244036b = i17 + 1;
            return s17 & 65535;
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            throw new java.io.EOFException();
        }
    }

    public int c() {
        return b() | (b() << 16);
    }

    public long d() {
        return b() | (b() << 16) | (b() << 32) | (b() << 48);
    }
}
