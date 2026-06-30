package ey4;

/* loaded from: classes8.dex */
public class y extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid f257636d;

    public y(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid webViewSmileyGrid, ey4.x xVar) {
        this.f257636d = webViewSmileyGrid;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f257636d.f187315g;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ey4.z zVar;
        android.graphics.drawable.Drawable drawable = null;
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid webViewSmileyGrid = this.f257636d;
        if (view == null || view.getTag() == null) {
            view = com.tencent.mm.ui.id.b(webViewSmileyGrid.getContext()).inflate(com.tencent.mm.R.layout.d_1, (android.view.ViewGroup) null);
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, ((webViewSmileyGrid.f187313e.f257612d - i65.a.h(webViewSmileyGrid.getContext(), com.tencent.mm.R.dimen.f479877hq)) - i65.a.h(webViewSmileyGrid.getContext(), com.tencent.mm.R.dimen.f480378w9)) / webViewSmileyGrid.f187318m));
            zVar = new ey4.z(view);
            view.setTag(zVar);
        } else {
            zVar = (ey4.z) view.getTag();
        }
        int i18 = webViewSmileyGrid.f187315g;
        if (i17 == i18 - 1) {
            zVar.f257637a.setImageResource(com.tencent.mm.R.drawable.f481347r0);
            zVar.f257637a.setContentDescription(webViewSmileyGrid.getContext().getString(com.tencent.mm.R.string.bof));
        } else {
            int i19 = ((i18 - 1) * webViewSmileyGrid.f187316h) + i17;
            if (i19 > webViewSmileyGrid.f187314f - 1) {
                zVar.f257637a.setImageDrawable(null);
            } else {
                com.tencent.mm.smiley.e1 e1Var = (com.tencent.mm.smiley.e1) webViewSmileyGrid.f187313e.a();
                android.util.SparseArray sparseArray = e1Var.f193244d;
                if (sparseArray == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley panel map is null.");
                } else {
                    com.tencent.mm.storage.emotion.SmileyPanelConfigInfo smileyPanelConfigInfo = (com.tencent.mm.storage.emotion.SmileyPanelConfigInfo) sparseArray.get(i19);
                    if (smileyPanelConfigInfo == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "getSmileyDrawable smiley info is null.");
                    } else {
                        drawable = e1Var.c(smileyPanelConfigInfo.field_key);
                    }
                }
                zVar.f257637a.setImageDrawable(drawable);
            }
        }
        return view;
    }
}
