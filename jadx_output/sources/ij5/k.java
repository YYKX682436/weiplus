package ij5;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f291778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ij5.t tVar) {
        super(1);
        this.f291778d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            state.A = true;
            ij5.t tVar = this.f291778d;
            java.lang.String str = (java.lang.String) ((jz5.n) tVar.f291801f).getValue();
            kotlin.jvm.internal.o.f(str, "access$getSelectShowHeadDisplay(...)");
            state.B = str;
            java.lang.String str2 = (java.lang.String) ((jz5.n) tVar.f291800e).getValue();
            kotlin.jvm.internal.o.f(str2, "access$getChatroomSessionWord(...)");
            state.C = str2;
            state.f446320p.addAll((java.util.HashSet) ((jz5.n) tVar.f291805m).getValue());
        }
        return jz5.f0.f302826a;
    }
}
