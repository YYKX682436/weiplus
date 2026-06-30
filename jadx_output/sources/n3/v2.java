package n3;

/* loaded from: classes14.dex */
public class v2 extends n3.x2 {

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets.Builder f334426c;

    public v2() {
        this.f334426c = new android.view.WindowInsets.Builder();
    }

    @Override // n3.x2
    public n3.g3 b() {
        a();
        n3.g3 i17 = n3.g3.i(this.f334426c.build(), null);
        i17.f334338a.q(this.f334439b);
        return i17;
    }

    @Override // n3.x2
    public void d(e3.d dVar) {
        this.f334426c.setMandatorySystemGestureInsets(dVar.e());
    }

    @Override // n3.x2
    public void e(e3.d dVar) {
        this.f334426c.setStableInsets(dVar.e());
    }

    @Override // n3.x2
    public void f(e3.d dVar) {
        this.f334426c.setSystemGestureInsets(dVar.e());
    }

    @Override // n3.x2
    public void g(e3.d dVar) {
        this.f334426c.setSystemWindowInsets(dVar.e());
    }

    @Override // n3.x2
    public void h(e3.d dVar) {
        this.f334426c.setTappableElementInsets(dVar.e());
    }

    public v2(n3.g3 g3Var) {
        super(g3Var);
        android.view.WindowInsets.Builder builder;
        android.view.WindowInsets h17 = g3Var.h();
        if (h17 != null) {
            builder = new android.view.WindowInsets.Builder(h17);
        } else {
            builder = new android.view.WindowInsets.Builder();
        }
        this.f334426c = builder;
    }
}
