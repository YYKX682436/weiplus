package wq3;

/* loaded from: classes2.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448571d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448572e;

    public m(java.util.LinkedList linkedList, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ct();
        lVar.f70665b = new r45.dt();
        lVar.f70666c = "/cgi-bin/micromsg-bin/cancelpreorder";
        lVar.f70667d = uc1.s1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448572e = a17;
        r45.ct ctVar = (r45.ct) a17.f70710a.f70684a;
        ctVar.f371818e = linkedList;
        ctVar.f371817d = linkedList != null ? linkedList.size() : 0;
        ctVar.f371819f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448571d = u0Var;
        return dispatch(sVar, this.f448572e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return uc1.s1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        r45.dt dtVar = (r45.dt) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i19 == 0 && (i27 = dtVar.f372738d) != 0) {
            str = dtVar.f372739e;
            i19 = i27;
        }
        this.f448571d.onSceneEnd(i18, i19, str, this);
    }
}
