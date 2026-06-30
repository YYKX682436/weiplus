package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class uo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.hp f119981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f119984g;

    public uo(com.tencent.mm.plugin.finder.live.widget.hp hpVar, java.lang.String str, int i17, r45.xn1 xn1Var) {
        this.f119981d = hpVar;
        this.f119982e = str;
        this.f119983f = i17;
        this.f119984g = xn1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$handleWxFinderDetail$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f119982e;
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.f119981d;
        com.tencent.mm.plugin.finder.live.widget.hp.e0(hpVar, str);
        hpVar.t0(2, hpVar.j0(this.f119983f), java.lang.Integer.valueOf(this.f119984g.getInteger(7)), null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveMemebrProfileWidget$handleWxFinderDetail$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
