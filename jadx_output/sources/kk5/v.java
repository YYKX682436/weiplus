package kk5;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.w f308692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kk5.w wVar) {
        super(1);
        this.f308692d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.o)) {
            wi5.o oVar = (wi5.o) dVar;
            kk5.w wVar = this.f308692d;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = wVar.O6();
            if (O6 != null) {
                v65.i.b(O6, null, new kk5.u(wVar, oVar, null), 1, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
