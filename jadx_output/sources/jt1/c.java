package jt1;

/* loaded from: classes12.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jt1.e f301614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jt1.e eVar) {
        super(1);
        this.f301614d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof qx.k0)) {
            jt1.e eVar = this.f301614d;
            v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) eVar.f301616b).getValue(), null, new jt1.b(eVar, (qx.k0) dVar, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
