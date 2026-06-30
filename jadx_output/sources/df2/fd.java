package df2;

/* loaded from: classes3.dex */
public final class fd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.od f230134d;

    public fd(df2.od odVar) {
        this.f230134d = odVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBannerController$getBannerViewOnLiving$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.od odVar = this.f230134d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew = odVar.f230955o;
        if (finderLiveTaskBannerViewNew != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.xw(false, finderLiveTaskBannerViewNew));
        }
        com.tencent.mm.plugin.finder.live.widget.rx rxVar = odVar.f230954n;
        if (rxVar != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.W(rxVar, null, false, 0, 7, null);
        }
        df2.od.f230952w.a(odVar.getStore().getLiveRoomData(), 2, 1, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBannerController$getBannerViewOnLiving$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
