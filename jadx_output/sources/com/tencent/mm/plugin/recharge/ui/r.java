package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class r extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f155219d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.recharge.ui.p f155220e = null;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f155221f = new java.util.ArrayList(com.tencent.mm.sdk.platformtools.t8.O1((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PHONE_RECHARGE_RECOMMENDED_LIST_STRING_SYNC, ""), ","));

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f155219d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f155219d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.recharge.ui.q qVar;
        vr4.b1 b1Var = (vr4.b1) getItem(i17);
        if (view == null) {
            view = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ccs, viewGroup, false);
            qVar = new com.tencent.mm.plugin.recharge.ui.q(this, null);
            qVar.f155215b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2);
            qVar.f155214a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k3f);
            qVar.f155216c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l6f);
            qVar.f155217d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486560lo4);
            view.setTag(qVar);
        } else {
            qVar = (com.tencent.mm.plugin.recharge.ui.q) view.getTag();
        }
        qVar.f155214a.setText(b1Var.f439691e);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f439692f)) {
            qVar.f155215b.setVisibility(8);
        } else {
            qVar.f155215b.setVisibility(0);
            qVar.f155215b.setText(b1Var.f439692f);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f439697n)) {
            qVar.f155216c.setVisibility(8);
        } else {
            qVar.f155216c.setVisibility(0);
            qVar.f155216c.setText(b1Var.f439697n);
        }
        if (b1Var.f439693g == 1) {
            view.setEnabled(true);
            qVar.f155215b.setEnabled(true);
            qVar.f155214a.setEnabled(true);
        } else {
            view.setEnabled(false);
            qVar.f155215b.setEnabled(false);
            qVar.f155214a.setEnabled(false);
        }
        if (b1Var.f439703t != 1 || ((java.util.ArrayList) this.f155221f).contains(b1Var.f439704u)) {
            qVar.f155217d.setVisibility(8);
        } else {
            qVar.f155217d.setVisibility(0);
        }
        if (b1Var.f439695i == 1 && b1Var.f439698o.equals("1") && !b1Var.f439699p.equals("0")) {
            android.content.Context context = viewGroup.getContext();
            int b17 = com.tencent.mm.plugin.wallet_core.utils.z1.b(b1Var.f439699p, false);
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(i65.a.b(context, 2));
            gradientDrawable.setColor(b17);
            android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(i65.a.b(context, 2));
            gradientDrawable2.setStroke(2, i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2));
            android.graphics.drawable.GradientDrawable gradientDrawable3 = new android.graphics.drawable.GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(i65.a.b(context, 2));
            gradientDrawable3.setColor(i65.a.d(context, com.tencent.mm.R.color.a2d));
            gradientDrawable3.setStroke(2, b17);
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
            stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
            stateListDrawable.addState(new int[0], gradientDrawable3);
            android.content.Context context2 = viewGroup.getContext();
            android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{-16842910}, new int[0]}, new int[]{i65.a.d(context2, com.tencent.mm.R.color.aaw), i65.a.d(context2, com.tencent.mm.R.color.a2b), com.tencent.mm.plugin.wallet_core.utils.z1.b(b1Var.f439699p, false)});
            qVar.f155215b.setTextColor(colorStateList);
            qVar.f155214a.setTextColor(colorStateList);
            view.setBackground(stateListDrawable);
        }
        view.setOnClickListener(new com.tencent.mm.plugin.recharge.ui.o(this, b1Var, qVar));
        return view;
    }
}
