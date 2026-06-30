package g75;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.r f269390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g75.r rVar) {
        super(0);
        this.f269390d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Pipeline_");
        g75.r rVar = this.f269390d;
        sb6.append(rVar.f269394f);
        sb6.append("_Main");
        return new com.tencent.mm.sdk.coroutines.SequenceLifecycleScope(sb6.toString(), rVar);
    }
}
