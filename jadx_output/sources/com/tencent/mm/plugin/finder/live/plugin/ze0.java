package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ze0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jf0 f115335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115336e;

    public ze0(com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var, android.view.View view) {
        this.f115335d = jf0Var;
        this.f115336e = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var = this.f115335d;
        android.content.Context context = jf0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        pl2.s sVar = ((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356684g;
        if (sVar != null) {
            pl2.s.e(sVar, 0L, null, 3, null);
        }
        android.content.Context context2 = jf0Var.f365323d.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(pl2.x.class)).f356687m.f356678h = 3;
        android.view.View view2 = this.f115336e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin$showSidebarMask$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
