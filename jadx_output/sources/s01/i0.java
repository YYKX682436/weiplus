package s01;

/* loaded from: classes4.dex */
public class i0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f401879d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f401880e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f401881f = new java.util.HashMap();

    public i0(java.util.LinkedList linkedList) {
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.rj rjVar = (r45.rj) it.next();
            java.lang.String str = rjVar.f384941e;
            java.lang.String str2 = rjVar.f384940d;
            if (str2 != null && str != null) {
                this.f401881f.put(str, str2);
            }
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xa3();
        lVar.f70665b = new r45.ya3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizchatinfolist";
        lVar.f70667d = 1365;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f401880e = a17;
        ((r45.xa3) a17.f70710a.f70684a).f389916d = linkedList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f401879d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.brandservice.NetSceneGetBizChatInfoList", "do scene");
        return dispatch(sVar, this.f401880e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1365;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f401879d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
