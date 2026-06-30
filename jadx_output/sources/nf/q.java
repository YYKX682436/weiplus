package nf;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf.r f336599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(nf.r rVar) {
        super(0);
        this.f336599d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf.r rVar = this.f336599d;
        java.lang.String str = rVar.f336600a;
        if (str == null) {
            java.lang.Object obj = rVar.f336603d;
            if (obj == null) {
                kotlin.jvm.internal.o.o("thisRef");
                throw null;
            }
            str = obj.getClass().getCanonicalName();
            kotlin.jvm.internal.o.d(str);
        }
        return com.tencent.mm.sdk.platformtools.o4.N(str, 2, null);
    }
}
