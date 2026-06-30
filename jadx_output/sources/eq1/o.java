package eq1;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f255844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f255845e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlinx.coroutines.q qVar, kotlinx.coroutines.y0 y0Var) {
        super(1);
        this.f255844d = qVar;
        this.f255845e = y0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (((kotlinx.coroutines.r) this.f255844d).n() && kotlinx.coroutines.z0.h(this.f255845e)) {
            kotlinx.coroutines.q qVar = this.f255844d;
            kotlinx.coroutines.y0 y0Var = this.f255845e;
            synchronized (qVar) {
                try {
                    kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) qVar;
                    if (rVar.n() && kotlinx.coroutines.z0.h(y0Var)) {
                        rVar.resumeWith(value);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("FlutterBizGetPOIHelper", "Callback exception: " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
