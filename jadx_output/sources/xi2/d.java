package xi2;

/* loaded from: classes10.dex */
public final class d implements xi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f454721a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.f f454722b;

    public d(com.tencent.mm.view.MMPAGView battleStartView, xi2.f animateCallback) {
        kotlin.jvm.internal.o.g(battleStartView, "battleStartView");
        kotlin.jvm.internal.o.g(animateCallback, "animateCallback");
        this.f454721a = battleStartView;
        this.f454722b = animateCallback;
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        battleStartView.o(ae2.in.f3688a.a(ym5.f6.M));
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new xi2.a(this, null), 2, null);
        battleStartView.a(new xi2.b(this));
    }

    @Override // xi2.g
    public android.view.View a() {
        return this.f454721a;
    }

    @Override // xi2.g
    public void b(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f454721a.setVisibility(0);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new xi2.c(this, null), 2, null);
    }

    @Override // xi2.g
    public int getVisibility() {
        return this.f454721a.getVisibility();
    }

    @Override // xi2.g
    public void reset() {
        this.f454721a.n();
        setVisibility(8);
    }

    @Override // xi2.g
    public void setVisibility(int i17) {
        this.f454721a.setVisibility(i17);
    }
}
