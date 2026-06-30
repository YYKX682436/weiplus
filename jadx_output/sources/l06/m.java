package l06;

/* loaded from: classes15.dex */
public class m implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l06.o f314885d;

    public m(l06.o oVar) {
        this.f314885d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.g gVar = (n16.g) obj;
        r06.x0 l17 = this.f314885d.l();
        n16.c cVar = l06.x.f314956k;
        y16.s sVar = ((r06.o0) l17.Q(cVar)).f368499m;
        if (sVar == null) {
            l06.o.a(11);
            throw null;
        }
        o06.j e17 = ((y16.a) sVar).e(gVar, w06.d.f441946d);
        if (e17 == null) {
            throw new java.lang.AssertionError("Built-in class " + cVar.c(gVar) + " is not found");
        }
        if (e17 instanceof o06.g) {
            return (o06.g) e17;
        }
        throw new java.lang.AssertionError("Must be a class descriptor " + gVar + ", but was " + e17);
    }
}
