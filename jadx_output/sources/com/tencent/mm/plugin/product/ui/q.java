package com.tencent.mm.plugin.product.ui;

/* loaded from: classes8.dex */
public class q extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153330d;

    /* renamed from: e, reason: collision with root package name */
    public final int f153331e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f153332f;

    /* renamed from: g, reason: collision with root package name */
    public int f153333g = -1;

    public q(android.content.Context context, int i17) {
        this.f153330d = context;
        this.f153331e = i17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f153332f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        if (view == null) {
            view = android.view.View.inflate(this.f153330d, com.tencent.mm.R.layout.f489291c05, null);
            com.tencent.mm.plugin.product.ui.r rVar = new com.tencent.mm.plugin.product.ui.r();
            rVar.f153337a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o3b);
            rVar.f153338b = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bs7);
            rVar.f153339c = (android.widget.RadioButton) view.findViewById(com.tencent.mm.R.id.lhs);
            view.setTag(rVar);
        }
        com.tencent.mm.plugin.product.ui.r rVar2 = (com.tencent.mm.plugin.product.ui.r) view.getTag();
        rVar2.f153337a.setText((java.lang.CharSequence) this.f153332f.get(i17));
        int i18 = this.f153331e;
        if (i18 == 1) {
            rVar2.f153338b.setVisibility(8);
            rVar2.f153339c.setVisibility(0);
            rVar2.f153339c.setChecked(i17 == this.f153333g);
        } else if (i18 != 2) {
            rVar2.f153338b.setVisibility(8);
            rVar2.f153339c.setVisibility(8);
        } else {
            rVar2.f153338b.setVisibility(0);
            rVar2.f153339c.setVisibility(8);
            rVar2.f153338b.setChecked(i17 == this.f153333g);
        }
        return view;
    }
}
