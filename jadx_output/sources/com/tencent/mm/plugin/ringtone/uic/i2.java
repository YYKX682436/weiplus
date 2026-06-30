package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158430e = b3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.i2(this.f158430e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158429d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158430e;
            androidx.appcompat.app.AppCompatActivity activity = b3Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlinx.coroutines.flow.j jVar = ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).f158407d.f349765e;
            com.tencent.mm.plugin.ringtone.uic.h2 h2Var = new com.tencent.mm.plugin.ringtone.uic.h2(b3Var);
            this.f158429d = 1;
            kotlinx.coroutines.flow.q2 q2Var = (kotlinx.coroutines.flow.q2) jVar;
            q2Var.getClass();
            if (kotlinx.coroutines.flow.q2.l(q2Var, h2Var, this) == aVar) {
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
