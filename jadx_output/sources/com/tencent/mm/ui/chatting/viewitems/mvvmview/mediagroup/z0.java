package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class z0 implements pk4.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204882a;

    public z0(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView) {
        this.f204882a = chattingMediaGroupVideoItemMvvmView;
    }

    @Override // pk4.u0
    public void a(long j17) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.h0 prepareContext;
        yz5.l lVar;
        pk4.d videoView;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204882a;
        prepareContext = chattingMediaGroupVideoItemMvvmView.getPrepareContext();
        if (prepareContext == null) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupVideoItemMvvmView.f204726m, "onPlayProgress, prepareContext returns null, skip");
            return;
        }
        b11.a viewModel = chattingMediaGroupVideoItemMvvmView.getViewModel();
        b11.d dVar = viewModel instanceof b11.d ? (b11.d) viewModel : null;
        if (dVar == null || (lVar = dVar.F) == null) {
            return;
        }
        t21.v2 v2Var = prepareContext.f204800c;
        java.lang.String d17 = v2Var.d();
        kotlin.jvm.internal.o.f(d17, "getFileName(...)");
        java.lang.String groupId = prepareContext.f204798a.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        long j18 = v2Var.f415015m;
        videoView = chattingMediaGroupVideoItemMvvmView.getVideoView();
        lVar.invoke(new b11.c(d17, groupId, j18, j17, videoView.getIsOnlineVideo(), false));
    }
}
