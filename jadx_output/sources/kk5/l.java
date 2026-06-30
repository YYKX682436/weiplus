package kk5;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q f308666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kk5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f308666d = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kk5.l(this.f308666d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        kk5.l lVar = (kk5.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.util.LinkedList) ((com.tencent.mm.storage.k4) c01.d9.b().q()).Q()).size() > 0) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni("3552365301", "openim_acct_type_title", j41.a0.TYPE_WORDING);
            kk5.q qVar = this.f308666d;
            com.tencent.mm.sdk.coroutines.LifecycleScope O6 = qVar.O6();
            if (O6 != null) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new kk5.k(qVar, null), 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
