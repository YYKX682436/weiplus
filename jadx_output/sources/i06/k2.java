package i06;

/* loaded from: classes15.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.n2 f286682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(i06.n2 n2Var) {
        super(0);
        this.f286682d = n2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h16.c cVar;
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        t06.g a17 = i06.n2.a(this.f286682d);
        if (a17 == null || (cVar = a17.f414537b) == null || (strArr = cVar.f278231c) == null || (strArr2 = cVar.f278233e) == null) {
            return null;
        }
        jz5.l h17 = m16.j.h(strArr, strArr2);
        return new jz5.o((m16.h) h17.f302833d, (i16.o0) h17.f302834e, cVar.f278230b);
    }
}
