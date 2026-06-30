package tc5;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView f417582e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI, com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView) {
        super(1);
        this.f417581d = msgHistoryGalleryUI;
        this.f417582e = scrollViewWidgetQuickScrollBarView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417581d;
        if (booleanValue) {
            msgHistoryGalleryUI.U = true;
            ed5.t tVar = msgHistoryGalleryUI.I;
            if (tVar != null) {
                tVar.f251386f = false;
            }
            msgHistoryGalleryUI.m7().D0();
            java.util.List t07 = kz5.n0.t0(msgHistoryGalleryUI.f201704v, msgHistoryGalleryUI.f201705w);
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI2 = this.f417581d;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it = ((java.util.ArrayList) t07).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                hashMap.put(next, 8);
            }
            com.tencent.mm.ui.immersive.ImmersiveBaseActivity.g7(msgHistoryGalleryUI2, hashMap, false, null, 6, null);
            msgHistoryGalleryUI.v7(true);
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView p76 = msgHistoryGalleryUI.p7();
            if (p76 != null) {
                p76.animate().cancel();
                p76.animate().setStartDelay(150L).setDuration(150L).withStartAction(new vc5.v(p76)).alpha(1.0f).withEndAction(new vc5.w(p76)).start();
            }
            msgHistoryGalleryUI.x7(true);
            msgHistoryGalleryUI.m7().setItemViewCacheSize(0);
        } else {
            msgHistoryGalleryUI.U = false;
            ed5.t tVar2 = msgHistoryGalleryUI.I;
            if (tVar2 != null) {
                tVar2.f251386f = true;
            }
            msgHistoryGalleryUI.m7().D0();
            msgHistoryGalleryUI.w7(this.f417582e.getWasLastGestureQuickTap());
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView p77 = msgHistoryGalleryUI.p7();
            if (p77 != null) {
                p77.animate().cancel();
                p77.animate().setStartDelay(0L).setDuration(150L).alpha(0.0f).withEndAction(new vc5.u(p77)).start();
            }
            msgHistoryGalleryUI.x7(false);
            msgHistoryGalleryUI.m7().postOnAnimation(new tc5.y(msgHistoryGalleryUI));
            msgHistoryGalleryUI.m7().setItemViewCacheSize(90);
        }
        return jz5.f0.f302826a;
    }
}
