package pd4;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pd4.b f353560d;

    public a(pd4.b bVar) {
        this.f353560d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.MaskImageView imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout$release$1");
        pd4.b bVar = this.f353560d;
        int childCount = bVar.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView maskImageWithLivePhotoTagView = (com.tencent.mm.plugin.sns.ui.MaskImageWithLivePhotoTagView) bVar.getChildAt(i17);
            if (maskImageWithLivePhotoTagView != null && (imageView = maskImageWithLivePhotoTagView.getImageView()) != null) {
                imageView.m();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout$release$1");
    }
}
