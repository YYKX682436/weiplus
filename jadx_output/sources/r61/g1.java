package r61;

/* loaded from: classes8.dex */
public class g1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392872d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392873e;

    public g1(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gu4();
        lVar.f70665b = new r45.hu4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newgetinvitefriend";
        lVar.f70667d = 135;
        lVar.f70668e = 23;
        lVar.f70669f = 1000000023;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f392872d = a17;
        ((r45.gu4) a17.f70710a.f70684a).f375531d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f392873e = u0Var;
        return dispatch(sVar, this.f392872d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 135;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.hu4 hu4Var = (r45.hu4) this.f392872d.f70711b.f70700a;
        hu4Var.f376449e.size();
        hu4Var.f376451g.size();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i27 = 0; i27 < hu4Var.f376448d; i27++) {
            if (!hashSet.contains(((r45.ku4) hu4Var.f376449e.get(i27)).f378962h)) {
                linkedList.add((r45.ku4) hu4Var.f376449e.get(i27));
                hashSet.add(((r45.ku4) hu4Var.f376449e.get(i27)).f378962h);
            }
        }
        hu4Var.f376449e = linkedList;
        hu4Var.f376448d = linkedList.size();
        this.f392873e.onSceneEnd(i18, i19, str, this);
    }
}
