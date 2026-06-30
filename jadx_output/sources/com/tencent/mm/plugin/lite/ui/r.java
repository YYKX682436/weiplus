package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes14.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f144466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView f144468f;

    public r(boolean z17, com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView, com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView2) {
        this.f144466d = z17;
        this.f144467e = wxaHalfScreenLiteAppView;
        this.f144468f = wxaHalfScreenLiteAppView2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGlobalLayout ");
        sb6.append(this.f144466d);
        sb6.append(' ');
        com.tencent.mm.plugin.lite.ui.WxaHalfScreenLiteAppView wxaHalfScreenLiteAppView = this.f144467e;
        sb6.append(wxaHalfScreenLiteAppView.getMeasuredWidth());
        sb6.append(" w2=");
        android.widget.FrameLayout contentView = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView);
        sb6.append(contentView.getWidth());
        com.tencent.mars.xlog.Log.i("ScrollableFrameLayout", sb6.toString());
        android.widget.FrameLayout contentView2 = wxaHalfScreenLiteAppView.getContentView();
        kotlin.jvm.internal.o.d(contentView2);
        contentView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f144468f.e();
    }
}
