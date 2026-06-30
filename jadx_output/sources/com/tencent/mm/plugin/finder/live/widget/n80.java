package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class n80 extends androidx.recyclerview.widget.f2 {
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.s80 S1;

    public n80(com.tencent.mm.plugin.finder.live.widget.s80 s80Var) {
        this.S1 = s80Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.S1.f119741c2).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.p80 holder = (com.tencent.mm.plugin.finder.live.widget.p80) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.s80 s80Var = this.S1;
        com.tencent.mm.plugin.finder.live.widget.l80 l80Var = (com.tencent.mm.plugin.finder.live.widget.l80) ((java.util.ArrayList) s80Var.f119741c2).get(i17);
        int i18 = l80Var.f118918a;
        android.content.Context context = s80Var.f118183e;
        holder.f119371p1.setText(context.getString(i18));
        int i19 = l80Var.f118919b;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f119372x1;
        weImageView.setImageResource(i19);
        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        android.widget.ImageView imageView = holder.f119373y1;
        if (imageView != null) {
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.f482054aw3);
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.m80(l80Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.eef, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.p80(inflate);
    }
}
