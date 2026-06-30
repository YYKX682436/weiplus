package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120694d;

    public c0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120694d = t0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJumpinfo_type(6);
        r45.k74 k74Var = new r45.k74();
        k74Var.set(0, "wxalite4c34c60b4fcf3afbbef39b252ee3a7de");
        k74Var.set(1, "pages/gift-wall-instructions");
        k74Var.set(6, 2);
        k74Var.set(7, java.lang.Boolean.FALSE);
        finderJumpInfo.setLite_app_info(k74Var);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.g(ya2.e1.f460472a, this.f120694d.f118381d, finderJumpInfo, null, null, false, 28, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/wish/widget/WishEditPanelWidget$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
