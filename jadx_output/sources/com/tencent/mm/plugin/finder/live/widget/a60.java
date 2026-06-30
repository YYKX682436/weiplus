package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a60 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f117736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.y50 f117737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b60 f117738f;

    public a60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var, com.tencent.mm.plugin.finder.live.widget.y50 y50Var, com.tencent.mm.plugin.finder.live.widget.b60 b60Var) {
        this.f117736d = z60Var;
        this.f117737e = y50Var;
        this.f117738f = b60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean a17 = com.tencent.mm.plugin.finder.live.widget.z60.a(this.f117736d);
        com.tencent.mm.plugin.finder.live.widget.y50 y50Var = this.f117737e;
        if (a17 && !kotlin.jvm.internal.o.b(y50Var.f120415a, "co_live")) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            this.f117738f.f117840d.invoke(y50Var.f120415a);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderStartLiveModeTabWidget$TabListAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
