package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class jc0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f134854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f134855e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc0(java.util.LinkedList linkedList, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134854d = linkedList;
        this.f134855e = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.jc0(this.f134854d, this.f134855e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.jc0 jc0Var = (com.tencent.mm.plugin.finder.viewmodel.component.jc0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jc0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (in5.x0 x0Var : this.f134854d) {
            in5.c cVar = x0Var.f293158a;
            ox3.f fVar = cVar instanceof ox3.f ? (ox3.f) cVar : null;
            dd0.m0 m0Var = (dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class));
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f134855e;
            ed0.z0 Di = m0Var.Di(appCompatActivity);
            int i17 = x0Var.f293160c;
            in5.c cVar2 = x0Var.f293158a;
            ed0.z0.i1(Di, 1L, i17, cVar2 instanceof ox3.f ? (ox3.f) cVar2 : null, 0L, 8, null);
            if ((fVar != null ? ((ox3.g) fVar).f349749d.f415622n : null) != null) {
                ed0.z0.i1(((dd0.m0) ((ed0.a1) i95.n0.c(ed0.a1.class))).Di(appCompatActivity), 11L, x0Var.f293160c, cVar2 instanceof ox3.f ? (ox3.f) cVar2 : null, 0L, 8, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
