package r50;

/* loaded from: classes9.dex */
public final class p0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new jd5.c();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        jd5.c model = (jd5.c) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        io.z zVar = new io.z();
        jd5.c cVar = zVar.f293444b;
        zVar.f293444b = model;
        zVar.c(cVar, model);
        return zVar.a(getActivity());
    }
}
