package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class e0 extends android.widget.BaseAdapter implements android.widget.Filterable {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153280d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f153281e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f153282f = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Filter f153283g = new com.tencent.mm.plugin.product.ui.c0(this);

    public e0(android.content.Context context) {
        this.f153281e = null;
        this.f153280d = context;
        this.f153281e = vq3.e.wi().Bi().f448568a;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f153282f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
        return this.f153283g;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f153282f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.product.ui.d0 d0Var;
        if (view == null) {
            d0Var = new com.tencent.mm.plugin.product.ui.d0(this);
            view2 = android.view.LayoutInflater.from(this.f153280d).inflate(android.R.layout.simple_list_item_1, (android.view.ViewGroup) null);
            d0Var.f153277a = (android.widget.TextView) view2.findViewById(android.R.id.text1);
            view2.setTag(d0Var);
        } else {
            view2 = view;
            d0Var = (com.tencent.mm.plugin.product.ui.d0) view.getTag();
        }
        d0Var.f153277a.setText((java.lang.String) this.f153282f.get(i17));
        return view2;
    }
}
