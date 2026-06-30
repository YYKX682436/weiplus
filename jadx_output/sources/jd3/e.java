package jd3;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jd3.g f299177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jd3.g gVar) {
        super(2);
        this.f299177d = gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        jd3.g gVar = this.f299177d;
        if (intValue == 0) {
            gVar.s().invoke(gVar.k());
        } else {
            gVar.s().invoke(gVar.h(intValue, errMsg));
        }
        return jz5.f0.f302826a;
    }
}
