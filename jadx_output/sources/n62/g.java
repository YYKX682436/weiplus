package n62;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n62.k f335192a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n62.k kVar, android.os.Looper looper) {
        super(looper);
        this.f335192a = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[SYNTHETIC] */
    @Override // com.tencent.mm.sdk.platformtools.n3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            n62.k r8 = r7.f335192a
            java.lang.String r0 = "MicroMsg.SubCoreExt"
            java.util.LinkedList r1 = r8.f335204n     // Catch: java.lang.Exception -> L9c
            int r1 = r1.size()     // Catch: java.lang.Exception -> L9c
            if (r1 > 0) goto Ld
            return
        Ld:
            java.util.LinkedList r8 = r8.f335204n
            java.util.Iterator r1 = r8.iterator()     // Catch: java.lang.Exception -> L9c
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L9c
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L9c
            java.lang.String r3 = "*"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L9c
            if (r3 == 0) goto L28
            goto L13
        L28:
            java.lang.Class<lt.i0> r3 = lt.i0.class
            i95.m r3 = i95.n0.c(r3)     // Catch: java.lang.Exception -> L9c
            lt.i0 r3 = (lt.i0) r3     // Catch: java.lang.Exception -> L9c
            kt.c r3 = (kt.c) r3     // Catch: java.lang.Exception -> L9c
            r3.getClass()     // Catch: java.lang.Exception -> L9c
            r3 = 0
            com.tencent.mm.pluginsdk.model.app.m r2 = com.tencent.mm.pluginsdk.model.app.w.j(r2, r3, r3)     // Catch: java.lang.Exception -> L9c
            if (r2 != 0) goto L42
            java.lang.String r2 = "appInfo is null"
            com.tencent.mars.xlog.Log.w(r0, r2)     // Catch: java.lang.Exception -> L9c
            goto L13
        L42:
            java.lang.String r4 = r2.field_appId     // Catch: java.lang.Exception -> L9c
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)     // Catch: java.lang.Exception -> L9c
            if (r4 == 0) goto L50
            java.lang.String r2 = "appId is null"
            com.tencent.mars.xlog.Log.w(r0, r2)     // Catch: java.lang.Exception -> L9c
            goto L13
        L50:
            com.tencent.mm.storage.ba r4 = n62.k.Ri()     // Catch: java.lang.Exception -> L9c
            java.lang.String r5 = r2.field_appId     // Catch: java.lang.Exception -> L9c
            com.tencent.mm.storage.aa r4 = r4.y0(r5)     // Catch: java.lang.Exception -> L9c
            r5 = 1
            if (r4 != 0) goto L6a
            java.lang.String r4 = "openMsgListener is null, appId = %s"
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = r2.field_appId     // Catch: java.lang.Exception -> L9c
            r5[r3] = r2     // Catch: java.lang.Exception -> L9c
            com.tencent.mars.xlog.Log.w(r0, r4, r5)     // Catch: java.lang.Exception -> L9c
            goto L13
        L6a:
            java.lang.String r6 = r2.field_appId     // Catch: java.lang.Exception -> L9c
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)     // Catch: java.lang.Exception -> L9c
            if (r6 == 0) goto L73
            goto L7b
        L73:
            int r6 = r2.field_appInfoFlag     // Catch: java.lang.Exception -> L9c
            r6 = r6 & 64
            if (r6 <= 0) goto L7b
            r6 = r5
            goto L7c
        L7b:
            r6 = r3
        L7c:
            if (r6 == 0) goto L86
            int r3 = r4.field_status     // Catch: java.lang.Exception -> L9c
            if (r3 != r5) goto L83
            goto L13
        L83:
            r4.field_status = r5     // Catch: java.lang.Exception -> L9c
            goto L8d
        L86:
            int r5 = r4.field_status     // Catch: java.lang.Exception -> L9c
            if (r5 != 0) goto L8b
            goto L13
        L8b:
            r4.field_status = r3     // Catch: java.lang.Exception -> L9c
        L8d:
            com.tencent.mm.storage.ba r3 = n62.k.Ri()     // Catch: java.lang.Exception -> L9c
            java.lang.String r2 = r2.field_appId     // Catch: java.lang.Exception -> L9c
            r3.z0(r2, r4)     // Catch: java.lang.Exception -> L9c
            goto L13
        L98:
            r8.clear()     // Catch: java.lang.Exception -> L9c
            goto Laa
        L9c:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r1 = "exception in onAppInfoStgChange, %s"
            com.tencent.mars.xlog.Log.e(r0, r1, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n62.g.handleMessage(android.os.Message):void");
    }
}
