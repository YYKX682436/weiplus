package g44;

/* loaded from: classes3.dex */
public final class v implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper f268841d;

    public v(com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper adGalleryOpenAppHalfScreenHelper) {
        this.f268841d = adGalleryOpenAppHalfScreenHelper;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$setOnBottomSheetDismissListener$1");
        this.f268841d.o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ad.halfscreen.AdGalleryOpenAppHalfScreenHelper$setOnBottomSheetDismissListener$1");
    }
}
