package hk5;

/* loaded from: classes9.dex */
public final class a0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new ob5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        ob5.a model = (ob5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.o0 o0Var = new mi5.o0();
        ob5.a aVar2 = o0Var.f326890c;
        o0Var.f326890c = model;
        o0Var.c(aVar2, model);
        return o0Var.a(getActivity());
    }
}
