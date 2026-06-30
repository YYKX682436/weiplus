package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.l f188953a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.pluginsdk.model.app.l lVar, android.os.Looper looper) {
        super(looper);
        this.f188953a = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    @Override // com.tencent.mm.sdk.platformtools.n3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            java.lang.Object r8 = r8.obj
            com.tencent.mm.pluginsdk.model.app.n3 r8 = (com.tencent.mm.pluginsdk.model.app.n3) r8
            com.tencent.mm.pluginsdk.model.app.f3 r0 = new com.tencent.mm.pluginsdk.model.app.f3
            java.lang.String r1 = r8.f188994a
            int r2 = r8.f188995b
            r0.<init>(r1, r2)
            com.tencent.mm.pluginsdk.model.app.l r1 = r7.f188953a
            java.util.List r3 = r1.f188974b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto La1
            java.util.List r3 = r1.f188974b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.remove(r0)
            com.tencent.mm.pluginsdk.model.app.z r0 = zo3.p.Ri()
            r0.getClass()
            java.lang.String r3 = r8.f188994a
            java.lang.String r5 = "MicroMsg.AppInfoStorage"
            if (r3 == 0) goto L91
            int r6 = r3.length()
            if (r6 == 0) goto L91
            byte[] r8 = r8.f188996c
            if (r8 == 0) goto L91
            int r6 = r8.length
            if (r6 != 0) goto L3c
            goto L91
        L3c:
            java.lang.String r2 = r0.D0(r3, r2)
            if (r2 != 0) goto L49
            java.lang.String r8 = "saveIcon fail, iconPath is null"
            com.tencent.mars.xlog.Log.e(r5, r8)
            goto L97
        L49:
            com.tencent.mm.vfs.r6 r6 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r2 = com.tencent.mm.vfs.z7.a(r2)
            r6.<init>(r2)
            boolean r2 = r6.m()
            if (r2 == 0) goto L5b
            r6.l()
        L5b:
            java.io.OutputStream r2 = com.tencent.mm.vfs.w6.H(r6)     // Catch: java.lang.Exception -> L6c
            r2.write(r8)     // Catch: java.lang.Exception -> L6a
            r2.close()     // Catch: java.lang.Exception -> L6a
            r0.doNotify(r3)     // Catch: java.lang.Exception -> L6a
            r8 = 1
            goto L98
        L6a:
            r8 = move-exception
            goto L6e
        L6c:
            r8 = move-exception
            r2 = 0
        L6e:
            java.lang.String r0 = ""
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r5, r8, r0, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "saveIcon, exception, e = "
            r0.<init>(r3)
            java.lang.String r8 = r8.getMessage()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.mars.xlog.Log.e(r5, r8)
            if (r2 == 0) goto L97
            r2.close()     // Catch: java.io.IOException -> L97
            goto L97
        L91:
            java.lang.String r8 = "saveIcon, invalid argument"
            com.tencent.mars.xlog.Log.e(r5, r8)
        L97:
            r8 = r4
        L98:
            if (r8 != 0) goto La1
            java.lang.String r8 = "MicroMsg.AppIconService"
            java.lang.String r0 = "handleMessage, saveIcon fail"
            com.tencent.mars.xlog.Log.e(r8, r0)
        La1:
            java.util.List r8 = r1.f188975c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r8 <= 0) goto Lc2
            java.util.List r8 = r1.f188975c
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.remove(r4)
            com.tencent.mm.pluginsdk.model.app.f3 r8 = (com.tencent.mm.pluginsdk.model.app.f3) r8
            boolean r0 = r1.b(r8)
            if (r0 == 0) goto La1
            java.util.List r0 = r1.f188974b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r8)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.pluginsdk.model.app.k.handleMessage(android.os.Message):void");
    }
}
