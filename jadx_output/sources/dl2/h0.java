package dl2;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView f235224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f235225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dl2.i0 f235226f;

    public h0(com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView, int i17, dl2.i0 i0Var) {
        this.f235224d = finderLiveGiftTagView;
        this.f235225e = i17;
        this.f235226f = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = this.f235224d;
        int i17 = this.f235225e;
        finderLiveGiftTagView.setSelectedTabIndex(i17);
        this.f235226f.notifyDataSetChanged();
        if (i17 == 0) {
            yz5.l lVar = finderLiveGiftTagView.f114760n;
            if (lVar != null) {
                lVar.invoke(0);
            }
        } else if (i17 > 0) {
            java.util.List list = finderLiveGiftTagView.f114757h;
            int intValue = list != null ? ((java.lang.Number) list.get(i17 - 1)).intValue() : 0;
            yz5.l lVar2 = finderLiveGiftTagView.f114760n;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Integer.valueOf(intValue));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/view/gift/FinderLiveGiftTagView$adapter$2$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
