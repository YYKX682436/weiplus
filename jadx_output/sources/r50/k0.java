package r50;

/* loaded from: classes9.dex */
public final class k0 extends o50.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new ld5.a();
    }

    @Override // o50.j
    public android.view.View U6(co.a aVar) {
        ld5.a model = (ld5.a) aVar;
        kotlin.jvm.internal.o.g(model, "model");
        ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
        xd5.a aVar2 = new xd5.a();
        aVar2.fromXml(model.toXml());
        io.v vVar = new io.v();
        xd5.a aVar3 = vVar.f293436c;
        vVar.f293436c = aVar2;
        vVar.c(aVar3, aVar2);
        return vVar.a(getActivity());
    }
}
