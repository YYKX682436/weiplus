package hk5;

/* loaded from: classes9.dex */
public final class o extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new lb5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        lb5.a model = (lb5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.f fVar = new mi5.f();
        lb5.a aVar2 = fVar.f326830c;
        fVar.f326830c = model;
        fVar.c(aVar2, model);
        return fVar.a(getActivity());
    }
}
