package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class h5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117129e = r5Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.viewmodel.h5(this.f117129e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.h5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f117128d;
        pk2.i2 i2Var = pk2.l2.f355938m;
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117129e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.content.Context O6 = r5Var.O6();
            java.lang.String e17 = xy2.c.e(r5Var.O6());
            this.f117128d = 1;
            obj = i2Var.b(O6, "LivePost", e17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.v71 v71Var = (r45.v71) obj;
        com.tencent.mm.ui.MMActivity N6 = r5Var.N6();
        if (N6 != null) {
            i2Var.e(N6, v71Var != null ? (r45.j32) v71Var.getCustom(4) : null, ((mm2.c1) r5Var.business(mm2.c1.class)).f328877r6, false);
        }
        return jz5.f0.f302826a;
    }
}
