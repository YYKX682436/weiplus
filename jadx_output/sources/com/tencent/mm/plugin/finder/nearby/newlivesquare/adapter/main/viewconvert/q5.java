package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class q5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f121901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout f121902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 f121903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f121905h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f121906i;

    public q5(android.widget.RelativeLayout relativeLayout, com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var, in5.s0 s0Var, android.widget.TextView textView, vp2.l0 l0Var) {
        this.f121901d = relativeLayout;
        this.f121902e = animSizeRelativeLayout;
        this.f121903f = t5Var;
        this.f121904g = s0Var;
        this.f121905h = textView;
        this.f121906i = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        qa5.l sizeAnimController;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.RelativeLayout expandView = this.f121901d;
        if (expandView.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("Finder.SpecialColumnListConvert", "The content has been expanded");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NEARBY_FOLLOW_TAB_EXPAND_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.tencent.mm.ui.anim.content.AnimSizeRelativeLayout animSizeRelativeLayout = this.f121902e;
        if (animSizeRelativeLayout != null && (sizeAnimController = animSizeRelativeLayout.getSizeAnimController()) != null) {
            sizeAnimController.f361127c = true;
        }
        in5.s0 s0Var = this.f121904g;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 t5Var = this.f121903f;
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5.n(t5Var, s0Var, 1);
        android.widget.TextView titleContentView = this.f121905h;
        kotlin.jvm.internal.o.f(titleContentView, "$titleContentView");
        kotlin.jvm.internal.o.f(expandView, "$expandView");
        t5Var.t(titleContentView, expandView, this.f121906i, true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/SpecialColumnListConvert$onBindViewHolder$expandClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
