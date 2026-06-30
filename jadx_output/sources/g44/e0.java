package g44;

/* loaded from: classes3.dex */
public final class e0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper f268818d;

    public e0(com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper adOpenAppHalfScreenHelper) {
        this.f268818d = adOpenAppHalfScreenHelper;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$7");
        this.f268818d.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenAppHalfScreenHelper$showBottomSheet$7");
    }
}
