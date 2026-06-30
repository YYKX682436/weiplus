package hk5;

/* loaded from: classes9.dex */
public final class z extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new dc5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        dc5.a model = (dc5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.m0 m0Var = new mi5.m0();
        dc5.a aVar2 = m0Var.f326881c;
        m0Var.f326881c = model;
        m0Var.c(aVar2, model);
        return m0Var.a(getActivity());
    }
}
