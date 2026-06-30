package kp2;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC f310960d;

    public e(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC) {
        this.f310960d = nearbyLiveSquareUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC$initSearchItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.O6(this.f310960d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/live/square/NearbyLiveSquareUIC$initSearchItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
