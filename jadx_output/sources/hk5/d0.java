package hk5;

/* loaded from: classes9.dex */
public final class d0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new oe5.b();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        oe5.b model = (oe5.b) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.c1 c1Var = new mi5.c1();
        oe5.b bVar = c1Var.f326809c;
        c1Var.f326809c = model;
        c1Var.c(bVar, model);
        return c1Var.a(getActivity());
    }
}
