package hk5;

/* loaded from: classes9.dex */
public final class s extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.f();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        fc5.f model = (fc5.f) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.o oVar = new mi5.o();
        fc5.f fVar = oVar.f326887c;
        oVar.f326887c = model;
        oVar.c(fVar, model);
        return oVar.a(getActivity());
    }
}
