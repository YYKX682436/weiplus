package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class b0 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153270d;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f153272f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.x f153273g = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f153271e = null;

    public b0(android.content.Context context) {
        this.f153270d = context;
    }

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        java.util.ArrayList arrayList = this.f153272f;
        if (arrayList != null) {
            viewGroup.removeView(((com.tencent.mm.plugin.product.ui.a0) arrayList.get(i17)).f153266d);
        }
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        java.util.List list = this.f153271e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        java.util.ArrayList arrayList = this.f153272f;
        if (arrayList == null) {
            return instantiateItem((android.view.View) viewGroup, i17);
        }
        viewGroup.addView(((com.tencent.mm.plugin.product.ui.a0) arrayList.get(i17)).f153266d, 0);
        return ((com.tencent.mm.plugin.product.ui.a0) this.f153272f.get(i17)).f153266d;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
