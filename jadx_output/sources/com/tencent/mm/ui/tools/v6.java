package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public class v6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.w6 f210843d;

    public v6(com.tencent.mm.ui.tools.w6 w6Var, com.tencent.mm.ui.tools.t6 t6Var) {
        this.f210843d = w6Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.ui.tools.w6 w6Var = this.f210843d;
        return w6Var.f210878s ? w6Var.f210879t.size() + 1 : w6Var.f210879t.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return (this.f210843d.f210878s && i17 == 0) ? 0 : 1;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.tools.u6 u6Var;
        com.tencent.mm.ui.tools.u6 u6Var2;
        com.tencent.mm.ui.tools.w6 w6Var = this.f210843d;
        boolean z17 = w6Var.f210878s;
        if (z17 && i17 == 0) {
            if (view == null) {
                view = w6Var.f210876q.inflate(com.tencent.mm.R.layout.c1j, viewGroup, false);
                u6Var2 = new com.tencent.mm.ui.tools.u6(this, null);
                u6Var2.f210813a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
                u6Var2.f210814b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n);
                view.setTag(u6Var2);
            } else {
                u6Var2 = (com.tencent.mm.ui.tools.u6) view.getTag();
            }
            android.widget.TextView textView = u6Var2.f210813a;
            db5.g4 g4Var = w6Var.f210879t;
            java.lang.CharSequence charSequence = g4Var.f228345e;
            textView.setText((charSequence == null || charSequence.length() == 0) ? w6Var.f210424e.getResources().getString(com.tencent.mm.R.string.f490352sk) : g4Var.f228345e);
        } else {
            if (z17) {
                i17--;
            }
            if (view == null) {
                view = w6Var.f210876q.inflate(com.tencent.mm.R.layout.c1i, viewGroup, false);
                u6Var = new com.tencent.mm.ui.tools.u6(this, null);
                u6Var.f210813a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
                u6Var.f210814b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h5n);
                u6Var.f210815c = view.findViewById(com.tencent.mm.R.id.m7g);
                view.setTag(u6Var);
            } else {
                u6Var = (com.tencent.mm.ui.tools.u6) view.getTag();
            }
            android.view.MenuItem item = w6Var.f210879t.getItem(i17);
            u6Var.f210813a.setText(item.getTitle());
            if (item.getIcon() != null) {
                u6Var.f210814b.setVisibility(0);
                u6Var.f210814b.setImageDrawable(item.getIcon());
            } else {
                u6Var.f210814b.setVisibility(8);
            }
            if (i17 == r0.size() - 1) {
                u6Var.f210815c.setBackgroundResource(com.tencent.mm.R.drawable.b4h);
            } else {
                u6Var.f210815c.setBackgroundResource(com.tencent.mm.R.drawable.b4g);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.f210843d.f210878s ? 2 : 1;
    }
}
