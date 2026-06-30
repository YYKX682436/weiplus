package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class o6 extends androidx.recyclerview.widget.y1 {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f129571f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f129572g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f129573h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f129574i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f129575j;

    /* renamed from: k, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f129576k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f129577l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f129578m;

    /* renamed from: n, reason: collision with root package name */
    public int f129579n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f129580o;

    /* renamed from: p, reason: collision with root package name */
    public int f129581p;

    /* renamed from: q, reason: collision with root package name */
    public int f129582q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f129583r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f129584s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f129585t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f129586u;

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public o6() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.gvs));
        this.f129571f = hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        hashSet2.add(java.lang.Integer.valueOf(com.tencent.mm.R.id.mfh));
        this.f129572g = hashSet2;
        this.f129574i = jz5.h.b(new com.tencent.mm.plugin.finder.ui.n6(this));
        this.f129575j = jz5.h.b(new com.tencent.mm.plugin.finder.ui.m6(this));
        this.f129578m = true;
        this.f129581p = -1;
        this.f129582q = -1;
        this.f129585t = new int[2];
        this.f129586u = new android.graphics.Rect();
    }

    public static final void n(com.tencent.mm.plugin.finder.ui.o6 o6Var, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager, int i17, int i18, int i19) {
        o6Var.getClass();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) <= 1) {
            return;
        }
        if (i17 != i18 && i17 == 1) {
            int w17 = i19 > 0 ? linearLayoutManager.w() : linearLayoutManager.y();
            androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
            if (i19 > 0 || w17 != 0) {
                o6Var.p(p07, com.tencent.mm.R.id.f484486ee3);
                o6Var.p(p07, com.tencent.mm.R.id.edq);
                o6Var.p(p07, com.tencent.mm.R.id.efr);
                o6Var.p(p07, com.tencent.mm.R.id.kp7);
                in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
                if ((s0Var != null ? s0Var.f293125i : null) instanceof so2.h1) {
                    o6Var.p(p07, com.tencent.mm.R.id.f484260dk3);
                    return;
                }
                return;
            }
            return;
        }
        if ((i18 == 1 || i18 == 2) && i17 != i18) {
            int w18 = linearLayoutManager.w();
            int y17 = linearLayoutManager.y();
            androidx.recyclerview.widget.k3 p08 = recyclerView.p0(w18);
            androidx.recyclerview.widget.k3 p09 = recyclerView.p0(y17);
            o6Var.t(p08, com.tencent.mm.R.id.f484486ee3);
            o6Var.t(p09, com.tencent.mm.R.id.f484486ee3);
            o6Var.t(p08, com.tencent.mm.R.id.efr);
            o6Var.t(p09, com.tencent.mm.R.id.efr);
            o6Var.t(p08, com.tencent.mm.R.id.edq);
            o6Var.t(p09, com.tencent.mm.R.id.edq);
            o6Var.t(p08, com.tencent.mm.R.id.kp7);
            o6Var.t(p09, com.tencent.mm.R.id.kp7);
            in5.s0 s0Var2 = p08 instanceof in5.s0 ? (in5.s0) p08 : null;
            if ((s0Var2 != null ? s0Var2.f293125i : null) instanceof so2.h1) {
                o6Var.t(p08, com.tencent.mm.R.id.f484260dk3);
            }
            in5.s0 s0Var3 = p09 instanceof in5.s0 ? (in5.s0) p09 : null;
            if ((s0Var3 != null ? s0Var3.f293125i : null) instanceof so2.h1) {
                o6Var.t(p09, com.tencent.mm.R.id.f484260dk3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.r3
    public void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            this.f129576k = recyclerView;
            this.f129573h = linearLayoutManager;
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(new com.tencent.mm.plugin.finder.ui.i6(this, recyclerView, linearLayoutManager));
            }
            recyclerView.i(new com.tencent.mm.plugin.finder.ui.k6(this, linearLayoutManager, f0Var2, f0Var));
        }
        super.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public int[] c(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, android.view.View targetView) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        boolean r17 = r(targetView);
        jz5.g gVar = this.f129574i;
        if (r17) {
            java.lang.Object tag = targetView.getTag(com.tencent.mm.R.id.egq);
            androidx.recyclerview.widget.w1 w1Var = (androidx.recyclerview.widget.w1) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(w1Var, "<get-verticalHelper>(...)");
            int e17 = w1Var.e(targetView) - w1Var.k();
            targetView.getHeight();
            targetView.toString();
            iArr[1] = e17;
            if (tag == null || kotlin.jvm.internal.o.b(tag, java.lang.Boolean.TRUE)) {
                iArr[1] = 0;
            }
            targetView.setTag(com.tencent.mm.R.id.egq, java.lang.Boolean.FALSE);
        } else {
            if (layoutManager.canScrollHorizontally()) {
                androidx.recyclerview.widget.w1 w1Var2 = (androidx.recyclerview.widget.w1) ((jz5.n) this.f129575j).getValue();
                kotlin.jvm.internal.o.f(w1Var2, "<get-horizontalHelper>(...)");
                int e18 = w1Var2.e(targetView) - w1Var2.k();
                targetView.getHeight();
                targetView.toString();
                iArr[0] = e18;
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.getF123307r()) {
                androidx.recyclerview.widget.w1 w1Var3 = (androidx.recyclerview.widget.w1) ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(w1Var3, "<get-verticalHelper>(...)");
                int e19 = w1Var3.e(targetView) - w1Var3.k();
                targetView.getHeight();
                targetView.toString();
                iArr[1] = e19;
            } else {
                iArr[1] = 0;
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public androidx.recyclerview.widget.o1 e(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager)) {
            return super.e(layoutManager);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f129576k;
        if (recyclerView != null) {
            return new com.tencent.mm.plugin.finder.ui.l6(this, layoutManager, recyclerView.getContext());
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    public android.view.View f(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        boolean f123307r = layoutManager.getF123307r();
        int childCount = layoutManager.getChildCount();
        android.view.View view = null;
        if (childCount != 0) {
            float f17 = 0.0f;
            android.view.View view2 = null;
            int i19 = 0;
            while (true) {
                if (i19 >= childCount) {
                    view = view2;
                    break;
                }
                android.view.View childAt = layoutManager.getChildAt(i19);
                if (childAt != null && ((!f123307r || childAt.getHeight() > 0) && (f123307r || childAt.getWidth() > 0))) {
                    boolean r17 = r(childAt);
                    android.graphics.Rect rect = this.f129586u;
                    if (r17 && childAt.getGlobalVisibleRect(rect) && rect.height() > 0) {
                        java.lang.Object tag = childAt.getTag(com.tencent.mm.R.id.egq);
                        childAt.toString();
                        java.util.Objects.toString(rect);
                        java.util.Objects.toString(tag);
                        if (tag == null || kotlin.jvm.internal.o.b(tag, java.lang.Boolean.TRUE)) {
                            view = childAt;
                        } else {
                            childAt.setTag(com.tencent.mm.R.id.egq, java.lang.Boolean.FALSE);
                        }
                    } else {
                        int height = childAt.getGlobalVisibleRect(rect) ? f123307r ? rect.height() : rect.width() : 0;
                        int height2 = f123307r ? childAt.getHeight() : childAt.getWidth();
                        if (q(childAt) && childAt.getGlobalVisibleRect(rect) && rect.height() > 0) {
                            boolean z17 = this.f129577l;
                            android.view.View childAt2 = (!z17 || (i18 = i19 + 1) >= childCount) ? (z17 || (i17 = i19 + (-1)) < 0) ? null : layoutManager.getChildAt(i17) : layoutManager.getChildAt(i18);
                            if (childAt2 != null) {
                                height += childAt2.getGlobalVisibleRect(rect) ? f123307r ? rect.height() : rect.width() : 0;
                                height2 += f123307r ? childAt2.getHeight() : childAt2.getWidth();
                                childAt.toString();
                                childAt2.toString();
                                childAt = childAt2;
                            }
                        }
                        float f18 = (height * 1.0f) / height2;
                        if (f17 < f18) {
                            view2 = childAt;
                            f17 = f18;
                        }
                    }
                }
                i19++;
            }
        }
        java.util.Objects.toString(view);
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r9 <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        r5 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r5 >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r5 >= r1) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        r9 = r6.f129573h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0061, code lost:
    
        if (r9 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0063, code lost:
    
        r9 = r9.getChildAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
    
        if (r9 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r9.getHeight() <= 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0074, code lost:
    
        kotlin.jvm.internal.o.o("layoutManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0078, code lost:
    
        if (r9 >= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007a, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007b, code lost:
    
        if (r3 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007d, code lost:
    
        if ((-1) >= r3) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007f, code lost:
    
        r9 = r6.f129573h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0081, code lost:
    
        if (r9 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0083, code lost:
    
        r9 = r9.getChildAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0087, code lost:
    
        if (r9 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008e, code lost:
    
        if (r9.getHeight() <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0091, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0094, code lost:
    
        kotlin.jvm.internal.o.o("layoutManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0097, code lost:
    
        throw null;
     */
    @Override // androidx.recyclerview.widget.y1, androidx.recyclerview.widget.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(androidx.recyclerview.widget.RecyclerView.LayoutManager r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.o6.g(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
    }

    public final void o(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.LinearLayoutManager layoutManager, int i17, boolean z17) {
        android.view.View view;
        android.view.View view2;
        int i18;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(layoutManager, "layoutManager");
        if (recyclerView.getHeight() > 0 && this.f129578m && i17 != 0) {
            int w17 = layoutManager.w();
            int y17 = layoutManager.y();
            if (this.f129581p != w17 || y17 != this.f129582q) {
                this.f129581p = w17;
                this.f129582q = y17;
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(w17);
                this.f129583r = (p07 == null || (view2 = p07.itemView) == null) ? null : view2.findViewById(com.tencent.mm.R.id.hih);
                androidx.recyclerview.widget.k3 p08 = recyclerView.p0(y17);
                this.f129584s = (p08 == null || (view = p08.itemView) == null) ? null : view.findViewById(com.tencent.mm.R.id.hih);
            }
            android.view.View view3 = this.f129583r;
            android.view.View view4 = this.f129584s;
            int[] iArr = this.f129585t;
            if (view3 != null) {
                view3.getLocationInWindow(iArr);
            }
            if (view3 == null) {
                i18 = 0;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf((java.lang.Math.abs(iArr[1]) * 1.0f) / recyclerView.getHeight()));
                java.util.Collections.reverse(arrayList);
                i18 = 0;
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (view4 != null) {
                view4.getLocationInWindow(iArr);
            }
            if (view4 != null) {
                float abs = (java.lang.Math.abs(iArr[1]) * 1.0f) / recyclerView.getHeight();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(abs));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((java.lang.Float) arrayList2.get(i18)).floatValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper", "checkMaskAlpha", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            if (z17) {
                int childCount = recyclerView.getChildCount();
                for (int i19 = i18; i19 < childCount; i19++) {
                    android.view.View findViewById = recyclerView.getChildAt(i19).findViewById(com.tencent.mm.R.id.hih);
                    if (findViewById != null && (animate2 = findViewById.animate()) != null) {
                        animate2.cancel();
                    }
                    if (!kotlin.jvm.internal.o.a(findViewById != null ? java.lang.Float.valueOf(findViewById.getAlpha()) : null, 0.0f) && findViewById != null && (animate = findViewById.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(90L)) != null) {
                        duration.start();
                    }
                }
            }
        }
    }

    public final void p(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.view.View view;
        android.view.View findViewById = (k3Var == null || (view = k3Var.itemView) == null) ? null : view.findViewById(i17);
        if (findViewById != null) {
            android.view.ViewPropertyAnimator animate = findViewById.animate();
            if (animate != null) {
                animate.cancel();
            }
            findViewById.animate().alpha(0.2f).setDuration(110L).start();
        }
    }

    public final boolean q(android.view.View view) {
        if (view == null) {
            return false;
        }
        java.util.Iterator it = this.f129572g.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        try {
            android.view.ViewParent parent = view.getParent();
            androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
            if (recyclerView == null) {
                s("ignoreViewForViewData but view:" + view + " 's parent:" + view.getParent() + '!');
                return false;
            }
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(view);
            in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
            if (s0Var == null) {
                s("ignoreViewForViewData but view:" + view + " 's viewHolder is null!");
                return false;
            }
            java.lang.Object obj = s0Var.f293125i;
            if ((obj instanceof in5.o0 ? (in5.o0) obj : null) == null) {
                s("ignoreViewForViewData but " + s0Var.f293125i + " is not instance ScrollConfig!");
                return false;
            }
            s("ignoreViewForViewData " + s0Var.f293125i + " scrollToNext=true");
            return true;
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "checkScrollConfig");
            pm0.z.b(xy2.b.f458155b, "checkScrollConfigErr", false, null, null, false, false, null, 124, null);
            return false;
        }
    }

    public final boolean r(android.view.View view) {
        if (view == null) {
            return false;
        }
        java.util.Iterator it = this.f129571f.iterator();
        while (it.hasNext()) {
            android.view.View findViewById = view.findViewById(((java.lang.Number) it.next()).intValue());
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    public final void s(java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("Finder.FullPagerSnapHelper", str);
        }
    }

    public final void t(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.view.View view;
        android.view.View findViewById = (k3Var == null || (view = k3Var.itemView) == null) ? null : view.findViewById(i17);
        if (kotlin.jvm.internal.o.a(findViewById != null ? java.lang.Float.valueOf(findViewById.getAlpha()) : null, 1.0f) || findViewById == null) {
            return;
        }
        android.view.ViewPropertyAnimator animate = findViewById.animate();
        if (animate != null) {
            animate.cancel();
        }
        findViewById.animate().alpha(1.0f).setDuration(110L).start();
    }
}
