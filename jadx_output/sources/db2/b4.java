package db2;

/* loaded from: classes.dex */
public final class b4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227911t;

    public b4(java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        this.f227911t = "Finder.CgiFinderPoiSearch";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.d23 d23Var = new r45.d23();
        d23Var.set(3, str);
        d23Var.set(4, gVar);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        d23Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        d23Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        lVar.f70664a = d23Var;
        r45.e23 e23Var = new r45.e23();
        e23Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) e23Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = e23Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderuserpoi";
        lVar.f70667d = 4035;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPoiSearch", "[init] finder_username:" + str);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.e23 resp = (r45.e23) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227911t, "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
