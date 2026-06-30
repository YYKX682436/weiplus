package eg3;

/* loaded from: classes3.dex */
public final class f implements eg3.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eg3.g f252659a;

    public f(eg3.g gVar) {
        this.f252659a = gVar;
    }

    public void a(java.lang.String path) {
        rf3.u uVar;
        mf3.s sVar;
        mf3.k kVar;
        kotlin.jvm.internal.o.g(path, "path");
        eg3.g gVar = this.f252659a;
        gVar.S();
        rf3.q qVar = (rf3.q) gVar.f252660o.a(rf3.q.class);
        if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f326110m) != null && (kVar = sVar.f326117a) != null) {
            uVar.Q("applyTranslateResult, path: ".concat(path), new java.lang.Object[0]);
            sf3.f fVar = (sf3.f) uVar.H(sf3.f.class);
            if (fVar != null) {
                fVar.I2(kVar, path, uVar);
            }
        }
        rf3.h hVar = (rf3.h) gVar.f252660o.a(rf3.h.class);
        if (hVar != null) {
            hVar.h();
        }
    }
}
