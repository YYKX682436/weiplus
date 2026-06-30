package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uw extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView f120009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120010e;

    public uw(com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView, android.content.Context context) {
        this.f120009d = finderLiveTaskBannerView;
        this.f120010e = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.LinkedList linkedList = this.f120009d.f117676g;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.qw holder = (com.tencent.mm.plugin.finder.live.widget.qw) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView = this.f120009d;
        java.util.LinkedList linkedList = finderLiveTaskBannerView.f117676g;
        com.tencent.mm.plugin.finder.live.widget.pw pwVar = linkedList != null ? (com.tencent.mm.plugin.finder.live.widget.pw) linkedList.get(i17) : null;
        android.content.Context context = this.f120010e;
        if (pwVar != null) {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f484826fn3);
            mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(((com.tencent.mm.plugin.finder.live.widget.ow) pwVar).f119330a.getString(0), com.tencent.mm.plugin.finder.storage.y90.f128355e), mMRoundCornerImageView, g1Var.h(mn2.f1.f329953d));
            mMRoundCornerImageView.setTag(com.tencent.mm.R.id.f484415e72, null);
            mMRoundCornerImageView.setRadius(i65.a.b(context, 8));
            mMRoundCornerImageView.setId(com.tencent.mm.R.id.f484828fn5);
            ((com.tencent.neattextview.textview.view.NeatTextView) holder.itemView.findViewById(com.tencent.mm.R.id.f484827fn4)).b(null);
        }
        holder.itemView.setTag(java.lang.Integer.valueOf(i17));
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.tw(finderLiveTaskBannerView, context, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView finderLiveTaskBannerView = this.f120009d;
        android.view.View inflate = android.view.LayoutInflater.from(finderLiveTaskBannerView.getMContext()).inflate(com.tencent.mm.R.layout.f489000b05, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.qw(finderLiveTaskBannerView, inflate);
    }
}
