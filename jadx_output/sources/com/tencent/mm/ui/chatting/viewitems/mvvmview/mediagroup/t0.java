package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class t0 implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f204857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView f204858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204859f;

    public t0(t21.v2 v2Var, com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView, com.tencent.mm.storage.f9 f9Var) {
        this.f204857d = v2Var;
        this.f204858e = chattingMediaGroupVideoItemMvvmView;
        this.f204859f = f9Var;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.lang.String str = r1Var != null ? r1Var.f445529a : null;
        t21.v2 v2Var = this.f204857d;
        boolean b17 = kotlin.jvm.internal.o.b(str, v2Var.d());
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView chattingMediaGroupVideoItemMvvmView = this.f204858e;
        if (!b17) {
            com.tencent.mars.xlog.Log.i(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownload, notifyChanged, fileName not matched, skip");
            return;
        }
        com.tencent.mm.storage.f9 f9Var = this.f204859f;
        if ((!f9Var.M2() && f9Var.z2()) || v2Var.f415011i == 198) {
            com.tencent.mars.xlog.Log.e(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownload, notifyChanged, video expired or failed, skip");
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(this);
            chattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFailed.f204743a);
            return;
        }
        if (!v2Var.i()) {
            com.tencent.mars.xlog.Log.e(chattingMediaGroupVideoItemMvvmView.f204726m, "tryPrepareDownload, notifyChanged, download failed, skip");
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(this);
            chattingMediaGroupVideoItemMvvmView.B(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFailed.f204743a);
            return;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFinished chattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFinished = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFinished.f204744a;
        int i17 = com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView.B;
        chattingMediaGroupVideoItemMvvmView.B(chattingMediaGroupVideoItemMvvmView$Event$InternalEvent$DownloadFinished);
    }
}
