package eh;

/* loaded from: classes7.dex */
public final class c extends d8.l {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eh.d f252867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d8.i iVar, e8.a aVar, eh.d dVar) {
        super(iVar, aVar);
        this.f252867g = dVar;
    }

    @Override // d8.l
    public f8.d a(java.io.InputStream ins) {
        kotlin.jvm.internal.o.g(ins, "ins");
        f8.d a17 = super.a(ins);
        f8.c cVar = a17.f260072a;
        f8.c cVar2 = f8.c.UNKNOWN;
        if (cVar == cVar2) {
            eh.d dVar = this.f252867g;
            g8.g.f269409a.w(dVar.f252868g, "hy: unknown type. judge svg", new java.lang.Object[0]);
            try {
                s7.t2 g17 = new s7.r3().g(ins, true);
                if (g17 != null) {
                    a17.f260072a = f8.c.CUSTOM;
                    this.f226906a = com.github.henryye.nativeiv.bitmap.BitmapType.Legacy;
                    b(new eh.b(g17, this));
                }
            } catch (s7.g3 e17) {
                g8.g.c(dVar.f252868g, e17, "hy: not svg image. return as failed", new java.lang.Object[0]);
                a17.f260072a = cVar2;
            }
        }
        return a17;
    }
}
