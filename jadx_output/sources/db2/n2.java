package db2;

/* loaded from: classes.dex */
public final class n2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228078t;

    public n2(java.lang.String str, java.lang.String str2) {
        super(null, null, 3, null);
        this.f228078t = "Finder.CgiFinderPoiSearch";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.to2 to2Var = new r45.to2();
        to2Var.set(2, str);
        to2Var.set(3, str2);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        to2Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        to2Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        lVar.f70664a = to2Var;
        r45.uo2 uo2Var = new r45.uo2();
        uo2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) uo2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = uo2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpoisearch";
        lVar.f70667d = 5884;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPoiSearch", "[init] query:" + str + ", finder_username:" + str2);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.uo2 resp = (r45.uo2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228078t, "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
