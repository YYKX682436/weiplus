package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class jx extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f134902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x91.h f134903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar, x91.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134902e = sxVar;
        this.f134903f = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.jx(this.f134902e, this.f134903f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.jx) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f134901d;
        boolean z17 = true;
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f134902e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var2 = sxVar.A;
            if ((r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) && (r2Var = sxVar.A) != null) {
                this.f134901d = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String U6 = sxVar.U6(sxVar.f135943y);
        if (U6 != null && U6.length() != 0) {
            z17 = false;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", "videoUrl is nullOrNil!!, return");
            db5.t7.makeText(sxVar.getContext(), com.tencent.mm.R.string.d8b, 0).show();
            return f0Var;
        }
        x91.h hVar = this.f134903f;
        sxVar.f135941w = hVar;
        sxVar.f135942x = sxVar.f135943y;
        if (hVar != null) {
            hVar.e(new com.tencent.mm.plugin.finder.viewmodel.component.bx(sxVar, U6));
        }
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "selectDevice: " + sxVar.f135941w);
        sxVar.B = null;
        return f0Var;
    }
}
