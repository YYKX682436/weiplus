package hk5;

/* loaded from: classes9.dex */
public final class e0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new oe5.c();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        oe5.c model = (oe5.c) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.e1 e1Var = new mi5.e1();
        oe5.c cVar = e1Var.f326827b;
        e1Var.f326827b = model;
        e1Var.c(cVar, model);
        return e1Var.a(getActivity());
    }
}
