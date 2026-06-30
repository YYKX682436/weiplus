package d85;

/* loaded from: classes12.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f227212g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object[] objArr) {
        super(1);
        this.f227209d = str;
        this.f227210e = str2;
        this.f227211f = obj;
        this.f227212g = objArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            d85.o oVar = d85.o.f227226a;
            java.lang.String innerClassName = this.f227209d;
            kotlin.jvm.internal.o.f(innerClassName, "$innerClassName");
            java.lang.String methodName = this.f227210e;
            kotlin.jvm.internal.o.f(methodName, "$methodName");
            java.lang.Object obj2 = this.f227211f;
            java.lang.Object[] args = this.f227212g;
            kotlin.jvm.internal.o.f(args, "$args");
            oVar.a(innerClassName, methodName, obj2, args, java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
