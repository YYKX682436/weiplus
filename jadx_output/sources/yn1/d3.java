package yn1;

/* loaded from: classes11.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(yn1.a4 a4Var, long j17) {
        super(1);
        this.f463640d = a4Var;
        this.f463641e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yn1.a4 a4Var = this.f463640d;
        com.tencent.mars.xlog.Log.i(a4Var.f463606a, "[filterRestoreMediaAsync] Task is cancelled, taskId=" + this.f463641e);
        com.tencent.wechat.aff.migration.a aVar = a4Var.f463609d;
        if (aVar != null) {
            aVar.m(this.f463641e, 0L, new java.util.ArrayList());
        }
        return jz5.f0.f302826a;
    }
}
