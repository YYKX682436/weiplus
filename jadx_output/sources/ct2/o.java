package ct2;

/* loaded from: classes10.dex */
public final class o extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f222295f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f222296g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f222297h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f222298i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f222299m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f222300n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f222295f = "ReplayPreviewSlice";
        this.f222296g = new java.util.concurrent.CopyOnWriteArrayList();
        this.f222297h = new java.util.LinkedList();
    }

    public final void N6(yz5.l lVar) {
        r45.kr1 kr1Var = new r45.kr1();
        kr1Var.set(4, this.f222298i);
        kr1Var.set(2, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
        kr1Var.set(3, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0)));
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 10123;
        lVar2.f70666c = "/cgi-bin/micromsg-bin/finderlivegetallreplaythumb";
        lVar2.f70664a = kr1Var;
        lVar2.f70665b = new r45.lr1();
        com.tencent.mm.modelbase.o a17 = lVar2.a();
        com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        wi6.l().K(new ct2.n(this, lVar));
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        this.f222296g.clear();
        this.f222298i = null;
        this.f222299m = null;
        this.f222300n = false;
    }
}
