package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class b70 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f117848f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.u70 u70Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117847e = str;
        this.f117848f = u70Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.b70(this.f117847e, this.f117848f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.b70) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117846d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f117846d = 1;
            obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new zl2.j(this.f117847e, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).bk(ml2.x3.f328230p);
            com.tencent.mm.plugin.finder.live.widget.u70 u70Var = this.f117848f;
            com.tencent.mm.ui.MMActivity N6 = u70Var.N6();
            if (N6 != null) {
                java.lang.String str2 = this.f117847e;
                zl2.k kVar = zl2.k.f473851a;
                boolean e76 = u70Var.e7();
                r45.bo1 bo1Var = r45.bo1.FinderLiveCoverImageEnhanceScene_CreateLive;
                com.tencent.mm.plugin.finder.live.widget.sl slVar = u70Var.f119955n;
                kVar.a(N6, str, 100111, str2, e76, bo1Var, slVar != null && slVar.isShowing());
            }
        }
        return jz5.f0.f302826a;
    }
}
