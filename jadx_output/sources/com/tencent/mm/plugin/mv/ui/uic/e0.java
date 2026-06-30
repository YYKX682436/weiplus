package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.k0 f151105d;

    public e0(com.tencent.mm.plugin.mv.ui.uic.k0 k0Var) {
        this.f151105d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.k0 k0Var = this.f151105d;
        com.tencent.mars.xlog.Log.i(k0Var.f151233d, "click comment input");
        k0Var.f151241o = true;
        android.view.View view2 = k0Var.f151237h;
        if (view2 != null) {
            com.tencent.mm.plugin.mv.ui.uic.m8 m8Var = k0Var.f151240n;
            m8Var.a(view2);
            m8Var.b(kz5.z.D0(new java.lang.Integer[]{java.lang.Integer.valueOf(com.tencent.mm.R.id.bpc), java.lang.Integer.valueOf(com.tencent.mm.R.id.blj), java.lang.Integer.valueOf(com.tencent.mm.R.id.gyy), java.lang.Integer.valueOf(com.tencent.mm.R.id.j7o), java.lang.Integer.valueOf(com.tencent.mm.R.id.os8)}));
        }
        k0Var.Q6().setVisibility(0);
        ((com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter) ((jz5.n) k0Var.f151235f).getValue()).setVisibility(0);
        k0Var.Q6().setAlpha(0.0f);
        k0Var.Q6().animate().alpha(1.0f).setDuration(200L).start();
        android.view.View view3 = k0Var.f151239m;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) (view3 != null ? view3.getParent() : null);
        if (viewGroup != null) {
            viewGroup.removeView(k0Var.f151239m);
        }
        ((android.view.ViewGroup) ((jz5.n) k0Var.f151236g).getValue()).addView(k0Var.f151239m);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvCommentUIC$bindView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
