package n06;

/* loaded from: classes15.dex */
public class q implements o26.d {

    /* renamed from: a, reason: collision with root package name */
    public final n06.b0 f334001a;

    public q(n06.b0 b0Var) {
        this.f334001a = b0Var;
    }

    @Override // o26.d
    public java.lang.Iterable a(java.lang.Object obj) {
        n06.b0 this$0 = this.f334001a;
        kotlin.jvm.internal.o.g(this$0, "this$0");
        java.util.Collection a17 = ((o06.g) obj).g().a();
        kotlin.jvm.internal.o.f(a17, "getSupertypes(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            o06.j i17 = ((f26.o0) it.next()).w0().i();
            b16.r rVar = null;
            o06.j a18 = i17 != null ? i17.a() : null;
            o06.g gVar = a18 instanceof o06.g ? (o06.g) a18 : null;
            if (gVar != null && (rVar = this$0.f(gVar)) == null) {
                rVar = gVar;
            }
            if (rVar != null) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }
}
