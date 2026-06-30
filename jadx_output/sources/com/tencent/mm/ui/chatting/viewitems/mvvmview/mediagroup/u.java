package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes14.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f204860d;

    public u(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView) {
        this.f204860d = chattingMediaGroupMvvmView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f204860d;
        if (!chattingMediaGroupMvvmView.f204721v || chattingMediaGroupMvvmView.f204723x || chattingMediaGroupMvvmView.f204722w) {
            return;
        }
        chattingMediaGroupMvvmView.f204722w = true;
        if (!chattingMediaGroupMvvmView.f204724y) {
            chattingMediaGroupMvvmView.f204724y = true;
            z01.v viewModel = chattingMediaGroupMvvmView.getViewModel();
            if (viewModel != null && (aVar = viewModel.f469172m) != null) {
                aVar.invoke();
            }
        }
        chattingMediaGroupMvvmView.performLongClick();
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView.g(chattingMediaGroupMvvmView);
    }
}
