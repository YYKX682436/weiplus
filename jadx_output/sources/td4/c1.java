package td4;

/* loaded from: classes4.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417639d;

    public c1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417639d = snsAlbumPickerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$fetchNextPageRemoteSnsAlbumData$1");
        int i17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417639d;
        snsAlbumPickerUI.f170229h = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.model.d6 d6Var = snsAlbumPickerUI.f170230i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (d6Var != null) {
            int j76 = snsAlbumPickerUI.j7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            java.lang.String str = snsAlbumPickerUI.f170232n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            java.lang.String str2 = snsAlbumPickerUI.f170232n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            java.lang.String e76 = snsAlbumPickerUI.e7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean b17 = kotlin.jvm.internal.o.b(str2, e76);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            java.lang.String str3 = snsAlbumPickerUI.f170232n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            java.lang.String e77 = snsAlbumPickerUI.e7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean b18 = kotlin.jvm.internal.o.b(str3, e77);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSnsSource$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSnsSource$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            d6Var.f(j76, str, b17, b18, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$fetchNextPageRemoteSnsAlbumData$1");
    }
}
