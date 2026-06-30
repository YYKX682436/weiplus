package r35;

/* loaded from: classes11.dex */
public class r1 implements lz.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r35.u1 f369247a;

    public r1(r35.u1 u1Var) {
        this.f369247a = u1Var;
    }

    @Override // lz.i
    public boolean a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        r35.u1 u1Var = this.f369247a;
        r35.v1 v1Var = u1Var.f369274f;
        if (v1Var.f369304w && v1Var.g(i17)) {
            u1Var.f369274f.a(i17);
        }
        return true;
    }
}
