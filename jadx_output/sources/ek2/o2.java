package ek2;

/* loaded from: classes.dex */
public final class o2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253511u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.n2 f253512v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.yb2 f253513w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(long j17, long j18, java.lang.String nonceId, java.lang.String anchorUsername, java.lang.String str, com.tencent.mm.protobuf.g gVar, java.util.LinkedList syncReqList, java.lang.String str2, ek2.n2 n2Var, r45.qt2 qt2Var) {
        super(qt2Var);
        java.lang.String str3;
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(anchorUsername, "anchorUsername");
        kotlin.jvm.internal.o.g(syncReqList, "syncReqList");
        this.f253511u = "Finder.CgiFinderLiveSyncExtraInfo";
        this.f253512v = n2Var;
        r45.yb2 yb2Var = new r45.yb2();
        this.f253513w = yb2Var;
        boolean z17 = true;
        yb2Var.set(1, db2.t4.f228171a.b(5971, qt2Var));
        yb2Var.set(6, java.lang.Long.valueOf(j17));
        yb2Var.set(5, java.lang.Long.valueOf(j18));
        yb2Var.set(2, anchorUsername);
        yb2Var.set(3, str);
        yb2Var.set(4, gVar);
        yb2Var.set(7, syncReqList);
        yb2Var.set(8, nonceId);
        gk2.e eVar = gk2.e.f272471n;
        yb2Var.set(10, (eVar == null || (str3 = ((mm2.c1) eVar.a(mm2.c1.class)).f328791d3) == null) ? "" : str3);
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            yb2Var.set(9, com.tencent.mm.protobuf.g.c(str2));
        }
        yb2Var.set(11, zl2.q4.d(zl2.q4.f473933a, null, null, 3, null));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yb2Var;
        r45.zb2 zb2Var = new r45.zb2();
        zb2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zb2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = zb2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivesyncextrainfo";
        lVar.f70667d = 5971;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveSyncExtraInfo", "init " + yb2Var.getLong(6) + ", " + yb2Var.getLong(5) + ", " + yb2Var.getString(8) + ", ux_info:" + yb2Var.getByteString(9));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zb2 resp = (r45.zb2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253511u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.n2 n2Var = this.f253512v;
        if (n2Var != null) {
            n2Var.a(this, i17, i18, str, resp);
        }
    }
}
