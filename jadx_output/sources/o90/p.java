package o90;

/* loaded from: classes7.dex */
public final class p implements hm0.w {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[Catch: Exception -> 0x0079, TryCatch #0 {Exception -> 0x0079, blocks: (B:3:0x0010, B:5:0x0017, B:11:0x0025, B:13:0x0031, B:15:0x0039, B:18:0x0069, B:20:0x0073, B:22:0x0049, B:24:0x0055, B:26:0x0021), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073 A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #0 {Exception -> 0x0079, blocks: (B:3:0x0010, B:5:0x0017, B:11:0x0025, B:13:0x0031, B:15:0x0039, B:18:0x0069, B:20:0x0073, B:22:0x0049, B:24:0x0055, B:26:0x0021), top: B:2:0x0010 }] */
    @Override // hm0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onNetworkChange(int r10) {
        /*
            r9 = this;
            java.lang.Class<lh3.n> r10 = lh3.n.class
            i95.m r10 = i95.n0.c(r10)
            lh3.n r10 = (lh3.n) r10
            r10.getClass()
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.SimcardService"
            r2 = 0
            boolean r3 = r10.Ui()     // Catch: java.lang.Exception -> L79
            r4 = 1
            if (r3 != 0) goto L1b
            r10.Di(r2, r4)     // Catch: java.lang.Exception -> L79
            goto L7f
        L1b:
            boolean r3 = r10.f318695m
            if (r3 == 0) goto L21
            r5 = r0
            goto L25
        L21:
            java.lang.String r5 = wo.w0.h()     // Catch: java.lang.Exception -> L79
        L25:
            java.lang.String r6 = "onNetworkChange imsi[%s]"
            java.lang.Object[] r7 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r1, r6, r7)     // Catch: java.lang.Exception -> L79
            r6 = 2
            if (r3 != 0) goto L49
            java.lang.String r3 = lh3.n.f318687p     // Catch: java.lang.Exception -> L79
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L79
            if (r3 != 0) goto L49
            java.lang.String r3 = "imsi change old[%s] new[%s]"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = lh3.n.f318687p     // Catch: java.lang.Exception -> L79
            r7[r2] = r8     // Catch: java.lang.Exception -> L79
            r7[r4] = r5     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r1, r3, r7)     // Catch: java.lang.Exception -> L79
            lh3.n.f318687p = r5     // Catch: java.lang.Exception -> L79
            goto L64
        L49:
            java.lang.String r3 = r10.Ri()     // Catch: java.lang.Exception -> L79
            java.lang.String r5 = lh3.n.f318688q     // Catch: java.lang.Exception -> L79
            boolean r5 = r3.equals(r5)     // Catch: java.lang.Exception -> L79
            if (r5 != 0) goto L66
            java.lang.String r5 = "clientIp change old[%s] new[%s]"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = lh3.n.f318688q     // Catch: java.lang.Exception -> L79
            r7[r2] = r8     // Catch: java.lang.Exception -> L79
            r7[r4] = r3     // Catch: java.lang.Exception -> L79
            com.tencent.mars.xlog.Log.i(r1, r5, r7)     // Catch: java.lang.Exception -> L79
            lh3.n.f318688q = r3     // Catch: java.lang.Exception -> L79
        L64:
            r3 = r4
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L73
            r10.f318689d = r2     // Catch: java.lang.Exception -> L79
            r3 = 0
            r10.f318693h = r3     // Catch: java.lang.Exception -> L79
            r10.wi(r6)     // Catch: java.lang.Exception -> L79
            goto L7f
        L73:
            int r3 = r10.f318690e     // Catch: java.lang.Exception -> L79
            r10.Di(r3, r4)     // Catch: java.lang.Exception -> L79
            goto L7f
        L79:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r10, r0, r2)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o90.p.onNetworkChange(int):void");
    }
}
