package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC f124191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dg4 f124192e;

    public rh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC, r45.dg4 dg4Var) {
        this.f124191d = finderProfileTingAudioWithCollectionUIC;
        this.f124192e = dg4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC$initAudioListLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC.S6(this.f124191d, this.f124192e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC$initAudioListLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
