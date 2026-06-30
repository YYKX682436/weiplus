package ey4;

/* loaded from: classes8.dex */
public class x implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid f257635d;

    public x(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid webViewSmileyGrid) {
        this.f257635d = webViewSmileyGrid;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String d17;
        ey4.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid webViewSmileyGrid = this.f257635d;
        if (i17 == webViewSmileyGrid.f187312d.f257636d.f187315g - 1) {
            ey4.b0 b0Var = webViewSmileyGrid.f187313e.f257611c;
            if (b0Var != null) {
                com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter = ((ey4.c) b0Var).f257608a;
                if (!webViewInputFooter.f187289s || (gVar = webViewInputFooter.f187278e) == null) {
                    com.tencent.mm.ui.widget.MMEditText mMEditText = webViewInputFooter.f187285o;
                    if (mMEditText != null) {
                        mMEditText.t();
                    }
                } else {
                    com.tencent.mm.plugin.webview.luggage.h0 h0Var = (com.tencent.mm.plugin.webview.luggage.h0) gVar;
                    h0Var.f182215a.f406655i.c(new com.tencent.mm.plugin.webview.luggage.g0(h0Var, "[DELETE_EMOTION]"));
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        int i18 = ((webViewSmileyGrid.f187315g - 1) * webViewSmileyGrid.f187316h) + i17;
        if (i18 >= webViewSmileyGrid.f187314f) {
            yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        ey4.c0 c0Var = webViewSmileyGrid.f187313e;
        ey4.b0 b0Var2 = c0Var.f257611c;
        if (b0Var2 != null) {
            com.tencent.mm.smiley.e1 e1Var = (com.tencent.mm.smiley.e1) c0Var.a();
            synchronized (e1Var.f193243c) {
                if (i18 >= 0) {
                    if (i18 < e1Var.f193243c.size()) {
                        com.tencent.mm.storage.emotion.SmileyPanelConfigInfo smileyPanelConfigInfo = (com.tencent.mm.storage.emotion.SmileyPanelConfigInfo) e1Var.f193243c.get(i18);
                        d17 = smileyPanelConfigInfo != null ? e1Var.d(smileyPanelConfigInfo.field_key) : "";
                    }
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.MergerSmileyManager", "get text, error index");
                d17 = "";
            }
            try {
                com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter webViewInputFooter2 = ((ey4.c) b0Var2).f257608a;
                if (webViewInputFooter2.f187289s) {
                    com.tencent.mm.plugin.webview.luggage.h0 h0Var2 = (com.tencent.mm.plugin.webview.luggage.h0) webViewInputFooter2.f187278e;
                    h0Var2.f182215a.f406655i.c(new com.tencent.mm.plugin.webview.luggage.g0(h0Var2, d17));
                } else {
                    webViewInputFooter2.f187285o.n(d17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/widget/input/WebViewSmileyGrid$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
