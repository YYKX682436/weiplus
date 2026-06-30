package mx0;

/* loaded from: classes5.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332068e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.j4(this.f332068e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.j4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332067d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332068e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = shootComposingPluginLayout.f69551p1;
            if (r2Var != null && r2Var.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", "cancel record job");
                kotlinx.coroutines.r2 r2Var2 = shootComposingPluginLayout.f69551p1;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
            }
            shootComposingPluginLayout.f69551p1 = null;
            bs0.j jVar = shootComposingPluginLayout.f69552q;
            if (jVar != null) {
                jVar.setLightTorch(false);
            }
            yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
            this.f332067d = 1;
            if (b8Var.r0(true, false, false, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.i4 i4Var = new mx0.i4(shootComposingPluginLayout, null);
        this.f332067d = 2;
        if (kotlinx.coroutines.l.g(g3Var, i4Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
