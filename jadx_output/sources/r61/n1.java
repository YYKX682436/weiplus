package r61;

/* loaded from: classes4.dex */
public class n1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392919d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392920e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f392921f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392922g;

    public n1(java.util.ArrayList arrayList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q04();
        lVar.f70665b = new r45.r04();
        lVar.f70666c = "/cgi-bin/micromsg-bin/invitegooglecontact";
        lVar.f70667d = 489;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f392919d = lVar.a();
        this.f392921f = new java.util.LinkedList();
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            r45.p04 p04Var = new r45.p04();
            p04Var.f382645d = (java.lang.String) arrayList.get(i17);
            this.f392921f.add(p04Var);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "doScene");
        this.f392920e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f392919d;
        r45.q04 q04Var = (r45.q04) oVar.f70710a.f70684a;
        java.util.LinkedList linkedList = this.f392921f;
        q04Var.f383533d = linkedList.size();
        q04Var.f383534e = linkedList;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 489;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GoogleContact.NetSceneInviteGoogleContact", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f392920e.onSceneEnd(i18, i19, str, this);
        } else {
            this.f392920e.onSceneEnd(i18, i19, str, this);
        }
    }
}
