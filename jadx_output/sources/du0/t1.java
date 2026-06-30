package du0;

/* loaded from: classes5.dex */
public final class t1 extends du0.g {

    /* renamed from: i, reason: collision with root package name */
    public volatile pp0.s0 f243445i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        pp0.s0 s0Var = this.f243445i;
        if (s0Var != null) {
            ((dz0.s2) s0Var).a();
        }
        pp0.s0 s0Var2 = this.f243445i;
        if (s0Var2 != null) {
            ((dz0.s2) s0Var2).c();
        }
        super.onCleared();
    }
}
