package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class i6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f192739a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f192740b;

    /* renamed from: c, reason: collision with root package name */
    public final int f192741c;

    /* renamed from: d, reason: collision with root package name */
    public final int f192742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f192743e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f192744f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Vector f192745g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f192746h;

    public i6(int i17, java.lang.String str, int i18) {
        this(i17, str, i18, android.os.Looper.myLooper());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r6.f192741c > r7.size()) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(com.tencent.mm.sdk.platformtools.g6 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "QueueWorkerThread.QueueWorkerThread"
            if (r7 != 0) goto Lb
            java.lang.String r7 = "add empty thread object"
            com.tencent.mars.xlog.Log.e(r0, r7)
            r7 = -1
            return r7
        Lb:
            r1 = 0
            java.util.concurrent.LinkedBlockingQueue r2 = r6.f192739a
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L3f
            r4 = 1
            boolean r7 = r2.offer(r7, r4, r3)     // Catch: java.lang.Exception -> L3f
            if (r7 != 0) goto L1f
            java.lang.String r7 = "add To Queue failed"
            com.tencent.mars.xlog.Log.e(r0, r7)     // Catch: java.lang.Exception -> L3f
            r7 = -2
            return r7
        L1f:
            java.util.Vector r7 = r6.f192745g
            int r0 = r7.size()
            if (r0 == 0) goto L35
            int r0 = r2.size()
            if (r0 <= 0) goto L3e
            int r7 = r7.size()
            int r0 = r6.f192741c
            if (r0 <= r7) goto L3e
        L35:
            com.tencent.mm.sdk.platformtools.h6 r7 = new com.tencent.mm.sdk.platformtools.h6
            r0 = 0
            r7.<init>(r6, r0)
            r7.start()
        L3e:
            return r1
        L3f:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "add To Queue failed :"
            r2.<init>(r3)
            java.lang.String r3 = r7.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.e(r0, r2)
            java.lang.String r2 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r7, r2, r1)
            r7 = -3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.i6.a(com.tencent.mm.sdk.platformtools.g6):int");
    }

    public i6(int i17, java.lang.String str, int i18, android.os.Looper looper) {
        this.f192739a = new java.util.concurrent.LinkedBlockingQueue();
        this.f192740b = false;
        this.f192741c = 1;
        this.f192742d = 1;
        this.f192743e = "";
        this.f192744f = new byte[0];
        this.f192745g = new java.util.Vector();
        this.f192741c = i18;
        this.f192743e = str;
        this.f192742d = i17;
        if (looper == null && android.os.Looper.getMainLooper() != null) {
            looper = android.os.Looper.getMainLooper();
            com.tencent.mars.xlog.Log.i("QueueWorkerThread.QueueWorkerThread", "looper is null use MainLooper!");
        }
        this.f192746h = new com.tencent.mm.sdk.platformtools.f6(this, looper);
    }
}
