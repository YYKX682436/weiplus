package hk5;

/* loaded from: classes9.dex */
public final class y extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new jd5.b();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        jd5.b model = (jd5.b) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.i0 i0Var = new mi5.i0();
        jd5.b bVar = i0Var.f326859c;
        i0Var.f326859c = model;
        i0Var.c(bVar, model);
        return i0Var.a(getActivity());
    }
}
