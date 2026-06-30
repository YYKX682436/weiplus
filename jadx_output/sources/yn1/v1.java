package yn1;

/* loaded from: classes9.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463879d = r2Var;
        this.f463880e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar = this.f463879d.f463810a;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        gVar.d1(this.f463880e, new java.util.ArrayList());
        return jz5.f0.f302826a;
    }
}
