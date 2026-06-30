package zi;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f473076a;

    public b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        this.f473076a = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof zi.b)) {
            return false;
        }
        return java.util.Arrays.equals(this.f473076a, ((zi.b) obj).f473076a);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f473076a);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0x");
        for (byte b17 : this.f473076a) {
            sb6.append(java.lang.Integer.toHexString(b17 & 255));
        }
        return sb6.toString();
    }
}
