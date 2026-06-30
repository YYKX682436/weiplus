package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class m implements com.tencent.mm.plugin.finder.webview.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final oy2.g f132616a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f132617b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f132618c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f132619d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f132620e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f132621f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.h f132622g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f132623h;

    public m(oy2.g dialog, java.lang.String url) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        kotlin.jvm.internal.o.g(url, "url");
        this.f132616a = dialog;
        com.tencent.mm.plugin.finder.view.h hVar = new com.tencent.mm.plugin.finder.view.h(dialog, dialog.c());
        this.f132622g = hVar;
        android.content.Context context = dialog.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.sn snVar = new r45.sn();
        snVar.f385851e = java.util.UUID.randomUUID().toString();
        snVar.f385852f = url;
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper = new com.tencent.mm.plugin.finder.webview.FinderWebViewHelper(context, snVar, null, 0, null, 28, null);
        finderWebViewHelper.setDialogWindow(dialog.getWindow());
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = hVar.f132198h;
        if (multiCodeMaskView == null) {
            kotlin.jvm.internal.o.o("codeMaskView");
            throw null;
        }
        finderWebViewHelper.setCodeMaskView(multiCodeMaskView);
        this.f132623h = finderWebViewHelper;
        finderWebViewHelper.addWebViewStateListener(new com.tencent.mm.plugin.finder.view.k(this));
        this.f132617b = finderWebViewHelper.getWithInitWebView();
        pm0.v.X(new com.tencent.mm.plugin.finder.view.l(this));
        android.view.Window window = dialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.tencent.mm.R.style.f494682tb);
        }
        dialog.setOnDismissListener(new com.tencent.mm.plugin.finder.view.i(this));
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f132617b;
        kotlin.jvm.internal.o.d(mMWebView);
        hVar.f132193c = mMWebView;
        mMWebView.D0(new com.tencent.mm.plugin.finder.view.d(hVar));
        com.tencent.mm.plugin.finder.webview.RelativeInterceptScrollLayout relativeInterceptScrollLayout = hVar.f132192b;
        if (relativeInterceptScrollLayout == null) {
            kotlin.jvm.internal.o.o("mWebViewContainer");
            throw null;
        }
        relativeInterceptScrollLayout.addView(hVar.f132193c, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        com.tencent.mm.ui.widget.MMWebView mMWebView2 = hVar.f132193c;
        if (mMWebView2 != null) {
            mMWebView2.setWebViewCallbackClient(hVar.f132200j);
        }
        hVar.f132199i = new com.tencent.mm.plugin.finder.view.j(this);
    }

    @Override // com.tencent.mm.plugin.finder.webview.n0
    public oy2.m a() {
        return this.f132616a;
    }
}
