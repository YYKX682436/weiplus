package hk5;

/* loaded from: classes9.dex */
public final class b0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new vd5.b();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        vd5.b model = (vd5.b) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        mi5.y0 y0Var = new mi5.y0();
        vd5.b bVar = y0Var.f326946d;
        y0Var.f326946d = model;
        y0Var.c(bVar, model);
        return y0Var.a(getActivity());
    }
}
