package ks3;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f311652d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f311653e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f311654f;

    public d0(java.util.ArrayList arrayList) {
        this.f311654f = arrayList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new ks3.c();
        lVar.f70665b = new ks3.d();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkconversationfile";
        lVar.f70667d = 483;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f311653e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f311652d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f311653e;
        ks3.c cVar = (ks3.c) oVar.f70710a.f70684a;
        java.util.ArrayList arrayList = this.f311654f;
        cVar.f311642d = arrayList.size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            ks3.h hVar = new ks3.h();
            hVar.f311681e = longValue;
            linkedList.add(hVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", java.lang.Long.valueOf(longValue));
        }
        cVar.f311643e = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", java.lang.Integer.valueOf(cVar.f311642d), java.lang.Integer.valueOf(cVar.f311643e.size()));
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 483;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if ((i18 != 0 || i19 != 0) && (u0Var = this.f311652d) != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mm.modelbase.u0 u0Var2 = this.f311652d;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
