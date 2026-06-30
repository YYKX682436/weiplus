package s01;

/* loaded from: classes4.dex */
public class k0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401892d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401893e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f401894f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f401895g;

    public k0(java.util.LinkedList linkedList, java.lang.Object obj) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.ao aoVar = (r45.ao) it.next();
            java.util.LinkedList linkedList2 = aoVar.f370162e;
            java.lang.String str = aoVar.f370161d;
            if (str != null && linkedList2 != null && linkedList2.size() > 0) {
                java.util.Iterator it6 = linkedList2.iterator();
                while (it6.hasNext()) {
                    this.f401894f.put((java.lang.String) it6.next(), str);
                }
            }
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.db3();
        lVar.f70665b = new r45.eb3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizchatuserinfolist";
        lVar.f70667d = od1.b.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401893e = a17;
        ((r45.db3) a17.f70710a.f70684a).f372283d = linkedList;
        this.f401895g = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401892d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneGetBizChatUserInfoList", "do scene");
        return dispatch(sVar, this.f401893e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return od1.b.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401892d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
