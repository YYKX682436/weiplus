package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes3.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f204873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.u f204875f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, fk4.u uVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204874e = chattingMediaGroupVideoItemMvvmView;
        this.f204875f = uVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.x0(this.f204874e, this.f204875f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204873d;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204874e;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mars.xlog.Log.i(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareOnline, awaitMoovReady");
                fk4.u uVar = this.f204875f;
                this.f204873d = 1;
                if (((fk4.k) uVar).d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (fk4.q e17) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareOnline, await moov failed: " + e17.getMessage());
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
