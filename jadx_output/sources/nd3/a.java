package nd3;

/* loaded from: classes.dex */
public final class a implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nd3.b f336472d;

    public a(nd3.b bVar) {
        this.f336472d = bVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        nd3.b bVar = this.f336472d;
        if (intValue == 0) {
            bVar.s().invoke(bVar.k());
        } else {
            bVar.s().invoke(bVar.h(2, errMsg));
        }
        return jz5.f0.f302826a;
    }
}
