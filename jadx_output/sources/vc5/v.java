package vc5;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView f435347d;

    public v(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView msgHistoryGalleryTimelineOverlayView) {
        this.f435347d = msgHistoryGalleryTimelineOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView msgHistoryGalleryTimelineOverlayView = this.f435347d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(msgHistoryGalleryTimelineOverlayView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(msgHistoryGalleryTimelineOverlayView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        msgHistoryGalleryTimelineOverlayView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(msgHistoryGalleryTimelineOverlayView, "com/tencent/mm/ui/chatting/history/chromes/MsgHistoryGalleryTimelineOverlayView$show$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(msgHistoryGalleryTimelineOverlayView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
