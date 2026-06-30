package g75;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f0 f269359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g75.f0 f0Var) {
        super(1);
        this.f269359d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null) {
            g75.f0 f0Var = this.f269359d;
            if (kotlin.jvm.internal.o.b(f0Var.f269365c, dVar.getClass())) {
                v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) f0Var.f269364b).getValue(), null, new g75.c0(f0Var, state, dVar, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
