package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.d2 f158350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.ringtone.uic.d2 d2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158350e = d2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.b2(this.f158350e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158349d;
        com.tencent.mm.plugin.ringtone.uic.d2 d2Var = this.f158350e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rx3.u P6 = d2Var.P6();
            androidx.appcompat.app.AppCompatActivity activity = d2Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            int i18 = ((com.tencent.mm.plugin.ringtone.uic.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class)).f158501g;
            this.f158349d = 1;
            obj = rx3.i.b(P6, i18, false, false, this, 6, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        rx3.j jVar = (rx3.j) obj;
        boolean z17 = jVar.f401035c;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            androidx.appcompat.app.AppCompatActivity activity2 = d2Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.g.class)).O6();
            return f0Var;
        }
        androidx.appcompat.app.AppCompatActivity activity3 = d2Var.getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.ringtone.uic.g) zVar.a(activity3).a(com.tencent.mm.plugin.ringtone.uic.g.class)).P6(jVar.f401033a);
        if (!jVar.f401034b) {
            androidx.appcompat.app.AppCompatActivity activity4 = d2Var.getActivity();
            kotlin.jvm.internal.o.g(activity4, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.g) zVar.a(activity4).a(com.tencent.mm.plugin.ringtone.uic.g.class)).O6();
        }
        return f0Var;
    }
}
