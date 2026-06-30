package ek2;

/* loaded from: classes.dex */
public final class p2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253517u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(gk2.e liveData, r45.t12 msg, int i17) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f253517u = "Finder.CgiFinderLiveTopComment";
        r45.jd2 jd2Var = new r45.jd2();
        jd2Var.set(1, db2.t4.f228171a.a(6295));
        jd2Var.set(3, java.lang.Long.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f328988r.getLong(0)));
        jd2Var.set(2, java.lang.Long.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f328983m));
        jd2Var.set(7, msg.getString(6) + '_' + c01.id.e() + '_' + ((mm2.c1) liveData.a(mm2.c1.class)).C7());
        jd2Var.set(6, com.tencent.mm.protobuf.g.b(((mm2.e1) liveData.a(mm2.e1.class)).f328985o));
        jd2Var.set(4, java.lang.Long.valueOf(msg.getLong(5)));
        jd2Var.set(5, java.lang.Integer.valueOf(i17));
        jd2Var.set(8, java.lang.Long.valueOf(pm0.v.Z(((mm2.e1) liveData.a(mm2.e1.class)).f328992v)));
        jd2Var.set(9, xy2.c.f(this.f16135n));
        jd2Var.set(10, ((mm2.e1) liveData.a(mm2.e1.class)).f328992v);
        jd2Var.set(12, msg.getString(6));
        ((mm2.c1) liveData.a(mm2.c1.class)).f328927z4.add(jd2Var.getString(7));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = jd2Var;
        r45.kd2 kd2Var = new r45.kd2();
        kd2Var.set(0, new r45.ie());
        lVar.f70665b = kd2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivetopcomment";
        lVar.f70667d = 6295;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveTopComment", "CgiFinderLiveTopComment init " + jd2Var.getLong(3) + ',' + xy2.c.f(this.f16135n) + ',' + msg.getString(2) + " opType:" + jd2Var.getInteger(5));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kd2 resp = (r45.kd2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253517u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225003e;
    }
}
