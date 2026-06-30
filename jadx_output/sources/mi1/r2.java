package mi1;

/* loaded from: classes7.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f326680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f326681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f326682f;

    public r2(mi1.n2 n2Var, int i17, boolean z17) {
        this.f326682f = n2Var;
        this.f326680d = i17;
        this.f326681e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        mi1.n2 n2Var = this.f326682f;
        int i17 = this.f326680d;
        n2Var.f326639i = i17;
        if (n2Var.a()) {
            mi1.g gVar = (mi1.g) n2Var.f326642o;
            gVar.f326558h = i17;
            if (gVar.p()) {
                return;
            }
            gVar.f326556f.f(i17, this.f326681e);
        }
    }
}
