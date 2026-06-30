package com.tencent.mm.plugin.finder.live.wish;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/wish/FinderLiveWishBannerView;", "Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView;", "Lr45/aa4;", "Lkn2/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveWishBannerView extends com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView<r45.aa4, kn2.a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveWishBannerView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView
    public void d(androidx.recyclerview.widget.k3 k3Var, int i17) {
        kn2.a holder = (kn2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.aa4 aa4Var = getDataList().get(i17);
        kotlin.jvm.internal.o.f(aa4Var, "get(...)");
        r45.aa4 aa4Var2 = aa4Var;
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        dk2.u7 u7Var = dk2.u7.f234181a;
        r45.kv1 kv1Var = (r45.kv1) aa4Var2.getCustom(0);
        ce2.i e17 = u7Var.e(kv1Var != null ? kv1Var.getString(0) : null);
        wo0.c a17 = d1Var.a(new mn2.q3(e17 != null ? e17.field_thumbnailFileUrl : null, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        fg2.z1 z1Var = holder.f309662d;
        android.widget.ImageView wishIcon = z1Var.f262421c;
        kotlin.jvm.internal.o.f(wishIcon, "wishIcon");
        ((wo0.b) a17).c(wishIcon);
        long j17 = aa4Var2.getLong(2);
        long j18 = aa4Var2.getLong(1);
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView = z1Var.f262423e;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView2 = z1Var.f262427i;
        com.tencent.mm.plugin.finder.live.view.FinderFixedTextView finderFixedTextView3 = z1Var.f262425g;
        if (j17 >= j18) {
            finderFixedTextView3.setVisibility(8);
            finderFixedTextView2.setVisibility(8);
            finderFixedTextView.setVisibility(0);
            return;
        }
        finderFixedTextView3.setVisibility(0);
        finderFixedTextView2.setVisibility(0);
        finderFixedTextView.setVisibility(8);
        finderFixedTextView3.setText(java.lang.String.valueOf(aa4Var2.getLong(2)));
        finderFixedTextView2.setText("/" + aa4Var2.getLong(1));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.FinderLiveLoopBannerView
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new kn2.a(fg2.z1.a(com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489023b23, (android.view.ViewGroup) null, false)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveWishBannerView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
