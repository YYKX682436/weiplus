package hk5;

/* loaded from: classes9.dex */
public final class x extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new id5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        id5.a model = (id5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.f0 f0Var = new mi5.f0();
        id5.a aVar2 = f0Var.f326833c;
        f0Var.f326833c = model;
        f0Var.c(aVar2, model);
        return f0Var.a(getActivity());
    }
}
