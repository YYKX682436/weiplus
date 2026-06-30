package r46;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f392502a = new byte[0];

    public static long a(java.io.DataInput dataInput, int i17) {
        if (i17 > 8) {
            throw new java.lang.IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
        long j17 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            j17 |= dataInput.readUnsignedByte() << (i18 * 8);
        }
        return j17;
    }

    public static long b(r46.c cVar, int i17) {
        if (i17 > 8) {
            throw new java.lang.IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
        long j17 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            long a17 = cVar.a();
            if (a17 == -1) {
                throw new java.io.IOException("Premature end of data");
            }
            j17 |= a17 << (i18 * 8);
        }
        return j17;
    }

    public static long c(byte[] bArr, int i17, int i18) {
        if (i18 > 8) {
            throw new java.lang.IllegalArgumentException("Can't read more than eight bytes into a long value");
        }
        long j17 = 0;
        for (int i19 = 0; i19 < i18; i19++) {
            j17 |= (bArr[i17 + i19] & 255) << (i19 * 8);
        }
        return j17;
    }
}
