package td4;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        super(0);
        this.f417731d = snsAlbumPickerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
        android.widget.Button button = (android.widget.Button) this.f417731d.findViewById(com.tencent.mm.R.id.kap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$mNextBtn$2");
        return button;
    }
}
