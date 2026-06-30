package uk;

/* loaded from: classes8.dex */
public final class p implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final int f428510d;

    public p(byte[] bArr) {
        int i17 = (bArr[1] << 8) & 65280;
        this.f428510d = i17;
        this.f428510d = i17 + (bArr[0] & 255);
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof uk.p) && this.f428510d == ((uk.p) obj).f428510d;
    }

    public int hashCode() {
        return this.f428510d;
    }

    public p(int i17) {
        this.f428510d = i17;
    }
}
