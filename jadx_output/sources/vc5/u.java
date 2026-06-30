package vc5;

/* loaded from: classes.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView f435346d;

    public u(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView msgHistoryGalleryTimelineOverlayView) {
        this.f435346d = msgHistoryGalleryTimelineOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView msgHistoryGalleryTimelineOverlayView = this.f435346d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(msgHistoryGalleryTimelineOverlayView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(msgHistoryGalleryTimelineOverlayView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        msgHistoryGalleryTimelineOverlayView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(msgHistoryGalleryTimelineOverlayView, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView$hide$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(msgHistoryGalleryTimelineOverlayView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f435346d.setAlpha(1.0f);
    }
}
