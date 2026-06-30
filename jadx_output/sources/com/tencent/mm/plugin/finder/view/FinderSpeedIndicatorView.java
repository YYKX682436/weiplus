package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0002B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\tJ\u001a\u0010\f\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\t¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/finder/view/al;", "getCurrentState", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED, "Ljz5/f0;", "setCurrentSpeed", "getCurrentSpeed", "Lkotlin/Function1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSpeedClickListener", "setOnStateChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/yk", "com/tencent/mm/plugin/finder/view/zk", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderSpeedIndicatorView extends android.widget.FrameLayout {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f131467w = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f131468d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f131469e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f131470f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f131471g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f131472h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f131473i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f131474m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f131475n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.al f131476o;

    /* renamed from: p, reason: collision with root package name */
    public float f131477p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f131478q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f131479r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.y0 f131480s;

    /* renamed from: t, reason: collision with root package name */
    public kotlinx.coroutines.r2 f131481t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.AnimatorSet f131482u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.yk f131483v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderSpeedIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(com.tencent.mm.plugin.finder.view.zk zkVar) {
        zkVar.f133472a.setVisibility(0);
        zkVar.f133472a.setBackground(b3.l.getDrawable(getContext(), com.tencent.mm.R.drawable.d0h));
        zkVar.f133473b.setVisibility(0);
        zkVar.f133474c.setVisibility(0);
        android.widget.TextView textView = zkVar.f133475d;
        textView.setTextColor(-1);
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public final void b() {
        com.tencent.mm.plugin.finder.view.zk zkVar;
        if (this.f131476o == com.tencent.mm.plugin.finder.view.al.f131652d && (zkVar = (com.tencent.mm.plugin.finder.view.zk) ((java.util.LinkedHashMap) this.f131471g).get(java.lang.Float.valueOf(this.f131477p))) != null) {
            android.animation.AnimatorSet animatorSet = this.f131482u;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.widget.LinearLayout linearLayout = zkVar.f133472a;
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(linearLayout, "scaleX", 1.0f, 1.1f, 1.0f);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(linearLayout, "scaleY", 1.0f, 1.1f, 1.0f);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.playTogether(ofFloat, ofFloat2);
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(new com.tencent.mm.plugin.finder.view.fl(this));
            animatorSet2.start();
            this.f131482u = animatorSet2;
        }
    }

    public final void c(android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        kotlinx.coroutines.r2 r2Var = this.f131481t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        imageView.setAlpha(1.0f);
        imageView2.setAlpha(0.3f);
        kotlinx.coroutines.y0 y0Var = this.f131480s;
        if (y0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorView", "startIconAnimation skip: scope unavailable (not attached)");
        } else {
            this.f131481t = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.view.gl(this, imageView, imageView2, null), 3, null);
        }
    }

    public final void d() {
        kotlinx.coroutines.r2 r2Var = this.f131481t;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f131481t = null;
        android.animation.AnimatorSet animatorSet = this.f131482u;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f131482u = null;
    }

    public void e(com.tencent.mm.plugin.finder.view.al state) {
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorView", "switchToState from " + this.f131476o + " to " + state);
        this.f131476o = state;
        d();
        android.widget.LinearLayout linearLayout = this.f131468d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("selectorContainer");
            throw null;
        }
        linearLayout.setVisibility((state == com.tencent.mm.plugin.finder.view.al.f131652d || state == com.tencent.mm.plugin.finder.view.al.f131656h) ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = this.f131469e;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("playingContainer");
            throw null;
        }
        linearLayout2.setVisibility(state == com.tencent.mm.plugin.finder.view.al.f131653e ? 0 : 8);
        android.widget.LinearLayout linearLayout3 = this.f131470f;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("lockedContainer");
            throw null;
        }
        linearLayout3.setVisibility(state == com.tencent.mm.plugin.finder.view.al.f131654f ? 0 : 8);
        int ordinal = state.ordinal();
        java.util.Map map = this.f131471g;
        if (ordinal == 0) {
            f();
            com.tencent.mm.plugin.finder.view.zk zkVar = (com.tencent.mm.plugin.finder.view.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f131477p));
            if (zkVar != null) {
                c(zkVar.f133473b, zkVar.f133474c);
            }
        } else if (ordinal == 1) {
            k();
            com.tencent.mm.plugin.finder.view.zk zkVar2 = (com.tencent.mm.plugin.finder.view.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f131477p));
            if (zkVar2 != null) {
                c(zkVar2.f133473b, zkVar2.f133474c);
            }
        } else if (ordinal == 2) {
            h();
            android.widget.ImageView imageView2 = this.f131472h;
            if (imageView2 != null && (imageView = this.f131473i) != null) {
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("ivPlayingIcon1");
                    throw null;
                }
                imageView2.setVisibility(0);
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("ivPlayingIcon2");
                    throw null;
                }
                imageView.setVisibility(0);
                if (imageView2 == null) {
                    kotlin.jvm.internal.o.o("ivPlayingIcon1");
                    throw null;
                }
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("ivPlayingIcon2");
                    throw null;
                }
                c(imageView2, imageView);
            }
        } else if (ordinal == 3) {
            g();
        }
        yz5.l lVar = this.f131479r;
        if (lVar != null) {
            lVar.invoke(state);
        }
    }

    public final void f() {
        for (java.util.Map.Entry entry : this.f131471g.entrySet()) {
            float floatValue = ((java.lang.Number) entry.getKey()).floatValue();
            com.tencent.mm.plugin.finder.view.zk zkVar = (com.tencent.mm.plugin.finder.view.zk) entry.getValue();
            zkVar.f133472a.setVisibility(0);
            if (floatValue == this.f131477p) {
                a(zkVar);
            } else {
                zkVar.f133472a.setBackground(null);
                zkVar.f133473b.setVisibility(8);
                zkVar.f133474c.setVisibility(8);
                int color = b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_3);
                android.widget.TextView textView = zkVar.f133475d;
                textView.setTextColor(color);
                textView.setShadowLayer(getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479644bj), 0.0f, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479641bg), 1291845632);
            }
        }
    }

    public final void g() {
        java.lang.String string;
        float f17 = this.f131477p;
        if (this.f131483v == com.tencent.mm.plugin.finder.view.yk.f133398d) {
            if (f17 == 1.0f) {
                string = getContext().getResources().getString(com.tencent.mm.R.string.f492086o22);
            } else {
                string = f17 % ((float) 1) == 0.0f ? getContext().getResources().getString(com.tencent.mm.R.string.f492087o23, java.lang.Integer.valueOf((int) f17)) : getContext().getResources().getString(com.tencent.mm.R.string.f492087o23, java.lang.Float.valueOf(f17));
            }
            kotlin.jvm.internal.o.d(string);
        } else {
            if (f17 == 1.0f) {
                string = getContext().getResources().getString(com.tencent.mm.R.string.f492086o22);
            } else {
                string = f17 % ((float) 1) == 0.0f ? getContext().getResources().getString(com.tencent.mm.R.string.p5h, java.lang.Integer.valueOf((int) f17)) : getContext().getResources().getString(com.tencent.mm.R.string.p5h, java.lang.Float.valueOf(f17));
            }
            kotlin.jvm.internal.o.d(string);
        }
        android.widget.TextView textView = this.f131475n;
        if (textView != null) {
            textView.setText(string);
        } else {
            kotlin.jvm.internal.o.o("tvLockedSpeed");
            throw null;
        }
    }

    /* renamed from: getCurrentSpeed, reason: from getter */
    public final float getF131477p() {
        return this.f131477p;
    }

    /* renamed from: getCurrentState, reason: from getter */
    public final com.tencent.mm.plugin.finder.view.al getF131476o() {
        return this.f131476o;
    }

    public final void h() {
        java.lang.String string;
        float f17 = this.f131477p;
        if (f17 == 1.0f) {
            string = getContext().getResources().getString(com.tencent.mm.R.string.f492085o21);
            kotlin.jvm.internal.o.f(string, "getString(...)");
        } else {
            if (f17 % ((float) 1) == 0.0f) {
                string = getContext().getResources().getString(com.tencent.mm.R.string.p5v, java.lang.Integer.valueOf((int) f17));
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else {
                string = getContext().getResources().getString(com.tencent.mm.R.string.p5v, java.lang.Float.valueOf(f17));
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
        }
        android.widget.TextView textView = this.f131474m;
        if (textView != null) {
            textView.setText(string);
        } else {
            kotlin.jvm.internal.o.o("tvPlayingSpeed");
            throw null;
        }
    }

    public final void k() {
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f131471g).entrySet()) {
            float floatValue = ((java.lang.Number) entry.getKey()).floatValue();
            com.tencent.mm.plugin.finder.view.zk zkVar = (com.tencent.mm.plugin.finder.view.zk) entry.getValue();
            if (floatValue == this.f131477p) {
                a(zkVar);
            } else {
                zkVar.f133472a.setVisibility(4);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        android.widget.ImageView imageView;
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("FinderSpeedIndicatorView", "onAttachedToWindow currentState=" + this.f131476o);
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f131480s = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        com.tencent.mm.plugin.finder.view.al alVar = this.f131476o;
        if (alVar != com.tencent.mm.plugin.finder.view.al.f131653e) {
            if (alVar == com.tencent.mm.plugin.finder.view.al.f131652d || alVar == com.tencent.mm.plugin.finder.view.al.f131656h) {
                com.tencent.mm.plugin.finder.view.zk zkVar = (com.tencent.mm.plugin.finder.view.zk) ((java.util.LinkedHashMap) this.f131471g).get(java.lang.Float.valueOf(this.f131477p));
                if (zkVar != null) {
                    c(zkVar.f133473b, zkVar.f133474c);
                    return;
                }
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = this.f131472h;
        if (imageView2 == null || (imageView = this.f131473i) == null) {
            return;
        }
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("ivPlayingIcon1");
            throw null;
        }
        if (imageView != null) {
            c(imageView2, imageView);
        } else {
            kotlin.jvm.internal.o.o("ivPlayingIcon2");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        kotlinx.coroutines.y0 y0Var = this.f131480s;
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
        this.f131480s = null;
    }

    public final void setCurrentSpeed(float f17) {
        this.f131477p = f17;
        int ordinal = this.f131476o.ordinal();
        java.util.Map map = this.f131471g;
        if (ordinal == 0) {
            f();
            com.tencent.mm.plugin.finder.view.zk zkVar = (com.tencent.mm.plugin.finder.view.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f131477p));
            if (zkVar != null) {
                c(zkVar.f133473b, zkVar.f133474c);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                h();
                return;
            } else {
                if (ordinal != 3) {
                    return;
                }
                g();
                return;
            }
        }
        k();
        com.tencent.mm.plugin.finder.view.zk zkVar2 = (com.tencent.mm.plugin.finder.view.zk) ((java.util.LinkedHashMap) map).get(java.lang.Float.valueOf(this.f131477p));
        if (zkVar2 != null) {
            c(zkVar2.f133473b, zkVar2.f133474c);
        }
    }

    public final void setOnSpeedClickListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f131478q = listener;
    }

    public final void setOnStateChangeListener(yz5.l listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f131479r = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSpeedIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f131471g = linkedHashMap;
        this.f131476o = com.tencent.mm.plugin.finder.view.al.f131652d;
        this.f131477p = 2.0f;
        this.f131483v = com.tencent.mm.plugin.finder.view.yk.f133398d;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eec, (android.view.ViewGroup) this, true);
        setClipChildren(false);
        setClipToPadding(false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.v2w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131468d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.uqq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f131469e = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ucx);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f131470f = (android.widget.LinearLayout) findViewById3;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.5f);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.v_b);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.u6i);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.u6j);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.vh9);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        linkedHashMap.put(valueOf, new com.tencent.mm.plugin.finder.view.zk((android.widget.LinearLayout) findViewById4, (android.widget.ImageView) findViewById5, (android.widget.ImageView) findViewById6, (android.widget.TextView) findViewById7));
        java.lang.Float valueOf2 = java.lang.Float.valueOf(2.0f);
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.v_c);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.u6k);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.u6l);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.vh_);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        linkedHashMap.put(valueOf2, new com.tencent.mm.plugin.finder.view.zk((android.widget.LinearLayout) findViewById8, (android.widget.ImageView) findViewById9, (android.widget.ImageView) findViewById10, (android.widget.TextView) findViewById11));
        java.lang.Float valueOf3 = java.lang.Float.valueOf(3.0f);
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.v_d);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.u6m);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.u6n);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.view.View findViewById15 = findViewById(com.tencent.mm.R.id.vha);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        linkedHashMap.put(valueOf3, new com.tencent.mm.plugin.finder.view.zk((android.widget.LinearLayout) findViewById12, (android.widget.ImageView) findViewById13, (android.widget.ImageView) findViewById14, (android.widget.TextView) findViewById15));
        android.view.View findViewById16 = findViewById(com.tencent.mm.R.id.u6o);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        this.f131472h = (android.widget.ImageView) findViewById16;
        android.view.View findViewById17 = findViewById(com.tencent.mm.R.id.u6p);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.f131473i = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = findViewById(com.tencent.mm.R.id.vh6);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.f131474m = (android.widget.TextView) findViewById18;
        android.view.View findViewById19 = findViewById(com.tencent.mm.R.id.f487410vh5);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        this.f131475n = (android.widget.TextView) findViewById19;
        float m17 = i65.a.m(context);
        float dimension = context.getResources().getDimension(com.tencent.mm.R.dimen.f479850gz);
        java.util.Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.finder.view.zk) it.next()).f133475d.setTextSize(0, dimension * m17);
        }
        android.widget.TextView textView = this.f131474m;
        if (textView != null) {
            float f17 = dimension * m17;
            textView.setTextSize(0, f17);
            android.widget.TextView textView2 = this.f131475n;
            if (textView2 != null) {
                textView2.setTextSize(0, f17);
                android.widget.LinearLayout linearLayout = this.f131469e;
                if (linearLayout != null) {
                    linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.view.xk(this));
                    f();
                    return;
                } else {
                    kotlin.jvm.internal.o.o("playingContainer");
                    throw null;
                }
            }
            kotlin.jvm.internal.o.o("tvLockedSpeed");
            throw null;
        }
        kotlin.jvm.internal.o.o("tvPlayingSpeed");
        throw null;
    }

    public final android.animation.ValueAnimator a(android.view.View view, long j17, long j18, float f17, float f18) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j17);
        ofFloat.setStartDelay(j18);
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.view.el(view, f17, f18));
        return ofFloat;
    }
}
