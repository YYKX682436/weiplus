package pk2;

/* loaded from: classes3.dex */
public final class q8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356197d;

    public q8(pk2.d9 d9Var) {
        this.f356197d = d9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = this.f356197d.f355670m.iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}
