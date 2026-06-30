package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class PhotosContent extends com.tencent.mm.ui.base.MMFrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f166571e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f166572f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f166573g;

    /* renamed from: h, reason: collision with root package name */
    public float f166574h;

    /* renamed from: i, reason: collision with root package name */
    public int f166575i;

    public PhotosContent(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166571e = new java.util.ArrayList();
        this.f166572f = new java.util.ArrayList();
        this.f166573g = new java.util.ArrayList();
        this.f166575i = 120;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PhotosContent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f166573g.add(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void b(com.tencent.mm.plugin.sns.ui.TagImageView tagImageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageview", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f166571e.add(tagImageView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageview", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void c(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addLivePhotoTagView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f166572f.add(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addLivePhotoTagView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        this.f166571e.clear();
        this.f166572f.clear();
        this.f166573g.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public android.widget.FrameLayout.LayoutParams e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        android.view.View childAt = getChildAt(i17);
        if (childAt == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return null;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) childAt.getLayoutParams();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEachImageViewLayoutParams", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return layoutParams;
    }

    public android.view.View f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        java.util.ArrayList arrayList = this.f166573g;
        if (i17 >= arrayList.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return null;
        }
        android.view.View view = (android.view.View) arrayList.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageParentView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return view;
    }

    public com.tencent.mm.plugin.sns.ui.TagImageView g(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        java.util.ArrayList arrayList = this.f166571e;
        if (i17 >= arrayList.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = (com.tencent.mm.plugin.sns.ui.TagImageView) arrayList.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageView", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        return tagImageView;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }

    public void setParentImageViewWidth(int i17) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setParentImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
        if (i17 <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setParentImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
            return;
        }
        float f17 = getResources().getDisplayMetrics().density;
        this.f166574h = f17;
        int i18 = (int) (this.f166575i * f17);
        this.f166575i = i18;
        if (i17 >= i18) {
            i17 = i18;
        }
        int i19 = 0;
        while (true) {
            arrayList = this.f166571e;
            if (i19 >= arrayList.size()) {
                break;
            }
            android.view.View childAt = getChildAt(i19);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(childAt.getLayoutParams());
            marginLayoutParams.width = i17;
            marginLayoutParams.height = i17;
            float f18 = i17;
            float f19 = this.f166574h;
            marginLayoutParams.leftMargin = (int) ((i19 % 3) * ((f19 * 3.0f) + f18));
            marginLayoutParams.topMargin = (int) ((i19 / 3) * (f18 + (f19 * 3.0f)));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(marginLayoutParams);
            layoutParams.gravity = 51;
            childAt.setLayoutParams(layoutParams);
            i19++;
        }
        if (arrayList.size() / 3 > 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams2.height = (int) ((i17 * r2) + (this.f166574h * 3.0f * (r2 - 1)));
            setLayoutParams(marginLayoutParams2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setParentImageViewWidth", "com.tencent.mm.plugin.sns.ui.PhotosContent");
    }
}
