package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f144487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f144488f;

    public v(com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView, int i17, int i18) {
        this.f144486d = wxaHalfScreenLiteAppView;
        this.f144487e = i17;
        this.f144488f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = this.f144486d;
        if (wxaHalfScreenLiteAppView.m42getActivity() != null) {
            android.app.Activity m42getActivity = wxaHalfScreenLiteAppView.m42getActivity();
            kotlin.jvm.internal.o.d(m42getActivity);
            i17 = com.tencent.mm.ui.bk.m(m42getActivity).left;
        } else {
            i17 = 0;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams((this.f144487e / 2) + i17, this.f144488f);
        android.widget.FrameLayout contentView = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView);
        int width = contentView.getWidth() / 2;
        android.widget.FrameLayout contentView2 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView2);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(width, contentView2.getHeight());
        layoutParams2.setMarginStart(i17);
        wxaHalfScreenLiteAppView.f46043g.setLayoutParams(layoutParams2);
        android.view.View landscapeMarginView = wxaHalfScreenLiteAppView.getLandscapeMarginView();
        kotlin.jvm.internal.o.d(landscapeMarginView);
        android.widget.FrameLayout contentView3 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView3);
        landscapeMarginView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, contentView3.getHeight()));
        android.widget.FrameLayout landscapeContentView = wxaHalfScreenLiteAppView.getLandscapeContentView();
        kotlin.jvm.internal.o.d(landscapeContentView);
        landscapeContentView.setLayoutParams(layoutParams);
        wxaHalfScreenLiteAppView.e();
    }
}
