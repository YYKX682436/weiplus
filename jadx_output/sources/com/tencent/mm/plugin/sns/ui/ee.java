package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class ee implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar f168235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f168236e;

    public ee(com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar snsAlbumImgBottomBar, android.view.View.OnClickListener onClickListener) {
        this.f168235d = snsAlbumImgBottomBar;
        this.f168236e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar$setLivePhotoTagClickCallback$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar$setLivePhotoTagClickCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar.f166794n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar snsAlbumImgBottomBar = this.f168235d;
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = snsAlbumImgBottomBar.f166795e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        snsLivePlayButton.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar");
        snsAlbumImgBottomBar.f166795e.b();
        this.f168236e.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAlbumImgBottomBar$setLivePhotoTagClickCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar$setLivePhotoTagClickCallback$1");
    }
}
