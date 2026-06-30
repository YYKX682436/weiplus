package vo1;

/* loaded from: classes3.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f438540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438541e;

    public o(java.util.ArrayList arrayList, vo1.q qVar) {
        this.f438540d = arrayList;
        this.f438541e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f438540d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vo1.q qVar = this.f438541e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f438552n.remove(arrayList);
                return;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            vo1.c cVar = (vo1.c) next;
            qVar.getClass();
            androidx.recyclerview.widget.k3 k3Var = cVar.f438498a;
            android.view.View view = k3Var != null ? k3Var.itemView : null;
            androidx.recyclerview.widget.k3 k3Var2 = cVar.f438499b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = qVar.f438556r;
            jz5.l lVar = cVar.f438504g;
            if (view != null) {
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                long j17 = 2;
                ofFloat.setDuration(qVar.f12171f / j17);
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.play(ofFloat).after(qVar.f12171f / j17);
                if (lVar != null) {
                    java.lang.Number number = (java.lang.Number) lVar.f302833d;
                    int intValue = number.intValue();
                    java.lang.Number number2 = (java.lang.Number) lVar.f302834e;
                    if (intValue > number2.intValue()) {
                        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(number.intValue(), number2.intValue());
                        ofInt.addUpdateListener(new vo1.f(view));
                        ofInt.addListener(new vo1.g(view));
                        ofInt.setDuration(qVar.f12171f);
                        animatorSet.play(ofInt);
                    }
                }
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(qVar.f12171f);
                kotlin.jvm.internal.o.f(duration, "setDuration(...)");
                arrayList2.add(cVar.f438498a);
                duration.translationX(cVar.f438502e - cVar.f438500c);
                duration.translationY(cVar.f438503f - cVar.f438501d);
                duration.setListener(new vo1.h(qVar, cVar, duration, animatorSet, view)).start();
                animatorSet.start();
            }
            if (view2 != null) {
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                if (lVar != null) {
                    java.lang.Number number3 = (java.lang.Number) lVar.f302833d;
                    int intValue2 = number3.intValue();
                    java.lang.Number number4 = (java.lang.Number) lVar.f302834e;
                    if (intValue2 < number4.intValue()) {
                        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(number3.intValue(), number4.intValue());
                        h0Var.f310123d = ofInt2;
                        ofInt2.addUpdateListener(new vo1.i(view2));
                        ((android.animation.ValueAnimator) h0Var.f310123d).addListener(new vo1.j(view2));
                        ((android.animation.ValueAnimator) h0Var.f310123d).setDuration(qVar.f12171f);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = view2;
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChangeImpl", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator", "animateChangeImpl", "(Lcom/tencent/mm/plugin/backup/roambackup/ui/anim/ExpandableRvAnimator$ChangeInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.ViewPropertyAnimator animate = view3.animate();
                arrayList2.add(cVar.f438499b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(qVar.f12171f).alpha(1.0f).setListener(new vo1.k(qVar, cVar, animate, h0Var, view3)).start();
                android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) h0Var.f310123d;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
            }
        }
    }
}
