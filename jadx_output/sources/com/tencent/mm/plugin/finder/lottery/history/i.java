package com.tencent.mm.plugin.finder.lottery.history;

/* loaded from: classes.dex */
public final class i extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ats;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.y2 item = (so2.y2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.f293125i = item;
        android.content.Context context = holder.f293121e;
        android.content.res.Resources resources = context.getResources();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ir8);
        r45.xc5 xc5Var = item.f410724d;
        java.lang.String string = xc5Var.getString(2);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        java.lang.String string2 = xc5Var.getString(2);
        java.lang.String str = string2 != null ? string2 : "";
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str != null) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.isl);
            textView2.setText(str);
            textView2.getVisibility();
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.isl)).getVisibility();
        }
        if (xc5Var.getInteger(0) == 2) {
            holder.p(com.tencent.mm.R.id.uda).setBackgroundColor(android.graphics.Color.parseColor("#215CB5"));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ud_)).setIconColor(resources.getColor(com.tencent.mm.R.color.aay));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ud_)).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_gift_chatting, resources.getColor(com.tencent.mm.R.color.aay)));
        } else {
            holder.p(com.tencent.mm.R.id.uda).setBackgroundColor(android.graphics.Color.parseColor("#FA5151"));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ud_)).setIconColor(resources.getColor(com.tencent.mm.R.color.aay));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.ud_)).setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_reward_new, resources.getColor(com.tencent.mm.R.color.aay)));
        }
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.ir8)).setText(k35.m1.g(context.getString(com.tencent.mm.R.string.ley), xc5Var.getLong(1) * 1000));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
