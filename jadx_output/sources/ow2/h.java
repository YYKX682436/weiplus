package ow2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: j */
    public static final ow2.b f349377j = new ow2.b(null);

    /* renamed from: k */
    public static android.graphics.Rect f349378k;

    /* renamed from: l */
    public static android.graphics.Rect f349379l;

    /* renamed from: a */
    public final android.content.Context f349380a;

    /* renamed from: b */
    public final android.view.View f349381b;

    /* renamed from: c */
    public final yz5.l f349382c;

    /* renamed from: d */
    public final jz5.g f349383d;

    /* renamed from: e */
    public boolean f349384e;

    /* renamed from: f */
    public in5.s0 f349385f;

    /* renamed from: g */
    public java.lang.Runnable f349386g;

    /* renamed from: h */
    public boolean f349387h;

    /* renamed from: i */
    public boolean f349388i;

    public h(android.content.Context context, android.view.View speedPlayLayout, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(speedPlayLayout, "speedPlayLayout");
        this.f349380a = context;
        this.f349381b = speedPlayLayout;
        this.f349382c = lVar;
        this.f349383d = jz5.h.b(new ow2.g(this));
    }

    public static /* synthetic */ void k(ow2.h hVar, in5.s0 s0Var, float f17, com.tencent.mm.plugin.finder.view.al alVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            f17 = 2.0f;
        }
        if ((i17 & 4) != 0) {
            alVar = com.tencent.mm.plugin.finder.view.al.f131653e;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        hVar.j(s0Var, f17, alVar, z17);
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [ow2.c] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ow2.d] */
    public final void a(boolean z17, in5.s0 s0Var, boolean z18) {
        android.graphics.Rect rect;
        android.widget.HorizontalScrollView d76;
        java.lang.String h17 = hc2.b0.h((so2.j5) s0Var.f293125i, false, 1, null);
        if (!z17) {
            android.view.View view = this.f349381b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "checkAddOrRemoveSpeedLayout", "(ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "checkAddOrRemoveSpeedLayout", "(ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", h17 + " remove ...");
            return;
        }
        android.view.View view2 = this.f349381b;
        if (kotlin.jvm.internal.o.b(view2.getParent(), s0Var.itemView) && !z18) {
            com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", "checkAddOrRemoveSpeedLayout return for has added.");
            return;
        }
        android.view.ViewParent parent = view2.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view2);
        }
        android.content.Context context = this.f349380a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = (com.tencent.mm.plugin.finder.viewmodel.component.bl) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        ow2.b bVar = f349377j;
        if (blVar == null || (d76 = blVar.d7()) == null) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) activity.findViewById(com.tencent.mm.R.id.tz_);
            if (viewGroup2 != null) {
                java.lang.Object obj = new kotlin.jvm.internal.s(bVar) { // from class: ow2.d
                    @Override // kotlin.jvm.internal.s, f06.s
                    public java.lang.Object get() {
                        return ow2.h.f349378k;
                    }
                }.get();
                if (!(((android.graphics.Rect) obj) != null)) {
                    obj = null;
                }
                rect = (android.graphics.Rect) obj;
                if (rect == null) {
                    android.graphics.Rect rect2 = new android.graphics.Rect();
                    viewGroup2.getGlobalVisibleRect(rect2);
                    f349378k = rect2;
                    rect = rect2;
                }
            } else {
                rect = null;
            }
        } else {
            java.lang.Object obj2 = new kotlin.jvm.internal.s(bVar) { // from class: ow2.c
                @Override // kotlin.jvm.internal.s, f06.s
                public java.lang.Object get() {
                    return ow2.h.f349379l;
                }
            }.get();
            if (!(((android.graphics.Rect) obj2) != null)) {
                obj2 = null;
            }
            rect = (android.graphics.Rect) obj2;
            if (rect == null) {
                rect = new android.graphics.Rect();
                d76.getGlobalVisibleRect(rect);
                f349379l = rect;
            }
        }
        if (rect == null) {
            return;
        }
        android.view.View view3 = s0Var.itemView;
        kotlin.jvm.internal.o.e(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view3;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, rect.height());
        java.lang.Object tag = s0Var.itemView.getTag(com.tencent.mm.R.id.tuy);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        layoutParams.topMargin = num != null ? num.intValue() : rect.top;
        viewGroup3.addView(view2, layoutParams);
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", h17 + " add top:" + rect.top + " height:" + rect.height());
    }

    public final void b(float f17) {
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", "enterPendingLock speed=" + f17);
        this.f349388i = true;
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = e();
        if (e17 != null) {
            e17.setCurrentSpeed(f17);
            e17.e(com.tencent.mm.plugin.finder.view.al.f131656h);
        }
    }

    public final void c(float f17) {
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", "exitPendingLock speed=" + f17);
        this.f349388i = false;
        if (f17 == 1.0f) {
            com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = e();
            if (e17 != null) {
                e17.setCurrentSpeed(f17);
                e17.e(com.tencent.mm.plugin.finder.view.al.f131653e);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e18 = e();
        if (e18 != null) {
            e18.setCurrentSpeed(f17);
        }
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e19 = e();
        if (e19 != null) {
            e19.e(com.tencent.mm.plugin.finder.view.al.f131652d);
        }
    }

    public final android.view.View d() {
        android.widget.HorizontalScrollView d76;
        android.content.Context context = this.f349380a;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = (com.tencent.mm.plugin.finder.viewmodel.component.bl) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        if (blVar != null && (d76 = blVar.d7()) != null) {
            return d76;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((android.app.Activity) context).findViewById(com.tencent.mm.R.id.tz_);
        if (viewGroup != null) {
            return viewGroup.findViewById(com.tencent.mm.R.id.ggm);
        }
        return null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e() {
        return (com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView) ((jz5.n) this.f349383d).getValue();
    }

    public final void f(in5.s0 holder, boolean z17) {
        android.view.View d17;
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f349384e = false;
        this.f349387h = z17;
        this.f349388i = false;
        this.f349381b.removeCallbacks(this.f349386g);
        this.f349386g = null;
        if (!z17) {
            a(false, holder, false);
        }
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = e();
        if (e17 != null) {
            e17.d();
        }
        android.view.View view = this.f349381b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f349385f = null;
        if (z17 || (d17 = d()) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "hideSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r1 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(float r3, long r4, yz5.a r6, com.tencent.mm.plugin.finder.view.yk r7, in5.s0 r8, boolean r9) {
        /*
            r2 = this;
            java.lang.String r0 = "onTextDismiss"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "lockSource"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "lockSpeed speed: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", isLandscape: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderSpeedIndicatorController"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 0
            r2.f349388i = r0
            if (r8 == 0) goto L4a
            boolean r0 = r2.f349384e
            jz5.f0 r1 = jz5.f0.f302826a
            if (r0 != 0) goto L36
            com.tencent.mm.plugin.finder.view.al r0 = com.tencent.mm.plugin.finder.view.al.f131654f
            r2.j(r8, r3, r0, r9)
            goto L48
        L36:
            com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView r8 = r2.e()
            if (r8 == 0) goto L47
            r8.f131483v = r7
            r8.setCurrentSpeed(r3)
            com.tencent.mm.plugin.finder.view.al r9 = com.tencent.mm.plugin.finder.view.al.f131654f
            r8.e(r9)
            goto L48
        L47:
            r1 = 0
        L48:
            if (r1 != 0) goto L5a
        L4a:
            com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView r8 = r2.e()
            if (r8 == 0) goto L5a
            r8.f131483v = r7
            r8.setCurrentSpeed(r3)
            com.tencent.mm.plugin.finder.view.al r3 = com.tencent.mm.plugin.finder.view.al.f131654f
            r8.e(r3)
        L5a:
            java.lang.Runnable r3 = r2.f349386g
            android.view.View r7 = r2.f349381b
            r7.removeCallbacks(r3)
            ow2.e r3 = new ow2.e
            r3.<init>(r6)
            r2.f349386g = r3
            r7.postDelayed(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ow2.h.g(float, long, yz5.a, com.tencent.mm.plugin.finder.view.yk, in5.s0, boolean):void");
    }

    public final void h(float f17) {
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", "showPlaying speed: " + f17);
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = e();
        if (e17 != null) {
            e17.setCurrentSpeed(f17);
            e17.e(com.tencent.mm.plugin.finder.view.al.f131653e);
        }
    }

    public final void i(float f17) {
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorController", "showSelector speed: " + f17);
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = e();
        if (e17 != null) {
            e17.setCurrentSpeed(f17);
        }
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e18 = e();
        if (e18 != null) {
            e18.e(com.tencent.mm.plugin.finder.view.al.f131652d);
        }
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e19 = e();
        if (e19 != null) {
            e19.b();
        }
    }

    public final void j(in5.s0 holder, float f17, com.tencent.mm.plugin.finder.view.al state, boolean z17) {
        android.view.View d17;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(state, "state");
        this.f349384e = true;
        this.f349387h = z17;
        this.f349388i = false;
        if (!z17) {
            a(true, holder, false);
        }
        this.f349381b.removeCallbacks(this.f349386g);
        this.f349385f = holder;
        android.view.View view = this.f349381b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = e();
        if (e17 != null) {
            e17.setCurrentSpeed(f17);
        }
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e18 = e();
        if (e18 != null) {
            e18.e(state);
        }
        if (z17 || (d17 = d()) == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/plugin/finder/video/speed/FinderSpeedIndicatorController", "showSpeedIndicator", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
