package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderHorizontalVideoDrawerUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public gx2.q f133587d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f133588e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f133589f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f133590g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1 f133591h;

    /* renamed from: i, reason: collision with root package name */
    public in5.s0 f133592i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f133593m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f133594n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f133595o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f133596p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f133597q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f133598r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1] */
    public FinderHorizontalVideoDrawerUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133589f = true;
        this.f133591h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent>(this) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC$videoFinishListener$1

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f133600e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(androidx.appcompat.app.AppCompatActivity.this);
                this.f133600e = this;
                this.__eventId = -1291074182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
                com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent event = feedMegaVideoAnimPlayEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54249g.f6661d) {
                    androidx.appcompat.app.AppCompatActivity activity2 = androidx.appcompat.app.AppCompatActivity.this;
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    pf5.z zVar = pf5.z.f353948a;
                    com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a(activity2).e(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
                    if (a4Var != null && a4Var.f133729y) {
                        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: some drawer has been open");
                    } else if (activity2.getResources().getConfiguration().orientation != 1) {
                        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "videoFinishListener: activity is not portrait");
                    } else {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("videoFinishListener: isPeek=");
                        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f133600e;
                        sb6.append(finderHorizontalVideoDrawerUIC.f133589f);
                        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", sb6.toString());
                        if (finderHorizontalVideoDrawerUIC.f133589f) {
                            finderHorizontalVideoDrawerUIC.f133589f = false;
                            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(finderHorizontalVideoDrawerUIC.Q6(), false, 1, null);
                            ((com.tencent.mm.plugin.finder.viewmodel.component.mn) zVar.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class)).f135180e = 1;
                        }
                    }
                }
                return true;
            }
        };
        this.f133593m = new android.graphics.Rect();
        this.f133594n = new android.graphics.Rect();
        this.f133595o = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.lm(this));
        this.f133596p = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.nm(this));
        this.f133597q = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.qm(this));
        this.f133598r = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.mm(this));
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.c79);
        if (p17 != null) {
            android.view.View findViewById = finderHorizontalVideoDrawerUIC.R6().findViewById(com.tencent.mm.R.id.c79);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshComment", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshComment", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.cm(p17, s0Var, finderHorizontalVideoDrawerUIC));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.h6b);
        if (weImageView != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) finderHorizontalVideoDrawerUIC.R6().findViewById(com.tencent.mm.R.id.h6b);
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.c6s);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) finderHorizontalVideoDrawerUIC.R6().findViewById(com.tencent.mm.R.id.c6s);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC, in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.msw);
        if (p17 != null) {
            android.view.View findViewById = finderHorizontalVideoDrawerUIC.R6().findViewById(com.tencent.mm.R.id.msw);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshShare", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "applyShrinkOpLayout$refreshShare", "(Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.em(p17, s0Var, finderHorizontalVideoDrawerUIC));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.p(com.tencent.mm.R.id.h6p);
        if (weImageView != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) finderHorizontalVideoDrawerUIC.R6().findViewById(com.tencent.mm.R.id.h6p);
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.msm);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) finderHorizontalVideoDrawerUIC.R6().findViewById(com.tencent.mm.R.id.msm);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public final gx2.q Q6() {
        gx2.q qVar = this.f133587d;
        if (qVar != null) {
            return qVar;
        }
        kotlin.jvm.internal.o.o("recommendDrawer");
        throw null;
    }

    public final android.view.View R6() {
        return (android.view.View) ((jz5.n) this.f133598r).getValue();
    }

    public final android.widget.FrameLayout S6() {
        return (android.widget.FrameLayout) ((jz5.n) this.f133597q).getValue();
    }

    public final boolean T6(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        boolean z17 = true;
        boolean z18 = this.f133589f && motionEvent != null && motionEvent2 != null && Q6().onScroll(motionEvent, motionEvent2, f17, f18);
        if (!this.f133590g && !z18) {
            z17 = false;
        }
        this.f133590g = z17;
        return z18;
    }

    public final void U6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_x);
        if (p17 != null) {
            android.view.View findViewById = R6().findViewById(com.tencent.mm.R.id.a_x);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.jm(p17));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6i);
        if (weImageView != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) R6().findViewById(com.tencent.mm.R.id.h6i);
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.i1g);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) R6().findViewById(com.tencent.mm.R.id.i1g);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public final void V6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f487088ng5);
        if (p17 != null) {
            android.view.View findViewById = R6().findViewById(com.tencent.mm.R.id.f487088ng5);
            int visibility = p17.getVisibility();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "refreshStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setEnabled(p17.isEnabled());
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.km(p17));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.h6s);
        if (weImageView != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) R6().findViewById(com.tencent.mm.R.id.h6s);
            weImageView2.setAlpha(weImageView.getAlpha());
            weImageView2.setImageDrawable(weImageView.getDrawable());
            weImageView2.setIconColor(weImageView.getIconColor());
            weImageView2.setVisibility(weImageView.getVisibility());
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f487086ng3);
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) R6().findViewById(com.tencent.mm.R.id.f487086ng3);
            textView2.setTextSize(0, textView.getTextSize());
            textView2.getPaint().setStyle(textView.getPaint().getStyle());
            textView2.getPaint().setStrokeWidth(textView.getPaint().getStrokeWidth());
            textView2.getPaint().setFakeBoldText(textView.getPaint().isFakeBoldText());
            textView2.setAlpha(textView.getAlpha());
            textView2.setTextColor(textView.getTextColors());
            textView2.setText(textView.getText());
            textView2.setVisibility(textView.getVisibility());
        }
    }

    public final void W6() {
        android.view.View view = (android.view.View) ((jz5.n) this.f133595o).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "resetAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "resetAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        S6().setVisibility(8);
        this.f133592i = null;
    }
}
