package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.d5 f117514f;

    public w4(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, int i17, com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var) {
        this.f117512d = r5Var;
        this.f117513e = i17;
        this.f117514f = d5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f117512d;
        com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var = (com.tencent.mm.plugin.finder.live.viewmodel.c6) kz5.n0.a0(r5Var.f117360o, this.f117513e);
        if (c6Var != null) {
            yz5.p pVar = r5Var.f117361p;
            if (pVar != null) {
                ((com.tencent.mm.plugin.finder.live.viewmodel.i5) pVar).invoke(c6Var, java.lang.Boolean.valueOf(this.f117514f.f117032i));
            }
            com.tencent.mm.plugin.finder.live.widget.sl slVar = r5Var.f117363r;
            if (slVar != null) {
                slVar.dismiss();
            }
            r5Var.f117363r = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
