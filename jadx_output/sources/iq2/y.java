package iq2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f293787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f293788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f293789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(iq2.d0 d0Var, long j17, boolean z17) {
        super(1);
        this.f293787d = d0Var;
        this.f293788e = j17;
        this.f293789f = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f293787d.K = false;
        rq2.o.f398847a.e(4, java.lang.System.currentTimeMillis() - this.f293788e, this.f293789f);
        return jz5.f0.f302826a;
    }
}
