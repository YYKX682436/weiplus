package jd2;

/* loaded from: classes10.dex */
public final class d implements xi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f299144a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.f f299145b;

    public d(com.tencent.mm.view.MMPAGView battleStartView, xi2.f animateCallback) {
        kotlin.jvm.internal.o.g(battleStartView, "battleStartView");
        kotlin.jvm.internal.o.g(animateCallback, "animateCallback");
        this.f299144a = battleStartView;
        this.f299145b = animateCallback;
        battleStartView.a(new jd2.a(this));
    }

    @Override // xi2.g
    public android.view.View a() {
        return this.f299144a;
    }

    @Override // xi2.g
    public void b(kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(scope, kotlinx.coroutines.internal.b0.f310484a, null, new jd2.c(this, null), 2, null);
    }

    @Override // xi2.g
    public int getVisibility() {
        return this.f299144a.getVisibility();
    }

    @Override // xi2.g
    public void reset() {
        this.f299144a.n();
        setVisibility(8);
    }

    @Override // xi2.g
    public void setVisibility(int i17) {
        this.f299144a.setVisibility(i17);
    }
}
