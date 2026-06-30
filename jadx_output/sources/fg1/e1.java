package fg1;

/* loaded from: classes7.dex */
public class e1 implements bg.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg1.f1 f261857a;

    public e1(fg1.f1 f1Var) {
        this.f261857a = f1Var;
    }

    public void a(boolean z17) {
        fg1.f1 f1Var = this.f261857a;
        ye1.e eVar = f1Var.f261864g.f261868a.f19764h;
        ye1.r rVar = !(eVar instanceof ye1.r) ? null : (ye1.r) eVar;
        if (rVar == null) {
            return;
        }
        f1Var.f261860c = z17;
        rVar.a(this.f261857a.f261861d);
        rVar.A(this.f261857a.f261862e);
        rVar.e(this.f261857a.f261863f);
    }
}
