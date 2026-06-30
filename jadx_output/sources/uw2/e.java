package uw2;

/* loaded from: classes2.dex */
public final class e extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public boolean f431653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.RoundLinearLayout f431654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f431655f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f431656g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f431657h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f431658i;

    public e(com.tencent.mm.plugin.finder.feed.RoundLinearLayout roundLinearLayout, java.util.List list, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, android.view.ViewGroup viewGroup) {
        this.f431654e = roundLinearLayout;
        this.f431655f = list;
        this.f431656g = baseFinderFeed;
        this.f431657h = s0Var;
        this.f431658i = viewGroup;
    }

    @Override // wa2.z, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f431653d = true;
        uw2.h0.f431675b = null;
        in5.s0 s0Var = this.f431657h;
        android.view.View view = s0Var.itemView;
        yz5.a aVar = uw2.h0.f431676c;
        view.removeCallbacks(aVar != null ? new uw2.c0(aVar) : null);
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.lkg);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$avatarAnimator$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$avatarAnimator$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        this.f431654e.setVisibility(8);
        android.view.View view2 = (android.view.View) this.f431655f.get(0);
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$avatarAnimator$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$avatarAnimator$4", "onAnimationCancel", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        int i17;
        kotlin.jvm.internal.o.g(animation, "animation");
        uw2.h0.f431675b = null;
        this.f431654e.setVisibility(8);
        java.util.List list = this.f431655f;
        android.view.View view = (android.view.View) list.get(0);
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$avatarAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/animation/FinderViewAnimationLogic$avatarAnimator$4", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        uw2.h0 h0Var = uw2.h0.f431674a;
        if (h0Var.h() == 0 || this.f431653d) {
            return;
        }
        nv2.h1 h1Var = nv2.n1.f340550g;
        int size = nv2.n1.f340551h.h(this.f431656g.getFeedObject().getFeedObject()).size();
        int h17 = h0Var.h();
        if (h17 == 0) {
            com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "use normal like animator");
            return;
        }
        in5.s0 s0Var = this.f431657h;
        if (h17 == 1) {
            if (size == 0) {
                com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "no avatar view");
                return;
            }
            if (size == 1) {
                com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "one avatar view");
                return;
            }
            if (size == 2) {
                android.view.View view2 = (android.view.View) list.get(1);
                if (view2 != null) {
                    h0Var.d(view2);
                }
                android.view.View view3 = (android.view.View) list.get(0);
                if (view3 != null) {
                    h0Var.b(view3, (r14 & 2) != 0 ? 150L : 150L, (r14 & 4) != 0 ? 150L : 0L);
                }
                h0Var.q(s0Var);
                return;
            }
            android.view.ViewGroup viewGroup = this.f431658i;
            if (size != 3) {
                pm0.v.V(50L, new uw2.y(list, viewGroup, s0Var));
                return;
            }
            android.view.View view4 = (android.view.View) list.get(2);
            if (view4 != null) {
                viewGroup.getGlobalVisibleRect(new android.graphics.Rect());
                h0Var.d(view4);
            }
            android.view.View view5 = (android.view.View) list.get(1);
            if (view5 != null) {
                h0Var.b(view5, (r14 & 2) != 0 ? 150L : 150L, (r14 & 4) != 0 ? 150L : 0L);
            }
            android.view.View view6 = (android.view.View) list.get(0);
            if (view6 != null) {
                pm0.v.V(30L, new uw2.x(view6));
            }
            h0Var.q(s0Var);
            return;
        }
        if (h17 == 2) {
            if (size == 0) {
                com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "no avatar view");
                return;
            }
            if (size == 1) {
                com.tencent.mars.xlog.Log.i("LikeIconAnimationHelper", "one avatar view");
                return;
            }
            if (size == 2) {
                android.view.View view7 = (android.view.View) list.get(1);
                if (view7 != null) {
                    uw2.h0.e(h0Var, view7, 0L, 0L, s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn), null, 22, null);
                }
                android.view.View view8 = (android.view.View) list.get(0);
                if (view8 != null) {
                    pm0.v.V(100L, new uw2.z(view8, s0Var));
                }
                h0Var.q(s0Var);
                return;
            }
            android.view.View view9 = (android.view.View) list.get(2);
            if (view9 != null) {
                i17 = 1;
                uw2.h0.e(h0Var, view9, 0L, 0L, s0Var.f293121e.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn), null, 22, null);
            } else {
                i17 = 1;
            }
            android.view.View view10 = (android.view.View) list.get(i17);
            if (view10 != null) {
                pm0.v.V(75L, new uw2.a0(view10, s0Var));
            }
            android.view.View view11 = (android.view.View) list.get(0);
            if (view11 != null) {
                pm0.v.V(150L, new uw2.b0(view11, s0Var));
            }
            h0Var.q(s0Var);
        }
    }
}
