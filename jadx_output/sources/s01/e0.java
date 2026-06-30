package s01;

/* loaded from: classes4.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401863d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f401865f;

    public e0(java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.vj();
        lVar.f70665b = new r45.wj();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/bizchatsearchcontact";
        lVar.f70667d = 1364;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401864e = a17;
        r45.vj vjVar = (r45.vj) a17.f70710a.f70684a;
        vjVar.f388297d = str;
        vjVar.f388298e = str2;
        vjVar.f388299f = i17;
        this.f401865f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401863d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizChatSearchContact", "do scene");
        return dispatch(sVar, this.f401864e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1364;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401863d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
