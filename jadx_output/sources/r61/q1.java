package r61;

/* loaded from: classes4.dex */
public class q1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392945d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392946e = null;

    public q1(java.lang.String str, java.util.List list) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sz5();
        lVar.f70665b = new r45.tz5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendsmstomfriend";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f392945d = a17;
        r45.sz5 sz5Var = (r45.sz5) a17.f70710a.f70684a;
        sz5Var.f386036d = str;
        sz5Var.f386038f = new java.util.LinkedList();
        sz5Var.f386037e = list != null ? list.size() : 0;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    java.util.LinkedList linkedList = sz5Var.f386038f;
                    r45.du5 du5Var = new r45.du5();
                    du5Var.f372756d = str2;
                    du5Var.f372757e = true;
                    linkedList.add(du5Var);
                }
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392946e = u0Var;
        return dispatch(sVar, this.f392945d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f392946e.onSceneEnd(i18, i19, str, this);
    }
}
