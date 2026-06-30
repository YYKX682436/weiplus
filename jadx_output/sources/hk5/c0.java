package hk5;

/* loaded from: classes9.dex */
public final class c0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new oe5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        oe5.a model = (oe5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.a1 a1Var = new mi5.a1();
        oe5.a aVar2 = a1Var.f326795b;
        a1Var.f326795b = model;
        a1Var.c(aVar2, model);
        return a1Var.a(getActivity());
    }
}
