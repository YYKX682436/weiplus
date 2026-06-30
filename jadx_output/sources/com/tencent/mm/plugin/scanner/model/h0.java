package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes14.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158916d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158917e;

    public h0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18, int i19, int i27, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gm();
        lVar.f70665b = new r45.hm();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanproductreport";
        lVar.f70667d = 1064;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158916d = a17;
        r45.gm gmVar = (r45.gm) a17.f70710a.f70684a;
        gmVar.f375348d = o45.wf.f343025c;
        gmVar.f375349e = o45.wf.f343024b;
        gmVar.f375350f = o45.wf.f343027e;
        gmVar.f375351g = wo.q.f447785f;
        gmVar.f375352h = com.tencent.mm.sdk.platformtools.m2.d();
        gmVar.f375353i = i19;
        gmVar.f375354m = str4;
        gmVar.f375355n = str;
        gmVar.f375356o = str2;
        gmVar.f375357p = i17;
        gmVar.f375358q = str3;
        gmVar.f375359r = i18;
        gmVar.f375360s = i27;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158917e = u0Var;
        return dispatch(sVar, this.f158916d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1064;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f158917e.onSceneEnd(i18, i19, str, this);
    }
}
