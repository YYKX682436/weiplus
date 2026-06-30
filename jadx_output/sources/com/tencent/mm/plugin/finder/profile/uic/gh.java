package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class gh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.e6 f123743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123744e;

    public gh(db2.e6 e6Var, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC) {
        this.f123743d = e6Var;
        this.f123744e = finderProfileTingAudioUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$initAudioPostLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.sd1 O = this.f123743d.O();
        if (O != null) {
            com.tencent.mm.plugin.finder.profile.uic.fk.Q6(this.f123744e, O, null, 2, null);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderProfileTingAudioUIC", "gotoLiteApp but postLiteApp is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$initAudioPostLayout$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
