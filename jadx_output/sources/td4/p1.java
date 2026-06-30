package td4;

/* loaded from: classes4.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417717d;

    public p1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417717d = snsAlbumPickerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2$onLoadMore$1");
        int i17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417717d;
        com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumPickerUI.f170230i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (d6Var == null) {
            com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI.f170230i = Kj;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z17 = snsAlbumPickerUI.f170229h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (!z17 && com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Z6(snsAlbumPickerUI)) {
            com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.X6(snsAlbumPickerUI);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$2$onLoadMore$1");
    }
}
