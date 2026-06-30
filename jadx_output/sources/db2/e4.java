package db2;

/* loaded from: classes8.dex */
public final class e4 extends com.tencent.mm.modelbase.i {
    public e4(double d17, double d18) {
        r45.zd3 zd3Var = new r45.zd3();
        zd3Var.f391931e = d17;
        zd3Var.f391930d = d18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = zd3Var;
        lVar.f70665b = new r45.ae3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcurlocation";
        lVar.f70667d = 665;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Cgi.GetCurrentLocation", "onCgiBack errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
    }
}
