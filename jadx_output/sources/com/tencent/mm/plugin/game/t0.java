package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m33.c1 f140640d;

    public t0(com.tencent.mm.plugin.game.p0 p0Var, m33.c1 c1Var) {
        this.f140640d = c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            m53.l1 r0 = com.tencent.mm.plugin.game.commlib.i.i()
            m33.c1 r1 = r10.f140640d
            if (r0 == 0) goto Lae
            m53.h3 r0 = r0.f323860e
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.f323750d
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L16
            goto Lae
        L16:
            java.lang.Class<m33.s1> r0 = m33.s1.class
            i95.m r0 = i95.n0.c(r0)
            m33.s1 r0 = (m33.s1) r0
            com.tencent.mm.plugin.game.s1 r0 = (com.tencent.mm.plugin.game.s1) r0
            com.tencent.mm.plugin.game.model.o1 r0 = r0.Di()
            r0.getClass()
            java.lang.String r2 = "MicroMsg.GameMessageStorage"
            m33.d1 r3 = new m33.d1
            r3.<init>()
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L98
            java.lang.String r6 = "select count(*) from GameRawMessage where rawXML like \"%<chatmsg%\" and isRead=0"
            r7 = 0
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L98
            android.database.Cursor r6 = r0.rawQuery(r6, r8)     // Catch: java.lang.Exception -> L98
            r8 = 1
            if (r6 == 0) goto L69
            boolean r9 = r6.moveToFirst()     // Catch: java.lang.Exception -> L98
            if (r9 == 0) goto L4e
            int r9 = r6.getInt(r7)     // Catch: java.lang.Exception -> L98
            if (r9 <= 0) goto L4e
            r3.f323280a = r8     // Catch: java.lang.Exception -> L98
            r3.f323281b = r9     // Catch: java.lang.Exception -> L98
        L4e:
            r6.close()     // Catch: java.lang.Exception -> L98
            boolean r6 = r3.f323280a     // Catch: java.lang.Exception -> L98
            if (r6 == 0) goto L69
            java.lang.String r0 = "unread logic costtime:%d"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L98
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L98
            long r8 = r8 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L98
            r6[r7] = r4     // Catch: java.lang.Exception -> L98
            com.tencent.mars.xlog.Log.i(r2, r0, r6)     // Catch: java.lang.Exception -> L98
            goto La6
        L69:
            java.lang.String r6 = "select count(*) from GameRawMessage where rawXML like \"%<chatmsg%\""
            java.lang.String[] r9 = new java.lang.String[r7]     // Catch: java.lang.Exception -> L98
            android.database.Cursor r0 = r0.rawQuery(r6, r9)     // Catch: java.lang.Exception -> L98
            if (r0 != 0) goto L74
            goto La6
        L74:
            boolean r6 = r0.moveToFirst()     // Catch: java.lang.Exception -> L98
            if (r6 == 0) goto L82
            int r6 = r0.getInt(r7)     // Catch: java.lang.Exception -> L98
            if (r6 <= 0) goto L82
            r3.f323280a = r8     // Catch: java.lang.Exception -> L98
        L82:
            r0.close()     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = "loop logic costtime:%d"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L98
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L98
            long r8 = r8 - r4
            java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Exception -> L98
            r6[r7] = r4     // Catch: java.lang.Exception -> L98
            com.tencent.mars.xlog.Log.i(r2, r0, r6)     // Catch: java.lang.Exception -> L98
            goto La6
        L98:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r4 = "errMsg:%s"
            com.tencent.mars.xlog.Log.i(r2, r4, r0)
        La6:
            if (r1 == 0) goto Lad
            g63.u r1 = (g63.u) r1
            r1.a(r3)
        Lad:
            return
        Lae:
            if (r1 == 0) goto Lb6
            r0 = 0
            g63.u r1 = (g63.u) r1
            r1.a(r0)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.t0.run():void");
    }
}
