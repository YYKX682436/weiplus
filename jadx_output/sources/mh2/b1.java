package mh2;

/* loaded from: classes3.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mh2.p0 f326303f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(mh2.f1 f1Var, mh2.p0 p0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326302e = f1Var;
        this.f326303f = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.b1(this.f326302e, this.f326303f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.b1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326301d;
        mh2.f1 f1Var = this.f326302e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f326301d = 1;
            obj = mh2.f1.f(f1Var, this.f326303f, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (obj != null) {
            if (obj instanceof org.libpag.PAGFile) {
                ym5.l2 l2Var = ym5.l2.f463424a;
                com.tencent.mm.view.MMPAGView mMPAGView = f1Var.f326334i;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                com.tencent.mm.view.MMPAGView mMPAGView2 = f1Var.f326334i;
                mMPAGView2.o(false);
                mMPAGView2.setComposition((org.libpag.PAGFile) obj);
            } else if (obj instanceof com.tencent.mm.rfx.RfxPagFile) {
                ym5.l2 l2Var2 = ym5.l2.f463424a;
                com.tencent.mm.view.MMPAGView mMPAGView3 = f1Var.f326334i;
                ym5.j2[] j2VarArr2 = ym5.j2.f463392d;
                com.tencent.mm.view.MMPAGView mMPAGView4 = f1Var.f326334i;
                mMPAGView4.o(true);
                mMPAGView4.setComposition((com.tencent.mm.rfx.RfxPagFile) obj);
            }
            f1Var.f326334i.setProgress(0.0d);
            com.tencent.mm.view.MMPAGView mMPAGView5 = f1Var.f326334i;
            mMPAGView5.setRepeatCount(1);
            mh2.r0 r0Var = f1Var.C;
            mMPAGView5.i(r0Var);
            mMPAGView5.a(r0Var);
            mMPAGView5.g();
        }
        return jz5.f0.f302826a;
    }
}
