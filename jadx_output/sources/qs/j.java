package qs;

/* loaded from: classes8.dex */
public class j extends com.tencent.mm.sdk.event.n {
    public j() {
        super(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r6 != null) goto L10;
     */
    @Override // com.tencent.mm.sdk.event.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean callback(com.tencent.mm.sdk.event.IEvent r9) {
        /*
            r8 = this;
            com.tencent.mm.autogen.events.UpdateFindEntryEvent r9 = (com.tencent.mm.autogen.events.UpdateFindEntryEvent) r9
            z71.f r0 = z71.f.Bi()
            am.wz r9 = r9.f54917g
            java.util.List r9 = r9.f8329a
            r0.getClass()
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.util.Iterator r3 = r9.iterator()
            r4 = 0
            r5 = r4
        L19:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L36
            java.lang.Object r6 = r3.next()
            java.lang.String r6 = (java.lang.String) r6
            z71.e r6 = z71.e.valueOf(r6)     // Catch: java.lang.IllegalArgumentException -> L2c
            if (r6 == 0) goto L2c
            goto L2d
        L2c:
            r6 = 0
        L2d:
            if (r6 == 0) goto L19
            r7 = 1
            int r6 = r6.f470518d
            int r6 = r7 << r6
            r5 = r5 | r6
            goto L19
        L36:
            r0.f470519d = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r9, r1}
            java.lang.String r0 = "MicroMsg.AiRedDotData"
            java.lang.String r1 = "noteFindEntry [%d] [%s] cost[%d]"
            com.tencent.mars.xlog.Log.i(r0, r1, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qs.j.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
