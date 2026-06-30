package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f204861d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f204862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204863f = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.u0 u0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.u0(this.f204863f, continuation);
        u0Var.f204862e = obj;
        return u0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204861d;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204863f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f204862e = (kotlinx.coroutines.y0) this.f204862e;
            this.f204861d = 1;
            obj = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.n(chattingMediaGroupVideoItemMvvmView, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 h0Var = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (h0Var == null) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownloadedVideo, prepare context is null, skip");
            chattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed.f204752a);
            return f0Var;
        }
        com.tencent.mm.storage.f9 f9Var = h0Var.f204799b;
        if (!com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.s(chattingMediaGroupVideoItemMvvmView, f9Var, h0Var.f204800c, h0Var.f204801d)) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownloadedVideo, prepare failed");
            chattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed.f204752a);
            return f0Var;
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).mj(new java.lang.Long(f9Var.getMsgId()), f9Var.Q0());
        return f0Var;
    }
}
