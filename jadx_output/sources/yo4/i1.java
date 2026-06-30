package yo4;

/* loaded from: classes10.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f464236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464237e = multiVideoPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.i1(this.f464237e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.i1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f464236d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464237e;
            multiVideoPluginLayout.G.b();
            com.tencent.mm.plugin.vlog.model.v0.d();
            multiVideoPluginLayout.f175879v.F();
            multiVideoPluginLayout.f175873p1.getClass();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yo4.h1 h1Var = new yo4.h1(multiVideoPluginLayout, null);
            this.f464236d = 1;
            if (kotlinx.coroutines.l.g(g3Var, h1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
