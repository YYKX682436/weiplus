package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class n0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f212296d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f212297e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f212298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.p0 f212299g;

    public n0(com.tencent.mm.ui.widget.picker.p0 p0Var, android.content.Context context) {
        this.f212299g = p0Var;
        this.f212296d = context;
    }

    public java.util.ArrayList a() {
        if (this.f212297e == null) {
            return null;
        }
        this.f212298f = new java.util.ArrayList();
        for (int i17 = 0; i17 < getCount(); i17++) {
            if (((java.lang.Boolean) this.f212297e.get(java.lang.Integer.valueOf(i17))).booleanValue()) {
                this.f212298f.add(java.lang.Integer.valueOf(i17));
            }
        }
        return this.f212298f;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f212299g.f212320l.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f212299g.f212320l.f228344d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.widget.picker.m0 m0Var;
        com.tencent.mm.ui.widget.picker.p0 p0Var = this.f212299g;
        db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) p0Var.f212320l.f228344d).get(i17);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f212296d);
        if (view == null) {
            view = from.inflate(com.tencent.mm.R.layout.byr, (android.view.ViewGroup) null);
            m0Var = new com.tencent.mm.ui.widget.picker.m0(this);
            m0Var.f212295d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hic);
            m0Var.f212294c = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.hha);
            m0Var.f212292a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hjn);
            m0Var.f212293b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.hhg);
            view.setTag(m0Var);
        } else {
            m0Var = (com.tencent.mm.ui.widget.picker.m0) view.getTag();
        }
        m0Var.f212292a.setText(h4Var.getTitle());
        m0Var.f212295d.setOnClickListener(new com.tencent.mm.ui.widget.picker.l0(this, i17, h4Var));
        if (m0Var.f212293b != null) {
            java.lang.CharSequence charSequence = h4Var.f228373q;
            if (charSequence == null || charSequence.length() <= 0) {
                m0Var.f212293b.setVisibility(8);
            } else {
                m0Var.f212293b.setVisibility(0);
                m0Var.f212293b.setText(h4Var.f228373q);
            }
        }
        if (h4Var.f228375s) {
            m0Var.f212292a.setTextColor(p0Var.f212311c.getResources().getColor(com.tencent.mm.R.color.f478728fj));
            m0Var.f212293b.setTextColor(p0Var.f212311c.getResources().getColor(com.tencent.mm.R.color.f478728fj));
            m0Var.f212294c.setChecked(((java.lang.Boolean) this.f212297e.get(java.lang.Integer.valueOf(i17))).booleanValue());
            m0Var.f212294c.setEnabled(false);
        } else {
            m0Var.f212292a.setTextColor(p0Var.f212311c.getResources().getColor(com.tencent.mm.R.color.f478727fi));
            m0Var.f212293b.setTextColor(p0Var.f212311c.getResources().getColor(com.tencent.mm.R.color.f478729fk));
            m0Var.f212294c.setChecked(((java.lang.Boolean) this.f212297e.get(java.lang.Integer.valueOf(i17))).booleanValue());
            m0Var.f212294c.setEnabled(true);
        }
        return view;
    }
}
