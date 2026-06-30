package u46;

/* loaded from: classes9.dex */
public abstract class j {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(byte[] r2) {
        /*
            if (r2 == 0) goto L37
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            r2 = 0
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1f java.lang.ClassNotFoundException -> L28
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1f java.lang.ClassNotFoundException -> L28
            java.lang.Object r2 = r1.readObject()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17 java.lang.ClassNotFoundException -> L19
            r1.close()     // Catch: java.io.IOException -> L14
        L14:
            return r2
        L15:
            r2 = move-exception
            goto L31
        L17:
            r2 = move-exception
            goto L22
        L19:
            r2 = move-exception
            goto L2b
        L1b:
            r0 = move-exception
            r1 = r2
            r2 = r0
            goto L31
        L1f:
            r0 = move-exception
            r1 = r2
            r2 = r0
        L22:
            u46.i r0 = new u46.i     // Catch: java.lang.Throwable -> L15
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L28:
            r0 = move-exception
            r1 = r2
            r2 = r0
        L2b:
            u46.i r0 = new u46.i     // Catch: java.lang.Throwable -> L15
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L31:
            if (r1 == 0) goto L36
            r1.close()     // Catch: java.io.IOException -> L36
        L36:
            throw r2
        L37:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The byte[] must not be null"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u46.j.a(byte[]):java.lang.Object");
    }
}
