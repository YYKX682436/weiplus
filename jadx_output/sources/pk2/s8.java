package pk2;

/* loaded from: classes3.dex */
public final class s8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f356242d;

    public s8(pk2.d9 d9Var) {
        this.f356242d = d9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = this.f356242d.f355672o.iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}
