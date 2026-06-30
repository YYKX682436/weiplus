package r50;

/* loaded from: classes9.dex */
public final class b extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new ec5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        ec5.a model = (ec5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.h hVar = new mi5.h();
        ec5.a aVar2 = hVar.f326848c;
        hVar.f326848c = model;
        hVar.c(aVar2, model);
        return hVar.a(getActivity());
    }
}
