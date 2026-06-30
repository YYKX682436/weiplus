package um5;

/* loaded from: classes10.dex */
public final class i0 extends um5.w {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f429167t = "MultiInputEffectRenderController@" + hashCode();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f429168u = new java.util.concurrent.ConcurrentLinkedDeque();

    /* JADX WARN: Can't wrap try/catch for region: R(12:19|20|(10:22|(2:24|(2:26|(1:28))(1:42))(1:43)|29|(1:31)(1:41)|32|33|34|(1:36)|37|38)|44|29|(0)(0)|32|33|34|(0)|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        xm5.b.b(r11, "update surfaceTexture error key:" + r13, new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #0 {Exception -> 0x0096, blocks: (B:34:0x008e, B:36:0x0092), top: B:33:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    @Override // um5.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(long r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um5.i0.a(long):java.util.List");
    }

    @Override // um5.w
    public void b() {
        f(new um5.c0(this));
        super.b();
    }

    @Override // um5.w
    public java.lang.String c() {
        return this.f429167t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r0.isAlive() == true) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = r4.f429167t
            java.lang.String r1 = "removeInputTexture:"
            java.lang.String r1 = r1.concat(r5)
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            xm5.b.c(r0, r1, r3)
            java.util.concurrent.ConcurrentLinkedDeque r0 = r4.f429168u
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            r3 = r1
            um5.z r3 = (um5.z) r3
            java.lang.String r3 = r3.f429228a
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            if (r3 == 0) goto L19
            goto L30
        L2f:
            r1 = 0
        L30:
            um5.z r1 = (um5.z) r1
            if (r1 != 0) goto L35
            return
        L35:
            um5.h0 r5 = new um5.h0
            r5.<init>(r1)
            android.os.Handler r0 = r4.f429203l
            if (r0 == 0) goto L62
            android.os.HandlerThread r0 = r4.f429204m
            if (r0 == 0) goto L4a
            boolean r0 = r0.isAlive()
            r3 = 1
            if (r0 != r3) goto L4a
            goto L4b
        L4a:
            r3 = r2
        L4b:
            if (r3 == 0) goto L62
            boolean r0 = r4.f429202k
            if (r0 != 0) goto L62
            boolean r0 = r4.f429201j
            if (r0 == 0) goto L62
            android.os.Handler r0 = r4.f429203l
            if (r0 == 0) goto L6b
            um5.u r2 = new um5.u
            r2.<init>(r5)
            r0.postAtFrontOfQueue(r2)
            goto L6b
        L62:
            java.util.ArrayList r0 = r4.f429205n
            monitor-enter(r0)
            java.util.ArrayList r3 = r4.f429205n     // Catch: java.lang.Throwable -> L71
            r3.add(r2, r5)     // Catch: java.lang.Throwable -> L71
            monitor-exit(r0)
        L6b:
            java.util.concurrent.ConcurrentLinkedDeque r5 = r4.f429168u
            r5.remove(r1)
            return
        L71:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: um5.i0.k(java.lang.String):void");
    }
}
