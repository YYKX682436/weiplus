package db2;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final int f228226m;

    public x(int i17, com.tencent.mm.protobuf.g gVar) {
        this.f228226m = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.az0 az0Var = new r45.az0();
        az0Var.set(3, db2.t4.f228171a.a(3839));
        az0Var.set(1, java.lang.Integer.valueOf(i17));
        az0Var.set(2, gVar);
        lVar.f70664a = az0Var;
        r45.bz0 bz0Var = new r45.bz0();
        bz0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bz0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = bz0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderconsumeprefetchreport";
        lVar.f70667d = 3839;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[init] tabType=");
        sb6.append(i17);
        sb6.append(" lastBuff=");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f192156a.length) : null);
        com.tencent.mars.xlog.Log.i("Cgi.FinderConsumePrefetchReport", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Cgi.FinderConsumePrefetchReport", "onCgiBack errType[" + i17 + "] errCode[" + i18 + "] errMsg[" + str + "] tabType[" + this.f228226m + ']');
    }
}
