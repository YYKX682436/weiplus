package f16;

/* loaded from: classes15.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258723e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, java.lang.String str2) {
        super(1);
        this.f258722d = str;
        this.f258723e = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f16.z0 function = (f16.z0) obj;
        kotlin.jvm.internal.o.g(function, "$this$function");
        f16.k kVar = f16.r0.f258769b;
        java.lang.String str = this.f258722d;
        function.a(str, kVar);
        f16.k kVar2 = f16.r0.f258768a;
        function.a(this.f258723e, kVar, kVar, kVar2, kVar2);
        function.b(str, kVar2);
        return jz5.f0.f302826a;
    }
}
