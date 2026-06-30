package ls1;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f321019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ls1.e0 e0Var) {
        super(1);
        this.f321019d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        ls1.e0 e0Var = this.f321019d;
        com.tencent.mars.xlog.Log.i(e0Var.B1(), "onPageAuthOK, jsContent evaluateJavascript cb, ret = " + value + ", view " + e0Var.f181916a.getRandomStr());
        return jz5.f0.f302826a;
    }
}
