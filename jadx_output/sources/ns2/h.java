package ns2;

/* loaded from: classes3.dex */
public final class h implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns2.b f339384d;

    public h(ns2.b bVar) {
        this.f339384d = bVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            ns2.b bVar = this.f339384d;
            g4Var.d(4, bVar.f339355a.getResources().getColor(com.tencent.mm.R.color.f478532ac), bVar.f339355a.getResources().getString(com.tencent.mm.R.string.f491733e22));
        }
    }
}
