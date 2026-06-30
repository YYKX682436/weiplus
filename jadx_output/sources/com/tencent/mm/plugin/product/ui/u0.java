package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class u0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153358d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f153359e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f153360f;

    public u0(android.content.Context context) {
        this.f153358d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f153359e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (wq3.v) this.f153359e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.product.ui.t0 t0Var;
        wq3.v vVar = (wq3.v) this.f153359e.get(i17);
        if (view == null || view.getTag() == null) {
            t0Var = new com.tencent.mm.plugin.product.ui.t0(this);
            android.content.Context context = this.f153358d;
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cal, null);
            t0Var.f153353a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ja9);
            t0Var.f153354b = (com.tencent.mm.plugin.product.ui.MaxGridView) inflate.findViewById(com.tencent.mm.R.id.ja8);
            t0Var.f153355c = new com.tencent.mm.plugin.product.ui.v0(context);
            inflate.setTag(t0Var);
            view = inflate;
        } else {
            t0Var = (com.tencent.mm.plugin.product.ui.t0) view.getTag();
        }
        t0Var.f153353a.setText(vVar.f448611a);
        t0Var.f153354b.setOnItemClickListener(this.f153360f);
        com.tencent.mm.plugin.product.ui.v0 v0Var = t0Var.f153355c;
        v0Var.f153362e = vVar.f448612b;
        v0Var.notifyDataSetChanged();
        t0Var.f153354b.setAdapter((android.widget.ListAdapter) t0Var.f153355c);
        return view;
    }
}
