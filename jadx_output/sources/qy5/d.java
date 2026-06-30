package qy5;

/* loaded from: classes13.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(int r7, byte[] r8, byte[] r9) {
        /*
            if (r8 == 0) goto L60
            int r0 = r8.length
            r1 = 24
            r2 = 16
            r3 = 8
            if (r0 == r3) goto L11
            int r0 = r8.length
            if (r0 == r2) goto L11
            int r0 = r8.length
            if (r0 != r1) goto L60
        L11:
            if (r9 == 0) goto L5a
            java.lang.String r0 = "DESede/ECB/NoPadding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            byte[] r4 = new byte[r1]
            int r5 = r8.length
            r6 = 0
            if (r5 != r3) goto L29
            java.lang.System.arraycopy(r8, r6, r4, r6, r3)
            java.lang.System.arraycopy(r8, r6, r4, r3, r3)
        L25:
            java.lang.System.arraycopy(r8, r6, r4, r2, r3)
            goto L33
        L29:
            int r5 = r8.length
            if (r5 != r2) goto L30
            java.lang.System.arraycopy(r8, r6, r4, r6, r2)
            goto L25
        L30:
            java.lang.System.arraycopy(r8, r6, r4, r6, r1)
        L33:
            int r8 = r9.length
            int r8 = r8 % r3
            r1 = 1
            if (r8 == 0) goto L47
            int r8 = r9.length
            int r8 = r8 / r3
            int r8 = r8 + r1
            int r8 = r8 * r3
            byte[] r2 = new byte[r8]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r6, r2, r6, r3)
            int r9 = r9.length
            java.util.Arrays.fill(r2, r9, r8, r6)
            r9 = r2
        L47:
            if (r7 == 0) goto L4a
            goto L4b
        L4a:
            r1 = 2
        L4b:
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r8 = "DESede"
            r7.<init>(r4, r8)
            r0.init(r1, r7)
            byte[] r7 = r0.doFinal(r9)
            return r7
        L5a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L60:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qy5.d.a(int, byte[], byte[]):byte[]");
    }
}
