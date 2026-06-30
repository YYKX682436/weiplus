package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class gi implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ri f123745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ii f123746e;

    public gi(com.tencent.mm.plugin.finder.profile.uic.ri riVar, com.tencent.mm.plugin.finder.profile.uic.ii iiVar) {
        this.f123745d = riVar;
        this.f123746e = iiVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingSongListUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingSongListLoader finderProfileTingSongListLoader = this.f123745d.f124196o;
        if (finderProfileTingSongListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        finderProfileTingSongListLoader.requestRefresh();
        com.tencent.mm.plugin.finder.profile.uic.ii iiVar = this.f123746e;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout.y(iiVar.f132666d, false, 1, null);
        iiVar.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingSongListUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
