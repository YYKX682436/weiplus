package r01;

/* loaded from: classes2.dex */
public class n3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368166d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368167e;

    public n3(java.util.LinkedList linkedList) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kp5();
        lVar.f70665b = new r45.lp5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/reportcommand";
        lVar.f70667d = 2592;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368167e = a17;
        r45.kp5 kp5Var = (r45.kp5) a17.f70710a.f70684a;
        if (linkedList != null) {
            kp5Var.f378897d = linkedList;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneReportBrandSession", "reportcommand MsgReport size %d", java.lang.Integer.valueOf(kp5Var.f378897d.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368166d = u0Var;
        return dispatch(sVar, this.f368167e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2592;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f368166d.onSceneEnd(i18, i19, str, this);
    }
}
