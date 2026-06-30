package com.tencent.mm.plugin.webview.ui.tools.widget.input;

/* loaded from: classes8.dex */
public class WebViewSmileyViewPager extends com.tencent.mm.ui.base.CustomViewPager {

    /* renamed from: d, reason: collision with root package name */
    public int f187328d;

    /* renamed from: e, reason: collision with root package name */
    public int f187329e;

    /* renamed from: f, reason: collision with root package name */
    public ey4.c0 f187330f;

    /* renamed from: g, reason: collision with root package name */
    public ey4.d0 f187331g;

    public WebViewSmileyViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187328d = 0;
        this.f187329e = 0;
        if (fp.h.c(9)) {
            setOverScrollMode(2);
        }
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        ey4.c0 c0Var = this.f187330f;
        if (c0Var != null && (((i17 > 0 && i19 != i17) || (i18 > 0 && i27 != i18)) && ((i18 > 0 && i18 != this.f187328d) || (i17 > 0 && i17 != this.f187329e)))) {
            c0Var.f257612d = i18;
            c0Var.f257613e = i17;
            ey4.d0 d0Var = this.f187331g;
            if (d0Var != null) {
                com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel webViewSmileyPanel = (com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyPanel) d0Var;
                if (webViewSmileyPanel.f187325i != null) {
                    webViewSmileyPanel.f187322f.f257614f = com.tencent.mm.sdk.platformtools.d2.j(webViewSmileyPanel.getContext());
                    ey4.e0 e0Var = (ey4.e0) webViewSmileyPanel.f187325i.getAdapter();
                    if (e0Var != null) {
                        e0Var.f257617d.clear();
                        e0Var.f257618e = webViewSmileyPanel.f187322f;
                        e0Var.notifyDataSetChanged();
                    } else {
                        ey4.e0 e0Var2 = new ey4.e0();
                        e0Var2.f257618e = webViewSmileyPanel.f187322f;
                        webViewSmileyPanel.f187325i.setAdapter(e0Var2);
                    }
                    webViewSmileyPanel.f187325i.post(new ey4.a0(webViewSmileyPanel));
                }
            }
        }
        if (i18 > 0) {
            this.f187328d = i18;
        }
        if (i17 > 0) {
            this.f187329e = i17;
        }
    }

    public void setOnSizeChangedListener(ey4.d0 d0Var) {
        this.f187331g = d0Var;
    }

    public void setPanelManager(ey4.c0 c0Var) {
        this.f187330f = c0Var;
    }
}
