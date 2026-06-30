package com.tencent.mm.storage;

/* loaded from: classes.dex */
public abstract class m2 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[Catch: NumberFormatException -> 0x000c, TryCatch #0 {NumberFormatException -> 0x000c, blocks: (B:16:0x0003, B:5:0x0011, B:6:0x001a, B:14:0x0016), top: B:15:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[Catch: NumberFormatException -> 0x000c, TryCatch #0 {NumberFormatException -> 0x000c, blocks: (B:16:0x0003, B:5:0x0011, B:6:0x001a, B:14:0x0016), top: B:15:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto Le
            boolean r1 = r26.n0.N(r3)     // Catch: java.lang.NumberFormatException -> Lc
            if (r1 == 0) goto La
            goto Le
        La:
            r1 = r0
            goto Lf
        Lc:
            r3 = move-exception
            goto L22
        Le:
            r1 = 1
        Lf:
            if (r1 == 0) goto L16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc
            goto L1a
        L16:
            java.lang.Integer r3 = java.lang.Integer.decode(r3)     // Catch: java.lang.NumberFormatException -> Lc
        L1a:
            kotlin.jvm.internal.o.d(r3)     // Catch: java.lang.NumberFormatException -> Lc
            int r0 = r3.intValue()     // Catch: java.lang.NumberFormatException -> Lc
            goto L31
        L22:
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = "MicroMsg.BizTimeLineStorageLogicExKt"
            java.lang.String r2 = "safeToInt fail %s"
            com.tencent.mars.xlog.Log.e(r1, r2, r3)
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.m2.a(java.lang.String):int");
    }
}
