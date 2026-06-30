package qe5;

/* loaded from: classes9.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f362153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f362154e;

    public n0(com.tencent.mm.pluginsdk.model.app.d dVar, com.tencent.mm.pluginsdk.model.app.d dVar2) {
        this.f362153d = dVar;
        this.f362154e = dVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r15 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.pluginsdk.model.app.d r2 = r15.f362153d
            java.lang.String r3 = r2.field_fileFullPath
            com.tencent.mm.pluginsdk.model.app.d r4 = r15.f362154e
            java.lang.String r5 = r4.field_fileFullPath
            r6 = 0
            long r7 = com.tencent.mm.vfs.w6.d(r3, r5, r6)
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L46
            r4.field_offset = r7
            if (r4 != 0) goto L1c
            goto L35
        L1c:
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6
            java.lang.String r5 = r4.field_fileFullPath
            r3.<init>(r5)
            boolean r5 = r3.m()
            if (r5 == 0) goto L35
            long r9 = r3.C()
            long r11 = r4.field_totalLen
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L35
            r3 = 1
            goto L36
        L35:
            r3 = r6
        L36:
            if (r3 == 0) goto L3c
            r9 = 199(0xc7, double:9.83E-322)
            r4.field_status = r9
        L3c:
            com.tencent.mm.pluginsdk.model.app.e r3 = com.tencent.mm.pluginsdk.model.app.u5.wi()
            java.lang.String[] r5 = new java.lang.String[r6]
            boolean r6 = r3.update(r4, r5)
        L46:
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            long r2 = r2.field_msgInfoId
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            long r2 = r4.field_msgInfoId
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            long r2 = r4.field_status
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r9, r10, r11, r12, r13, r14}
            java.lang.String r1 = "MicroMsg.AppAttachDownLoadUtil"
            java.lang.String r2 = "summerapp copyAttachFromLocal size[%d], id[%d, %d], ret[%b], new status[%d], take[%d]ms"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.n0.run():void");
    }
}
