package ls1;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f320963d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ls1.e0 e0Var) {
        super(1);
        this.f320963d = e0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String value = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(value, "value");
        ls1.e0 e0Var = this.f320963d;
        com.tencent.mars.xlog.Log.i(e0Var.B1(), "onPageAuthFail, jsContent evaluateJavascript cb, ret = " + value + ", view " + e0Var.f181916a.getRandomStr());
        return jz5.f0.f302826a;
    }
}
