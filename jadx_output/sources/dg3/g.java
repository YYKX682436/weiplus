package dg3;

/* loaded from: classes3.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f232327e;

    public g(dg3.k kVar, mf3.k kVar2) {
        this.f232326d = kVar;
        this.f232327e = kVar2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        mf3.k kVar = this.f232327e;
        dg3.k kVar2 = this.f232326d;
        dg3.k.V6(kVar2, g4Var, kVar2.Y6(kVar));
    }
}
