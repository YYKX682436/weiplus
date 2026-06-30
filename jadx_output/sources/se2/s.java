package se2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f406881d;

    /* renamed from: e, reason: collision with root package name */
    public int f406882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f406883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f406884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406883f = z17;
        this.f406884g = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new se2.s(this.f406883f, this.f406884g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((se2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f406882e;
        boolean z17 = this.f406883f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (z17) {
                if (se2.w.f406897c == null) {
                    vl2.s sVar = vl2.s.f437868a;
                    vl2.h hVar = vl2.h.F;
                    this.f406882e = 1;
                    obj = sVar.f(hVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    se2.w.f406897c = (com.tencent.mm.rfx.RfxPagFile) obj;
                }
            } else if (se2.w.f406896b == null) {
                vl2.s sVar2 = vl2.s.f437868a;
                vl2.h hVar2 = vl2.h.F;
                this.f406882e = 2;
                obj = sVar2.e(hVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
                se2.w.f406896b = (org.libpag.PAGFile) obj;
            }
        } else if (i17 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            se2.w.f406897c = (com.tencent.mm.rfx.RfxPagFile) obj;
        } else {
            if (i17 != 2) {
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            se2.w.f406896b = (org.libpag.PAGFile) obj;
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f406884g;
        this.f406881d = mMPAGView;
        this.f406882e = 3;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar.k();
        se2.g gVar = new se2.g(rVar);
        rVar.m(new se2.r(mMPAGView, gVar));
        mMPAGView.n();
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(z17);
        if (z17) {
            com.tencent.mm.rfx.RfxPagFile rfxPagFile = se2.w.f406897c;
            if (rfxPagFile != null) {
                mMPAGView.setComposition(rfxPagFile);
            }
        } else {
            org.libpag.PAGFile pAGFile = se2.w.f406896b;
            if (pAGFile != null) {
                mMPAGView.setComposition(pAGFile);
            }
        }
        mMPAGView.setRepeatCount(1);
        mMPAGView.a(gVar);
        mMPAGView.setScaleMode(1);
        if (mMPAGView.getVisibility() == 0) {
            mMPAGView.g();
        }
        if (rVar.j() == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
