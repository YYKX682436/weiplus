package tc5;

/* loaded from: classes10.dex */
public final class v implements android.view.Choreographer.FrameCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.q f417577e;

    public v(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI, kz5.q qVar) {
        this.f417576d = msgHistoryGalleryUI;
        this.f417577e = qVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        kz5.q qVar;
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417576d;
        if (msgHistoryGalleryUI.T || msgHistoryGalleryUI.isFinishing()) {
            msgHistoryGalleryUI.R = false;
            msgHistoryGalleryUI.S = false;
            return;
        }
        if (msgHistoryGalleryUI.F != 0) {
            msgHistoryGalleryUI.R = false;
            msgHistoryGalleryUI.S = false;
            return;
        }
        xm3.t0 b17 = xm3.u0.b(msgHistoryGalleryUI.m7());
        if (b17 == null) {
            msgHistoryGalleryUI.R = false;
            msgHistoryGalleryUI.S = false;
            return;
        }
        int i17 = 3;
        while (true) {
            int i18 = i17 - 1;
            qVar = this.f417577e;
            if (i17 <= 0 || !(!qVar.isEmpty())) {
                break;
            }
            int intValue = ((java.lang.Number) qVar.removeFirst()).intValue();
            if (intValue >= 0 && intValue < b17.getItemCount()) {
                b17.notifyItemChanged(intValue);
            }
            i17 = i18;
        }
        if (!qVar.isEmpty()) {
            android.view.Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        msgHistoryGalleryUI.R = false;
        if (msgHistoryGalleryUI.S) {
            msgHistoryGalleryUI.S = false;
            msgHistoryGalleryUI.z7();
        }
    }
}
