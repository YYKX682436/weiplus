package yn1;

/* loaded from: classes9.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f463639e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(yn1.r2 r2Var, long j17) {
        super(1);
        this.f463638d = r2Var;
        this.f463639e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.aff.migration.g gVar = this.f463638d.f463810a;
        if (gVar != null) {
            gVar.K(this.f463639e, "");
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
