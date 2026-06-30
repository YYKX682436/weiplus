package ho1;

/* loaded from: classes15.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282784e;

    public q(ho1.v vVar, long j17) {
        this.f282783d = vVar;
        this.f282784e = j17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r2.f() != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            ho1.v r0 = r8.f282783d
            boolean r0 = r0.f282837i
            if (r0 != 0) goto L1e
            ho1.v r0 = r8.f282783d
            java.lang.String r0 = r0.f282829a
            java.lang.String r1 = "Not initiated, getRoamDiskInfoAsync return null"
            com.tencent.mars.xlog.Log.w(r0, r1)
            ho1.v r0 = r8.f282783d
            com.tencent.wechat.aff.affroam.t0 r0 = r0.f282836h
            if (r0 == 0) goto L1d
            long r1 = r8.f282784e
            com.tencent.wechat.aff.affroam.x r3 = com.tencent.wechat.aff.affroam.x.f216006i
            r4 = -1
            r0.V(r1, r4, r3)
        L1d:
            return
        L1e:
            oo1.j r0 = oo1.j.f347145a
            ro1.v r0 = ro1.v.f398014a
            java.util.List r0 = r0.b()
            ho1.v r1 = r8.f282783d
            boolean r2 = r0.isEmpty()
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L33
        L31:
            r0 = r5
            goto L5a
        L33:
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            po1.d r2 = (po1.d) r2
            java.lang.String r2 = r2.f357300f
            po1.d r6 = r1.f282832d
            if (r6 == 0) goto L53
            java.lang.String r6 = r6.f357300f
            boolean r2 = kotlin.jvm.internal.o.b(r2, r6)
            if (r2 == 0) goto L37
            r0 = r3
            goto L5a
        L53:
            java.lang.String r0 = "unifyDevice"
            kotlin.jvm.internal.o.o(r0)
            throw r4
        L5a:
            java.lang.String r1 = "mUDiskChannel"
            if (r0 == 0) goto L6f
            ho1.v r2 = r8.f282783d
            ro1.g r2 = r2.f282831c
            if (r2 == 0) goto L6b
            boolean r2 = r2.f()
            if (r2 == 0) goto L6f
            goto L70
        L6b:
            kotlin.jvm.internal.o.o(r1)
            throw r4
        L6f:
            r3 = r5
        L70:
            ho1.v r2 = r8.f282783d
            java.lang.String r2 = r2.f282829a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "getAllUsbStorageVolumeFromSystem, isOnline = "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", isRootExist="
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = r6.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            if (r3 != 0) goto L9e
            ho1.v r0 = r8.f282783d
            com.tencent.wechat.aff.affroam.t0 r0 = r0.f282836h
            if (r0 == 0) goto L9d
            long r1 = r8.f282784e
            com.tencent.wechat.aff.affroam.x r3 = com.tencent.wechat.aff.affroam.x.f216006i
            r4 = -2
            r0.V(r1, r4, r3)
        L9d:
            return
        L9e:
            ho1.v r0 = r8.f282783d
            ro1.g r0 = r0.f282831c
            if (r0 == 0) goto Ld4
            com.tencent.wechat.aff.affroam.x r0 = r0.j()
            ho1.v r1 = r8.f282783d
            java.lang.String r1 = r1.f282829a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getRoamDiskInfoAsync taskId="
            r2.<init>(r3)
            long r3 = r8.f282784e
            r2.append(r3)
            java.lang.String r3 = " Done, info(%s)"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r1, r2, r3)
            ho1.v r1 = r8.f282783d
            com.tencent.wechat.aff.affroam.t0 r1 = r1.f282836h
            if (r1 == 0) goto Ld3
            long r2 = r8.f282784e
            r1.V(r2, r5, r0)
        Ld3:
            return
        Ld4:
            kotlin.jvm.internal.o.o(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ho1.q.run():void");
    }
}
