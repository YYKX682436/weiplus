package i06;

/* loaded from: classes15.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f286776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(i06.f1 f1Var) {
        super(0);
        this.f286776d = f1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        y16.s z17 = this.f286776d.a().z();
        kotlin.jvm.internal.o.f(z17, "getUnsubstitutedInnerClassesScope(...)");
        java.util.Collection a17 = y16.v.a(z17, null, null, 3, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : a17) {
            if (!r16.i.n((o06.m) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o06.m mVar = (o06.m) it.next();
            o06.g gVar = mVar instanceof o06.g ? (o06.g) mVar : null;
            java.lang.Class k17 = gVar != null ? i06.o4.k(gVar) : null;
            i06.k1 k1Var = k17 != null ? new i06.k1(k17) : null;
            if (k1Var != null) {
                arrayList2.add(k1Var);
            }
        }
        return arrayList2;
    }
}
