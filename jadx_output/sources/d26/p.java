package d26;

/* loaded from: classes16.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(d26.x xVar) {
        super(0);
        this.f226035d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d26.x xVar = this.f226035d;
        i16.o oVar = xVar.f226053h;
        if ((oVar.f287641f & 4) == 4) {
            o06.j e17 = xVar.u0().e(b26.t0.b(xVar.f226060r.f17516b, oVar.f287644i), w06.d.f441952m);
            if (e17 instanceof o06.g) {
                return (o06.g) e17;
            }
        }
        return null;
    }
}
