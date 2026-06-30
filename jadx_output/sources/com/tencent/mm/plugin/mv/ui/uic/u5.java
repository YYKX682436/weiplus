package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.z5 f151478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.l f151479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(com.tencent.mm.plugin.mv.ui.uic.z5 z5Var, fm3.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151478e = z5Var;
        this.f151479f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.u5(this.f151478e, this.f151479f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.u5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f151477d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.mv.ui.uic.t5 t5Var = new com.tencent.mm.plugin.mv.ui.uic.t5(this.f151479f, null);
            this.f151477d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, t5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dk4.a aVar2 = (dk4.a) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar2 == null) {
            return f0Var;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        rw2.k kVar = new rw2.k(aVar2);
        kVar.f311071a = 80;
        kVar.f311072b = 120;
        com.tencent.mm.plugin.mv.ui.uic.z5 z5Var = this.f151478e;
        kVar.f311076f = (z5Var.f151583v * ((float) z5Var.f151581t)) / (((z5Var.C * 1.0f) / 120) * 80);
        kVar.f();
        com.tencent.mm.plugin.mv.ui.uic.x4 P6 = z5Var.P6();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        P6.f151527e = new rw2.a();
        com.tencent.mm.plugin.mv.ui.uic.x4 P62 = z5Var.P6();
        java.util.List c17 = kz5.b0.c(kVar);
        P62.getClass();
        java.util.ArrayList arrayList = P62.f151526d;
        arrayList.clear();
        arrayList.addAll(c17);
        P62.notifyDataSetChanged();
        return f0Var;
    }
}
