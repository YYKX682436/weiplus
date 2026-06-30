package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class hh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC f123772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.sd1 f123773e;

    public hh(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTingAudioUIC finderProfileTingAudioUIC, r45.sd1 sd1Var) {
        this.f123772d = finderProfileTingAudioUIC;
        this.f123773e = sd1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$initAudioPostLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.uic.fk.Q6(this.f123772d, this.f123773e, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTingAudioUIC$initAudioPostLayout$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
