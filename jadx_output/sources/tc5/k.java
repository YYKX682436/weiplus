package tc5;

/* loaded from: classes10.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417563d;

    public k(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        this.f417563d = msgHistoryGalleryUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.f201697x1;
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417563d;
        msgHistoryGalleryUI.v7(true);
        android.view.View decorView = msgHistoryGalleryUI.getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(decorView);
    }
}
