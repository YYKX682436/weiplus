package mq4;

/* loaded from: classes14.dex */
public class h implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq4.i f330799d;

    public h(mq4.i iVar) {
        this.f330799d = iVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        vq4.d0.a("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd type:" + m1Var.getType() + " errType:" + i17 + " errCode:" + i18);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd: error %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        mq4.i iVar = this.f330799d;
        r45.h27 h27Var = (r45.h27) iVar.f330793d.f70710a.f70684a;
        int i19 = iVar.f330800h;
        if (h27Var != null && i19 != 2) {
            com.tencent.mm.plugin.voip.model.j0.m(h27Var.f375794e, h27Var.f375795f, h27Var.f375800n);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneVoipCancelInvite", "onSceneEnd: cancel type " + i19);
    }
}
