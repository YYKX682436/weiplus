package ij5;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ij5.t tVar) {
        super(1);
        this.f291786d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            ij5.t tVar = this.f291786d;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = tVar.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new ij5.m(tVar, oVar, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
