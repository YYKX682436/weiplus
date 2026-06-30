package wb5;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb5.i f444449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wb5.i iVar) {
        super(1);
        this.f444449d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            wb5.i iVar = this.f444449d;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = iVar.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new wb5.d(iVar, oVar, null), 1, null);
            }
            com.tencent.mm.sdk.coroutines.LifecycleScope O62 = iVar.O6();
            if (O62 != null) {
                v65.i.b(O62, null, new wb5.g(iVar, oVar, state, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
