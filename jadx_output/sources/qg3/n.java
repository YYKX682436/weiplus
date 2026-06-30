package qg3;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qg3.k f362832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qg3.k kVar) {
        super(2);
        this.f362832d = kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f362832d.P0(intValue, errMsg);
        return jz5.f0.f302826a;
    }
}
