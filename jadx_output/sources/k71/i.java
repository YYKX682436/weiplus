package k71;

/* loaded from: classes14.dex */
public final class i implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304688d;

    public i(java.util.List list) {
        this.f304688d = list;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            for (k71.m mVar : this.f304688d) {
                g4Var.a(mVar.f304699d, mVar.f304700e);
            }
        }
    }
}
