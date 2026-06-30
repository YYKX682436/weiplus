package yf2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f461817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f461818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(yf2.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f461818e = z0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yf2.y0(this.f461818e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.ze2 ze2Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f461817d;
        yf2.z0 z0Var = this.f461818e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f461817d = 1;
            z0Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            pf5.u uVar = pf5.u.f353936a;
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                r45.ze2 ze2Var2 = (r45.ze2) ((kotlinx.coroutines.flow.h3) ((mm2.g1) z0Var.getStore().business(mm2.g1.class)).f329073n).getValue();
                if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var2 != null ? ze2Var2.getString(3) : null)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var2 != null ? ze2Var2.getString(2) : null)) {
                        if (zl2.r4.f473950a.w1()) {
                            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser begin");
                            jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
                            r45.d64 d64Var = new r45.d64();
                            d64Var.f372174d = ((java.lang.Number) P6.f302833d).floatValue();
                            d64Var.f372175e = ((java.lang.Number) P6.f302834e).floatValue();
                            d64Var.f372179i = 0;
                            d64Var.f372176f = 1;
                            if (!yf2.z0.Z6(z0Var, d64Var, new yf2.x0(z0Var, rVar, d64Var))) {
                                rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
                            }
                        } else {
                            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser poi exist");
                rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLivePostLocationWidget", "#requestLocationLikeByUser no permission");
                rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.l lVar = (jz5.l) obj;
        if (lVar != null && (ze2Var = (r45.ze2) lVar.f302833d) != null) {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) z0Var.getStore().business(mm2.g1.class)).f329073n).k(ze2Var);
            if (com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(3)) && com.tencent.mm.sdk.platformtools.t8.K0(ze2Var.getString(2))) {
                ((kotlinx.coroutines.flow.h3) ((mm2.g1) z0Var.getStore().business(mm2.g1.class)).f329073n).k(null);
            }
        }
        return jz5.f0.f302826a;
    }
}
