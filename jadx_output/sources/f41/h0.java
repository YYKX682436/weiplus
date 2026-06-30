package f41;

/* loaded from: classes4.dex */
public final class h0 implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259484d;

    public h0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        this.f259484d = sendMsgCard;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i17 = com.tencent.mm.open_voice_control.card.SendMsgCard.f72243v;
        this.f259484d.g();
    }
}
