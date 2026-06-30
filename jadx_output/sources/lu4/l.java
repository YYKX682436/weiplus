package lu4;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.m f321439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(lu4.m mVar, java.lang.String str) {
        super(3);
        this.f321439d = mVar;
        this.f321440e = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        lu4.c cVar = (lu4.c) this.f321439d.f321430b;
        java.lang.String str = this.f321440e;
        cl0.g gVar = new cl0.g();
        gVar.h("err_code", (java.lang.Integer) obj2);
        gVar.h("err_msg", "fail");
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        lu4.c.u(cVar, str, gVar2, null, 4, null);
        return jz5.f0.f302826a;
    }
}
