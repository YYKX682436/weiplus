package z53;

@j95.b
/* loaded from: classes8.dex */
public final class q extends i95.w implements u53.a0 {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0014 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ai(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L11
            boolean r0 = com.tencent.mm.storage.z3.a4(r3)
            if (r0 == 0) goto La
            r0 = 1
            goto L12
        La:
            java.lang.String r0 = "GameLife.PluginGameLife"
            java.lang.String r1 = "check sessionId failed"
            com.tencent.mars.xlog.Log.i(r0, r1)
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L15
            return
        L15:
            java.lang.Class<t53.m0> r0 = t53.m0.class
            i95.m r0 = i95.n0.c(r0)
            t53.m0 r0 = (t53.m0) r0
            z53.t r0 = r0.Ui()
            kotlin.jvm.internal.o.d(r3)
            r0.y0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z53.q.Ai(java.lang.String):void");
    }

    public boolean Bi(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        z53.t Ui = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
        z53.i z07 = Ui.z0(str);
        boolean deleteNotify = Ui.deleteNotify(z07.systemRowid, false);
        Ui.doNotify("single", 3, z07);
        return deleteNotify;
    }

    public z53.t Di() {
        return ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
    }

    public z53.j Ni() {
        java.lang.String str;
        z53.i D0 = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().D0();
        long j17 = D0 != null ? D0.field_lastMsgID : 0L;
        if (D0 != null) {
            java.lang.String str2 = D0.field_talker;
            str = str2 == null || str2.length() == 0 ? "@gamelifehistory" : D0.field_talker;
        } else {
            str = null;
        }
        z53.j jVar = new z53.j(str, j17, gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LAST_SAVED_EXTERN_INFO_STRING, ""), gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_LAST_SAVED_MSG_TYPE_INT, 0), D0 != null ? D0.field_updateTime : 0L);
        com.tencent.mars.xlog.Log.i("GameLife.ConversationService", "getLatestConversationInfo: " + jVar);
        return jVar;
    }

    public int Ri() {
        android.database.Cursor B = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().f470268d.B("SELECT SUM(unReadCount) FROM GameLifeConversation WHERE sessionId<>'@gamelifehistory'", null);
        try {
            int i17 = 0;
            if (B.moveToFirst() && !B.isAfterLast()) {
                i17 = B.getInt(0);
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("GameLife.ConversationStorage", "[getTotalUnreadCount] " + i17);
            return i17;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Ui(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "check sessionId failed"
            java.lang.String r2 = "GameLife.PluginGameLife"
            r3 = 0
            if (r7 == 0) goto L13
            boolean r4 = com.tencent.mm.storage.z3.a4(r7)
            if (r4 == 0) goto L10
            r4 = r0
            goto L14
        L10:
            com.tencent.mars.xlog.Log.i(r2, r1)
        L13:
            r4 = r3
        L14:
            if (r4 != 0) goto L17
            return r3
        L17:
            java.lang.Class<t53.m0> r4 = t53.m0.class
            i95.m r4 = i95.n0.c(r4)
            t53.m0 r4 = (t53.m0) r4
            z53.t r4 = r4.Ui()
            kotlin.jvm.internal.o.d(r7)
            boolean r5 = com.tencent.mm.storage.z3.a4(r7)
            if (r5 == 0) goto L2d
            goto L31
        L2d:
            com.tencent.mars.xlog.Log.i(r2, r1)
            r0 = r3
        L31:
            if (r0 != 0) goto L34
            goto L7c
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SELECT sessionId from GameLifeConversation WHERE sessionId='"
            r0.<init>(r1)
            r0.append(r7)
            r1 = 39
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            l75.k0 r1 = r4.f470268d
            r2 = 0
            android.database.Cursor r0 = r1.B(r0, r2)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L5e
            boolean r1 = r0.isAfterLast()     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L5e
            int r3 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L7d
        L5e:
            vz5.b.a(r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[getUnreadCount] "
            r0.<init>(r1)
            r0.append(r7)
            r7 = 32
            r0.append(r7)
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "GameLife.ConversationStorage"
            com.tencent.mars.xlog.Log.i(r0, r7)
        L7c:
            return r3
        L7d:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L7f
        L7f:
            r1 = move-exception
            vz5.b.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z53.q.Ui(java.lang.String):int");
    }

    public void Vi(l75.q0 storageChange) {
        kotlin.jvm.internal.o.g(storageChange, "storageChange");
        ((t53.m0) i95.n0.c(t53.m0.class)).Ui().remove(storageChange);
    }

    public void wi(l75.q0 storageChange) {
        kotlin.jvm.internal.o.g(storageChange, "storageChange");
        ((t53.m0) i95.n0.c(t53.m0.class)).Ui().add(storageChange);
    }
}
