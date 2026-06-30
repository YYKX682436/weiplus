package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v6 f113061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113061e = v6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.j6(this.f113061e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.j6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113060d;
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = this.f113061e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.D;
            com.tencent.mm.view.MMPAGView mMPAGView = v6Var.f114670s;
            kotlin.jvm.internal.o.f(mMPAGView, "access$getLikeIconPag$p(...)");
            this.f113060d = 1;
            if (sVar.d(hVar, mMPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        v6Var.f114670s.setProgress(0.0d);
        v6Var.f114670s.d();
        v6Var.f114670s.setRepeatCount(0);
        if (v6Var.f114670s.getVisibility() == 0) {
            v6Var.f114670s.g();
        }
        return jz5.f0.f302826a;
    }
}
