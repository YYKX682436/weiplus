package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class v extends com.tencent.mm.storage.f {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f196268c = {"CREATE TABLE IF NOT EXISTS bizchatmessage ( msgId INTEGER PRIMARY KEY, msgSvrId INTEGER , type INT, status INT, isSend INT, isShowTimer INTEGER, createTime INTEGER, talker TEXT, content TEXT, imgPath TEXT, reserved TEXT, lvbuffer BLOB, transContent TEXT, transBrandWording TEXT, bizChatId INTEGER DEFAULT -1, bizChatUserId TEXT, talkerId INTEGER, bizClientMsgId TEXT ) ", "CREATE INDEX IF NOT EXISTS  bizmessageChatIdIndex ON bizchatmessage ( bizChatId )", "CREATE INDEX IF NOT EXISTS  bizmessageSvrIdIndex ON bizchatmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizmessageTalkerIndex ON bizchatmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizmessageTalerStatusIndex ON bizchatmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTimeIndex ON bizchatmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageCreateTaklerTimeIndex ON bizchatmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageBizChatIdTypeCreateTimeIndex ON bizchatmessage ( bizChatId,type,createTime )", "CREATE INDEX IF NOT EXISTS  bizmessageSendCreateTimeIndex ON bizchatmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerTypeIndex ON bizchatmessage ( talker,type )", "CREATE INDEX IF NOT EXISTS  bizchatmessageTalkerClientMsgIdIndex ON bizchatmessage ( talker,bizClientMsgId )"};

    public v(xg3.m0 m0Var) {
        super(m0Var);
        g(d(), "bizchatmessage");
        a(new xg3.k0(16, "bizchatmessage", xg3.k0.a(2500001L, 3000000L, 99000001L, 102000000L, -1L, -1L)));
    }

    @Override // com.tencent.mm.storage.f
    public boolean b(com.tencent.mm.storage.f9 f9Var, c01.ea eaVar) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:message == null");
            return false;
        }
        f9Var.Y0(-1L);
        if (eaVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(eaVar.f37154m)) {
            s01.h hVar = new s01.h();
            hVar.field_bizChatServId = eaVar.f37154m;
            hVar.field_brandUserName = f9Var.Q0();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(eaVar.f37155n)) {
                hVar.field_chatVersion = com.tencent.mm.sdk.platformtools.t8.P(eaVar.f37155n, -1);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(eaVar.f37153l)) {
                hVar.field_chatType = com.tencent.mm.sdk.platformtools.t8.P(eaVar.f37153l, com.tencent.mm.sdk.platformtools.t8.P(eaVar.f37152k, -1));
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(eaVar.f37152k)) {
                hVar.field_chatType = com.tencent.mm.sdk.platformtools.t8.P(eaVar.f37152k, -1);
            }
            s01.h m17 = s01.r.m(hVar);
            if (m17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMessageStorage", "dealMsgSourceValue:bizChatInfo == null!");
                return false;
            }
            f9Var.Y0(m17.field_bizChatLocalId);
            java.lang.String str = eaVar.f37156o;
            if (str == null) {
                str = "";
            }
            f9Var.Z0(str);
            if (eaVar.f37158q.equals("1")) {
                f9Var.j1(1);
            }
            f9Var.a1(eaVar.f37146e);
            if (f9Var.A0() != 1 && eaVar.f37156o != null) {
                if (eaVar.f37156o.equals(r01.q3.Vi().z0(f9Var.Q0()))) {
                    f9Var.j1(1);
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(eaVar.f37156o)) {
                s01.a0 a0Var = new s01.a0();
                a0Var.field_userId = eaVar.f37156o;
                a0Var.field_userName = eaVar.f37157p;
                a0Var.field_brandUserName = f9Var.Q0();
                s01.d0 Vi = r01.q3.Vi();
                Vi.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.BizChatUserInfoStorage", "updateUserName");
                s01.a0 y07 = Vi.y0(a0Var.field_userId);
                if (y07 == null) {
                    Vi.insert(a0Var);
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(a0Var.field_userName) && !a0Var.field_userName.equals(y07.field_userName)) {
                    y07.field_userName = a0Var.field_userName;
                    Vi.J0(y07);
                }
            }
        }
        return true;
    }

    @Override // com.tencent.mm.storage.f
    public void c(com.tencent.mm.storage.f9 f9Var) {
        c01.ea w17;
        if (f9Var == null) {
            return;
        }
        java.lang.String Q0 = f9Var.Q0();
        if (android.text.TextUtils.isEmpty(Q0)) {
            return;
        }
        java.lang.String str = f9Var.G;
        if (!android.text.TextUtils.isEmpty(str) && r01.z.g(Q0) && (w17 = c01.w9.w(str)) != null && android.text.TextUtils.equals(w17.f37158q, "1")) {
            f9Var.j1(1);
        }
    }

    @Override // com.tencent.mm.storage.f
    public java.lang.String f(java.lang.String str) {
        iz5.a.g(null, str != null && str.length() > 0);
        if (r01.z.g(str)) {
            return "bizchatmessage";
        }
        return null;
    }

    public int h(java.lang.String str, long j17) {
        if (str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizChatMessageStorage", "getBizMsgCountFromMsgTable talker:%s,bizChatId:%s", str, java.lang.Long.valueOf(j17));
            return -1;
        }
        int i17 = r01.q3.aj().J0(j17).field_msgCount;
        if (i17 != 0) {
            return i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizChatMessageStorage", "geBiztMsgCount contactMsgCount is 0 ,go normal %s", str);
        return m(str, j17);
    }

    public final java.lang.String i(java.lang.String str) {
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str);
        if (m07 <= 0) {
            return "";
        }
        return " createTime > " + m07 + " AND ";
    }

    public android.database.Cursor j(java.lang.String str, long j17) {
        java.lang.System.currentTimeMillis();
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizChatMessageStorage", "getImgMessage fail, argument is invalid");
            return null;
        }
        java.lang.String e17 = e(str);
        this.f193895a.getClass();
        android.database.Cursor B = d().B("select * from " + e17 + "  INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  where" + l(str, j17) + "AND type IN (3,39,13,43,62,44,49,268435505)  order by createTime", null);
        java.lang.System.currentTimeMillis();
        return B;
    }

    public int k(java.lang.String str, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
        xg3.m0 m0Var = this.f193895a;
        sb6.append(((com.tencent.mm.storage.g9) m0Var).X8(str));
        sb6.append(" WHERE ");
        sb6.append(i(str));
        sb6.append(l(str, j17));
        sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313)");
        m0Var.getClass();
        android.database.Cursor B = d().B(sb6.toString(), null);
        int i17 = B.moveToLast() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public java.lang.String l(java.lang.String str, long j17) {
        return " bizChatId= " + j17 + " AND talker= '" + str + "'";
    }

    public int m(java.lang.String str, long j17) {
        android.database.Cursor B = d().B("SELECT COUNT(*) FROM " + e(str) + " WHERE " + l(str, j17), null);
        int i17 = B.moveToLast() ? B.getInt(0) : 0;
        B.close();
        return i17;
    }

    public com.tencent.mm.storage.f9 n(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        android.database.Cursor B = d().B("select * from " + e(str) + " where" + l(str, j17) + "order by createTime DESC limit 1", null);
        if (B.getCount() != 0) {
            B.moveToFirst();
            f9Var.convertFrom(B);
        }
        B.close();
        return f9Var;
    }
}
