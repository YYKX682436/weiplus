package qf2;

/* loaded from: classes3.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.z3 f362647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(qf2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362647d = z3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.x3(this.f362647d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.x3 x3Var = (qf2.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        qf2.z3 z3Var = this.f362647d;
        if (z3Var.O6() instanceof android.app.Activity) {
            if (z3Var.f362679m == null) {
                z3Var.f362679m = new com.tencent.mm.plugin.finder.live.widget.k8(z3Var.O6(), z3Var);
            }
            com.tencent.mm.plugin.finder.live.widget.k8 k8Var = z3Var.f362679m;
            if (k8Var != null) {
                com.tencent.mm.plugin.finder.live.widget.e0.W(k8Var, null, false, 0, 7, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
