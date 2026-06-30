package r50;

/* loaded from: classes9.dex */
public final class h extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new jd5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        jd5.a model = (jd5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        io.r rVar = new io.r();
        jd5.a aVar2 = rVar.f293427c;
        rVar.f293427c = model;
        rVar.c(aVar2, model);
        return rVar.a(getActivity());
    }
}
