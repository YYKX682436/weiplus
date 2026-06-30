package yn1;

/* loaded from: classes9.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f463841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f463842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f463843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i17, yn1.r2 r2Var, long j17) {
        super(1);
        this.f463841d = i17;
        this.f463842e = r2Var;
        this.f463843f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (this.f463841d == 7817) {
            yn1.z0.f463944l = "";
        }
        com.tencent.wechat.aff.migration.g gVar = this.f463842e.f463810a;
        if (gVar != null) {
            gVar.K0(this.f463843f, 3, -1, "Coroutine Scope cancelled", new byte[0], 2);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("callback");
        throw null;
    }
}
