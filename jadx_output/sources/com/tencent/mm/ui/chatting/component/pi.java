package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class pi implements fb0.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.qi f199717a;

    public pi(com.tencent.mm.ui.chatting.component.qi qiVar) {
        this.f199717a = qiVar;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenMsgComponent", "isShow:" + z17);
        com.tencent.mm.ui.chatting.component.qi qiVar = this.f199717a;
        if (qiVar.f199787e == null) {
            android.view.View c17 = qiVar.f198580d.c(com.tencent.mm.R.id.blo);
            qiVar.f199787e = c17 instanceof com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar ? (com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar) c17 : null;
            if (qiVar.f199787e == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.OpenMsgComponent", "chatting_footer_more_btn_bar not found");
            }
        }
        if (!z17) {
            com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar chattingFooterMoreBtnBar = qiVar.f199787e;
            if (chattingFooterMoreBtnBar == null || chattingFooterMoreBtnBar.f198214h.getVisibility() == 8) {
                return;
            }
            chattingFooterMoreBtnBar.f198218o.remove(5);
            chattingFooterMoreBtnBar.f198214h.animate().alpha(0.0f).setDuration(500L).setListener(new com.tencent.mm.ui.chatting.c5(chattingFooterMoreBtnBar));
            return;
        }
        com.tencent.mm.ui.chatting.ChattingFooterMoreBtnBar chattingFooterMoreBtnBar2 = qiVar.f199787e;
        if (chattingFooterMoreBtnBar2 == null || chattingFooterMoreBtnBar2.f198214h.getVisibility() == 0) {
            return;
        }
        chattingFooterMoreBtnBar2.f198218o.add(5);
        chattingFooterMoreBtnBar2.f198214h.setVisibility(0);
        chattingFooterMoreBtnBar2.f198214h.animate().alpha(1.0f).setDuration(500L).setListener(null);
    }
}
