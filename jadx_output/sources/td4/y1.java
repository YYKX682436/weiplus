package td4;

/* loaded from: classes4.dex */
public final class y1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417754d;

    public y1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417754d = snsAlbumPickerUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showMaterialLoadingDialog$1");
        int i17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417754d;
        snsAlbumPickerUI.f170240v = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        td4.g i76 = snsAlbumPickerUI.i7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        i76.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showMaterialLoadingDialog$1");
    }
}
