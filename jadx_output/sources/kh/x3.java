package kh;

/* loaded from: classes10.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f307944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f307945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kh.y3 f307946f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(java.lang.Object[] objArr, java.lang.reflect.Method method, kh.y3 y3Var) {
        super(0);
        this.f307944d = objArr;
        this.f307945e = method;
        this.f307946f = y3Var;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        kh.y3 y3Var = this.f307946f;
        java.lang.reflect.Method method = this.f307945e;
        java.lang.Object[] objArr = this.f307944d;
        return objArr == null ? method.invoke(y3Var.f307956b, new java.lang.Object[0]) : method.invoke(y3Var.f307956b, java.util.Arrays.copyOf(objArr, objArr.length));
    }
}
