package mm2;

/* loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(java.lang.String str) {
        super(3);
        this.f329361d = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String wordingId = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g((java.lang.String) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(wordingId, "wordingId");
        return java.lang.Boolean.valueOf(intValue == 5 && kotlin.jvm.internal.o.b(wordingId, this.f329361d));
    }
}
