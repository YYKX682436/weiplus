package kz3;

/* loaded from: classes5.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f313867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f313869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313870g;

    public b(long j17, java.lang.String str, yz5.p pVar, yz5.l lVar) {
        this.f313867d = j17;
        this.f313868e = str;
        this.f313869f = pVar;
        this.f313870g = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            jz5.g r0 = kz3.d.f313872a
            java.lang.String r0 = r10.f313868e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L11
            int r3 = r0.length()
            if (r3 != 0) goto Lf
            goto L11
        Lf:
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            long r4 = r10.f313867d
            java.lang.String r6 = "MicroMsg.BizImageOCRManager"
            if (r3 != 0) goto L63
            boolean r3 = com.tencent.mm.vfs.w6.j(r0)
            if (r3 == 0) goto L63
            java.lang.Class<ek0.e> r3 = ek0.e.class
            i95.m r3 = i95.n0.c(r3)
            ek0.e r3 = (ek0.e) r3
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r8 = ""
            if (r0 != 0) goto L2e
            r9 = r8
            goto L2f
        L2e:
            r9 = r0
        L2f:
            r7[r2] = r9
            java.util.ArrayList r7 = kz5.c0.d(r7)
            oy4.x r3 = (oy4.x) r3
            java.util.ArrayList r3 = r3.Di(r7)
            java.lang.Object r7 = kz5.n0.Z(r3)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L4c
            int r7 = r7.length()
            if (r7 != 0) goto L4a
            goto L4c
        L4a:
            r7 = r2
            goto L4d
        L4c:
            r7 = r1
        L4d:
            if (r7 != 0) goto L68
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = kz5.n0.Z(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L5c
            goto L5d
        L5c:
            r8 = r3
        L5d:
            yz5.p r3 = r10.f313869f
            r3.invoke(r2, r8)
            goto L69
        L63:
            java.lang.String r1 = "doLocalOCRInner imagePath invalid"
            com.tencent.mars.xlog.Log.e(r6, r1)
        L68:
            r1 = r2
        L69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "doLocalOCR request: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = ", imagePath: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", success: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.tencent.mars.xlog.Log.i(r6, r0)
            if (r1 != 0) goto L95
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            yz5.l r1 = r10.f313870g
            r1.invoke(r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kz3.b.run():void");
    }
}
