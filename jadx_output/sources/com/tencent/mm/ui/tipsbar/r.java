package com.tencent.mm.ui.tipsbar;

/* loaded from: classes5.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup f209950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.q f209951e;

    public r(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup, yb5.q qVar) {
        this.f209950d = chatTipsBarGroup;
        this.f209951e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yb5.q talkerInfo = this.f209951e;
        kotlin.jvm.internal.o.f(talkerInfo, "$talkerInfo");
        int i17 = com.tencent.mm.ui.tipsbar.ChatTipsBarGroup.f209904v;
        com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup = this.f209950d;
        chatTipsBarGroup.getClass();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(chatTipsBarGroup, "group_msg_set_top_list");
        java.lang.ref.WeakReference weakReference = chatTipsBarGroup.chattingContextRef;
        if (weakReference != null && ((yb5.d) weakReference.get()) != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(chatTipsBarGroup, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_list_length", java.lang.Integer.valueOf(chatTipsBarGroup.dataList.size()))), com.tencent.mm.ui.tipsbar.s.a(talkerInfo)));
        }
        if (chatTipsBarGroup.f209914p.f209925a == com.tencent.mm.ui.tipsbar.c.f209922d) {
            chatTipsBarGroup.setListViewPaddingTop(chatTipsBarGroup.f209905d.getHeight());
        }
    }
}
