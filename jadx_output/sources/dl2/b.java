package dl2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView f235186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f235187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.c f235188f;

    public b(com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView, int i17, dl2.c cVar) {
        this.f235186d = finderLiveCustomGiftTagView;
        this.f235187e = i17;
        this.f235188f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveCustomGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f235187e;
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView = this.f235186d;
        finderLiveCustomGiftTagView.setSelectedTabIndex(i17);
        this.f235188f.notifyDataSetChanged();
        yz5.l lVar = finderLiveCustomGiftTagView.f114751m;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(finderLiveCustomGiftTagView.selectedTabIndex));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveCustomGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
