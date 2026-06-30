package cr0;

/* loaded from: classes12.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr0.u0 f221691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.battery.AccBinderCallsStats f221692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(cr0.u0 u0Var, com.tencent.mm.matrix.battery.AccBinderCallsStats accBinderCallsStats) {
        super(0);
        this.f221691d = u0Var;
        this.f221692e = accBinderCallsStats;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f221691d.c().merge(this.f221692e);
        return jz5.f0.f302826a;
    }
}
