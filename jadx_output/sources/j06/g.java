package j06;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f297060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f297061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.Class cls, java.util.Map map) {
        super(0);
        this.f297060d = cls;
        this.f297061e = map;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append('@');
        sb6.append(this.f297060d.getCanonicalName());
        kz5.n0.f0(this.f297061e.entrySet(), sb6, ", ", "(", ")", 0, null, j06.f.f297059d, 48, null);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
