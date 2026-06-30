package tl4;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.jq0 f420318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl4.l f420319e;

    public k(bw5.jq0 jq0Var, tl4.l lVar) {
        this.f420318d = jq0Var;
        this.f420319e = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if ((r0.d().f34189e == 4) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            bw5.jq0 r0 = r10.f420318d
            boolean[] r1 = r0.f29115m
            r2 = 5
            boolean r1 = r1[r2]
            if (r1 == 0) goto Lc
            bw5.lq0 r1 = r0.f29113h
            goto Le
        Lc:
            bw5.lq0 r1 = bw5.lq0.unknown
        Le:
            int r1 = r1.f29930d
            tl4.l r2 = r10.f420319e
            int r3 = r2.f420322f
            if (r1 != r3) goto L17
            return
        L17:
            r2.f420322f = r1
            com.tencent.unit_rc.WeakPtr r2 = r2.f420321e
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r2.lock()
            b66.g r2 = (b66.g) r2
            if (r2 == 0) goto Lab
            b66.i r2 = (b66.i) r2
            b66.n r2 = r2.a()
            if (r2 != 0) goto L2f
            goto Lab
        L2f:
            bw5.lp0 r0 = r0.b()
            long r2 = r2.k()
            int r1 = rk4.k5.f(r1)
            if (r1 >= 0) goto L3e
            return
        L3e:
            kotlin.jvm.internal.o.d(r0)
            com.tencent.mm.autogen.events.MusicPlayerEvent r4 = new com.tencent.mm.autogen.events.MusicPlayerEvent
            r4.<init>()
            b21.r r5 = rk4.k5.g(r0)
            am.jk r6 = r4.f54512g
            r6.f7037c = r5
            r6.f7036b = r1
            r5 = 0
            r7 = 2
            if (r1 != r7) goto L5c
            boolean r1 = kl4.b.f308883b
            kl4.b.f308883b = r5
            r6.f7043i = r1
            r6.f7042h = r5
        L5c:
            boolean r1 = rk4.j5.h(r0)
            if (r1 == 0) goto L76
            bw5.v70 r1 = r0.d()
            bw5.nc0 r1 = r1.l()
            java.lang.String r1 = r1.getAppId()
            r6.f7044j = r1
            b21.r r1 = r6.f7037c
            r8 = 11
            r1.f17345d = r8
        L76:
            bw5.v70 r1 = r0.d()
            int r1 = r1.f34189e
            boolean r8 = il4.l.j(r1)
            r9 = 1
            if (r8 != 0) goto L8d
            if (r1 != r7) goto L87
            r1 = r9
            goto L88
        L87:
            r1 = r5
        L88:
            if (r1 == 0) goto L8b
            goto L8d
        L8b:
            r1 = r5
            goto L8e
        L8d:
            r1 = r9
        L8e:
            if (r1 != 0) goto L9c
            bw5.v70 r0 = r0.d()
            int r0 = r0.f34189e
            r1 = 4
            if (r0 != r1) goto L9a
            r5 = r9
        L9a:
            if (r5 == 0) goto L9e
        L9c:
            r6.f7035a = r9
        L9e:
            java.lang.String r0 = ""
            r6.f7040f = r0
            r6.f7039e = r2
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r4.b(r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tl4.k.run():void");
    }
}
