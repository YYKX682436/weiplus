package zn1;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r26.t f474422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(r26.t tVar) {
        super(1);
        this.f474422d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return java.lang.Boolean.valueOf(this.f474422d.a(lowerCase));
    }
}
