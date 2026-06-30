package tc5;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417560d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        super(1);
        this.f417560d = msgHistoryGalleryUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.activity.g addCallback = (androidx.activity.g) obj;
        kotlin.jvm.internal.o.g(addCallback, "$this$addCallback");
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417560d;
        if (msgHistoryGalleryUI.r7()) {
            com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = msgHistoryGalleryUI.W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
            if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView)) {
                W6 = null;
            }
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) W6;
            if (msgHistoryGalleryActionBarView != null) {
                msgHistoryGalleryActionBarView.setSelecting(false);
            }
        } else {
            addCallback.setEnabled(false);
            msgHistoryGalleryUI.getOnBackPressedDispatcher().c();
        }
        return jz5.f0.f302826a;
    }
}
