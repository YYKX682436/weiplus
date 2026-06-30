package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.w f123396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f123397e;

    public m(com.tencent.mm.plugin.finder.profile.w wVar, kotlin.jvm.internal.h0 h0Var) {
        this.f123396d = wVar;
        this.f123397e = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handleProfilePoi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.profile.w wVar = this.f123396d;
        android.app.Activity activity = wVar.f124444a;
        r45.l95 l95Var = ((r45.v96) this.f123397e.f310123d).f388009d;
        wVar.j(activity, l95Var != null ? l95Var.f379241d : null);
        java.lang.CharSequence text = wVar.g().getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        wVar.k(1, str, wVar.f124453j);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/FinderProfilePoiHandler$handleProfilePoi$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
