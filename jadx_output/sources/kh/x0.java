package kh;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f307939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f307940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.reflect.Method method, java.lang.Object[] objArr) {
        super(0);
        this.f307939d = method;
        this.f307940e = objArr;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#");
        sb6.append(this.f307939d.getName());
        sb6.append(": ");
        java.lang.String arrays = java.util.Arrays.toString(this.f307940e);
        kotlin.jvm.internal.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        return sb6.toString();
    }
}
