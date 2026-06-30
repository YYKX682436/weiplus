package vp4;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f439076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vp4.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439076d = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp4.u(this.f439076d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vp4.b0 b0Var = this.f439076d;
        yz5.p pVar = b0Var.f439010j;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (pVar == null && (context = b0Var.f439006f) != null) {
            ru3.f fVar = b0Var.f439007g;
            if (fVar != null) {
                kotlin.jvm.internal.o.d(context);
                fVar.b(context, false, com.tencent.mm.R.string.i1q, vp4.t.f439075d);
                return f0Var;
            }
        } else if (pVar != null) {
            pVar.invoke(new java.lang.Integer(0), b0Var.f439011k);
            return f0Var;
        }
        return null;
    }
}
