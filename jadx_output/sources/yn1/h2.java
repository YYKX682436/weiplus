package yn1;

/* loaded from: classes11.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final yn1.h2 f463688d = new yn1.h2();

    public h2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationPlatformImpl", "notify network changed. reason=".concat(reason));
        kotlinx.coroutines.flow.i2 i2Var = yn1.r2.f463809f;
        ((kotlinx.coroutines.flow.q2) yn1.r2.f463809f).e(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
