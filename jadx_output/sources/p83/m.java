package p83;

/* loaded from: classes4.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352766d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352767e;

    public m(int i17, int i18, java.util.LinkedList linkedList) {
        this.f352766d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.d06();
        lVar.f70665b = new r45.e06();
        lVar.f70667d = 871;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendwcofeedback";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352766d = a17;
        r45.d06 d06Var = (r45.d06) a17.f70710a.f70684a;
        d06Var.f371980d = i18;
        d06Var.f371982f = linkedList;
        d06Var.f371981e = linkedList.size();
        d06Var.f371983g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallSendFeedback", "NetSceneIPCallSendFeedback roomid=%d, level=%d, feedbackCount=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(linkedList.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352767e = u0Var;
        return dispatch(sVar, this.f352766d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 871;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallSendFeedback", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f352767e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
