package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ml0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.pl0 f113527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.z f113528e;

    public ml0(com.tencent.mm.plugin.finder.live.plugin.pl0 pl0Var, cm2.z zVar) {
        this.f113527d = pl0Var;
        this.f113528e = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f113527d.f113910g;
        if (lVar != null) {
            lVar.invoke(this.f113528e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveWecomBubble$refreshView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
