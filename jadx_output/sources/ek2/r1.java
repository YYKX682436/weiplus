package ek2;

/* loaded from: classes.dex */
public final class r1 extends az2.j {

    /* renamed from: u, reason: collision with root package name */
    public static final ek2.q1 f253524u = new ek2.q1(null);

    /* renamed from: t, reason: collision with root package name */
    public final r45.hx0 f253525t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(long j17, long j18, int i17, r45.hx0 cmdItem) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(cmdItem, "cmdItem");
        this.f253525t = cmdItem;
        r45.l02 l02Var = new r45.l02();
        l02Var.set(2, java.lang.Long.valueOf(j17));
        l02Var.set(3, java.lang.Long.valueOf(j18));
        l02Var.set(4, java.lang.Integer.valueOf(i17));
        l02Var.set(1, db2.t4.f228171a.b(4175, null));
        l02Var.getList(5).add(cmdItem);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = l02Var;
        r45.m02 m02Var = new r45.m02();
        m02Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) m02Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = m02Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivemodbasicinfo";
        lVar.f70667d = 4175;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveModBasicInfo", "liveId " + j17 + ", objectId " + pm0.v.u(j18) + ",scene:" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.m02 resp = (r45.m02) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveModBasicInfo", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        if (this.f253525t.getInteger(0) == 7) {
            ya2.g gVar = ya2.h.f460484a;
            gk2.e eVar = dk2.ef.I;
            ya2.b2 b17 = gVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null);
            if (b17 != null) {
                gk2.e eVar2 = dk2.ef.I;
                b17.field_liveRoomImg = eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).w7() : null;
                gVar.k(b17);
            }
        }
    }
}
