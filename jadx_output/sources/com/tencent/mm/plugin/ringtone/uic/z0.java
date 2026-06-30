package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.d1 f158559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.ringtone.uic.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158559e = d1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.z0(this.f158559e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j jVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158558d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.ringtone.uic.d1 d1Var = this.f158559e;
            androidx.appcompat.app.AppCompatActivity activity = d1Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ox3.l lVar = ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).f158407d;
            if (lVar != null && (jVar = lVar.f349765e) != null) {
                com.tencent.mm.plugin.ringtone.uic.y0 y0Var = new com.tencent.mm.plugin.ringtone.uic.y0(d1Var);
                this.f158558d = 1;
                if (kotlinx.coroutines.flow.q2.l((kotlinx.coroutines.flow.q2) jVar, y0Var, this) == aVar) {
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
