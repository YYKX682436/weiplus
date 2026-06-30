package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.nz6 f120285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.y4 f120286e;

    public x4(r45.nz6 nz6Var, com.tencent.mm.plugin.finder.live.widget.y4 y4Var) {
        this.f120285d = nz6Var;
        this.f120286e = y4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorDefinitionWidget$AnchorDefinitionAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.nz6 nz6Var = this.f120285d;
        int i17 = nz6Var.f381778d;
        com.tencent.mm.plugin.finder.live.widget.y4 y4Var = this.f120286e;
        if (i17 != y4Var.f120411e) {
            y4Var.f120412f.invoke(nz6Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorDefinitionWidget$AnchorDefinitionAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
