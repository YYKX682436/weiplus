package q71;

/* loaded from: classes8.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360361d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360362e;

    public q(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ej5();
        lVar.f70665b = new r45.fj5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rcptinfotouch";
        lVar.f70667d = 419;
        lVar.f70668e = 204;
        lVar.f70669f = 1000000204;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360362e = a17;
        ((r45.ej5) a17.f70710a.f70684a).f373573d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360361d = u0Var;
        return dispatch(sVar, this.f360362e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 419;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.fj5 fj5Var = (r45.fj5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            java.util.LinkedList linkedList = fj5Var.f374402d.f391139e;
            if (linkedList != null) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(fj5Var.f374402d.f391139e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f360361d.onSceneEnd(i18, i19, str, this);
    }
}
