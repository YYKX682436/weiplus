package com.tencent.xweb;

/* loaded from: classes13.dex */
public class b1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.WebView f220212d;

    public b1(com.tencent.xweb.WebView webView) {
        this.f220212d = webView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.xweb.WebView webView = this.f220212d;
        android.view.View.OnLongClickListener onLongClickListener = webView.f220198g;
        if (onLongClickListener != null) {
            return onLongClickListener.onLongClick(webView);
        }
        return false;
    }
}
