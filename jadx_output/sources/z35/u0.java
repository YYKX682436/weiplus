package z35;

/* loaded from: classes4.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView f470046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f470047e;

    public u0(com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView, int i17) {
        this.f470046d = suspendableHeroSeekBarView;
        this.f470047e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView suspendableHeroSeekBarView = this.f470046d;
        int mTotalTimeMs = (int) (((suspendableHeroSeekBarView.getMTotalTimeMs() * this.f470047e) / 2500) / 1000);
        int i17 = com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView.U;
        suspendableHeroSeekBarView.getClass();
        int i18 = mTotalTimeMs / 3600;
        int i19 = mTotalTimeMs % 3600;
        int i27 = i19 / 60;
        int i28 = i19 % 60;
        java.lang.String r17 = i65.a.r(suspendableHeroSeekBarView.getContext(), com.tencent.mm.R.string.pc_);
        java.lang.String r18 = i65.a.r(suspendableHeroSeekBarView.getContext(), com.tencent.mm.R.string.pca);
        java.lang.String r19 = i65.a.r(suspendableHeroSeekBarView.getContext(), com.tencent.mm.R.string.pcb);
        java.lang.String str3 = "";
        if (i18 > 0) {
            str = i18 + r17;
        } else {
            str = "";
        }
        if (i27 > 0) {
            str2 = i27 + r18;
        } else {
            str2 = "";
        }
        if (i28 > 0) {
            str3 = i28 + r19;
        }
        suspendableHeroSeekBarView.getCurrentTimeTxt().announceForAccessibility(str + str2 + str3);
    }
}
