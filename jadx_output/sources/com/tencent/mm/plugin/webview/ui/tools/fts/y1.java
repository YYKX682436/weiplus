package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI f184729d;

    public y1(com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI) {
        this.f184729d = fTSSOSHomeWebViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = this.f184729d;
        android.view.View view = fTSSOSHomeWebViewUI.H4;
        if (view != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            android.view.View cancelTextView = fTSSOSHomeWebViewUI.J4.getCancelTextView();
            android.view.View searchBarCancelTextContainer = fTSSOSHomeWebViewUI.J4.getSearchBarCancelTextContainer();
            if (cancelTextView.getWidth() == 0 || searchBarCancelTextContainer.getWidth() == 0 || cancelTextView.getVisibility() != 0 || searchBarCancelTextContainer.getVisibility() != 0) {
                layoutParams.rightMargin = (int) fTSSOSHomeWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479731dn);
            } else {
                layoutParams.rightMargin = java.lang.Math.max(java.lang.Math.max((int) fTSSOSHomeWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479731dn), searchBarCancelTextContainer.getWidth()), cancelTextView.getWidth());
            }
            layoutParams.leftMargin = (int) fTSSOSHomeWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
            fTSSOSHomeWebViewUI.H4.setLayoutParams(layoutParams);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", "searchInputBackground right Margin is 8A = %d, cancelTextView.getWidth() = %d,%d, CancelTextContainer() = %d,%d", java.lang.Integer.valueOf((int) fTSSOSHomeWebViewUI.getResources().getDimension(com.tencent.mm.R.dimen.f479731dn)), java.lang.Integer.valueOf(cancelTextView.getWidth()), java.lang.Integer.valueOf(cancelTextView.getVisibility()), java.lang.Integer.valueOf(searchBarCancelTextContainer.getWidth()), java.lang.Integer.valueOf(searchBarCancelTextContainer.getVisibility()));
        }
    }
}
