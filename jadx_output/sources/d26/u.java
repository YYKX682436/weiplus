package d26;

/* loaded from: classes16.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d26.x f226050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(d26.x xVar) {
        super(0);
        this.f226050d = xVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        d26.x xVar = this.f226050d;
        if (xVar.f226059q.h()) {
            r16.g gVar = new r16.g(xVar, o06.x1.f342004a, false);
            gVar.C0(xVar.k());
            return gVar;
        }
        java.util.List list = xVar.f226053h.f287654v;
        kotlin.jvm.internal.o.f(list, "getConstructorList(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!k16.f.f303446n.c(((i16.r) obj).f287705g).booleanValue()) {
                break;
            }
        }
        i16.r rVar = (i16.r) obj;
        if (rVar != null) {
            return xVar.f226060r.f17523i.d(rVar, true);
        }
        return null;
    }
}
