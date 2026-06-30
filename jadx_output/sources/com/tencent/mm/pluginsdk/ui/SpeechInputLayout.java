package com.tencent.mm.pluginsdk.ui;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0003,\u0006\tB\u001d\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u000fR\u001b\u0010%\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u000f¨\u0006-"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/SpeechInputLayout;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/ui/tools/c5;", "Landroid/view/View;", "Ljz5/f0;", "setVisible", "Lcom/tencent/mm/pluginsdk/ui/v2;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSpeechInputListener", "Lcom/tencent/mm/pluginsdk/ui/w2;", "setOnSpeechInputShowListener", "", "d", "I", "getCurV2TStatus", "()I", "setCurV2TStatus", "(I)V", "curV2TStatus", "", "e", "Z", "isShowKeyboard", "()Z", "setShowKeyboard", "(Z)V", "Landroid/animation/ObjectAnimator;", "u", "Ljz5/g;", "getBgAnimator", "()Landroid/animation/ObjectAnimator;", "bgAnimator", org.chromium.base.BaseSwitches.V, "getMaxWave", "maxWave", "w", "getMinWave", "minWave", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/pluginsdk/ui/u2", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpeechInputLayout extends android.widget.FrameLayout implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: y, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.u2 f189820y = new com.tencent.mm.pluginsdk.ui.u2(null);

    /* renamed from: z, reason: collision with root package name */
    public static final jz5.g f189821z = jz5.h.b(com.tencent.mm.pluginsdk.ui.t2.f191325d);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int curV2TStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShowKeyboard;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f189824f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f189825g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f189826h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f189827i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f189828m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f189829n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.v2 f189830o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.w2 f189831p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f189832q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f189833r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f189834s;

    /* renamed from: t, reason: collision with root package name */
    public final int f189835t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bgAnimator;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final jz5.g maxWave;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final jz5.g minWave;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.f5 f189839x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpeechInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.bgAnimator = jz5.h.b(new com.tencent.mm.pluginsdk.ui.y2(this));
        this.maxWave = jz5.h.b(new com.tencent.mm.pluginsdk.ui.z2(context));
        this.minWave = jz5.h.b(new com.tencent.mm.pluginsdk.ui.a3(context));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.epq, this);
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) != null) {
            com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
            this.f189839x = f5Var;
            f5Var.f210400e = this;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.vl6);
        this.f189824f = findViewById;
        this.f189825g = findViewById(com.tencent.mm.R.id.f487524vl1);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f487525vl2);
        this.f189826h = weImageView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487527vl4);
        this.f189827i = findViewById2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f487528vl5);
        this.f189828m = weImageView2;
        this.f189829n = findViewById(com.tencent.mm.R.id.vl7);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.s2(this));
        }
        this.f189832q = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigVoiceInputLongClick()) == 1;
        this.f189835t = context.getResources().getColor(com.tencent.mm.R.color.adg);
        if (f189820y.a() == 1) {
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.mike_circle_regular);
            }
            if (weImageView != null) {
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
            android.view.ViewGroup.LayoutParams layoutParams = weImageView != null ? weImageView.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.width = dimensionPixelSize;
                layoutParams2.height = dimensionPixelSize;
                layoutParams2.setMargins(0, 0, 0, 0);
                if (weImageView != null) {
                    weImageView.setLayoutParams(layoutParams2);
                }
            }
            if (weImageView2 != null) {
                weImageView2.setImageResource(com.tencent.mm.R.raw.mike_no_circle_filled);
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = weImageView2 != null ? weImageView2.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.width = dimensionPixelSize;
                layoutParams4.height = dimensionPixelSize;
                layoutParams4.setMargins(0, 0, 0, 0);
                if (weImageView2 != null) {
                    weImageView2.setLayoutParams(layoutParams4);
                }
            }
            int e17 = com.tencent.mm.ui.zk.e(context, com.tencent.mm.R.dimen.amd);
            java.lang.Object layoutParams5 = findViewById2 != null ? findViewById2.getLayoutParams() : null;
            android.widget.FrameLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.setMargins(e17, e17, e17, e17);
                if (findViewById2 == null) {
                    return;
                }
                findViewById2.setLayoutParams(layoutParams6);
            }
        }
    }

    private final int getMaxWave() {
        return ((java.lang.Number) ((jz5.n) this.maxWave).getValue()).intValue();
    }

    private final int getMinWave() {
        return ((java.lang.Number) ((jz5.n) this.minWave).getValue()).intValue();
    }

    public static final int getVoiceInputNewIconExpt() {
        return f189820y.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisible(android.view.View view) {
        view.animate().cancel();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "setVisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "setVisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "setVisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "setVisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void b(int i17) {
        android.view.View view = this.f189829n;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        int i18 = layoutParams != null ? layoutParams.width : 0;
        if (i18 > 0) {
            int min = java.lang.Math.min(java.lang.Math.max(i17 < 10 ? i18 - 2 : i18 + 2, getMinWave()), getMaxWave());
            if (layoutParams != null) {
                layoutParams.width = min;
            }
            if (layoutParams != null) {
                layoutParams.height = min;
            }
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(int i17) {
        android.view.View view;
        int i18;
        android.view.View view2;
        float f17;
        android.view.View view3;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        android.view.View view4;
        float f18;
        float f19;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout;
        int i19;
        android.app.Activity activity;
        android.view.View view5;
        float f27;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
        float f28;
        android.view.View view6;
        int i27;
        com.tencent.mm.pluginsdk.ui.SpeechInputLayout speechInputLayout2;
        int i28;
        com.tencent.mm.pluginsdk.ui.w2 w2Var;
        android.view.View view7;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator animate4;
        android.view.ViewPropertyAnimator animate5;
        android.view.ViewPropertyAnimator animate6;
        int i29 = this.curV2TStatus;
        if (i17 == i29) {
            return;
        }
        this.curV2TStatus = i17;
        android.view.View view8 = this.f189825g;
        if (view8 != null && (animate6 = view8.animate()) != null) {
            animate6.cancel();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f189826h;
        if (weImageView3 != null && (animate5 = weImageView3.animate()) != null) {
            animate5.cancel();
        }
        android.view.View view9 = this.f189827i;
        if (view9 != null && (animate4 = view9.animate()) != null) {
            animate4.cancel();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f189828m;
        if (weImageView4 != null && (animate3 = weImageView4.animate()) != null) {
            animate3.cancel();
        }
        android.view.View view10 = this.f189829n;
        if (view10 != null && (animate2 = view10.animate()) != null) {
            animate2.cancel();
        }
        android.view.View view11 = this.f189824f;
        if (view11 != null && (animate = view11.animate()) != null) {
            animate.cancel();
        }
        android.animation.ObjectAnimator bgAnimator = getBgAnimator();
        if (bgAnimator != null) {
            bgAnimator.cancel();
        }
        if (view8 == null) {
            i18 = 0;
            view2 = view11;
            view = view10;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            view = view10;
            i18 = 0;
            view2 = view11;
            yj0.a.d(view8, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view8.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view8, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (weImageView3 == null) {
            f17 = 1.0f;
        } else {
            f17 = 1.0f;
            weImageView3.setAlpha(1.0f);
        }
        if (view9 == null) {
            view3 = view9;
            view4 = view;
            weImageView = weImageView4;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            view3 = view9;
            yj0.a.d(view9, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(i18)).floatValue());
            weImageView = weImageView4;
            view4 = view;
            yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (weImageView == null) {
            f18 = 1.0f;
        } else {
            f18 = 1.0f;
            weImageView.setAlpha(1.0f);
        }
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Float.valueOf(f18));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList3.get(i18)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view12 = view2;
        if (view12 == null) {
            f19 = 1.0f;
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            f19 = 1.0f;
            arrayList4.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view12, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view12.setAlpha(((java.lang.Float) arrayList4.get(i18)).floatValue());
            yj0.a.f(view12, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "cancelAllViewAnimations", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (i17 != 0) {
            com.tencent.mm.pluginsdk.ui.u2 u2Var = f189820y;
            if (i17 != 1) {
                if (i17 == 2) {
                    speechInputLayout2 = this;
                    i28 = 2;
                    com.tencent.mm.pluginsdk.ui.w2 w2Var2 = speechInputLayout2.f189831p;
                    if (w2Var2 != null) {
                        w2Var2.a();
                    }
                    if (!speechInputLayout2.isShowKeyboard && (w2Var = speechInputLayout2.f189831p) != null) {
                        w2Var.f();
                    }
                    com.tencent.mm.pluginsdk.ui.w2 w2Var3 = speechInputLayout2.f189831p;
                    if (w2Var3 != null) {
                        w2Var3.onShow();
                    }
                    if (weImageView3 != null) {
                        weImageView3.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.Brand_80));
                    }
                    if (u2Var.a() == 1 && weImageView3 != null) {
                        weImageView3.setImageResource(com.tencent.mm.R.raw.mike_no_circle_regular);
                    }
                    if (view4 != null) {
                        sa5.d.c(view4, 0.0f, 100L, null, 5, null);
                    }
                    if (view12 != null) {
                        speechInputLayout2.setVisible(view12);
                    }
                } else if (i17 == 3 && i29 == 2) {
                    if (view8 != null) {
                        view7 = view3;
                        i28 = 2;
                        sa5.d.d(view8, 0, 150L, null, 5, null);
                    } else {
                        view7 = view3;
                        i28 = 2;
                    }
                    speechInputLayout2 = this;
                    if (view7 != null) {
                        speechInputLayout2.setVisible(view7);
                    }
                    android.animation.ObjectAnimator bgAnimator2 = getBgAnimator();
                    if (bgAnimator2 != null) {
                        bgAnimator2.start();
                    }
                    if (weImageView != null) {
                        speechInputLayout2.setVisible(weImageView);
                    }
                    if (weImageView != null) {
                        sa5.d.c(weImageView, 0.0f, 150L, null, 5, null);
                    }
                } else {
                    speechInputLayout2 = this;
                    i28 = 2;
                }
                speechInputLayout = speechInputLayout2;
                i19 = i28;
            } else {
                android.view.View view13 = view3;
                float f29 = f19;
                com.tencent.mm.pluginsdk.ui.w2 w2Var4 = this.f189831p;
                if (w2Var4 != null) {
                    w2Var4.onShow();
                }
                android.animation.ObjectAnimator bgAnimator3 = getBgAnimator();
                if (bgAnimator3 != null) {
                    bgAnimator3.cancel();
                }
                if (u2Var.a() == 1) {
                    if (weImageView3 != null) {
                        weImageView3.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0));
                    }
                    if (weImageView3 != null) {
                        weImageView3.setImageResource(com.tencent.mm.R.raw.mike_circle_regular);
                    }
                } else if (weImageView3 != null) {
                    weImageView3.setIconColor(this.f189835t);
                }
                if (i29 == 0) {
                    if (weImageView3 != null) {
                        setVisible(weImageView3);
                    }
                    if (view12 != null) {
                        setVisible(view12);
                    }
                    if (view4 == null) {
                        view5 = view13;
                        f27 = f29;
                    } else {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList5.add(java.lang.Float.valueOf(f29));
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((java.lang.Float) arrayList5.get(i18)).floatValue());
                        view5 = view13;
                        f27 = f29;
                        yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    if (view5 == null) {
                        weImageView2 = weImageView;
                        float f37 = f27;
                        view6 = view4;
                        f28 = f37;
                    } else {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                        arrayList6.add(java.lang.Float.valueOf(f27));
                        java.util.Collections.reverse(arrayList6);
                        android.view.View view14 = view4;
                        yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view5.setAlpha(((java.lang.Float) arrayList6.get(i18)).floatValue());
                        weImageView2 = weImageView;
                        f28 = f27;
                        view6 = view14;
                        yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    if (weImageView2 != null) {
                        weImageView2.setAlpha(f28);
                    }
                    if (view6 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (view5 == null) {
                        i27 = 8;
                    } else {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                        arrayList8.add(8);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        android.view.View view15 = view5;
                        i27 = 8;
                        yj0.a.f(view15, "com/tencent/mm/pluginsdk/ui/SpeechInputLayout", "onStatusChanged", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(i27);
                    }
                    if (view8 != null) {
                        speechInputLayout = this;
                        sa5.d.c(view8, 0.0f, 150L, com.tencent.mm.pluginsdk.ui.c3.f189911d, 1, null);
                    } else {
                        speechInputLayout = this;
                    }
                } else {
                    android.view.View view16 = view4;
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = weImageView;
                    speechInputLayout = this;
                    if (view16 != null) {
                        sa5.d.d(view16, 50, 0L, null, 6, null);
                    }
                    if (view13 != null) {
                        sa5.d.d(view13, 50, 0L, null, 6, null);
                    }
                    if (weImageView5 != null) {
                        sa5.d.d(weImageView5, 50, 0L, null, 6, null);
                    }
                    if (weImageView3 != null) {
                        speechInputLayout.setVisible(weImageView3);
                    }
                    if (view8 != null) {
                        sa5.d.c(view8, 0.0f, 150L, new com.tencent.mm.pluginsdk.ui.d3(speechInputLayout), 1, null);
                    }
                }
                com.tencent.mm.pluginsdk.ui.v2 v2Var = speechInputLayout.f189830o;
                if (v2Var != null) {
                    v2Var.f();
                }
                i19 = 2;
            }
        } else {
            speechInputLayout = this;
            if (i29 == 1) {
                com.tencent.mm.pluginsdk.ui.w2 w2Var5 = speechInputLayout.f189831p;
                if (w2Var5 != null) {
                    w2Var5.onHide();
                }
                if (view8 != null) {
                    sa5.d.d(view8, 0, 150L, null, 5, null);
                }
                i19 = 2;
            } else {
                i19 = 2;
                if (i29 < 2) {
                    com.tencent.mm.pluginsdk.ui.w2 w2Var6 = speechInputLayout.f189831p;
                    if (w2Var6 != null) {
                        w2Var6.onHide();
                    }
                } else if (view12 != null) {
                    sa5.d.d(view12, 0, 150L, new com.tencent.mm.pluginsdk.ui.b3(speechInputLayout), 1, null);
                }
            }
            com.tencent.mm.pluginsdk.ui.v2 v2Var2 = speechInputLayout.f189830o;
            if (v2Var2 != null) {
                v2Var2.f();
            }
        }
        if (i17 == i19) {
            com.tencent.mm.pluginsdk.ui.v2 v2Var3 = speechInputLayout.f189830o;
            if (v2Var3 != null) {
                v2Var3.g(i29);
            }
            android.content.Context context = getContext();
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.getWindow().addFlags(128);
                return;
            }
            return;
        }
        if (i29 == 3) {
            com.tencent.mm.pluginsdk.ui.v2 v2Var4 = speechInputLayout.f189830o;
            if (v2Var4 != null) {
                v2Var4.a();
            }
            android.content.Context context2 = getContext();
            activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity != null) {
                activity.getWindow().clearFlags(128);
            }
        }
    }

    public final android.animation.ObjectAnimator getBgAnimator() {
        return (android.animation.ObjectAnimator) ((jz5.n) this.bgAnimator).getValue();
    }

    public final int getCurV2TStatus() {
        return this.curV2TStatus;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        com.tencent.mm.ui.tools.f5 f5Var = this.f189839x;
        if (i17 == 0) {
            if (f5Var != null) {
                f5Var.f();
                return;
            } else {
                kotlin.jvm.internal.o.o("keyboardHeightProvider");
                throw null;
            }
        }
        if (f5Var != null) {
            f5Var.d();
        } else {
            kotlin.jvm.internal.o.o("keyboardHeightProvider");
            throw null;
        }
    }

    public final void setCurV2TStatus(int i17) {
        this.curV2TStatus = i17;
    }

    public final void setOnSpeechInputListener(com.tencent.mm.pluginsdk.ui.v2 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f189830o = listener;
    }

    public final void setOnSpeechInputShowListener(com.tencent.mm.pluginsdk.ui.w2 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f189831p = listener;
    }

    public final void setShowKeyboard(boolean z17) {
        this.isShowKeyboard = z17;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mm.pluginsdk.ui.w2 w2Var;
        boolean z18 = i17 > 0;
        this.isShowKeyboard = z18;
        if (z18) {
            if (this.curV2TStatus != 0 || (w2Var = this.f189831p) == null) {
                return;
            }
            w2Var.b(1);
            return;
        }
        if (this.curV2TStatus >= 2) {
            com.tencent.mm.pluginsdk.ui.v2 v2Var = this.f189830o;
            if (v2Var != null) {
                v2Var.e(52);
            }
            c(1);
        }
    }
}
