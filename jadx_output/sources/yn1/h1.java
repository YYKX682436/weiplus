package yn1;

/* loaded from: classes9.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463687e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463686d = r2Var;
        this.f463687e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar = this.f463686d.f463810a;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        gVar.a1(this.f463687e, new byte[0]);
        return jz5.f0.f302826a;
    }
}
