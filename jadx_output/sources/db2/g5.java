package db2;

/* loaded from: classes2.dex */
public final class g5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f227989g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227990h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227991i;

    /* renamed from: m, reason: collision with root package name */
    public final r45.m21 f227992m;

    /* renamed from: n, reason: collision with root package name */
    public cz2.f f227993n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g5(r45.qt2 qt2Var, int i17, r45.jn0 extStats, java.lang.String str) {
        this(qt2Var, i17, kz5.c0.d(extStats), str);
        kotlin.jvm.internal.o.g(extStats, "extStats");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f227989g, "onGYNetEnd " + i17 + ' ' + i18 + ' ' + i19 + ' ' + str + ' ');
        if (i18 >= 4) {
            this.f227993n = cz2.f.f225002d;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f227991i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227991i = u0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doExtStatsReport actionType=");
        r45.m21 m21Var = this.f227992m;
        sb6.append(m21Var.getInteger(2));
        sb6.append(", scene=");
        r45.kv0 kv0Var = (r45.kv0) m21Var.getCustom(4);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.getInteger(1)) : null);
        sb6.append(" extList=");
        java.util.LinkedList<r45.jn0> list = m21Var.getList(3);
        kotlin.jvm.internal.o.f(list, "getExtStats(...)");
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (r45.jn0 jn0Var : list) {
            stringBuffer.append("[feedActionValue=" + jn0Var.getString(3) + " objectId=" + pm0.v.u(jn0Var.getLong(0)) + " func_msg_report_ext_info=" + jn0Var.getString(10) + "];");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        sb6.append(stringBuffer2);
        com.tencent.mars.xlog.Log.i(this.f227989g, sb6.toString());
        return dispatch(sVar, this.f227990h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6681;
    }

    @Override // az2.u, cz2.j
    public cz2.f v() {
        return this.f227993n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(r45.qt2 qt2Var, int i17, java.util.List extStats, java.lang.String str) {
        super(qt2Var);
        r45.kv0 kv0Var;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(extStats, "extStats");
        this.f227989g = "Finder.NetSceneExtStatsReport";
        this.f227993n = cz2.f.f225004f;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6681;
        r45.m21 m21Var = new r45.m21();
        m21Var.set(1, xy2.c.f(qt2Var));
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.getList(3).addAll(extStats);
        db2.t4 t4Var = db2.t4.f228171a;
        m21Var.set(4, t4Var.b(6681, qt2Var));
        this.f227992m = m21Var;
        r45.kv0 kv0Var2 = (r45.kv0) m21Var.getCustom(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(jn0Var.getLong(0)), jn0Var.getString(12)));
        }
        t4Var.h(kv0Var2, qt2Var, arrayList);
        if (!(str == null || str.length() == 0) && (kv0Var = (r45.kv0) this.f227992m.getCustom(4)) != null && (list = kv0Var.getList(7)) != null) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                ((r45.fl2) it6.next()).set(1, str);
            }
        }
        lVar.f70664a = this.f227992m;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f70665b = n21Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        this.f227990h = lVar.a();
    }
}
