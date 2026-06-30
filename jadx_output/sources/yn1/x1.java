package yn1;

/* loaded from: classes9.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463915e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463914d = r2Var;
        this.f463915e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar = this.f463914d.f463810a;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
        gVar.S(this.f463915e, new java.util.ArrayList());
        return jz5.f0.f302826a;
    }
}
