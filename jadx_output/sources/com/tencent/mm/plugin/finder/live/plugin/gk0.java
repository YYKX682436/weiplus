package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gk0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jk0 f112709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f112710e;

    public gk0(com.tencent.mm.plugin.finder.live.plugin.jk0 jk0Var, android.app.Activity activity) {
        this.f112709d = jk0Var;
        this.f112710e = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.xf W0 = this.f112709d.W0();
        if (W0 != null) {
            ((dk2.r4) W0).r(this.f112710e, true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorRoleGuidePlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
