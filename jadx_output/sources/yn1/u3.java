package yn1;

/* loaded from: classes11.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(yn1.a4 a4Var, long j17) {
        super(1);
        this.f463873d = a4Var;
        this.f463874e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yn1.a4 a4Var = this.f463873d;
        com.tencent.mars.xlog.Log.w(a4Var.f463606a, "[sendBLEMessageAsync] coroutine cancelled");
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.r(this.f463874e, false);
        }
        return jz5.f0.f302826a;
    }
}
