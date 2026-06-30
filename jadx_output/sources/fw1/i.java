package fw1;

/* loaded from: classes14.dex */
public abstract class i {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
    
        if (r4 != 4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(int r4, boolean r5) {
        /*
            r0 = 4
            r1 = 1
            if (r4 == r1) goto L15
            r2 = 2
            if (r4 == r2) goto Ld
            r3 = 3
            if (r4 == r3) goto L15
            if (r4 == r0) goto Ld
            goto L17
        Ld:
            if (r5 == 0) goto L12
            int r4 = r4 + r1
            int r4 = r4 % r0
            goto L13
        L12:
            int r4 = r4 - r1
        L13:
            r2 = r4
            goto L17
        L15:
            int r2 = r4 + 1
        L17:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.order(r5)
            byte r5 = (byte) r2
            r4.put(r5)
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 r5 = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE
            byte[] r4 = r4.array()
            r5.getClass()
            r5 = 21
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.g0.b(r5, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fw1.i.a(int, boolean):void");
    }
}
