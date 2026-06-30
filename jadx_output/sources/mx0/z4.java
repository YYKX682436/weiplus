package mx0;

/* loaded from: classes5.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332468e = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.z4(this.f332468e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.z4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332467d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332468e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
            this.f332467d = 1;
            b8Var.getClass();
            ((yy0.k8) ((pp0.q0) i95.n0.c(pp0.q0.class))).getClass();
            az0.i5 i5Var = az0.i5.f15557a;
            az0.i5.f15573q = null;
            b8Var.h0(true);
            java.lang.Object C = ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(b8Var.M, null, null, new yx0.v7(b8Var, null), 3, null)).C(this);
            if (C != aVar) {
                C = f0Var;
            }
            if (C == aVar) {
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
        us2.u.f430548a.d();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        mx0.y4 y4Var = new mx0.y4(shootComposingPluginLayout, null);
        this.f332467d = 2;
        return kotlinx.coroutines.l.g(g3Var, y4Var, this) == aVar ? aVar : f0Var;
    }
}
