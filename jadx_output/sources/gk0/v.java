package gk0;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk0.w f272457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gk0.w wVar) {
        super(1);
        this.f272457d = wVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        gk0.w wVar = this.f272457d;
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof gk0.s)) {
            gk0.u uVar = new gk0.u((gk0.s) dVar, state, wVar);
            if (state.e("Common_MakeSureUIThread", false)) {
                com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(uVar);
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(uVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
