package ee5;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.h0 f251884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ee5.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251884e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.g0(this.f251884e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251883d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f251883d = 1;
            if (kotlinx.coroutines.k1.b(300L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ee5.h0 h0Var = this.f251884e;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = h0Var.E;
        if (u3Var != null && u3Var.isShowing()) {
            return f0Var;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        ee5.f0 f0Var2 = new ee5.f0(h0Var, null);
        this.f251883d = 2;
        return kotlinx.coroutines.l.g(g3Var, f0Var2, this) == aVar ? aVar : f0Var;
    }
}
