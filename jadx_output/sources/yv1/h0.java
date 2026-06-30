package yv1;

/* loaded from: classes10.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Future f466061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f466062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f466063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw1.f f466064g;

    public h0(java.util.concurrent.Future future, com.tencent.wcdb.support.CancellationSignal cancellationSignal, java.util.HashSet hashSet, bw1.f fVar) {
        this.f466061d = future;
        this.f466062e = cancellationSignal;
        this.f466063f = hashSet;
        this.f466064g = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r1.isCanceled() == true) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            java.util.concurrent.Future r0 = r3.f466061d
            if (r0 == 0) goto L7
            r0.get()
        L7:
            r0 = 0
            com.tencent.wcdb.support.CancellationSignal r1 = r3.f466062e
            if (r1 == 0) goto L14
            boolean r1 = r1.isCanceled()
            r2 = 1
            if (r1 != r2) goto L14
            goto L15
        L14:
            r2 = r0
        L15:
            java.lang.String r1 = "MicroMsg.CleanService"
            if (r2 != 0) goto L26
            java.lang.String r2 = "Start CompressOriginalMediaService"
            com.tencent.mars.xlog.Log.i(r1, r2)
            aw1.l0 r1 = aw1.l0.f14568a
            java.util.HashSet r2 = r3.f466063f
            r1.k(r2, r0)
            goto L32
        L26:
            java.lang.String r0 = "CleanPersistOriginalMedia task cancelled"
            com.tencent.mars.xlog.Log.i(r1, r0)
            jz5.f0 r0 = jz5.f0.f302826a
            bw1.f r1 = r3.f466064g
            r1.a(r0)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yv1.h0.run():void");
    }
}
