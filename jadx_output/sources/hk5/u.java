package hk5;

/* loaded from: classes9.dex */
public final class u extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.h();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        fc5.h model = (fc5.h) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.s sVar = new mi5.s();
        fc5.h hVar = sVar.f326913c;
        sVar.f326913c = model;
        sVar.c(hVar, model);
        return sVar.a(getActivity());
    }
}
