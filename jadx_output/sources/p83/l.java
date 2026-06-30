package p83;

/* loaded from: classes14.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352764d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352765e;

    public l(int i17, long j17, boolean z17) {
        this.f352764d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.re5();
        lVar.f70665b = new r45.se5();
        lVar.f70667d = 227;
        lVar.f70666c = "/cgi-bin/micromsg-bin/pstnreport";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352764d = a17;
        r45.re5 re5Var = (r45.re5) a17.f70710a.f70684a;
        re5Var.f384771g = i17;
        re5Var.f384772h = j17;
        re5Var.f384773i = z17 ? 1 : 0;
        m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
        java.lang.String str = "" + Zi.f324734l + "," + Zi.f324735m + "," + Zi.f324736n + "," + Zi.f324737o + "," + Zi.f324738p + "," + Zi.f324723a + "," + Zi.f324724b + "," + Zi.f324725c + "," + Zi.f324726d + "," + Zi.f324727e + "," + Zi.f324728f + "," + Zi.f324729g + "," + Zi.f324730h + "," + Zi.f324731i + "," + Zi.f324732j + "," + Zi.f324739q + "," + vq4.d0.e(com.tencent.mm.sdk.platformtools.x2.f193071a) + "," + Zi.A + "," + Zi.B + "," + Zi.C + "," + Zi.D + "," + Zi.E + Zi.f324747y + "," + Zi.G;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", str);
        re5Var.f384768d = x51.j1.i(str);
        m83.d Zi2 = com.tencent.mm.plugin.ipcall.model.r.Zi();
        java.lang.String str2 = "" + Zi2.f324734l + "," + Zi2.f324735m + "," + Zi2.f324736n + Zi2.f324746x + "";
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", str2);
        re5Var.f384769e = x51.j1.i(str2);
        m83.d Zi3 = com.tencent.mm.plugin.ipcall.model.r.Zi();
        java.lang.String str3 = "" + Zi3.f324734l + "," + Zi3.f324735m + "," + Zi3.f324736n + Zi3.f324745w + "";
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", str3);
        re5Var.f384770f = x51.j1.i(str3);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352765e = u0Var;
        return dispatch(sVar, this.f352764d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 227;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f352765e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
