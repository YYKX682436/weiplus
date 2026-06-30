package yn1;

/* loaded from: classes11.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(yn1.a4 a4Var, long j17) {
        super(1);
        this.f463907d = a4Var;
        this.f463908e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yn1.a4 a4Var = this.f463907d;
        com.tencent.mars.xlog.Log.w(a4Var.f463606a, "[startBLEAdvertisingAsync] coroutine cancelled");
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.k(this.f463908e, false, "");
        }
        return jz5.f0.f302826a;
    }
}
