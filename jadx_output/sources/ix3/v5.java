package ix3;

/* loaded from: classes10.dex */
public final class v5 extends pf5.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final ix3.u5 f295591d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f295591d = new ix3.u5();
    }

    @Override // pf5.d
    public pf5.s0 h6() {
        return this.f295591d;
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        ix3.u5 u5Var = this.f295591d;
        ((kotlinx.coroutines.flow.i2) ((jz5.n) u5Var.f353932d).getValue()).e(u5Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f295591d = new ix3.u5();
    }
}
