package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f184699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI f184701f;

    public w(com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI, int i17, android.view.View view) {
        this.f184701f = baseSOSWebViewUI;
        this.f184699d = i17;
        this.f184700e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        android.view.View view = this.f184700e;
        int i18 = this.f184699d;
        int measuredWidth = (i18 == 0 || i18 == 4) ? view.getMeasuredWidth() : 0;
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = this.f184701f;
        if (baseSOSWebViewUI.J4.getVoiceImageButton() != null && baseSOSWebViewUI.J4.getVoiceImageButton().getVisibility() == 0) {
            i17 = 0 + baseSOSWebViewUI.J4.getVoiceImageButton().getWidth();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "setCancelTextViewCallback, width = %s, commonRightBtnWidth = %s.", java.lang.Integer.valueOf(view.getWidth()), java.lang.Integer.valueOf(i17));
        android.view.View view2 = baseSOSWebViewUI.G4;
        if (view2 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.rightMargin = i17 + measuredWidth;
            layoutParams.leftMargin = java.lang.Math.max(baseSOSWebViewUI.O4.getRight() - ((int) baseSOSWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz)), (int) baseSOSWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn));
            layoutParams.width = -1;
            baseSOSWebViewUI.G4.setLayoutParams(layoutParams);
        }
        android.view.View view3 = baseSOSWebViewUI.H4;
        if (view3 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view3.getLayoutParams();
            layoutParams2.rightMargin = measuredWidth;
            layoutParams2.leftMargin = baseSOSWebViewUI.O4.getRight() - ((int) baseSOSWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479704cz));
            layoutParams2.width = -1;
            baseSOSWebViewUI.H4.setLayoutParams(layoutParams2);
        }
    }
}
