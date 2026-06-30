package f41;

/* loaded from: classes4.dex */
public final class j0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SendMsgCard f259488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f259490f;

    public j0(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard, int i17, kotlin.jvm.internal.f0 f0Var) {
        this.f259488d = sendMsgCard;
        this.f259489e = i17;
        this.f259490f = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = com.tencent.mm.open_voice_control.card.SendMsgCard.f72243v;
        com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard = this.f259488d;
        int height = ((android.view.View) ((jz5.n) sendMsgCard.f72247h).getValue()).getHeight();
        if (height <= 0) {
            return true;
        }
        int height2 = this.f259489e - (height - sendMsgCard.d().getHeight());
        if (height2 < 0) {
            height2 = 0;
        }
        kotlin.jvm.internal.f0 f0Var = this.f259490f;
        if (height2 != f0Var.f310116d) {
            f0Var.f310116d = height2;
            sendMsgCard.d().setMaxHeight(height2);
            sendMsgCard.d().requestLayout();
        }
        return true;
    }
}
