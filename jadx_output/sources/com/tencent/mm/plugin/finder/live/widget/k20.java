package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes2.dex */
public final class k20 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f118802e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118802e = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.k20(this.f118802e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.k20) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118801d;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f118802e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.D;
            this.f118801d = 1;
            if (sVar.d(hVar, mMPAGView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mMPAGView.setProgress(0.0d);
        mMPAGView.d();
        mMPAGView.setRepeatCount(0);
        if (mMPAGView.getVisibility() == 0) {
            mMPAGView.g();
        }
        return jz5.f0.f302826a;
    }
}
