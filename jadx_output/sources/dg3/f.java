package dg3;

/* loaded from: classes3.dex */
public final class f implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f232325e;

    public f(dg3.k kVar, mf3.k kVar2) {
        this.f232324d = kVar;
        this.f232325e = kVar2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        mf3.k kVar = this.f232325e;
        dg3.k kVar2 = this.f232324d;
        dg3.k.V6(kVar2, g4Var, kVar2.W6(kVar));
    }
}
