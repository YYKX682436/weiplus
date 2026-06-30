package hk5;

/* loaded from: classes9.dex */
public final class f0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new oe5.d();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        oe5.d model = (oe5.d) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.g1 g1Var = new mi5.g1();
        oe5.d dVar = g1Var.f326845c;
        g1Var.f326845c = model;
        g1Var.c(dVar, model);
        return g1Var.a(getActivity());
    }
}
