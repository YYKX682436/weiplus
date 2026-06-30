package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class vb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f136237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.nc0 f136238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136238e = nc0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.vb0(this.f136238e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.vb0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j jVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136237d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ed0.a1 a1Var = (ed0.a1) i95.n0.c(ed0.a1.class);
            com.tencent.mm.plugin.finder.viewmodel.component.nc0 nc0Var = this.f136238e;
            androidx.appcompat.app.AppCompatActivity activity = nc0Var.getActivity();
            ((dd0.m0) a1Var).getClass();
            kotlin.jvm.internal.o.g(activity, "activity");
            java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ox3.l lVar = ((com.tencent.mm.plugin.ringtone.uic.g) ((ed0.q0) a17)).f158407d;
            if (lVar != null && (jVar = lVar.f349765e) != null) {
                com.tencent.mm.plugin.finder.viewmodel.component.ub0 ub0Var = new com.tencent.mm.plugin.finder.viewmodel.component.ub0(nc0Var);
                this.f136237d = 1;
                if (kotlinx.coroutines.flow.q2.l((kotlinx.coroutines.flow.q2) jVar, ub0Var, this) == aVar) {
                    return aVar;
                }
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
