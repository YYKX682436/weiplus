package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public final class ss implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar f170484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f170485e;

    public ss(com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar, android.view.View.OnClickListener onClickListener) {
        this.f170484d = snsTimelineImgBottomBar;
        this.f170485e = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setLivePhotoTagClickCallback$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar$setLivePhotoTagClickCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar.f167465h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar snsTimelineImgBottomBar = this.f170484d;
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = snsTimelineImgBottomBar.f167466e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        snsLivePlayButton.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLivePhotoPlayTagView$p", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        snsTimelineImgBottomBar.f167466e.b();
        this.f170485e.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar$setLivePhotoTagClickCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar$setLivePhotoTagClickCallback$1");
    }
}
