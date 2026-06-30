package r50;

/* loaded from: classes9.dex */
public final class l0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new ld5.b();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        ld5.b model = (ld5.b) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.k0 k0Var = new mi5.k0();
        ld5.b bVar = k0Var.f326869b;
        k0Var.f326869b = model;
        k0Var.c(bVar, model);
        return k0Var.a(getActivity());
    }
}
