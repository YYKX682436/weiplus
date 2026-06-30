package uj3;

/* loaded from: classes3.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f428290d;

    public j0(uj3.l0 l0Var) {
        this.f428290d = l0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.HashSet<uj3.j> hashSet;
        uj3.k kVar = this.f428290d.f428318c;
        if (kVar == null || (hashSet = kVar.f428302b) == null) {
            return;
        }
        for (uj3.j jVar : hashSet) {
            g4Var.d(jVar.f428289b, -1, jVar.f428288a);
        }
    }
}
