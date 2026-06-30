package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class z9 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ga f120554d;

    public z9(com.tencent.mm.plugin.finder.live.widget.ga gaVar) {
        this.f120554d = gaVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f120554d.I).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.ba holder = (com.tencent.mm.plugin.finder.live.widget.ba) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.ga gaVar = this.f120554d;
        com.tencent.mm.plugin.finder.live.widget.ca caVar = (com.tencent.mm.plugin.finder.live.widget.ca) ((java.util.ArrayList) gaVar.I).get(i17);
        int i18 = caVar.f117983b;
        android.content.Context context = gaVar.f118183e;
        holder.f117855d.setText(context.getString(i18));
        int i19 = caVar.f117984c;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f117856e;
        weImageView.setImageResource(i19);
        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        android.widget.ImageView imageView = holder.f117857f;
        if (imageView != null) {
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.f482054aw3);
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.y9(caVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.eef, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.ba(inflate);
    }
}
