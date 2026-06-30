package r;

/* loaded from: classes16.dex */
public final class j implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.SelectContactCard f367952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f367953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f367954f;

    public j(com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard, int i17, kotlin.jvm.internal.f0 f0Var) {
        this.f367952d = selectContactCard;
        this.f367953e = i17;
        this.f367954f = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = com.tencent.mm.open_voice_control.card.SelectContactCard.f72234p;
        com.tencent.mm.open_voice_control.card.SelectContactCard selectContactCard = this.f367952d;
        int height = ((android.view.View) ((jz5.n) selectContactCard.f72239i).getValue()).getHeight();
        if (height <= 0) {
            return true;
        }
        int height2 = height - selectContactCard.c().getHeight();
        int i18 = this.f367953e - height2;
        if (i18 < 0) {
            i18 = 0;
        }
        kotlin.jvm.internal.f0 f0Var = this.f367954f;
        int i19 = f0Var.f310116d;
        if (i18 != i19) {
            if (i19 < 0 || java.lang.Math.abs(i18 - i19) > 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVC.SelectContactCard", "adaptive list max: old=" + f0Var.f310116d + ", new=" + i18 + ", contentH=" + height + ", listH=" + selectContactCard.c().getHeight() + ", othersH=" + height2);
            }
            f0Var.f310116d = i18;
            selectContactCard.c().setMaxHeight(i18);
            selectContactCard.c().requestLayout();
        }
        return true;
    }
}
