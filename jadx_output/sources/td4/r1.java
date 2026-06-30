package td4;

/* loaded from: classes4.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417723d;

    public r1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417723d = snsAlbumPickerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$firstPageLoadRunnable$1");
        int i17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsFinishing$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417723d;
        boolean z17 = snsAlbumPickerUI.f170228g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsFinishing$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$firstPageLoadRunnable$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumPickerUI.f170230i;
        if (d6Var != null) {
            d6Var.w(snsAlbumPickerUI.j7(), snsAlbumPickerUI.f170232n, snsAlbumPickerUI.G);
        }
        com.tencent.mm.plugin.sns.model.d6 d6Var2 = snsAlbumPickerUI.f170230i;
        if (d6Var2 != null) {
            int j76 = snsAlbumPickerUI.j7();
            java.lang.String str = snsAlbumPickerUI.f170232n;
            d6Var2.e(j76, str, kotlin.jvm.internal.o.b(str, snsAlbumPickerUI.e7()), kotlin.jvm.internal.o.b(snsAlbumPickerUI.f170232n, snsAlbumPickerUI.e7()), 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$firstPageLoadRunnable$1");
    }
}
