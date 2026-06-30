package mi1;

/* loaded from: classes7.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f326659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f326660e;

    public p2(mi1.n2 n2Var, java.lang.CharSequence charSequence) {
        this.f326660e = n2Var;
        this.f326659d = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        mi1.n2 n2Var = this.f326660e;
        java.lang.CharSequence charSequence = this.f326659d;
        n2Var.f326635e = charSequence;
        if (n2Var.a()) {
            mi1.g gVar = (mi1.g) n2Var.f326642o;
            if (gVar.p()) {
                return;
            }
            gVar.f326556f.b(charSequence);
        }
    }
}
