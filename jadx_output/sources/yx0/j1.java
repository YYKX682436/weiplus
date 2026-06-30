package yx0;

/* loaded from: classes5.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467391e = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.j1(this.f467391e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467390d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if ((this.f467391e.S instanceof rx0.f) && (lVar = this.f467391e.f467190q) != null) {
                rx0.h hVar = this.f467391e.S;
                kotlin.jvm.internal.o.e(hVar, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.model.SelectedTemplate.Normal");
                lVar.invoke(((rx0.f) hVar).f400916a);
            }
            kotlinx.coroutines.r2 r2Var = this.f467391e.f467194u;
            if (r2Var == null) {
                return null;
            }
            yx0.b8 b8Var = this.f467391e;
            this.f467390d = 1;
            if (yx0.b8.a(b8Var, r2Var, "SwitchingTemplateJob doReleaseCore", this) == aVar) {
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
