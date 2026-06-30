package pc;

/* loaded from: classes10.dex */
public abstract class h {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0054: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:56:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L61
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto L61
        La:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            r1.<init>()     // Catch: java.lang.Throwable -> L41 java.io.IOException -> L43
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L36
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "UTF-8"
            byte[] r4 = r4.getBytes(r3)     // Catch: java.lang.Throwable -> L34
            r2.write(r4)     // Catch: java.lang.Throwable -> L34
            r2.close()     // Catch: java.lang.Throwable -> L34
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L34
            r1.close()     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            r2.close()     // Catch: java.io.IOException -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            r0.getLocalizedMessage()
        L2f:
            return r4
        L30:
            r4 = move-exception
            goto L56
        L32:
            r4 = move-exception
            goto L45
        L34:
            r4 = move-exception
            goto L38
        L36:
            r4 = move-exception
            r2 = r0
        L38:
            r1.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L53
        L40:
            throw r4     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L53
        L41:
            r4 = move-exception
            goto L55
        L43:
            r4 = move-exception
            r2 = r0
        L45:
            r4.getLocalizedMessage()     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r4 = move-exception
            r4.getLocalizedMessage()
        L52:
            return r0
        L53:
            r4 = move-exception
            r0 = r2
        L55:
            r2 = r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.getLocalizedMessage()
        L60:
            throw r4
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.h.a(java.lang.String):byte[]");
    }
}
