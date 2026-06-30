package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f204877d;

    /* renamed from: e, reason: collision with root package name */
    public int f204878e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f204879f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204880g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204880g = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y0 y0Var = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y0(this.f204880g, continuation);
        y0Var.f204879f = obj;
        return y0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r7.f204878e
            r2 = 2
            r3 = 1
            jz5.f0 r4 = jz5.f0.f302826a
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView r5 = r7.f204880g
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r0 = r7.f204877d
            t21.v2 r0 = (t21.v2) r0
            java.lang.Object r1 = r7.f204879f
            com.tencent.mm.storage.f9 r1 = (com.tencent.mm.storage.f9) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L73
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L24:
            java.lang.Object r1 = r7.f204879f
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3e
        L2c:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.f204879f
            kotlinx.coroutines.y0 r8 = (kotlinx.coroutines.y0) r8
            r7.f204879f = r8
            r7.f204878e = r3
            java.lang.Object r8 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.n(r5, r7)
            if (r8 != r0) goto L3e
            return r0
        L3e:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 r8 = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0) r8
            if (r8 != 0) goto L50
            java.lang.String r8 = r5.f204726m
            java.lang.String r0 = "tryPrepareVideo, prepare context is null, skip"
            com.tencent.mars.xlog.Log.w(r8, r0)
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed r8 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed.f204752a
            r5.B(r8)
            return r4
        L50:
            com.tencent.mm.storage.f9 r1 = r8.f204799b
            t21.v2 r3 = r8.f204800c
            fk4.u r8 = r8.f204801d
            boolean r6 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.s(r5, r1, r3, r8)
            if (r6 == 0) goto L65
            java.lang.String r8 = r5.f204726m
            java.lang.String r0 = "tryPrepareVideo, tryPrepareLocal success, wait for videoView prepared"
            com.tencent.mars.xlog.Log.i(r8, r0)
            return r4
        L65:
            r7.f204879f = r1
            r7.f204877d = r3
            r7.f204878e = r2
            java.lang.Object r8 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.t(r5, r1, r8, r7)
            if (r8 != r0) goto L72
            return r0
        L72:
            r0 = r3
        L73:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L84
            java.lang.String r8 = r5.f204726m
            java.lang.String r0 = "tryPrepareVideo, tryPrepareOnline success, wait for videoView prepared"
            com.tencent.mars.xlog.Log.i(r8, r0)
            return r4
        L84:
            boolean r8 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.r(r5, r1, r0)
            if (r8 == 0) goto L93
            java.lang.String r8 = r5.f204726m
            java.lang.String r0 = "tryPrepareVideo, tryPrepareDownload success, wait for videoView prepared"
            com.tencent.mars.xlog.Log.i(r8, r0)
            return r4
        L93:
            com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed r8 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$VideoPreparingFailed.f204752a
            r5.B(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
