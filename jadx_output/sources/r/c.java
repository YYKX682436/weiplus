package r;

/* loaded from: classes16.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.BaseCard f367946d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f367947e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentManager f367948f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f367949g;

    public c(com.tencent.mm.open_voice_control.card.BaseCard baseCard, kotlin.jvm.internal.c0 c0Var, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.f367946d = baseCard;
        this.f367947e = c0Var;
        this.f367948f = fragmentManager;
        this.f367949g = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        kotlin.jvm.internal.c0 c0Var = this.f367947e;
        androidx.fragment.app.FragmentManager fragmentManager = this.f367948f;
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f367949g;
        com.tencent.mm.open_voice_control.card.BaseCard baseCard = this.f367946d;
        boolean z18 = true;
        try {
            if (baseCard.isAdded() && !baseCard.isDetached() && !baseCard.isRemoving()) {
                if (!com.tencent.mm.open_voice_control.card.BaseCard.b(fragmentManager, baseCard) && !c0Var.f310112d) {
                    z17 = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.OVC.BaseCard", "dismiss fallback lastFragment=" + z17);
                    androidx.fragment.app.i2 beginTransaction = fragmentManager.beginTransaction();
                    beginTransaction.j(baseCard);
                    beginTransaction.e();
                    com.tencent.mm.open_voice_control.card.BaseCard.a(fragmentActivity, z17);
                    return;
                }
                z17 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.OVC.BaseCard", "dismiss fallback lastFragment=" + z17);
                androidx.fragment.app.i2 beginTransaction2 = fragmentManager.beginTransaction();
                beginTransaction2.j(baseCard);
                beginTransaction2.e();
                com.tencent.mm.open_voice_control.card.BaseCard.a(fragmentActivity, z17);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.OVC.BaseCard", "dismiss fallback: fragment not valid, isAdded=" + baseCard.isAdded() + ", isDetached=" + baseCard.isDetached() + ", isRemoving=" + baseCard.isRemoving());
            com.tencent.mm.open_voice_control.card.BaseCard.a(fragmentActivity, c0Var.f310112d);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OVC.BaseCard", th6, "dismiss fallback failed", new java.lang.Object[0]);
            if (!com.tencent.mm.open_voice_control.card.BaseCard.b(fragmentManager, baseCard) && !c0Var.f310112d) {
                z18 = false;
            }
            com.tencent.mm.open_voice_control.card.BaseCard.a(fragmentActivity, z18);
        }
    }
}
