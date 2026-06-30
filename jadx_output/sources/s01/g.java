package s01;

/* loaded from: classes11.dex */
public class g extends l75.n0 implements l75.z0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f401870f = {l75.n0.getCreateSQLs(s01.b.W, "BizChatConversation")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f401871d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.v0 f401872e;

    public g(l75.k0 k0Var) {
        super(k0Var, s01.b.W, "BizChatConversation", null);
        boolean z17;
        this.f401872e = new s01.d(this);
        this.f401871d = k0Var;
        ((ku5.t0) ku5.t0.f312615d).k(new s01.c(this, k0Var), 30000L);
        android.database.Cursor f17 = k0Var.f("PRAGMA table_info( BizChatConversation)", null, 2);
        while (true) {
            if (!f17.moveToNext()) {
                z17 = false;
                break;
            }
            int columnIndex = f17.getColumnIndex(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            if (columnIndex >= 0 && "flag".equalsIgnoreCase(f17.getString(columnIndex))) {
                z17 = true;
                break;
            }
        }
        f17.close();
        if (!z17) {
            k0Var.A("BizChatConversation", "update BizChatConversation set flag = lastMsgTime");
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
    }

    public static long W0(s01.b bVar, int i17, long j17) {
        if (bVar == null) {
            return 0L;
        }
        if (j17 == 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            j17 = java.lang.System.currentTimeMillis();
        }
        return i17 != 2 ? i17 != 3 ? i17 != 4 ? b1(bVar, j17) : b1(bVar, j17) & 4611686018427387904L : b1(bVar, j17) & (-4611686018427387905L) : b1(bVar, j17) | 4611686018427387904L;
    }

    public static long b1(s01.b bVar, long j17) {
        return (j17 & 72057594037927935L) | (bVar.field_flag & (-72057594037927936L));
    }

    public boolean D0(long j17) {
        s01.b J0 = J0(j17);
        boolean delete = super.delete(J0, "bizChatId");
        if (delete) {
            s01.e eVar = new s01.e();
            eVar.f401861a = J0.field_bizChatId;
            eVar.f401862b = J0;
            l75.v0 v0Var = this.f401872e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return delete;
    }

    public s01.b J0(long j17) {
        s01.b bVar = new s01.b();
        bVar.field_bizChatId = j17;
        super.get(bVar, new java.lang.String[0]);
        return bVar;
    }

    public android.database.Cursor L0(java.lang.String str) {
        return this.f401871d.B("select * from BizChatConversation where brandUserName = '" + str + "' order by flag desc , lastMsgTime desc", null);
    }

    public int P0(java.lang.String str) {
        android.database.Cursor f17 = this.f401871d.f("select count(*) from BizChatConversation where brandUserName = '" + str + "' ", null, 2);
        if (f17 != null) {
            r0 = f17.moveToFirst() ? f17.getInt(0) : 0;
            f17.close();
        }
        return r0;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public boolean insert(s01.b bVar) {
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizConversationStorage", "insert wrong argument");
            return false;
        }
        boolean insert = super.insert(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "BizChatConversationStorage insert res:%s", java.lang.Boolean.valueOf(insert));
        if (insert) {
            s01.e eVar = new s01.e();
            eVar.f401861a = bVar.field_bizChatId;
            eVar.f401862b = bVar;
            l75.v0 v0Var = this.f401872e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return insert;
    }

    public boolean f1(s01.b bVar) {
        if (bVar != null) {
            return W0(bVar, 4, 0L) != 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BizConversationStorage", "isPlacedTop failed, conversation null");
        return false;
    }

    public void finalize() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "onNotifyChange");
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        java.lang.String str = (java.lang.String) obj;
        if (!r01.z.g(str) || c01.e2.J(str)) {
            return;
        }
        s01.r.b(str, true, null);
    }

    public boolean i1(long j17) {
        J0(j17);
        s01.b J0 = J0(j17);
        boolean A = this.f401871d.A("BizChatConversation", "update BizChatConversation set flag = " + W0(J0, 2, J0.field_lastMsgTime) + " where bizChatId = " + J0.field_bizChatId);
        if (A) {
            s01.b J02 = J0(J0.field_bizChatId);
            s01.e eVar = new s01.e();
            eVar.f401861a = J02.field_bizChatId;
            eVar.f401862b = J02;
            l75.v0 v0Var = this.f401872e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return A;
    }

    public boolean k1(long j17) {
        s01.b J0 = J0(j17);
        boolean A = this.f401871d.A("BizChatConversation", "update BizChatConversation set flag = " + W0(J0, 3, J0.field_lastMsgTime) + " where bizChatId = " + J0.field_bizChatId);
        if (A) {
            s01.b J02 = J0(J0.field_bizChatId);
            s01.e eVar = new s01.e();
            eVar.f401861a = J02.field_bizChatId;
            eVar.f401862b = J02;
            l75.v0 v0Var = this.f401872e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return A;
    }

    public boolean n1(s01.b bVar) {
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizConversationStorage", "update wrong argument");
            return false;
        }
        boolean replace = super.replace(bVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "BizChatConversationStorage update res:%s", java.lang.Boolean.valueOf(replace));
        if (replace) {
            s01.r.r(r01.q3.Ui().z0(bVar.field_bizChatId));
            s01.e eVar = new s01.e();
            eVar.f401861a = bVar.field_bizChatId;
            eVar.f401862b = bVar;
            l75.v0 v0Var = this.f401872e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return replace;
    }

    public boolean o1(long j17) {
        s01.b J0 = J0(j17);
        if (J0.field_unReadCount == 0 && J0.field_bizChatId == j17) {
            return true;
        }
        J0.field_unReadCount = 0;
        J0.field_atCount = 0;
        J0.field_atAll = 0;
        n1(J0);
        return true;
    }

    public void y0(s01.b bVar, int i17, int i18) {
        int i19 = bVar.field_msgCount;
        if (i19 == 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.field_brandUserName)) {
                bVar.field_msgCount = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Bi(null).m(bVar.field_brandUserName, bVar.field_bizChatId);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "getMsgCount from message table");
        } else if (i17 > 0) {
            int i27 = i19 - i17;
            bVar.field_msgCount = i27;
            if (i27 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizConversationStorage", "msg < 0 ,some path must be ignore!");
                bVar.field_msgCount = 0;
            }
        } else if (i18 > 0) {
            bVar.field_msgCount = i19 + i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "countMsg %d talker :%s deleteCount:%d insertCount:%d", java.lang.Integer.valueOf(bVar.field_msgCount), java.lang.Long.valueOf(bVar.field_bizChatId), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public boolean z0(java.lang.String str) {
        java.lang.String str2 = "delete from BizChatConversation where brandUserName = '" + str + "' ";
        boolean A = this.f401871d.A("BizChatConversation", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "deleteByBrandUserName sql %s,%s", str2, java.lang.Boolean.valueOf(A));
        if (A) {
            s01.b bVar = new s01.b();
            s01.e eVar = new s01.e();
            eVar.f401861a = -1L;
            eVar.f401862b = bVar;
            l75.v0 v0Var = this.f401872e;
            v0Var.d(eVar);
            v0Var.c();
        }
        return A;
    }
}
