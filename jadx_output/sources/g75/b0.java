package g75;

/* loaded from: classes11.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f0 f269350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(g75.f0 f0Var) {
        super(1);
        this.f269350d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof g75.w)) {
            g75.f0 f0Var = this.f269350d;
            if (f0Var.f269365c == null) {
                java.lang.Class b17 = d75.b.b(f0Var.getClass(), 0);
                kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type java.lang.Class<InAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent>");
                f0Var.f269365c = b17;
            }
            if (f0Var.f269366d == null) {
                java.lang.Class b18 = d75.b.b(f0Var.getClass(), 1);
                kotlin.jvm.internal.o.e(b18, "null cannot be cast to non-null type java.lang.Class<OutAction of com.tencent.mm.sdk.pipeline.ProcessorPipelineComponent>");
                f0Var.f269366d = b18;
            }
        }
        return jz5.f0.f302826a;
    }
}
