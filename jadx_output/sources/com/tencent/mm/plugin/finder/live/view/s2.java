package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes5.dex */
public final class s2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView f116667d;

    public s2(com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView) {
        this.f116667d = finderLiveCameraOptBeautyPowerfulDetailsView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f116667d.getEffectItems().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.view.t2 holder = (com.tencent.mm.plugin.finder.live.view.t2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 >= 0) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveCameraOptBeautyPowerfulDetailsView finderLiveCameraOptBeautyPowerfulDetailsView = this.f116667d;
            if (i17 >= finderLiveCameraOptBeautyPowerfulDetailsView.getEffectItems().size()) {
                return;
            }
            boolean z17 = false;
            int a17 = i17 == 0 ? com.tencent.mm.ui.zk.a(holder.itemView.getContext(), 32) : 0;
            android.view.View view = holder.itemView;
            view.setPadding(a17, view.getPaddingTop(), holder.itemView.getPaddingRight(), holder.itemView.getPaddingBottom());
            java.lang.String str = finderLiveCameraOptBeautyPowerfulDetailsView.getEffectItems().get(i17).f366424b;
            android.widget.TextView textView = holder.f116689d;
            textView.setText(str);
            qs5.c selectedEffect = finderLiveCameraOptBeautyPowerfulDetailsView.getSelectedEffect();
            if (selectedEffect != null) {
                if (selectedEffect.f366423a == finderLiveCameraOptBeautyPowerfulDetailsView.getEffectItems().get(i17).f366423a) {
                    z17 = true;
                }
            }
            textView.setActivated(z17);
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.r2(finderLiveCameraOptBeautyPowerfulDetailsView, i17));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.ae_, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.live.view.t2(inflate);
    }
}
