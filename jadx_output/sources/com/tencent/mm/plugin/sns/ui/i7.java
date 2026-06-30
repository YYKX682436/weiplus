package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.m7 f168602f;

    public i7(com.tencent.mm.plugin.sns.ui.m7 m7Var, android.view.View view, android.view.View view2) {
        this.f168602f = m7Var;
        this.f168600d = view;
        this.f168601e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$1");
        android.view.View view = this.f168601e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        com.tencent.mm.plugin.sns.ui.m7 m7Var = this.f168602f;
        m7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initOpenIMView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "initOpenIMView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OpenIMUnlikeHelper", "initOpenIMView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m7Var.f169895g = true;
        com.tencent.mm.plugin.sns.ui.j7 j7Var = new com.tencent.mm.plugin.sns.ui.j7(m7Var);
        android.view.animation.Animation animation = m7Var.f169893e;
        animation.setAnimationListener(j7Var);
        view.startAnimation(animation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initOpenIMView", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper$1");
    }
}
