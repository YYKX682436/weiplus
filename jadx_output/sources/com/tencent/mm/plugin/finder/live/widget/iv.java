package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class iv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.sv f118699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f118700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pv f118701f;

    public iv(com.tencent.mm.plugin.finder.live.widget.sv svVar, r45.h84 h84Var, com.tencent.mm.plugin.finder.live.widget.pv pvVar) {
        this.f118699d = svVar;
        this.f118700e = h84Var;
        this.f118701f = pvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.sv svVar = this.f118699d;
        r45.h84 elementInfo = this.f118700e;
        com.tencent.mm.plugin.finder.live.widget.sv.b(svVar, 4, elementInfo.getString(0), elementInfo.getString(1), 0L, 8, null);
        com.tencent.mm.plugin.finder.live.widget.sv svVar2 = this.f118699d;
        com.tencent.mm.plugin.finder.live.widget.pv pvVar = svVar2.f119846g;
        android.view.View view2 = pvVar != null ? pvVar.f119450i : null;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.pv pvVar2 = this.f118701f;
        svVar2.f119846g = pvVar2;
        android.view.View view3 = pvVar2 != null ? pvVar2.f119450i : null;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        pvVar2.getClass();
        kotlin.jvm.internal.o.g(elementInfo, "elementInfo");
        kotlinx.coroutines.r2 r2Var = pvVar2.f119453o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.plugin.finder.live.widget.sv svVar3 = pvVar2.f119454p;
        kotlinx.coroutines.y0 y0Var = svVar3.f119841b;
        pvVar2.f119453o = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.ov(elementInfo, svVar3, pvVar2, null), 3, null) : null;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveScreenEffectWidget$ElementAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
