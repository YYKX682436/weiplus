package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158444e = v0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.l0(this.f158444e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.f3 f3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158443d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158444e;
            androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            qx3.o oVar = ((com.tencent.mm.plugin.ringtone.uic.z1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).f158560d;
            if (oVar == null || (f3Var = oVar.f367376f) == null) {
                return jz5.f0.f302826a;
            }
            com.tencent.mm.plugin.ringtone.uic.k0 k0Var = new com.tencent.mm.plugin.ringtone.uic.k0(v0Var);
            this.f158443d = 1;
            if (((kotlinx.coroutines.flow.h3) f3Var).a(k0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new jz5.d();
    }
}
