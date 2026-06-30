package te2;

/* loaded from: classes10.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.i3 f417917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.d3 f417918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(te2.i3 i3Var, te2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417917e = i3Var;
        this.f417918f = d3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.c3(this.f417917e, this.f417918f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f417916d;
        te2.i3 i3Var = this.f417917e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (i3Var.f418112p == 1) {
                com.tencent.mm.view.MMPAGView mMPAGView = i3Var.f418109m;
                if (mMPAGView != null) {
                    vl2.s sVar = vl2.s.f437868a;
                    vl2.h hVar = vl2.h.f437838y;
                    this.f417916d = 1;
                    if (sVar.d(hVar, mMPAGView, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                com.tencent.mm.view.MMPAGView mMPAGView2 = i3Var.f418109m;
                if (mMPAGView2 != null) {
                    vl2.s sVar2 = vl2.s.f437868a;
                    vl2.h hVar2 = vl2.h.f437839z;
                    this.f417916d = 2;
                    if (sVar2.d(hVar2, mMPAGView2, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = i3Var.f418109m;
        if (mMPAGView3 != null) {
            mMPAGView3.i(this.f417918f);
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = i3Var.f418109m;
        if (mMPAGView4 != null) {
            mMPAGView4.setRepeatCount(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = i3Var.f418109m;
        if (mMPAGView5 != null) {
            mMPAGView5.g();
        }
        return jz5.f0.f302826a;
    }
}
