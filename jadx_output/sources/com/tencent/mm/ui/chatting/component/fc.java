package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class fc extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f199040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gc f199041f;

    public fc(com.tencent.mm.ui.chatting.component.gc gcVar, java.lang.String str, com.tencent.mm.ui.chatting.component.cc ccVar) {
        this.f199041f = gcVar;
        this.f199040e = str;
    }

    public final void e(xg3.m0 m0Var, long j17, long j18) {
        final long a17 = c01.id.a() - 259200000;
        java.lang.String d17 = k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, a17 / 1000);
        final java.lang.String str = this.f199040e;
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) m0Var;
        g9Var.getClass();
        final com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        final java.lang.String X8 = g9Var.X8(str);
        if (g9Var.Da(X8)) {
            final int i17 = 1;
            final int i18 = 1;
            f9Var = ot0.c3.l().g("getUpIncReceivedMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$q4
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.l1(com.tencent.mm.storage.g9.this.f193989r, X8, str, a17, i18);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$r4
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                    g9Var2.getClass();
                    android.database.Cursor B = g9Var2.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND createTime < " + a17 + " AND isSend = 0 ORDER BY createTime DESC  LIMIT " + i17, null);
                    com.tencent.mm.storage.f9 f9Var2 = f9Var;
                    if (B == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
                    } else if (B.moveToLast()) {
                        f9Var2.convertFrom(B);
                        B.close();
                    } else {
                        B.close();
                        com.tencent.mars.xlog.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
                    }
                    return f9Var2;
                }
            });
        } else if (g9Var.Pb(X8)) {
            f9Var = ot0.z2.f348822a.l1(g9Var.f193989r, X8, str, a17, 1);
        } else {
            android.database.Cursor B = g9Var.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime < " + a17 + " AND isSend = 0 ORDER BY createTime DESC  LIMIT 1", null);
            if (B == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgInfoStorage", "get inc msg create time error, cursor is null");
            } else if (B.moveToLast()) {
                f9Var.convertFrom(B);
                B.close();
            } else {
                B.close();
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgInfoStorage", "get result fail");
            }
        }
        com.tencent.mm.storage.f9 f9Var2 = f9Var;
        long j19 = 0;
        java.lang.String str2 = this.f199040e;
        if (f9Var2 == null || f9Var2.getMsgId() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] getUpIncReceivedMsg is null!");
            long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str2);
            com.tencent.mm.storage.x4 x4Var = (com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
            if (str2 == null) {
                x4Var.getClass();
            } else {
                j19 = x4Var.s0("SELECT max(lastSeq) FROM DeletedConversationInfo WHERE userName=? OR userName=''", new java.lang.String[]{str2});
            }
            f9Var2.e1(m07);
            f9Var2.n1(j19);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[handleFoundGetChatroom] talker:%s seq:[%s:%s] time:[%s:%s] fromTimeFormat:%s recMsgTimeFormat:%s", this.f199040e, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f9Var2.F0()), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(f9Var2.getCreateTime()), d17, k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, f9Var2.getCreateTime() / 1000));
        com.tencent.mm.autogen.events.GetChatRoomWrapEvent getChatRoomWrapEvent = new com.tencent.mm.autogen.events.GetChatRoomWrapEvent();
        am.mf mfVar = getChatRoomWrapEvent.f54385g;
        mfVar.f7342a = str2;
        mfVar.f7345d = f9Var2.F0();
        mfVar.f7346e = f9Var2.getCreateTime();
        mfVar.f7343b = j17;
        mfVar.f7344c = j18;
        getChatRoomWrapEvent.e();
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "CheckGetChatroomTask";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[Catch: all -> 0x013d, TryCatch #0 {all -> 0x013d, blocks: (B:3:0x000e, B:7:0x0035, B:9:0x0048, B:13:0x0067, B:15:0x00ad, B:20:0x00b9, B:22:0x00cd, B:24:0x00d5, B:25:0x00e2, B:28:0x00dc, B:29:0x00ed, B:31:0x010e, B:34:0x011a), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #0 {all -> 0x013d, blocks: (B:3:0x000e, B:7:0x0035, B:9:0x0048, B:13:0x0067, B:15:0x00ad, B:20:0x00b9, B:22:0x00cd, B:24:0x00d5, B:25:0x00e2, B:28:0x00dc, B:29:0x00ed, B:31:0x010e, B:34:0x011a), top: B:2:0x000e }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.fc.run():void");
    }
}
