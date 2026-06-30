package td4;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI f417753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        super(0);
        this.f417753d = snsAlbumPickerPreviewUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) this.f417753d.findViewById(com.tencent.mm.R.id.bsv);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$mSelectButton$2");
        return imageButton;
    }
}
