package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lb0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mb0 f135039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f135041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f135042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.db0 f135043h;

    public lb0(com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var, in5.s0 s0Var, android.view.View view, yz5.a aVar, com.tencent.mm.plugin.finder.viewmodel.component.db0 db0Var) {
        this.f135039d = mb0Var;
        this.f135040e = s0Var;
        this.f135041f = view;
        this.f135042g = aVar;
        this.f135043h = db0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.animation.ValueAnimator valueAnimator;
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = this.f135039d;
        android.animation.ValueAnimator valueAnimator2 = mb0Var.f135159d;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = mb0Var.f135159d) != null) {
            valueAnimator.end();
        }
        mb0Var.c7(this.f135040e);
        android.view.View view = this.f135041f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f135042g.invoke();
        int i17 = this.f135043h != com.tencent.mm.plugin.finder.viewmodel.component.db0.f134119e ? -1 : 1;
        android.view.View view2 = this.f135041f;
        int u17 = hc2.f1.u(view2);
        int i18 = view2.getLayoutParams().height;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        android.view.View view3 = this.f135041f;
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var2 = this.f135039d;
        in5.s0 s0Var = this.f135040e;
        com.tencent.mm.plugin.finder.viewmodel.component.db0 db0Var = this.f135043h;
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.jb0(view3, u17, i17));
        ofFloat.addListener(new com.tencent.mm.plugin.finder.viewmodel.component.kb0(view3, mb0Var2, s0Var, i18, db0Var, u17));
        ofFloat.start();
        mb0Var.f135159d = ofFloat;
    }
}
