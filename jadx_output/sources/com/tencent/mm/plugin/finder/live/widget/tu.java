package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class tu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f119909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.vu f119910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn2.d f119911f;

    public tu(r45.yx1 yx1Var, com.tencent.mm.plugin.finder.live.widget.vu vuVar, hn2.d dVar) {
        this.f119909d = yx1Var;
        this.f119910e = vuVar;
        this.f119911f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request, name ");
        r45.yx1 yx1Var = this.f119909d;
        sb6.append(yx1Var.f391466o.f371143d.f370351e);
        com.tencent.mars.xlog.Log.i("FinderLiveRequestSingingSongWidget", sb6.toString());
        com.tencent.mm.plugin.finder.live.widget.vu vuVar = this.f119910e;
        boolean q76 = vuVar.f120090b.q7(6);
        hn2.d dVar = this.f119911f;
        if (!q76) {
            sf2.d3 d3Var = vuVar.f120090b;
            d3Var.f407106p = dVar;
            d3Var.f407107q = 2;
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = vuVar.f120098j;
        kotlin.jvm.internal.o.f(mMProcessBar, "<get-btnProgress>(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mMProcessBar, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMProcessBar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mMProcessBar, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.button.WeButton weButton = vuVar.f120099k;
        kotlin.jvm.internal.o.f(weButton, "<get-btnRequestSong>(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(weButton, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weButton.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(weButton, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        vuVar.c(2, bm2.y8.f22462e, 1, yx1Var.f391466o.f371143d);
        com.tencent.mm.plugin.finder.live.util.y.d(vuVar.f120090b, null, null, new com.tencent.mm.plugin.finder.live.widget.su(vuVar, dVar, yx1Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveRequestSingingSongWidget$populateSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
