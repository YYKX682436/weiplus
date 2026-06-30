package vv1;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ThreadPoolExecutor f440403a = new java.util.concurrent.ThreadPoolExecutor(0, 1, 1, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque());

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(wv1.a r3, vv1.a r4, im5.b r5) {
        /*
            java.lang.String r0 = "sumbit() item:%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r2 = "MicroMsg.MsgFileMgr"
            com.tencent.mars.xlog.Log.i(r2, r0, r1)
            int r0 = r3.h()
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 == r1) goto L24
            r1 = 4
            if (r0 == r1) goto L1e
            r3 = 0
            goto L36
        L1e:
            vv1.e r0 = new vv1.e
            r0.<init>(r3, r4, r5)
            goto L35
        L24:
            vv1.n r0 = new vv1.n
            r0.<init>(r3, r4, r5)
            goto L35
        L2a:
            vv1.k r0 = new vv1.k
            r0.<init>(r3, r4, r5)
            goto L35
        L30:
            vv1.h r0 = new vv1.h
            r0.<init>(r3, r4, r5)
        L35:
            r3 = r0
        L36:
            if (r3 != 0) goto L43
            java.lang.String r3 = "downloadTask is null, return"
            com.tencent.mars.xlog.Log.e(r2, r3)
            if (r4 == 0) goto L42
            r4.c()
        L42:
            return
        L43:
            boolean r5 = r3.j()
            if (r5 != 0) goto L54
            java.lang.String r3 = "downloadTask is invalid, return"
            com.tencent.mars.xlog.Log.e(r2, r3)
            if (r4 == 0) goto L53
            r4.b()
        L53:
            return
        L54:
            boolean r4 = r3.d()
            if (r4 != 0) goto L5f
            java.util.concurrent.ThreadPoolExecutor r4 = vv1.b.f440403a
            r4.submit(r3)
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vv1.b.a(wv1.a, vv1.a, im5.b):void");
    }
}
