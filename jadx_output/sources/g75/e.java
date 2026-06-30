package g75;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f f269360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g75.f fVar) {
        super(1);
        this.f269360d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        g75.f fVar = this.f269360d;
        if (dVar != null && (dVar instanceof g75.w)) {
            g75.f.k(fVar, ((g75.w) dVar).f269403b, false, 2, null);
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) ((java.util.HashMap) ((jz5.n) fVar.f269363b).getValue()).get(dVar2.getClass().getName());
            if (method != null) {
                java.lang.Object invoke = method.invoke(fVar, state, dVar2);
                kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type com.tencent.mm.sdk.statecenter.BaseStateAction");
                g75.f.k(fVar, (j75.b) invoke, false, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
