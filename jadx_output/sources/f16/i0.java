package f16;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f258737d = str;
        this.f258738e = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f16.z0 function = (f16.z0) obj;
        kotlin.jvm.internal.o.g(function, "$this$function");
        f16.k kVar = f16.r0.f258769b;
        java.lang.String str = this.f258737d;
        function.a(str, kVar);
        f16.k kVar2 = f16.r0.f258770c;
        function.a(str, kVar2);
        f16.k kVar3 = f16.r0.f258768a;
        function.a(this.f258738e, kVar, kVar2, kVar2, kVar3);
        function.b(str, kVar3);
        return jz5.f0.f302826a;
    }
}
