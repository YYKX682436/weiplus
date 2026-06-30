package s01;

/* loaded from: classes4.dex */
public class m0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401902d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401903e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f401904f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f401905g;

    public m0(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tz3();
        lVar.f70665b = new r45.uz3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/initiatebizchat";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.media.k2.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401903e = a17;
        r45.tz3 tz3Var = (r45.tz3) a17.f70710a.f70684a;
        tz3Var.f386879d = str;
        tz3Var.f386880e = str2 == null ? "" : str2;
        tz3Var.f386881f = linkedList;
        this.f401905g = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401902d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInitiateBizChat", "do scene");
        return dispatch(sVar, this.f401903e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.k2.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401902d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
