package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.dh f123572e;

    public bh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC, com.tencent.mm.plugin.finder.profile.uic.dh dhVar) {
        this.f123571d = finderProfileTingAudioUIC;
        this.f123572e = dhVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.model.FinderProfileTingAudioListLoader finderProfileTingAudioListLoader = this.f123571d.f123483o;
        if (finderProfileTingAudioListLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        finderProfileTingAudioListLoader.requestRefresh();
        com.tencent.mm.plugin.finder.profile.uic.dh dhVar = this.f123572e;
        com.tencent.mm.view.refreshLayout.WxRefreshLayout.y(dhVar.f132666d, false, 1, null);
        dhVar.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
