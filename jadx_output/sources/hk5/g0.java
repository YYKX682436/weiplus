package hk5;

/* loaded from: classes9.dex */
public final class g0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new se5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        se5.a model = (se5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.s0 s0Var = new mi5.s0();
        se5.a aVar2 = s0Var.f326916c;
        s0Var.f326916c = model;
        s0Var.c(aVar2, model);
        return s0Var.a(getActivity());
    }
}
