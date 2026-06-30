package dg3;

/* loaded from: classes3.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f232329e;

    public h(dg3.k kVar, mf3.k kVar2) {
        this.f232328d = kVar;
        this.f232329e = kVar2;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        dg3.k kVar = this.f232328d;
        cg3.a aVar = (cg3.a) kVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.H1(this.f232329e, kVar.f232332d, g4Var);
        }
    }
}
