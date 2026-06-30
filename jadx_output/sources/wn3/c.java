package wn3;

/* loaded from: classes8.dex */
public final class c implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public byte[] f447528d;

    public c(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("apdu is null");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        if (bArr2.length < 2) {
            throw new java.lang.IllegalArgumentException("apdu must be at least 2 bytes long");
        }
        this.f447528d = bArr2;
    }

    public void a(wn3.c cVar) {
        byte[] bArr = this.f447528d;
        int length = bArr.length;
        this.f447528d = java.util.Arrays.copyOf(bArr, (bArr.length + cVar.f447528d.length) - 2);
        int i17 = length - 2;
        byte[] bArr2 = (byte[]) cVar.f447528d.clone();
        int length2 = bArr2.length;
        int i18 = 0;
        while (i18 < length2) {
            this.f447528d[i17] = bArr2[i18];
            i18++;
            i17++;
        }
    }

    public short b() {
        return (short) (this.f447528d[r0.length - 2] & 255);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wn3.c) {
            return java.util.Arrays.equals(this.f447528d, ((wn3.c) obj).f447528d);
        }
        return false;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f447528d);
    }

    public java.lang.String toString() {
        return zn3.a.a(this.f447528d);
    }
}
