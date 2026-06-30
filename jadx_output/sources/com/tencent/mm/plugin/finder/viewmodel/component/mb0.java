package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public abstract class mb0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.animation.ValueAnimator f135159d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f135160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135160e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.eb0(this));
    }

    public static void T6(com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var, in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hide");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        mb0Var.getClass();
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        mb0Var.V6(holder, animationType, i17);
        mb0Var.O6(holder, animationType);
    }

    public void O6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
    }

    public void P6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
    }

    public void Q6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
    }

    public abstract android.view.View R6(in5.s0 s0Var);

    public abstract so2.c S6();

    public final void U6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(sc2.a8.class);
        if (a8Var != null) {
            a8Var.T6(holder, new com.tencent.mm.plugin.finder.viewmodel.component.fb0(holder));
        }
    }

    public void V6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType, int i17) {
        android.animation.ValueAnimator valueAnimator;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        android.animation.ValueAnimator valueAnimator2 = this.f135159d;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = this.f135159d) != null) {
            valueAnimator.end();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "hideWithAnimation", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        R6.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "hideWithAnimation", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$AnimationType;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.plugin.finder.viewmodel.component.db0 db0Var = com.tencent.mm.plugin.finder.viewmodel.component.db0.f134119e;
        int i18 = animationType != db0Var ? -1 : 1;
        if (animationType != db0Var) {
            i17 = hc2.f1.u(R6);
        }
        int i19 = R6.getLayoutParams().height;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.gb0(R6, i17, i18));
        ofFloat.addListener(new com.tencent.mm.plugin.finder.viewmodel.component.hb0(R6, this, holder, i19, R6));
        ofFloat.start();
        this.f135159d = ofFloat;
    }

    public void W6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public abstract boolean X6(in5.s0 s0Var, boolean z17);

    public void Y6(in5.s0 holder, android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    public void Z6(in5.s0 holder, boolean z17, long j17, long j18) {
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public boolean a7(so2.c type) {
        kotlin.jvm.internal.o.g(type, "type");
        return true;
    }

    public void b7(boolean z17, in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType, yz5.a onVisible) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        kotlin.jvm.internal.o.g(onVisible, "onVisible");
        long j17 = z17 ? 150L : 0L;
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.viewmodel.component.lb0 lb0Var = new com.tencent.mm.plugin.finder.viewmodel.component.lb0(this, holder, R6, onVisible, animationType);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(lb0Var, j17, false);
    }

    public void c7(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "showWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem", "showWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
