package cp2;

/* loaded from: classes2.dex */
public final class c1 extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public c1(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        super(nearbyLiveItemConvertFactory, arrayList, false, 4, null);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams)) {
            return;
        }
        ((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i = holder.getItemViewType() == -1 || holder.getItemViewType() == -9 || holder.getItemViewType() == -10 || holder.getItemViewType() == 6 || holder.getItemViewType() == 4 || holder.getItemViewType() == 2022;
    }
}
