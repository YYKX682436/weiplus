package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ia extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f132297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f132298e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f132298e = finderFeedLiveNoticeView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.ia(this.f132298e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.ia) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f132297d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f132297d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f132298e.setVisibility(8);
        return jz5.f0.f302826a;
    }
}
