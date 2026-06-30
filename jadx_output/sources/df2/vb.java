package df2;

/* loaded from: classes10.dex */
public final class vb implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f231591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f231593f;

    public vb(boolean z17, df2.zb zbVar, yz5.a aVar) {
        this.f231591d = z17;
        this.f231592e = zbVar;
        this.f231593f = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(animation, "animation");
        df2.zb zbVar = this.f231592e;
        com.tencent.mm.plugin.finder.live.view.SiriBubbleView h76 = zbVar.h7();
        boolean z17 = this.f231591d;
        boolean z18 = false;
        if (h76 != null) {
            h76.setVisibility(z17 ? 0 : 8);
        }
        android.view.View S6 = zbVar.S6(com.tencent.mm.R.id.ua8);
        if (S6 != null) {
            int i17 = z17 ? 8 : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$startAnimation$1$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            S6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(S6, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$startAnimation$1$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View i76 = zbVar.i7();
        if (i76 != null) {
            i76.requestLayout();
        }
        yz5.a aVar = this.f231593f;
        if (aVar != null) {
            aVar.invoke();
        }
        if (!z17) {
            df2.zb.a7(zbVar, true);
            com.tencent.mm.plugin.finder.live.view.SiriBubbleView h77 = zbVar.h7();
            if (h77 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = h77.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = -2;
                }
                if (layoutParams != null) {
                    h77.setLayoutParams(layoutParams);
                }
            }
            zbVar.y7();
            return;
        }
        kotlinx.coroutines.r2 r2Var = zbVar.E;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        r45.ff1 ff1Var = zbVar.f231944r;
        if (ff1Var != null && ff1Var.getInteger(7) == 5) {
            z18 = true;
        }
        if (z18) {
            return;
        }
        df2.zb zbVar2 = this.f231592e;
        zbVar2.E = com.tencent.mm.plugin.finder.live.util.y.d(zbVar2, null, null, new df2.sb(zbVar2, null), 3, null);
        android.widget.TextView g76 = zbVar.g7();
        if (g76 == null || (viewTreeObserver = g76.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new df2.kb(zbVar));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        r45.w6 w6Var;
        kotlin.jvm.internal.o.g(animation, "animation");
        boolean z17 = this.f231591d;
        int i17 = 0;
        df2.zb zbVar = this.f231592e;
        if (!z17) {
            com.tencent.mm.plugin.finder.live.view.SiriBubbleView h76 = zbVar.h7();
            if (h76 != null && h76.B) {
                h76.B = false;
                h76.C = 0.0f;
                h76.D = 0.0f;
                h76.E = 0L;
                h76.F.f116865c = 0.35f;
                h76.G.f116865c = h76.N;
                h76.H.f116865c = 1.0f;
                h76.I.f116865c = h76.Q;
                h76.f116138J.f116865c = 0.5f;
                h76.K.f116865c = 0.0f;
            }
            com.tencent.mm.plugin.finder.live.view.SiriBubbleView h77 = zbVar.h7();
            if (h77 != null) {
                h77.e();
            }
            com.tencent.mm.plugin.finder.live.view.SiriBubbleView h78 = zbVar.h7();
            if (h78 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = h78.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = h78.getMeasuredHeight();
                }
                if (layoutParams != null) {
                    h78.setLayoutParams(layoutParams);
                    return;
                }
                return;
            }
            return;
        }
        df2.zb.a7(zbVar, false);
        com.tencent.mm.plugin.finder.live.view.SiriBubbleView h79 = zbVar.h7();
        if (h79 != null) {
            h79.setVisibility(0);
        }
        r45.ff1 ff1Var = zbVar.f231944r;
        if (ff1Var != null && ff1Var.getInteger(7) == 5) {
            com.tencent.mm.plugin.finder.live.view.SiriBubbleView h710 = zbVar.h7();
            if (h710 != null && !h710.f116162y) {
                h710.f116162y = true;
                h710.d();
            }
            zbVar.x7();
        }
        zbVar.y7();
        r45.ff1 ff1Var2 = zbVar.f231944r;
        if (ff1Var2 != null && ff1Var2.getInteger(7) == 5) {
            r45.ff1 ff1Var3 = zbVar.f231944r;
            if (ff1Var3 != null && (w6Var = (r45.w6) ff1Var3.getCustom(9)) != null) {
                int integer = w6Var.getInteger(1);
                r45.v6 v6Var = integer != 0 ? integer != 1 ? integer != 2 ? integer != 3 ? integer != 4 ? null : r45.v6.Responding : r45.v6.Pending : r45.v6.Processing : r45.v6.Listening : r45.v6.DisplayDefault;
                if (v6Var != null) {
                    i17 = v6Var.f387931d;
                }
            }
            if (i17 == 1) {
                zbVar.r7(1, df2.tb.f231431d);
            } else {
                if (i17 != 2) {
                    return;
                }
                zbVar.r7(1, df2.ub.f231508d);
            }
        }
    }
}
