package hk5;

/* loaded from: classes9.dex */
public final class p extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.c();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        fc5.c model = (fc5.c) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.k kVar = new mi5.k();
        fc5.c cVar = kVar.f326867c;
        kVar.f326867c = model;
        kVar.c(cVar, model);
        return kVar.a(getActivity());
    }
}
