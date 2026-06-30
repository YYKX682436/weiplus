package eh4;

/* loaded from: classes4.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252949d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252950e;

    public g(java.util.LinkedList linkedList, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pk6();
        lVar.f70665b = new r45.qk6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/talkstatreport";
        lVar.f70667d = vb1.g.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252950e = a17;
        r45.pk6 pk6Var = (r45.pk6) a17.f70710a.f70684a;
        pk6Var.f383144d = linkedList.size();
        pk6Var.f383145e = linkedList;
        pk6Var.f383146f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252949d = u0Var;
        return dispatch(sVar, this.f252950e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return vb1.g.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f252949d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f252949d.onSceneEnd(i18, i19, str, this);
        }
    }
}
