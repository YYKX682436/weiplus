package jm0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm0.o f300283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jm0.r f300284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jm0.o oVar, jm0.r rVar) {
        super(0);
        this.f300283d = oVar;
        this.f300284e = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope(this.f300283d.getClass().getSimpleName() + "_scope_" + this.f300284e.hashCode(), this.f300283d, 0, 4, null);
    }
}
