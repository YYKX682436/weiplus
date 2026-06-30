package td4;

/* loaded from: classes4.dex */
public final class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p94.d0 f417758e;

    public z1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI, p94.d0 d0Var) {
        this.f417757d = snsAlbumPickerUI;
        this.f417758e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1$onFpSetSize$1");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(this.f417757d).T(this.f417758e.h());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$snsEventCallback$1$onFpSetSize$1");
    }
}
