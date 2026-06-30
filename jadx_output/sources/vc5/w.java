package vc5;

/* loaded from: classes.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView f435348d;

    public w(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView msgHistoryGalleryTimelineOverlayView) {
        this.f435348d = msgHistoryGalleryTimelineOverlayView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f435348d.setAlpha(1.0f);
    }
}
