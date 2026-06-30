package r50;

/* loaded from: classes9.dex */
public final class m0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new xd5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        xd5.a model = (xd5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        io.v vVar = new io.v();
        xd5.a aVar2 = vVar.f293436c;
        vVar.f293436c = model;
        vVar.c(aVar2, model);
        return vVar.a(getActivity());
    }
}
