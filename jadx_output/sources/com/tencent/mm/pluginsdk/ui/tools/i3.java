package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f4 f191714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191716h;

    public i3(java.lang.String str, java.lang.String str2, com.tencent.mm.ui.widget.dialog.f4 f4Var, com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI, java.lang.String str3) {
        this.f191712d = str;
        this.f191713e = str2;
        this.f191714f = f4Var;
        this.f191715g = fileSelectorUI;
        this.f191716h = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00b5, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b8, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: Exception -> 0x0096, TryCatch #0 {Exception -> 0x0096, blocks: (B:13:0x0015, B:15:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0052, B:24:0x0060, B:25:0x0080), top: B:12:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: Exception -> 0x0096, TryCatch #0 {Exception -> 0x0096, blocks: (B:13:0x0015, B:15:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0052, B:24:0x0060, B:25:0x0080), top: B:12:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: Exception -> 0x0096, TRY_LEAVE, TryCatch #0 {Exception -> 0x0096, blocks: (B:13:0x0015, B:15:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0052, B:24:0x0060, B:25:0x0080), top: B:12:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "[LiveScreenShare] copied successfully: "
            java.lang.String r1 = "[LiveScreenShare] failed to copy Content URI, result: "
            java.lang.String r2 = "[LiveScreenShare] content URI detected, try copying to temp file: "
            r3 = 2
            r4 = 0
            java.lang.String r5 = r12.f191712d
            java.lang.String r6 = "content://"
            r7 = 0
            boolean r3 = r26.i0.A(r5, r6, r7, r3, r4)
            java.lang.String r4 = "MicroMsg.FileSelectorUI"
            if (r3 == 0) goto Lb1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r3.<init>(r2)     // Catch: java.lang.Exception -> L96
            r3.append(r5)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L96
            com.tencent.mars.xlog.Log.i(r4, r2)     // Catch: java.lang.Exception -> L96
            java.lang.String r2 = "finder_live_screen_share"
            com.tencent.mm.vfs.r7 r3 = com.tencent.mm.vfs.q7.f213141a     // Catch: java.lang.Exception -> L96
            com.tencent.mm.vfs.r6 r2 = lp0.b.h0(r2)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L96
            java.lang.String r6 = r12.f191713e     // Catch: java.lang.Exception -> L96
            r3.<init>(r2, r6)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.vfs.r6 r2 = r3.s()     // Catch: java.lang.Exception -> L96
            if (r2 == 0) goto L41
            boolean r2 = r2.m()     // Catch: java.lang.Exception -> L96
            r6 = 1
            if (r2 != r6) goto L41
            goto L42
        L41:
            r6 = r7
        L42:
            if (r6 != 0) goto L52
            java.lang.String r2 = "[LiveScreenShare] make parent directory"
            com.tencent.mars.xlog.Log.i(r4, r2)     // Catch: java.lang.Exception -> L96
            com.tencent.mm.vfs.r6 r2 = r3.s()     // Catch: java.lang.Exception -> L96
            if (r2 == 0) goto L52
            r2.J()     // Catch: java.lang.Exception -> L96
        L52:
            java.lang.String r2 = r3.o()     // Catch: java.lang.Exception -> L96
            long r8 = com.tencent.mm.vfs.w6.d(r5, r2, r7)     // Catch: java.lang.Exception -> L96
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r1.<init>(r0)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = r3.o()     // Catch: java.lang.Exception -> L96
            r1.append(r0)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = ", size: "
            r1.append(r0)     // Catch: java.lang.Exception -> L96
            r1.append(r8)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L96
            com.tencent.mars.xlog.Log.i(r4, r0)     // Catch: java.lang.Exception -> L96
            java.lang.String r5 = r3.o()     // Catch: java.lang.Exception -> L96
            goto Lb9
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L96
            r0.<init>(r1)     // Catch: java.lang.Exception -> L96
            r0.append(r8)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L96
            com.tencent.mars.xlog.Log.e(r4, r0)     // Catch: java.lang.Exception -> L96
            java.lang.String r0 = com.tencent.mm.vfs.w6.i(r5, r7)     // Catch: java.lang.Exception -> L96
            if (r0 != 0) goto Lb8
            goto Lb9
        L96:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[LiveScreenShare] exception while copying content URI, fallback to path: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r0, r1, r2)
            java.lang.String r0 = com.tencent.mm.vfs.w6.i(r5, r7)
            if (r0 != 0) goto Lb8
            goto Lb9
        Lb1:
            java.lang.String r0 = com.tencent.mm.vfs.w6.i(r5, r7)
            if (r0 != 0) goto Lb8
            goto Lb9
        Lb8:
            r5 = r0
        Lb9:
            kotlin.jvm.internal.o.d(r5)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r0 == 0) goto Lc7
            java.lang.String r0 = "goToScreenProfile, exportExternalPath is null"
            com.tencent.mars.xlog.Log.e(r4, r0)
        Lc7:
            com.tencent.mm.pluginsdk.ui.tools.h3 r0 = new com.tencent.mm.pluginsdk.ui.tools.h3
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r1 = r12.f191715g
            java.lang.String r2 = r12.f191716h
            com.tencent.mm.ui.widget.dialog.f4 r3 = r12.f191714f
            r0.<init>(r3, r1, r5, r2)
            pm0.v.X(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.ui.tools.i3.run():void");
    }
}
