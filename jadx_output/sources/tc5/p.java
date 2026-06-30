package tc5;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        super(0);
        this.f417570d = msgHistoryGalleryUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.f201697x1;
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417570d;
        wc5.k1 o76 = msgHistoryGalleryUI.o7();
        o76.f444592e = o76.U6().size();
        o76.X6();
        msgHistoryGalleryUI.m7().post(new tc5.o(msgHistoryGalleryUI));
        return jz5.f0.f302826a;
    }
}
