package ey4;

/* loaded from: classes8.dex */
public class e0 extends androidx.viewpager.widget.a {

    /* renamed from: e, reason: collision with root package name */
    public ey4.c0 f257618e;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f257617d = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f257619f = false;

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        viewGroup.removeView((android.view.View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        ey4.w wVar = (ey4.w) this.f257618e.b(0);
        if (wVar.a() * wVar.b() < 1) {
            return 0;
        }
        return (int) java.lang.Math.ceil((((com.tencent.mm.smiley.e1) wVar.f257631b.a()).f193243c != null ? r2.size() : 0) / (wVar.a() * wVar.b()));
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        if (this.f257619f) {
            return -2;
        }
        return super.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        android.util.SparseArray sparseArray = this.f257617d;
        android.view.View view = null;
        android.view.View view2 = sparseArray.get(i17) != null ? (android.view.View) ((java.lang.ref.SoftReference) sparseArray.get(i17)).get() : null;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((android.view.ViewGroup) view2.getParent()).removeView(view2);
            }
            viewGroup.addView(view2, 0);
            return view2;
        }
        ey4.w wVar = (ey4.w) this.f257618e.b(i17);
        android.content.Context context = wVar.f257630a;
        ey4.c0 c0Var = wVar.f257631b;
        if (context != null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.d_3, null);
            if (view instanceof com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid) {
                com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid webViewSmileyGrid = (com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyGrid) view;
                webViewSmileyGrid.setPanelManager(c0Var);
                java.util.List list = ((com.tencent.mm.smiley.e1) wVar.f257631b.a()).f193243c;
                webViewSmileyGrid.b(i17, list == null ? 0 : list.size(), wVar.a() * wVar.b(), wVar.a(), wVar.b(), (wVar.f257631b.f257612d - (ey4.w.f257633d * wVar.b())) / (wVar.b() + 1));
            }
        }
        if (view != null) {
            viewGroup.addView(view, 0);
            sparseArray.put(i17, new java.lang.ref.SoftReference(view));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewSmileyViewPagerAdapter", "contentView == null!");
        }
        return view;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        this.f257619f = true;
        super.notifyDataSetChanged();
        this.f257619f = false;
    }
}
