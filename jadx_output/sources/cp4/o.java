package cp4;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f221052d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cp4.r rVar) {
        super(2);
        this.f221052d = rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList result = (java.util.ArrayList) obj2;
        kotlin.jvm.internal.o.g(result, "result");
        cp4.r rVar = this.f221052d;
        rVar.f221059g.setShow(false);
        java.util.List list = rVar.f221068s;
        ((java.util.ArrayList) list.get(intValue)).clear();
        ((java.util.ArrayList) list.get(intValue)).addAll(result);
        rVar.G(intValue);
        ju3.d0.k(rVar.f465332d, ju3.c0.f301913x1, null, 2, null);
        return jz5.f0.f302826a;
    }
}
