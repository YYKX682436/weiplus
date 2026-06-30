package e71;

@j95.b
/* loaded from: classes4.dex */
public class k extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public e71.i f249881d;

    public static e71.i wi() {
        e71.k kVar;
        e71.k kVar2;
        e71.k kVar3;
        gm0.j1.b().c();
        synchronized (e71.k.class) {
            kVar = (e71.k) i95.n0.c(e71.k.class);
        }
        if (kVar.f249881d == null) {
            synchronized (e71.k.class) {
                kVar3 = (e71.k) i95.n0.c(e71.k.class);
            }
            kVar3.f249881d = new e71.i(gm0.j1.u().f273153f);
        }
        synchronized (e71.k.class) {
            kVar2 = (e71.k) i95.n0.c(e71.k.class);
        }
        return kVar2.f249881d;
    }
}
