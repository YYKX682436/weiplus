package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public class d3 extends l75.a1 implements xg3.w {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f193833e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.c3.f193810x, "ChatroomMsgSeq")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f193834f = {"CREATE INDEX IF NOT EXISTS  ChatroomMsgSeqTalkerIndex ON ChatroomMsgSeq ( username )"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f193835d;

    public d3(l75.k0 k0Var) {
        this.f193835d = k0Var;
        k0Var.A("ChatroomMsgSeq", f193834f[0]);
    }

    @Override // l75.a1
    public boolean f() {
        return true;
    }

    public long g(java.lang.String str) {
        return this.f193835d.delete("ChatroomMsgSeq", "username = ?", new java.lang.String[]{str});
    }

    public boolean h() {
        long delete = this.f193835d.delete("ChatroomMsgSeq", "", null);
        com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomMsgSeqStorage", "[deleteTable] result:" + delete + " table:ChatroomMsgSeq");
        return delete >= 0;
    }

    public com.tencent.mm.storage.c3 i(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMsgSeqStorage", "[getChatroomMsgSeq] username:%s", str);
        com.tencent.mm.storage.c3 c3Var = new com.tencent.mm.storage.c3();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select * from ChatroomMsgSeq where username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        android.database.Cursor f17 = this.f193835d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            return c3Var;
        }
        if (f17.moveToFirst()) {
            c3Var.convertFrom(f17);
        }
        f17.close();
        return c3Var;
    }

    public long j(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1L;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select lastLocalCreateTime from ChatroomMsgSeq where username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        android.database.Cursor f17 = this.f193835d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMsgSeqStorage", "getLastLocalSeq failed " + str);
            return -2L;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return -3L;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17;
    }

    public long k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return -1L;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select lastLocalSeq from ChatroomMsgSeq where username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        android.database.Cursor f17 = this.f193835d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMsgSeqStorage", "getLastLocalSeq failed " + str);
            return -2L;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return -3L;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17;
    }

    public mo.d l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMsgSeqStorage", "getSeqBlockInfo failed username is null!");
            return new mo.d();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select seqBlockInfo from ChatroomMsgSeq where username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        android.database.Cursor f17 = this.f193835d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMsgSeqStorage", "getSeqBlockInfo failed " + str);
            return new mo.d();
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return new mo.d();
        }
        byte[] blob = f17.getBlob(0);
        if (com.tencent.mm.sdk.platformtools.t8.M0(blob)) {
            f17.close();
            return new mo.d();
        }
        mo.d dVar = new mo.d();
        try {
            dVar.parseFrom(blob);
        } catch (java.lang.Exception unused) {
        }
        f17.close();
        return dVar;
    }

    public long m(com.tencent.mm.storage.c3 c3Var, boolean z17) {
        if (c3Var == null) {
            return -1L;
        }
        long l17 = this.f193835d.l("ChatroomMsgSeq", dm.i4.COL_USERNAME, c3Var.convertTo());
        if (l17 >= 0) {
            xg3.v vVar = new xg3.v();
            vVar.f454434a = 4;
            vVar.f454435b = c3Var.field_username;
            vVar.f454436c = z17;
            b(4, this, vVar);
        }
        return l17;
    }

    public boolean n(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(*) from ChatroomMsgSeq where username = \"");
        java.lang.String str2 = "" + str;
        com.tencent.mm.sdk.platformtools.t8.n(str2);
        sb6.append(str2);
        sb6.append("\"");
        android.database.Cursor f17 = this.f193835d.f(sb6.toString(), null, 2);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomMsgSeqStorage", "getLastPushSeq failed " + str);
            return false;
        }
        if (!f17.moveToFirst()) {
            f17.close();
            return false;
        }
        long j17 = f17.getLong(0);
        f17.close();
        return j17 > 0;
    }

    public long o(com.tencent.mm.storage.c3 c3Var) {
        if (c3Var == null) {
            return -1L;
        }
        return this.f193835d.p("ChatroomMsgSeq", c3Var.convertTo(), "username = ?", new java.lang.String[]{c3Var.field_username});
    }

    public boolean p(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update ChatroomMsgSeq set lastPushCreateTime =  ");
        sb6.append(j17);
        sb6.append(" where username = \"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        return this.f193835d.A("ChatroomMsgSeq", sb6.toString());
    }

    public boolean q(java.lang.String str, long j17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update ChatroomMsgSeq set lastPushSeq =  ");
        sb6.append(j17);
        sb6.append(" where username = \"");
        com.tencent.mm.sdk.platformtools.t8.n(str);
        sb6.append(str);
        sb6.append("\"");
        boolean A = this.f193835d.A("ChatroomMsgSeq", sb6.toString());
        if (A) {
            xg3.v vVar = new xg3.v();
            vVar.f454434a = 4;
            vVar.f454435b = str;
            b(2, this, vVar);
        }
        return A;
    }
}
