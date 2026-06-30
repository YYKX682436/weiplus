package q71;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public int f360352d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360353e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360354f;

    public n(java.lang.String str, java.lang.String str2, kk.v vVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wi5();
        lVar.f70665b = new r45.xi5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rcptinfoimport";
        lVar.f70667d = nd1.k1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.sdk.platformtools.t8.K0(str2);
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360354f = a17;
        r45.wi5 wi5Var = (r45.wi5) a17.f70710a.f70684a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.h(str));
        wi5Var.f389211e = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.tencent.mm.sdk.platformtools.t8.h(str2));
        wi5Var.f389212f = cu5Var2;
        wi5Var.f389210d = vVar.f308478d;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360353e = u0Var;
        return dispatch(sVar, this.f360354f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return nd1.k1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.xi5 xi5Var = (r45.xi5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            int i27 = xi5Var.f390152e;
            this.f360352d = i27;
            java.util.LinkedList linkedList = xi5Var.f390151d.f391139e;
            if (linkedList != null && i27 == 0) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(xi5Var.f390151d.f391139e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f360353e.onSceneEnd(i18, i19, str, this);
    }
}
