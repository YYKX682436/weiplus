package com.tencent.mm.plugin.game.ui;

/* loaded from: classes15.dex */
public class d6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141365d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141366e = "";

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f141367f = new java.util.LinkedList();

    public d6(android.content.Context context) {
        this.f141365d = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f141367f.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.game.ui.b6) this.f141367f.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.game.ui.c6 c6Var;
        com.tencent.mm.plugin.game.ui.b6 b6Var = (com.tencent.mm.plugin.game.ui.b6) this.f141367f.get(i17);
        android.content.Context context = this.f141365d;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.bhp, null);
            c6Var = new com.tencent.mm.plugin.game.ui.c6(null);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gon);
            c6Var.f141080a = textView;
            c6Var.f141081b = (android.view.ViewGroup) textView.getParent();
            c6Var.f141082c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gom);
            c6Var.f141083d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gok);
            c6Var.f141084e = (android.view.ViewGroup) c6Var.f141082c.getParent();
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gol);
            c6Var.f141085f = textView2;
            c6Var.f141086g = (android.view.ViewGroup) textView2.getParent().getParent();
            view.setTag(c6Var);
        } else {
            c6Var = (com.tencent.mm.plugin.game.ui.c6) view.getTag();
        }
        int i18 = b6Var.f141059a;
        if (i18 == 1) {
            c6Var.f141081b.setVisibility(0);
            c6Var.f141084e.setVisibility(8);
            c6Var.f141086g.setVisibility(8);
            c6Var.f141081b.setOnClickListener(null);
            c6Var.f141080a.setText(b6Var.f141060b);
        } else if (i18 == 2) {
            c6Var.f141081b.setVisibility(8);
            c6Var.f141084e.setVisibility(0);
            c6Var.f141086g.setVisibility(8);
            c6Var.f141082c.setText(b6Var.f141060b);
            c6Var.f141083d.setText(b6Var.f141062d);
        } else if (i18 == 3) {
            c6Var.f141081b.setVisibility(8);
            c6Var.f141084e.setVisibility(8);
            c6Var.f141086g.setVisibility(0);
            c6Var.f141085f.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            int color = context.getResources().getColor(com.tencent.mm.R.color.f479202sq);
            int indexOf = b6Var.f141060b.indexOf(this.f141366e);
            if (indexOf >= 0) {
                android.text.SpannableString spannableString = new android.text.SpannableString(b6Var.f141060b);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(color), indexOf, this.f141366e.length() + indexOf, 33);
                c6Var.f141085f.setText(spannableString);
            } else {
                c6Var.f141085f.setText(b6Var.f141060b);
            }
        }
        return view;
    }
}
