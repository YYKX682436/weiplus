package hk5;

/* loaded from: classes9.dex */
public final class q extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new fc5.d();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        fc5.d model = (fc5.d) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.m mVar = new mi5.m();
        fc5.d dVar = mVar.f326878b;
        mVar.f326878b = model;
        mVar.c(dVar, model);
        return mVar.a(getActivity());
    }
}
