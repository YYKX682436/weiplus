package nf2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f336779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f336779e = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nf2.m0(this.f336779e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nf2.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f336778d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.A;
            this.f336778d = 1;
            obj = sVar.a(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "initCollapsedButtonPag: PAG loaded successfully");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("FinderLiveLyricsView", "initCollapsedButtonPag: PAG resource download failed or not available");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "initCollapsedButtonPag: PAG resource path: " + str);
        vl2.s sVar2 = vl2.s.f437868a;
        vl2.h hVar2 = vl2.h.A;
        this.f336778d = 2;
        if (sVar2.d(hVar2, this.f336779e, this) == aVar) {
            return aVar;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLyricsView", "initCollapsedButtonPag: PAG loaded successfully");
        return f0Var;
    }
}
