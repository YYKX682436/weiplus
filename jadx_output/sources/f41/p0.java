package f41;

/* loaded from: classes11.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f259507e;

    public p0(boolean z17, com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        this.f259507e = z17;
        this.f259506d = sendMsgCard;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f259507e;
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = this.f259506d;
        if (!z17) {
            com.tencent.mm.open_voice_control.card.SendMsgCard.c(sendMsgCard);
            return;
        }
        int i17 = com.tencent.mm.open_voice_control.card.SendMsgCard.f72243v;
        sendMsgCard.m0().scrollTo(0, sendMsgCard.f());
        sendMsgCard.g();
    }
}
