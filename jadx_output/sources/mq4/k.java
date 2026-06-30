package mq4;

/* loaded from: classes9.dex */
public class k extends mq4.e0 {
    public k(int i17, long j17, int i18, int i19, int i27, int i28, int i29, byte[] bArr, int i37) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.o27();
        lVar.f70665b = new r45.p27();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voipDoubleLinkSwitch";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX;
        lVar.f70668e = com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX;
        lVar.f70669f = 1000000249;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f330793d = a17;
        r45.o27 o27Var = (r45.o27) a17.f70710a.f70684a;
        o27Var.f381852d = i17;
        o27Var.f381853e = j17;
        o27Var.f381854f = i18;
        o27Var.f381855g = i19;
        o27Var.f381856h = i27;
        o27Var.f381857i = i28;
        o27Var.f381858m = i29;
        o27Var.f381859n = 1;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.e(bArr, 0, i37);
        o27Var.f381860o = cu5Var;
    }

    @Override // mq4.e0
    public void I(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.DoubleLinkSwitch", "double link switch error");
            return;
        }
        r45.p27 p27Var = (r45.p27) K();
        if (p27Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.DoubleLinkSwitch", "roomId:%d, roomKey:%s, member:%d", java.lang.Integer.valueOf(p27Var.f382688d), java.lang.Long.valueOf(p27Var.f382689e), java.lang.Integer.valueOf(p27Var.f382690f));
        }
    }

    @Override // mq4.e0
    public com.tencent.mm.modelbase.u0 J() {
        return new mq4.j(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX;
    }
}
