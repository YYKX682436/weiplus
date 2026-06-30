package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fe f120061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f120062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ce f120063f;

    public vd(com.tencent.mm.plugin.finder.live.widget.fe feVar, r45.h84 h84Var, com.tencent.mm.plugin.finder.live.widget.ce ceVar) {
        this.f120061d = feVar;
        this.f120062e = h84Var;
        this.f120063f = ceVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.fe feVar = this.f120061d;
        r45.h84 elementInfo = this.f120062e;
        com.tencent.mm.plugin.finder.live.widget.fe.b(feVar, 4, elementInfo.getString(0), elementInfo.getString(1), 0L, 8, null);
        com.tencent.mm.plugin.finder.live.widget.fe feVar2 = this.f120061d;
        com.tencent.mm.plugin.finder.live.widget.ce ceVar = feVar2.f118349g;
        android.view.View view2 = ceVar != null ? ceVar.f117998i : null;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.live.widget.ce ceVar2 = this.f120063f;
        feVar2.f118349g = ceVar2;
        android.view.View view3 = ceVar2 != null ? ceVar2.f117998i : null;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ceVar2.getClass();
        kotlin.jvm.internal.o.g(elementInfo, "elementInfo");
        kotlinx.coroutines.r2 r2Var = ceVar2.f118001o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.plugin.finder.live.widget.fe feVar3 = ceVar2.f118002p;
        kotlinx.coroutines.y0 y0Var = feVar3.f118344b;
        ceVar2.f118001o = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.live.widget.be(elementInfo, feVar3, ceVar2, null), 3, null) : null;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
