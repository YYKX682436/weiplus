package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class th implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC f124238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f124239e;

    public th(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC, java.util.List list) {
        this.f124238d = finderProfileTingAudioWithCollectionUIC;
        this.f124239e = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC$initCollectionListLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_profile_type", intent.getIntExtra("key_enter_profile_type", 0));
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC finderProfileTingAudioWithCollectionUIC = this.f124238d;
        intent.putExtra("finder_username", com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioWithCollectionUIC.R6(finderProfileTingAudioWithCollectionUIC));
        intent.putExtra("key_audio_collection_count", finderProfileTingAudioWithCollectionUIC.f123490m);
        intent.putExtra("KEY_FINDER_SELF_FLAG", finderProfileTingAudioWithCollectionUIC.isSelfFlag());
        r45.wx0 N = finderProfileTingAudioWithCollectionUIC.f123489i.N();
        hc2.e0.b(intent, 0, this.f124239e, N != null ? N.getByteString(2) : null, null);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        androidx.appcompat.app.AppCompatActivity context = finderProfileTingAudioWithCollectionUIC.getActivity();
        i0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(999);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderTingAudioCollectionUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioWithCollectionUIC$initCollectionListLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
