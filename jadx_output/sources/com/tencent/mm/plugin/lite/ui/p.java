package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class p implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f144455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144457f;

    public p(boolean z17, com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView, com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView2) {
        this.f144455d = z17;
        this.f144456e = wxaHalfScreenLiteAppView;
        this.f144457f = wxaHalfScreenLiteAppView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout ");
        sb6.append(this.f144455d);
        sb6.append(' ');
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = this.f144456e;
        sb6.append(wxaHalfScreenLiteAppView.getMeasuredWidth());
        sb6.append(" w2=");
        android.widget.FrameLayout contentView = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView);
        sb6.append(contentView.getWidth());
        com.tencent.mars.xlog.Log.i("ScrollableFrameLayout", sb6.toString());
        if (wxaHalfScreenLiteAppView.m42getActivity() != null) {
            android.app.Activity m42getActivity = wxaHalfScreenLiteAppView.m42getActivity();
            kotlin.jvm.internal.o.d(m42getActivity);
            i17 = com.tencent.mm.ui.bk.m(m42getActivity).left;
        } else {
            i17 = 0;
        }
        android.widget.FrameLayout contentView2 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView2);
        int width = (contentView2.getWidth() / 2) + i17;
        android.widget.FrameLayout contentView3 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView3);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(width, contentView3.getHeight());
        android.widget.FrameLayout contentView4 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView4);
        int width2 = contentView4.getWidth() / 2;
        android.widget.FrameLayout contentView5 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView5);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(width2, contentView5.getHeight());
        layoutParams2.setMarginStart(i17);
        wxaHalfScreenLiteAppView.f46043g.setLayoutParams(layoutParams2);
        android.view.View landscapeMarginView = wxaHalfScreenLiteAppView.getLandscapeMarginView();
        kotlin.jvm.internal.o.d(landscapeMarginView);
        android.widget.FrameLayout contentView6 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView6);
        landscapeMarginView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, contentView6.getHeight()));
        android.widget.FrameLayout landscapeContentView = wxaHalfScreenLiteAppView.getLandscapeContentView();
        kotlin.jvm.internal.o.d(landscapeContentView);
        landscapeContentView.setLayoutParams(layoutParams);
        android.widget.FrameLayout contentView7 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView7);
        contentView7.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f144457f.e();
    }
}
