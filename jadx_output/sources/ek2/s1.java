package ek2;

/* loaded from: classes.dex */
public final class s1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONObject f253532u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(java.lang.String str, long j17, long j18, int i17, r45.fe1 fe1Var, r45.g72 g72Var, int i18, kotlin.jvm.internal.i iVar) {
        super(null, 1, null);
        fe1Var = (i18 & 16) != 0 ? null : fe1Var;
        g72Var = (i18 & 32) != 0 ? null : g72Var;
        this.f253532u = new org.json.JSONObject();
        r45.d12 d12Var = new r45.d12();
        d12Var.set(1, db2.t4.f228171a.b(10497, this.f16135n));
        d12Var.set(2, str);
        d12Var.set(3, java.lang.Long.valueOf(j17));
        d12Var.set(4, java.lang.Long.valueOf(j18));
        d12Var.set(5, java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            d12Var.set(6, g72Var != null ? hc2.b.a(g72Var) : null);
        } else {
            d12Var.set(6, fe1Var != null ? hc2.b.a(fe1Var) : null);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = d12Var;
        r45.e12 e12Var = new r45.e12();
        e12Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) e12Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = e12Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivemodroommanager";
        lVar.f70667d = 10497;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.e12 resp = (r45.e12) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveModRoomManager", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f253532u;
    }
}
