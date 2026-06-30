package d85;

/* loaded from: classes12.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227219f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f227220g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object[] objArr) {
        super(1);
        this.f227217d = str;
        this.f227218e = str2;
        this.f227219f = obj;
        this.f227220g = objArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            d85.o oVar = d85.o.f227226a;
            java.lang.String innerClassName = this.f227217d;
            kotlin.jvm.internal.o.f(innerClassName, "$innerClassName");
            java.lang.String methodName = this.f227218e;
            kotlin.jvm.internal.o.f(methodName, "$methodName");
            java.lang.Object obj2 = this.f227219f;
            java.lang.Object[] args = this.f227220g;
            kotlin.jvm.internal.o.f(args, "$args");
            oVar.b(innerClassName, methodName, obj2, args, java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
