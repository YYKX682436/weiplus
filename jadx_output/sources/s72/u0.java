package s72;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jm0.o f404159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(jm0.o oVar) {
        super(0);
        this.f404159d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("PinOnTopService", this.f404159d, 0, 4, null);
    }
}
