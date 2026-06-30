package kn;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309431d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309432e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f309433f;

    public n(java.util.LinkedList linkedList) {
        this.f309433f = linkedList;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.r50();
        lVar.f70665b = new r45.s50();
        lVar.f70666c = "/cgi-bin/micromsg-bin/collectchatroom";
        lVar.f70667d = 181;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309432e = a17;
        r45.r50 r50Var = (r45.r50) a17.f70710a.f70684a;
        r50Var.f384550e = linkedList;
        r50Var.f384549d = linkedList.size();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309431d = u0Var;
        return dispatch(sVar, this.f309432e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 181;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        if (v0Var.getRespObj().getRetCode() != 0) {
            this.f309431d.onSceneEnd(i18, i19, str, this);
            return;
        }
        java.util.LinkedList linkedList = this.f309433f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = ((r45.au3) it.next()).f370261d;
                java.util.Map map = c01.v1.f37519a;
                if (str2.toLowerCase().endsWith("@groupcard")) {
                    com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    if (Bi.j0(str2)) {
                        Bi.k(str2);
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard RoomName not exist:[" + str2 + "]");
                    }
                    ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().y0(str2);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard: room:[" + str2 + "]");
                }
            }
        }
        this.f309431d.onSceneEnd(i18, i19, str, this);
    }
}
