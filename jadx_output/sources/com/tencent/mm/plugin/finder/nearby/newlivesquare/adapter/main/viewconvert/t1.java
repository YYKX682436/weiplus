package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes.dex */
public class t1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public vp2.s f121945e;

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.el8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        java.lang.Object a07;
        r45.pw1 pw1Var;
        vp2.s item = (vp2.s) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f121945e = item;
        if (list == null || (a07 = kz5.n0.a0(list, 0)) == null || !(a07 instanceof dk2.zg)) {
            z18 = false;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("consume payload ");
            dk2.zg zgVar = (dk2.zg) a07;
            r45.il0 il0Var = zgVar.f234443f;
            sb6.append(il0Var != null ? java.lang.Integer.valueOf(il0Var.getInteger(0)) : null);
            com.tencent.mars.xlog.Log.i("Finder.LiveInteractionEntranceConvert", sb6.toString());
            r45.il0 il0Var2 = zgVar.f234443f;
            java.lang.Integer valueOf = il0Var2 != null ? java.lang.Integer.valueOf(il0Var2.getInteger(0)) : null;
            vp2.s sVar = this.f121945e;
            if (kotlin.jvm.internal.o.b(valueOf, (sVar == null || (pw1Var = sVar.f438954d) == null) ? null : java.lang.Integer.valueOf(pw1Var.getInteger(0)))) {
                r45.il0 il0Var3 = zgVar.f234443f;
                java.lang.String string = il0Var3 != null ? il0Var3.getString(1) : null;
                android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u5a);
                if (string == null || string.length() == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(string);
                    textView.setVisibility(0);
                }
            }
            z18 = true;
        }
        if (z18) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        android.content.Context context = holder.f293121e;
        layoutParams.width = (context.getResources().getDisplayMetrics().widthPixels - (i65.a.b(context, 12) * 3)) / 2;
        layoutParams.height = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479727dj);
        holder.itemView.setLayoutParams(layoutParams);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.u5_);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u5b);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.u5a);
        r45.pw1 pw1Var2 = item.f438954d;
        textView2.setText(pw1Var2.getString(1));
        java.lang.String string2 = pw1Var2.getString(2);
        if (string2 == null || string2.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(pw1Var2.getString(2));
        }
        int integer = pw1Var2.getInteger(0);
        if (integer == 1) {
            weImageView.setImageResource(com.tencent.mm.R.raw.finder_icons_filled_link_mic);
            weImageView.setIconColor(-1);
        } else if (integer != 2) {
            weImageView.setImageResource(com.tencent.mm.R.raw.finder_icons_filled_link_mic);
            weImageView.setIconColor(-1);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.microphone_note_filled);
            weImageView.setIconColor(-1);
        }
        android.view.View view = holder.itemView;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(pw1Var2.getString(1));
        java.lang.String string3 = pw1Var2.getString(2);
        if (!(string3 == null || string3.length() == 0)) {
            sb7.append(",");
            sb7.append(pw1Var2.getString(2));
        }
        java.lang.String sb8 = sb7.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        view.setContentDescription(sb8);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f121945e = null;
    }
}
