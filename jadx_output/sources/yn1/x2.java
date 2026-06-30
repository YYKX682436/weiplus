package yn1;

/* loaded from: classes11.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(yn1.a4 a4Var, long j17) {
        super(1);
        this.f463916d = a4Var;
        this.f463917e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.wechat.aff.migration.a aVar = this.f463916d.f463609d;
        if (aVar != null) {
            aVar.r1(this.f463917e, booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
