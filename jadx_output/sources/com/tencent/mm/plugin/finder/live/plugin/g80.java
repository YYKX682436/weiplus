package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class g80 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i80 f112647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.f0 f112648e;

    public g80(com.tencent.mm.plugin.finder.live.plugin.i80 i80Var, cm2.f0 f0Var) {
        this.f112647d = i80Var;
        this.f112648e = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.i80 i80Var = this.f112647d;
        yz5.l lVar = i80Var.f112940g;
        cm2.f0 f0Var = this.f112648e;
        if (lVar != null) {
            lVar.invoke(f0Var);
        }
        i80Var.a(f0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRedPacketBubble$refreshBtnStatus$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
