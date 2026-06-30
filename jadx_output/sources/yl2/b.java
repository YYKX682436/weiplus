package yl2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f462973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g f462974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yl2.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f462974e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yl2.b(this.f462974e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yl2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f462973d;
        yl2.g gVar = this.f462974e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yl2.g1 g1Var = gVar.f463003f;
            this.f462973d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "handleConfirmPostLive failed, errCode:" + ((yl2.x) a0Var).f463081a);
        } else if (a0Var instanceof yl2.z) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "handleConfirmPostLive continueLive");
            gVar.f463003f.d(((yl2.z) a0Var).f463087a);
        } else if (a0Var instanceof yl2.y) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostForNearby", "handleConfirmPostLive success");
            gVar.f463003f.h(null, ((yl2.y) a0Var).f463083a, false);
        }
        return jz5.f0.f302826a;
    }
}
