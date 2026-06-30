package g75;

/* loaded from: classes10.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.r f269361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g75.r rVar) {
        super(0);
        this.f269361d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Pipeline_");
        g75.r rVar = this.f269361d;
        sb6.append(rVar.f269394f);
        sb6.append("_Processor");
        return new com.tencent.mm.sdk.coroutines.SequenceLifecycleScope(sb6.toString(), rVar);
    }
}
