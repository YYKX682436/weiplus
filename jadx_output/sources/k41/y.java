package k41;

/* loaded from: classes11.dex */
public final class y implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f304056b;

    public y(java.lang.String str, c01.o8 o8Var) {
        this.f304055a = str;
        this.f304056b = o8Var;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f304055a;
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf((i0Var != null ? i0Var.f297643d : null) != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKFGetContactInterceptor", "getContact username: %s, success: %s", objArr);
        c01.o8 o8Var = this.f304056b;
        if (o8Var != null) {
            o8Var.a(str, (i0Var != null ? i0Var.f297643d : null) != null);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
    }
}
