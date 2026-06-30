package e04;

/* loaded from: classes15.dex */
public class e implements tg0.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz3.l0 f245889a;

    public e(e04.f fVar, sz3.l0 l0Var) {
        this.f245889a = l0Var;
    }

    @Override // tg0.g1
    public void onDismiss() {
    }

    @Override // tg0.g1
    public void onEnter() {
        sz3.l0 l0Var = this.f245889a;
        if (l0Var != null) {
            l0Var.a("circle_search", "session");
        }
    }
}
