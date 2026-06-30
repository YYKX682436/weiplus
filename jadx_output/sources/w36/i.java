package w36;

/* loaded from: classes16.dex */
public abstract class i {
    public static java.lang.String a(int i17) {
        if (i17 < 1000 || i17 >= 5000) {
            return "Code must be in range [1000,5000): " + i17;
        }
        if ((i17 < 1004 || i17 > 1006) && (i17 < 1012 || i17 > 2999)) {
            return null;
        }
        return "Code " + i17 + " is reserved and may not be used.";
    }

    public static void b(x36.i iVar, byte[] bArr) {
        long j17;
        int length = bArr.length;
        int i17 = 0;
        do {
            byte[] bArr2 = iVar.f451685h;
            int i18 = iVar.f451686i;
            int i19 = iVar.f451687m;
            while (true) {
                if (i18 >= i19) {
                    break;
                }
                int i27 = i17 % length;
                bArr2[i18] = (byte) (bArr2[i18] ^ bArr[i27]);
                i18++;
                i17 = i27 + 1;
            }
            long j18 = iVar.f451684g;
            x36.k kVar = iVar.f451681d;
            kotlin.jvm.internal.o.d(kVar);
            if (!(j18 != kVar.f451694e)) {
                throw new java.lang.IllegalStateException("no more bytes".toString());
            }
            j17 = iVar.f451684g;
        } while (iVar.a(j17 == -1 ? 0L : j17 + (iVar.f451687m - iVar.f451686i)) != -1);
    }
}
