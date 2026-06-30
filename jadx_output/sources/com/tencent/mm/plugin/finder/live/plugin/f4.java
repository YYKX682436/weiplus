package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f112497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112498e;

    public f4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, android.view.ViewGroup viewGroup) {
        this.f112497d = a5Var;
        this.f112498e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ll2.e eVar = ll2.e.f319133a;
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f112497d;
        ll2.e.b(eVar, a5Var.D1(), false, false, 6, null);
        a5Var.f111800r.animate().translationY(com.tencent.mm.ui.bl.b(r1.getContext()).y).setDuration(100L).setListener(new com.tencent.mm.plugin.finder.live.plugin.e4(a5Var, this.f112498e)).start();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorCameraOptPanelPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
