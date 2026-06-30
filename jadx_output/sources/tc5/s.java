package tc5;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417573d;

    public s(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        this.f417573d = msgHistoryGalleryUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417573d;
        msgHistoryGalleryUI.Q = false;
        msgHistoryGalleryUI.v7(false);
    }
}
