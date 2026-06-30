package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderSpeedControlUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: x */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.n50 f133635x = new com.tencent.mm.plugin.finder.viewmodel.component.n50(null);

    /* renamed from: d */
    public final jz5.g f133636d;

    /* renamed from: e */
    public final jz5.g f133637e;

    /* renamed from: f */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC$toggleAnimEndListener$1 f133638f;

    /* renamed from: g */
    public java.lang.Long f133639g;

    /* renamed from: h */
    public in5.s0 f133640h;

    /* renamed from: i */
    public float f133641i;

    /* renamed from: m */
    public long f133642m;

    /* renamed from: n */
    public android.view.MotionEvent f133643n;

    /* renamed from: o */
    public long f133644o;

    /* renamed from: p */
    public long f133645p;

    /* renamed from: q */
    public long f133646q;

    /* renamed from: r */
    public long f133647r;

    /* renamed from: s */
    public final ow2.h f133648s;

    /* renamed from: t */
    public final ow2.a f133649t;

    /* renamed from: u */
    public boolean f133650u;

    /* renamed from: v */
    public float f133651v;

    /* renamed from: w */
    public boolean f133652w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC$toggleAnimEndListener$1] */
    public FinderSpeedControlUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133636d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.b60(activity, this));
        this.f133637e = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.a60.f133737d);
        this.f133638f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent>(this) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC$toggleAnimEndListener$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f133654e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.f133654e = this;
                this.__eventId = 2063121603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent activityToggleAnimEndEvent) {
                in5.s0 s0Var;
                com.tencent.mm.autogen.events.ActivityToggleAnimEndEvent event = activityToggleAnimEndEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (androidx.appcompat.app.AppCompatActivity.this.hashCode() != event.f53967g.f6715a) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "ActivityToggleAnimEndEvent: notify resize speed tips");
                ow2.h hVar = this.f133654e.f133648s;
                if (hVar.f349387h || (s0Var = hVar.f349385f) == null || !hVar.f349384e) {
                    return false;
                }
                ow2.h.f349378k = null;
                ow2.h.f349379l = null;
                hVar.a(true, s0Var, true);
                return false;
            }
        };
        this.f133641i = 1.0f;
        jz5.g b17 = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.z50(this));
        android.app.Activity context = getContext();
        android.view.View view = (android.view.View) ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(view, "<get-speedPlayLayout>(...)");
        this.f133648s = new ow2.h(context, view, new com.tencent.mm.plugin.finder.viewmodel.component.y50(this));
        this.f133649t = new ow2.a(U6());
        this.f133651v = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap P6(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC r20, in5.s0 r21, float r22, boolean r23, boolean r24, boolean r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.P6(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC, in5.s0, float, boolean, boolean, boolean, int, java.lang.Object):java.util.HashMap");
    }

    public static /* synthetic */ void a7(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, in5.s0 s0Var, java.util.List list, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, com.tencent.mm.plugin.finder.viewmodel.component.k60 k60Var, yz5.a aVar, ow2.h hVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            k60Var = com.tencent.mm.plugin.finder.viewmodel.component.k60.f134924d;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.k60 k60Var2 = k60Var;
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        yz5.a aVar2 = aVar;
        if ((i17 & 32) != 0) {
            hVar = finderSpeedControlUIC.f133648s;
        }
        finderSpeedControlUIC.Z6(s0Var, list, finderThumbPlayerProxy, k60Var2, aVar2, hVar);
    }

    public final void O6(in5.s0 s0Var, android.view.MotionEvent motionEvent, com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout, yz5.l lVar) {
        android.view.View p17;
        this.f133652w = false;
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "showLockSpeedArea");
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.uql);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "showLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Q6(s0Var, this.f133651v, false);
        android.graphics.Rect rect = new android.graphics.Rect();
        in5.s0 V6 = V6();
        if (V6 != null && (p17 = V6.p(com.tencent.mm.R.id.uql)) != null) {
            p17.getGlobalVisibleRect(rect);
        }
        if (rect.height() == 0) {
            rect.set(0, getContext().getResources().getDisplayMetrics().heightPixels - ((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.by)), getContext().getResources().getDisplayMetrics().widthPixels, getContext().getResources().getDisplayMetrics().heightPixels);
        }
        float f17 = this.f133651v;
        ow2.a aVar = this.f133649t;
        aVar.c(f17, motionEvent, rect);
        if (!(this.f133651v == 1.0f)) {
            aVar.f349370g = new com.tencent.mm.plugin.finder.viewmodel.component.o50(this, lVar);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.p50 p50Var = com.tencent.mm.plugin.finder.viewmodel.component.p50.f135517d;
        ow2.h hVar = this.f133648s;
        hVar.getClass();
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView e17 = hVar.e();
        if (e17 != null) {
            e17.setOnStateChangeListener(p50Var);
        }
        aVar.f349371h = new com.tencent.mm.plugin.finder.viewmodel.component.q50(this, s0Var);
        aVar.f349372i = new com.tencent.mm.plugin.finder.viewmodel.component.r50(this, s0Var);
        aVar.f349373j = new com.tencent.mm.plugin.finder.viewmodel.component.s50(this, s0Var);
        if (simpleTouchableLayout != null) {
            simpleTouchableLayout.setOnSpeedChangeDetector(new com.tencent.mm.plugin.finder.viewmodel.component.t50((com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) s0Var.p(com.tencent.mm.R.id.ghd), this, simpleTouchableLayout));
        }
    }

    public final void Q6(in5.s0 s0Var, float f17, boolean z17) {
        android.view.View p17;
        java.lang.String string;
        android.view.View p18;
        java.lang.String string2;
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "changeLockAreaState " + z17);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.uql);
        if (p19 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.getLayoutParams().height = (int) ((s0Var.p(com.tencent.mm.R.id.gbz) != null ? r6.getHeight() : 0) + getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479706d1));
        p19.requestLayout();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.tqz);
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (!z17) {
            android.view.View p27 = s0Var.p(com.tencent.mm.R.id.mhc);
            if (p27 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p27, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                p27.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(p27, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.tqz);
            if (weImageView2 != null) {
                weImageView2.setIconColor(getContext().getColor(com.tencent.mm.R.color.adi));
            }
            android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
            if (textView2 != null) {
                if (f17 == 1.0f) {
                    string = getContext().getString(U6() ? com.tencent.mm.R.string.p5i : com.tencent.mm.R.string.o1z);
                } else {
                    string = getContext().getString(U6() ? com.tencent.mm.R.string.p5j : com.tencent.mm.R.string.f492084o20, b7(f17));
                }
                textView2.setText(string);
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.M1().r()).booleanValue() && (p17 = s0Var.p(com.tencent.mm.R.id.u3d)) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView3 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
            if (textView3 != null) {
                textView3.setTextColor(getContext().getColor(com.tencent.mm.R.color.adi));
            }
            p19.setBackground(getContext().getDrawable(com.tencent.mm.R.color.f479160rk));
            return;
        }
        android.view.View p28 = s0Var.p(com.tencent.mm.R.id.mhc);
        if (p28 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p28, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p28.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.tqz);
        if (weImageView3 != null) {
            weImageView3.setIconColor(getContext().getColor(com.tencent.mm.R.color.f478553an));
        }
        android.widget.TextView textView4 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
        if (textView4 != null) {
            if (f17 == 1.0f) {
                string2 = getContext().getString(U6() ? com.tencent.mm.R.string.p5k : com.tencent.mm.R.string.f492088o24);
            } else {
                string2 = getContext().getString(U6() ? com.tencent.mm.R.string.p5l : com.tencent.mm.R.string.f492089o25, b7(f17));
            }
            textView4.setText(string2);
        }
        i95.m c18 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.M1().r()).booleanValue() && (p18 = s0Var.p(com.tencent.mm.R.id.u3d)) != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "changeLockAreaState", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;FZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView5 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
        if (textView5 != null) {
            textView5.setTextColor(getContext().getColor(com.tencent.mm.R.color.f478553an));
        }
        p19.setBackground(getContext().getDrawable(com.tencent.mm.R.color.Brand_100));
        hc2.f1.x(s0Var.itemView);
    }

    public final void R6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy targetVideoView) {
        float floatValue;
        int i17;
        kotlin.jvm.internal.o.g(targetVideoView, "targetVideoView");
        float playSpeedRatio = targetVideoView.getPlaySpeedRatio();
        jz5.g gVar = this.f133637e;
        int indexOf = ((java.util.ArrayList) ((jz5.n) gVar).getValue()).indexOf(java.lang.Float.valueOf(playSpeedRatio));
        if (indexOf == -1) {
            floatValue = 1.0f;
        } else {
            int i18 = indexOf + 1;
            if (i18 >= ((java.util.ArrayList) ((jz5.n) gVar).getValue()).size()) {
                i18 = 0;
            }
            java.lang.Object obj = ((java.util.ArrayList) ((jz5.n) gVar).getValue()).get(i18);
            kotlin.jvm.internal.o.d(obj);
            floatValue = ((java.lang.Number) obj).floatValue();
        }
        targetVideoView.setPlaySpeed(floatValue);
        if (floatValue == 0.5f) {
            i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_0_5;
        } else {
            if (!(floatValue == 1.0f)) {
                if (floatValue == 1.5f) {
                    i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_1_5;
                } else {
                    if (floatValue == 2.0f) {
                        i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_2;
                    }
                }
            }
            i17 = com.tencent.mm.R.raw.icons_outlined_channels_play_quickly_1;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) getActivity().findViewById(com.tencent.mm.R.id.iqj);
        if (weImageView != null) {
            weImageView.setImageResource(i17);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) getActivity().findViewById(com.tencent.mm.R.id.f486331kx3);
        if (weImageView2 != null) {
            weImageView2.setImageResource(i17);
        }
        db5.t7.makeText(getActivity(), getContext().getString(com.tencent.mm.R.string.gix, java.lang.Float.valueOf(floatValue)), 0).show();
    }

    public final void S6(in5.s0 holder) {
        java.lang.String str;
        java.lang.String string;
        android.view.ViewParent parent;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        lw2.m videoScaleCleanHelper;
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout;
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner imageBanner;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f133640h == null) {
            return;
        }
        if ((getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) && (finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) getContext().findViewById(com.tencent.mm.R.id.f487570p16)) != null) {
            finderViewPager.setEnableViewPagerScroll(((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.W0().r()).intValue() == 1);
        }
        if (!this.f133652w && this.f133643n != null) {
            so2.j5 j5Var = (so2.j5) holder.f293125i;
            if ((j5Var != null && j5Var.h() == 2) && (finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6)) != null && (imageBanner = finderMediaLayout.getImageBanner()) != null) {
                imageBanner.setLoopSpeed(this.f133641i);
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
            cw2.da videoView = finderVideoLayout2 != null ? finderVideoLayout2.getVideoView() : null;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setPlaySpeed(this.f133641i);
            }
            hc2.f1.x(holder.itemView);
            float f17 = this.f133641i;
            if (f17 == 1.0f) {
                this.f133648s.f(holder, false);
                b(holder);
            } else {
                ow2.h.k(this.f133648s, holder, f17, null, false, 12, null);
                a(holder);
            }
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.M1().r()).booleanValue()) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.u3d);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View p18 = holder.p(com.tencent.mm.R.id.h6o);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        so2.j5 j5Var2 = (so2.j5) holder.f293125i;
        long itemId = j5Var2 != null ? j5Var2.getItemId() : 0L;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout3 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
        if (!(finderVideoLayout3 != null && finderVideoLayout3.D())) {
            android.view.View T6 = T6();
            if (T6 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(T6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "finishSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            in5.s0 V6 = V6();
            if (V6 != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) V6.p(com.tencent.mm.R.id.e_k)) != null && (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) != null) {
                videoScaleCleanHelper.i();
            }
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
            if (finderFullSeekBarLayout != null) {
                finderFullSeekBarLayout.G();
            }
        }
        this.f133640h = null;
        this.f133641i = 1.0f;
        this.f133650u = false;
        com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout2 = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
        android.view.ViewParent parent2 = (finderMediaLayout2 == null || (parent = finderMediaLayout2.getParent()) == null) ? null : parent.getParent();
        com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout finderFeedBubbleTipsLayout = parent2 instanceof com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout ? (com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout) parent2 : null;
        W6(holder);
        ow2.a aVar = this.f133649t;
        aVar.f349365b = 0.0f;
        aVar.f349367d = 1.0f;
        aVar.f349369f = false;
        aVar.f349370g = null;
        aVar.f349371h = null;
        aVar.f349372i = null;
        aVar.f349373j = null;
        if (finderFeedBubbleTipsLayout != null) {
            finderFeedBubbleTipsLayout.setOnSpeedChangeDetector(null);
        }
        if (itemId == 0 || this.f133643n == null) {
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V62 = nyVar != null ? nyVar.V6() : null;
        android.view.MotionEvent motionEvent = this.f133643n;
        java.lang.Number valueOf = motionEvent != null ? java.lang.Float.valueOf(motionEvent.getX()) : 0;
        android.view.MotionEvent motionEvent2 = this.f133643n;
        java.lang.Number valueOf2 = motionEvent2 != null ? java.lang.Float.valueOf(motionEvent2.getY()) : 0;
        float f18 = 100;
        int floatValue = (int) ((valueOf.floatValue() / getContext().getResources().getDisplayMetrics().widthPixels) * f18);
        int floatValue2 = (int) ((valueOf2.floatValue() / getContext().getResources().getDisplayMetrics().heightPixels) * f18);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedid", pm0.v.u(itemId));
        jSONObject.put("push_time", java.lang.System.currentTimeMillis() - this.f133642m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(floatValue);
        sb6.append('_');
        sb6.append(floatValue2);
        jSONObject.put("push_area", sb6.toString());
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V62, "video_card", 4, jSONObject, false, null, 48, null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("long_press_accelerate_play", null, P6(this, holder, this.f133651v, true, this.f133652w, false, 16, null), 1, false);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = "";
        if (V62 == null || (str = V62.getString(2)) == null) {
            str = "";
        }
        hashMap.put("finder_tab_context_id", str);
        if (V62 != null && (string = V62.getString(1)) != null) {
            str2 = string;
        }
        hashMap.put("finder_context_id", str2);
        hashMap.put("comment_scene", java.lang.Integer.valueOf(V62 != null ? V62.getInteger(5) : 0));
        hashMap.put("accelerate_type", java.lang.Float.valueOf(this.f133651v));
        hashMap.put("feed_id", pm0.v.u(itemId));
        hashMap.put("accelerate_duration", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f133642m));
        hashMap.put("accelerate_leave_type", java.lang.Integer.valueOf(this.f133652w ? 1 : 2));
        ((cy1.a) rVar).yj("long_press_temporary_accelerate_play", null, hashMap, 1, false);
    }

    public final android.view.View T6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = (com.tencent.mm.plugin.finder.viewmodel.component.bl) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.bl.class);
        if (blVar != null) {
            android.view.View findViewById = blVar.f133892e != null ? blVar.findViewById(com.tencent.mm.R.id.e5c) : null;
            if (findViewById != null) {
                return findViewById;
            }
        }
        return getActivity().findViewById(com.tencent.mm.R.id.ggn);
    }

    public final boolean U6() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L3).getValue()).r()).booleanValue();
    }

    public final in5.s0 V6() {
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View view = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getActiveFragment().getView();
            refreshLoadMoreLayout = view != null ? (com.tencent.mm.view.RefreshLoadMoreLayout) view.findViewById(com.tencent.mm.R.id.m6e) : null;
        } else {
            refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById(com.tencent.mm.R.id.m6e);
        }
        if (refreshLoadMoreLayout == null || (recyclerView = refreshLoadMoreLayout.getRecyclerView()) == null) {
            return null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            return null;
        }
        androidx.recyclerview.widget.k3 p07 = recyclerView.p0(finderLinearLayoutManager.w());
        in5.s0 s0Var = p07 instanceof in5.s0 ? (in5.s0) p07 : null;
        boolean z17 = false;
        if (s0Var != null && s0Var.getItemViewType() == 4) {
            z17 = true;
        }
        if (z17) {
            return s0Var;
        }
        return null;
    }

    public final void W6(in5.s0 s0Var) {
        com.tencent.mars.xlog.Log.i("FinderSpeedControlUIC", "hideLockSpeedArea");
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.uql);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hideLockSpeedArea", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setBackground(getContext().getDrawable(com.tencent.mm.R.color.f479160rk));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.tqz);
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484865tr1);
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    public final void X6(in5.s0 holder) {
        jz5.l lVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var != null) {
            if (j5Var.h() == 2) {
                com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
                com.tencent.mm.plugin.finder.view.image.FinderImageBanner imageBanner = finderMediaLayout != null ? finderMediaLayout.getImageBanner() : null;
                lVar = new jz5.l(java.lang.Float.valueOf(imageBanner != null ? imageBanner.getCurLoopSpeed() : 1.0f), java.lang.Boolean.valueOf(imageBanner != null && imageBanner.f132324v));
            } else {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                zy2.g5 videoView = finderVideoLayout != null ? finderVideoLayout.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                lVar = new jz5.l(java.lang.Float.valueOf(finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getPlaySpeedRatio() : 1.0f), java.lang.Boolean.valueOf(finderThumbPlayerProxy != null && finderThumbPlayerProxy.isPlaying()));
            }
            float floatValue = ((java.lang.Number) lVar.f302833d).floatValue();
            boolean booleanValue = ((java.lang.Boolean) lVar.f302834e).booleanValue();
            if ((floatValue == 1.0f) || !booleanValue) {
                this.f133648s.f(holder, false);
                b(holder);
            } else {
                ow2.h.k(this.f133648s, holder, floatValue, null, false, 12, null);
                a(holder);
            }
        }
    }

    public final void Y6(float f17) {
        int i17;
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (f17 == 3.0f) {
            i17 = 6;
        } else {
            i17 = f17 == 1.25f ? 5 : (int) (f17 * 2);
        }
        jSONObject.put("speedplay_click_result", i17);
        java.lang.Long l17 = this.f133639g;
        if (l17 != null) {
            jSONObject.put("feedid", pm0.v.u(l17.longValue()));
        }
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "speedplayresult", 1, jSONObject, false, null, 48, null);
        this.f133639g = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(in5.s0 r19, java.util.List r20, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r21, com.tencent.mm.plugin.finder.viewmodel.component.k60 r22, yz5.a r23, ow2.h r24) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.Z6(in5.s0, java.util.List, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, com.tencent.mm.plugin.finder.viewmodel.component.k60, yz5.a, ow2.h):void");
    }

    public final void a(in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.tty);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.te_);
        if (p18 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "hidePromotion", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r0.isNativeDramaPromotionFeed() == true) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(in5.s0 r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r12.f293125i
            boolean r1 = r0 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r1 == 0) goto L9
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0
            goto La
        L9:
            r0 = 0
        La:
            r1 = 0
            if (r0 == 0) goto L1b
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.getFeedObject()
            if (r0 == 0) goto L1b
            boolean r0 = r0.isNativeDramaPromotionFeed()
            r2 = 1
            if (r0 != r2) goto L1b
            goto L1c
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L6a
            r0 = 2131308222(0x7f092ebe, float:1.8234693E38)
            android.view.View r0 = r12.p(r0)
            if (r0 != 0) goto L28
            goto L6a
        L28:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10.add(r2)
            java.util.Collections.reverse(r10)
            java.lang.Object[] r3 = r10.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r5 = "showPromotion"
            java.lang.String r6 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r4 = "showPromotion"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        L6a:
            r0 = 2131305380(0x7f0923a4, float:1.822893E38)
            android.view.View r12 = r12.p(r0)
            if (r12 != 0) goto L74
            goto Lb6
        L74:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.ThreadLocal r2 = zj0.c.f473285a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.add(r2)
            java.util.Collections.reverse(r0)
            java.lang.Object[] r3 = r0.toArray()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r5 = "showPromotion"
            java.lang.String r6 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r12
            yj0.a.d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r12.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC"
            java.lang.String r4 = "showPromotion"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r12
            yj0.a.f(r2, r3, r4, r5, r6, r7, r8)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.b(in5.s0):void");
    }

    public final java.lang.String b7(float f17) {
        return f17 % ((float) 1) == 0.0f ? java.lang.String.valueOf((int) f17) : java.lang.String.valueOf(f17);
    }

    public final void c7(in5.s0 holder, android.view.MotionEvent motionEvent, int i17) {
        android.view.ViewParent parent;
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner imageBanner;
        float f17;
        android.view.View p17;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        lw2.m videoScaleCleanHelper;
        android.view.ViewParent parent2;
        com.tencent.mm.plugin.finder.view.FinderViewPager finderViewPager;
        kotlin.jvm.internal.o.g(holder, "holder");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var != null) {
            int h17 = j5Var.h();
            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) holder.p(com.tencent.mm.R.id.ghd);
            if (finderFullSeekBarLayout != null && finderFullSeekBarLayout.isSeekMode && !finderFullSeekBarLayout.isPendingExitMode) {
                com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.I(finderFullSeekBarLayout, "LongPress", false, 2, null);
            }
            this.f133640h = holder;
            this.f133642m = java.lang.System.currentTimeMillis();
            this.f133644o = java.lang.System.currentTimeMillis();
            this.f133643n = motionEvent;
            if ((getContext() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) && (finderViewPager = (com.tencent.mm.plugin.finder.view.FinderViewPager) getContext().findViewById(com.tencent.mm.R.id.f487570p16)) != null) {
                finderViewPager.setEnableViewPagerScroll(false);
            }
            if (h17 == 2) {
                this.f133645p = 0L;
            } else if (h17 == 4) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                cw2.da videoView = finderVideoLayout2 != null ? finderVideoLayout2.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
                this.f133645p = finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getCurrentPlayMs() : 0L;
            }
            this.f133646q = this.f133644o;
            this.f133647r = this.f133645p;
            if (h17 == 2) {
                android.view.View p18 = holder.p(com.tencent.mm.R.id.mhc);
                if (p18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
                if (finderMediaLayout != null && (imageBanner = finderMediaLayout.getImageBanner()) != null) {
                    float curLoopSpeed = imageBanner.getCurLoopSpeed();
                    this.f133641i = curLoopSpeed;
                    f17 = (curLoopSpeed > 1.0f ? 1 : (curLoopSpeed == 1.0f ? 0 : -1)) == 0 ? 2.0f : 1.0f;
                    this.f133651v = f17;
                    imageBanner.setLoopSpeed(f17);
                    imageBanner.m();
                }
                com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout2 = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
                android.view.ViewParent parent3 = (finderMediaLayout2 == null || (parent = finderMediaLayout2.getParent()) == null) ? null : parent.getParent();
                O6(holder, motionEvent, parent3 instanceof com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout ? (com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout) parent3 : null, new com.tencent.mm.plugin.finder.viewmodel.component.c60(this, holder));
            } else if (h17 == 4) {
                com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout3 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k);
                cw2.da videoView2 = finderVideoLayout3 != null ? finderVideoLayout3.getVideoView() : null;
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = videoView2 instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView2 : null;
                if (finderThumbPlayerProxy2 == null) {
                    return;
                }
                float playSpeedRatio = finderThumbPlayerProxy2.getPlaySpeedRatio();
                this.f133641i = playSpeedRatio;
                f17 = (playSpeedRatio > 1.0f ? 1 : (playSpeedRatio == 1.0f ? 0 : -1)) == 0 ? 2.0f : 1.0f;
                this.f133651v = f17;
                finderThumbPlayerProxy2.setPlaySpeed(f17);
                com.tencent.mm.plugin.finder.view.FinderMediaLayout finderMediaLayout3 = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) holder.p(com.tencent.mm.R.id.fs6);
                android.view.ViewParent parent4 = (finderMediaLayout3 == null || (parent2 = finderMediaLayout3.getParent()) == null) ? null : parent2.getParent();
                O6(holder, motionEvent, parent4 instanceof com.tencent.mm.plugin.finder.view.SimpleTouchableLayout ? (com.tencent.mm.plugin.finder.view.SimpleTouchableLayout) parent4 : null, new com.tencent.mm.plugin.finder.viewmodel.component.d60(this, holder, finderThumbPlayerProxy2));
            }
            android.view.View T6 = T6();
            if (T6 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(T6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                T6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(T6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            float f18 = this.f133651v;
            ow2.h.k(this.f133648s, holder, f18, (f18 > 1.0f ? 1 : (f18 == 1.0f ? 0 : -1)) == 0 ? com.tencent.mm.plugin.finder.view.al.f131653e : com.tencent.mm.plugin.finder.view.al.f131652d, false, 8, null);
            a(holder);
            hc2.f1.x(holder.itemView);
            in5.s0 V6 = V6();
            if (V6 != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) V6.p(com.tencent.mm.R.id.e_k)) != null && (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) != null) {
                videoScaleCleanHelper.a(false, true);
            }
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.M1().r()).booleanValue() && (p17 = holder.p(com.tencent.mm.R.id.h6o)) != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSpeedControlUIC", "triggerSpeedPlay", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/MotionEvent;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f133650u = true;
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
            if (finderBulletUIC != null) {
                cq.k1.a();
                if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127857o6).getValue()).r()).booleanValue()) {
                    bb2.a1 a1Var = finderBulletUIC.f133504q;
                    com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView megaVideoBulletNativeView = a1Var instanceof com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView ? (com.tencent.mm.plugin.finder.bullet.MegaVideoBulletNativeView) a1Var : null;
                    if (megaVideoBulletNativeView != null) {
                        megaVideoBulletNativeView.j();
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        lw2.m videoScaleCleanHelper;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2;
        jz5.g gVar = this.f133636d;
        boolean z17 = false;
        if (((com.tencent.mm.plugin.finder.viewmodel.component.x60) ((jz5.n) gVar).getValue()).f136406c != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.x60.c((com.tencent.mm.plugin.finder.viewmodel.component.x60) ((jz5.n) gVar).getValue(), true, true, 0.0f, 4, null);
            return true;
        }
        in5.s0 V6 = V6();
        if (V6 != null && (finderVideoLayout2 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) V6.p(com.tencent.mm.R.id.e_k)) != null && finderVideoLayout2.D()) {
            z17 = true;
        }
        if (!z17) {
            return super.onBackPressed();
        }
        in5.s0 V62 = V6();
        if (V62 != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) V62.p(com.tencent.mm.R.id.e_k)) != null && (videoScaleCleanHelper = finderVideoLayout.getVideoScaleCleanHelper()) != null) {
            videoScaleCleanHelper.i();
            videoScaleCleanHelper.h(64, true);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
    }
}
