package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w0 f114630d;

    public v0(com.tencent.mm.plugin.finder.live.plugin.w0 w0Var) {
        this.f114630d = w0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f114630d.f114840v = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startAnimateProgress onAnimationEnd:");
        com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = this.f114630d;
        sb6.append(w0Var.f114837s.getProgress());
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoTimerPlugin", sb6.toString());
        w0Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoTimerPlugin", "hidePreTimerProgress");
        android.view.View view = w0Var.f114836r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "hidePreTimerProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoTimerPlugin", "hidePreTimerProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (w0Var.f114835q.getVisibility() == 8) {
            w0Var.K0(8);
        }
        w0Var.f114840v = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
