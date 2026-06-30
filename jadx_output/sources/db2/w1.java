package db2;

/* loaded from: classes2.dex */
public final class w1 extends az2.j {

    /* renamed from: w, reason: collision with root package name */
    public static long f228209w;

    /* renamed from: t, reason: collision with root package name */
    public final nv2.w1 f228210t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228211u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.qd1 f228212v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(nv2.w1 action, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        int i17;
        r45.kv0 kv0Var;
        java.util.LinkedList<r45.fl2> list;
        kotlin.jvm.internal.o.g(action, "action");
        this.f228210t = action;
        this.f228211u = "Finder.CgiFinderLikeComment";
        long c17 = c01.id.c();
        long j17 = f228209w;
        if (c17 < j17) {
            f228209w = 1 + j17;
            c17 = j17;
        }
        f228209w = c17;
        r45.qd1 qd1Var = new r45.qd1();
        this.f228212v = qd1Var;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long j18 = action.f340612d;
        qd1Var.set(1, java.lang.Long.valueOf(j18));
        qd1Var.set(8, action.f340614f);
        qd1Var.set(2, java.lang.Long.valueOf(action.f340615g.u0().getCommentId()));
        qd1Var.set(4, java.lang.Long.valueOf(c17));
        int i18 = action.f340617i;
        if (i18 == 1) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j18);
            qd1Var.set(6, hc2.o0.H(h17 != null ? h17.getFeedObject() : null) ? h17 != null ? h17.field_username : null : xy2.c.f(qt2Var));
        }
        db2.t4 t4Var = db2.t4.f228171a;
        qd1Var.set(9, t4Var.b(3710, qt2Var));
        qd1Var.set(7, java.lang.Integer.valueOf(i18));
        switch (action.f340616h.ordinal()) {
            case 0:
                i17 = 1;
                break;
            case 1:
                i17 = 2;
                break;
            case 2:
                i17 = 7;
                break;
            case 3:
                i17 = 9;
                break;
            case 4:
                i17 = 10;
                break;
            case 5:
                i17 = 11;
                break;
            case 6:
                i17 = 12;
                break;
            case 7:
                i17 = 13;
                break;
            default:
                throw new jz5.j();
        }
        qd1Var.set(3, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        r45.kv0 kv0Var2 = (r45.kv0) qd1Var.getCustom(9);
        int integer = kv0Var2 != null ? kv0Var2.getInteger(1) : 0;
        java.lang.String str = action.f340613e;
        qd1Var.set(10, o3Var.ek(j18, str, integer));
        r45.kv0 kv0Var3 = (r45.kv0) qd1Var.getCustom(9);
        r45.kv0 kv0Var4 = (r45.kv0) qd1Var.getCustom(9);
        t4Var.h(kv0Var3, qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var4 != null ? kv0Var4.getInteger(1) : 0), java.lang.Long.valueOf(j18), str)));
        java.lang.String str2 = action.f340622n;
        java.lang.String t17 = str2 != null ? r26.i0.t(str2, ";", ",", false) : null;
        if (!(t17 == null || t17.length() == 0) && (kv0Var = (r45.kv0) qd1Var.getCustom(9)) != null && (list = kv0Var.getList(7)) != null) {
            for (r45.fl2 fl2Var : list) {
                db2.t4 t4Var2 = db2.t4.f228171a;
                java.lang.String string = fl2Var.getString(5);
                if (string == null) {
                    string = "";
                }
                fl2Var.set(5, db2.t4.m(t4Var2, string, t17, false, 4, null));
            }
        }
        nv2.w1 w1Var = this.f228210t;
        int i19 = w1Var.f340621m;
        if (i19 > 0 && w1Var.f340620l != null) {
            this.f228212v.set(21, java.lang.Integer.valueOf(i19));
            this.f228212v.set(20, this.f228210t.f340620l);
        }
        if (this.f228212v.getInteger(3) == 1) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            fo3.s sVar = fo3.s.INSTANCE;
            cu5Var.d(sVar.Ci("ce_feed_comment_like"));
            k57Var.f378395e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f378396f = cu5Var2;
            r45.kv0 kv0Var5 = (r45.kv0) this.f228212v.getCustom(9);
            if (kv0Var5 != null) {
                kv0Var5.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
            }
            w04.l.INSTANCE.Ch(540999690, 4);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qd1 qd1Var2 = this.f228212v;
        lVar.f70664a = qd1Var2;
        r45.rd1 rd1Var = new r45.rd1();
        rd1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rd1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = rd1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlike";
        lVar.f70667d = 3710;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i(this.f228211u, "CgiFinderLikeComment init " + qd1Var2.getLong(1) + " and userName " + qd1Var2.getString(6) + " comment:" + this.f228210t.f340615g);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.rd1 resp = (r45.rd1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228211u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        hz2.d dVar = hz2.d.f286313a;
        dVar.h(i17, i18, str);
        dVar.f(i17, i18, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d1g));
        if (this.f228210t.f340616h != nv2.x1.f340631i) {
            dVar.d(i17, i18, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d1i));
            return;
        }
        dVar.d(i17, i18, com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3l) : str);
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3n) : str;
        if (i17 == 4 && i18 == -4301 && string != null) {
            dVar.m(string);
        }
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.t8.K0(str) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.oit) : str;
        if (i17 == 4 && i18 == -4011 && string2 != null) {
            dVar.m(string2);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.p3m);
        }
        if (i17 == 4 && i18 == -4012 && str != null) {
            dVar.m(str);
        }
    }
}
