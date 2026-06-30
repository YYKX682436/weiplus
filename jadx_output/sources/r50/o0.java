package r50;

/* loaded from: classes.dex */
public final class o0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new ne5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        ne5.a model = (ne5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        io.x xVar = new io.x();
        ne5.a aVar2 = xVar.f293440b;
        xVar.f293440b = model;
        xVar.c(aVar2, model);
        return xVar.a(getActivity());
    }
}
