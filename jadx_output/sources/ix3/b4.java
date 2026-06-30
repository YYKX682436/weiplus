package ix3;

/* loaded from: classes.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.c4 f295369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(ix3.c4 c4Var) {
        super(1);
        this.f295369d = c4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        hx3.b state = (hx3.b) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof hx3.e)) {
            hx3.e eVar = (hx3.e) dVar;
            ix3.c4 c4Var = this.f295369d;
            kotlinx.coroutines.r2 r2Var = c4Var.f295379d;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = c4Var.O6();
            c4Var.f295379d = O6 != null ? v65.i.b(O6, null, new ix3.a4(eVar, c4Var, null), 1, null) : null;
        }
        return jz5.f0.f302826a;
    }
}
