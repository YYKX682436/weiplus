package k14;

/* loaded from: classes4.dex */
public class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303416d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303417e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f303418f;

    public y(int i17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b83();
        lVar.f70665b = new r45.c83();
        lVar.f70666c = "/cgi-bin/micromsg-bin/generalset";
        lVar.f70667d = 177;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f303417e = a17;
        this.f303418f = str;
        r45.b83 b83Var = (r45.b83) a17.f70710a.f70684a;
        b83Var.f370627d = i17;
        b83Var.f370628e = str;
        if (map != null) {
            b83Var.f370629f = map.size();
            b83Var.f370630g = new java.util.LinkedList();
            for (java.lang.Integer num : map.keySet()) {
                r45.d83 d83Var = new r45.d83();
                d83Var.f372221d = num.intValue();
                d83Var.f372222e = (java.lang.String) map.get(num);
                b83Var.f370630g.add(d83Var);
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303416d = u0Var;
        return dispatch(sVar, this.f303417e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 177;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f303416d.onSceneEnd(i18, i19, str, this);
    }
}
