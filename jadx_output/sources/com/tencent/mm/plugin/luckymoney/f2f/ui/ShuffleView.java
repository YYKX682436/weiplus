package com.tencent.mm.plugin.luckymoney.f2f.ui;

/* loaded from: classes15.dex */
public class ShuffleView extends android.widget.FrameLayout {
    public static android.util.DisplayMetrics E;
    public boolean A;
    public final int B;
    public final int C;
    public final android.view.GestureDetector D;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f145112d;

    /* renamed from: e, reason: collision with root package name */
    public ub3.v0 f145113e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.ValueAnimator f145114f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f145115g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f145116h;

    /* renamed from: i, reason: collision with root package name */
    public android.animation.ValueAnimator f145117i;

    /* renamed from: m, reason: collision with root package name */
    public ub3.t0 f145118m;

    /* renamed from: n, reason: collision with root package name */
    public ub3.t0 f145119n;

    /* renamed from: o, reason: collision with root package name */
    public ub3.u0 f145120o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f145121p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f145122q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f145123r;

    /* renamed from: s, reason: collision with root package name */
    public int f145124s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f145125t;

    /* renamed from: u, reason: collision with root package name */
    public int f145126u;

    /* renamed from: v, reason: collision with root package name */
    public int f145127v;

    /* renamed from: w, reason: collision with root package name */
    public float f145128w;

    /* renamed from: x, reason: collision with root package name */
    public float f145129x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f145130y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f145131z;

    public ShuffleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 2500;
        this.D = new android.view.GestureDetector(new ub3.r0(this));
        this.f145113e = new ub3.v0();
        this.f145112d = new java.util.ArrayList();
        this.f145130y = new java.util.ArrayList();
        this.f145131z = new java.util.ArrayList();
        this.B = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a4o);
    }

    public static void a(com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView shuffleView, int i17) {
        if (i17 < 0) {
            shuffleView.getClass();
            return;
        }
        if (i17 < shuffleView.f145127v) {
            com.tencent.mars.xlog.Log.i("ShuffleView", "touch card " + i17);
            if (shuffleView.f145117i.isStarted()) {
                shuffleView.f145117i.cancel();
            }
            shuffleView.f145117i.removeAllUpdateListeners();
            shuffleView.f145117i.removeAllListeners();
            shuffleView.f145125t = (android.view.View) ((java.util.ArrayList) shuffleView.f145112d).get(i17);
            shuffleView.f145126u = i17;
            if (shuffleView.f145113e.f426142b == 4) {
                if (i17 > 0) {
                    shuffleView.f145117i.addUpdateListener(new ub3.p0(shuffleView, i17 - 1, (shuffleView.f145127v - 1) - i17));
                } else {
                    shuffleView.f145117i.addUpdateListener(new ub3.q0(shuffleView));
                }
                ub3.u0 u0Var = shuffleView.f145120o;
                if (u0Var != null) {
                    int i18 = shuffleView.f145126u;
                    int i19 = shuffleView.f145127v;
                    com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FQRCodeUI luckyMoneyF2FQRCodeUI = ((ub3.f) u0Var).f426100a;
                    if (i19 == 8) {
                        luckyMoneyF2FQRCodeUI.H.a("music" + (i18 + 1) + ".m4a");
                        int[] iArr = luckyMoneyF2FQRCodeUI.V;
                        iArr[4] = iArr[4] + 1;
                    } else {
                        luckyMoneyF2FQRCodeUI.H.a("touch_card.m4a");
                        int[] iArr2 = luckyMoneyF2FQRCodeUI.V;
                        iArr2[2] = iArr2[2] + 1;
                    }
                }
            }
            shuffleView.f145117i.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getSelectScaleTranslationX() {
        if (this.f145123r == null) {
            return 0.0f;
        }
        float width = (r0.getWidth() * 0.33f) - this.f145128w;
        int i17 = this.f145124s;
        int i18 = i17 - 1;
        int i19 = (this.f145127v - 1) - i17;
        int i27 = i18 > 0 ? 0 + i18 : 0;
        if (i19 > 0) {
            i27 += i19;
        }
        if (i27 > 0) {
            return (width * 2.0f) / i27;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getTouchScaleTranslationX() {
        if (this.f145125t == null) {
            return 0.0f;
        }
        float width = (r0.getWidth() * 0.28f) - this.f145128w;
        int i17 = this.f145126u;
        int i18 = i17 - 1;
        int i19 = (this.f145127v - 1) - i17;
        int i27 = i18 > 0 ? 0 + i18 : 0;
        if (i19 > 0) {
            i27 += i19;
        }
        if (i27 > 0) {
            return (width * 2.0f) / i27;
        }
        return 0.0f;
    }

    public final void d() {
        if (this.f145123r != null) {
            com.tencent.mars.xlog.Log.i("ShuffleView", "selectView != null, cancel select");
            if (this.f145117i.isStarted()) {
                this.f145117i.cancel();
            }
            this.f145117i.removeAllUpdateListeners();
            this.f145117i.removeAllListeners();
            if (this.f145113e.f426142b == 4 && this.f145124s >= 0) {
                this.f145117i.addUpdateListener(new ub3.l0(this));
            }
            this.f145123r = null;
            this.f145124s = 0;
            this.f145117i.start();
        }
    }

    public final void e() {
        if (this.f145125t != null) {
            com.tencent.mars.xlog.Log.i("ShuffleView", "touchView != null,cancel touch");
            if (this.f145117i.isStarted()) {
                this.f145117i.cancel();
            }
            this.f145117i.removeAllUpdateListeners();
            this.f145117i.removeAllListeners();
            if (this.f145113e.f426142b == 4 && this.f145126u >= 0) {
                this.f145117i.addUpdateListener(new ub3.o0(this));
            }
            this.f145125t = null;
            this.f145126u = -1;
            this.f145117i.start();
        }
    }

    public final android.graphics.Rect f(int i17) {
        if (i17 < 0 || i17 >= this.f145127v) {
            return null;
        }
        java.util.List list = this.f145112d;
        android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i17);
        if (this.f145113e.f426142b != 4) {
            return null;
        }
        if (i17 == 0) {
            return new android.graphics.Rect(view.getLeft() + ((int) view.getTranslationX()), view.getTop() + ((int) view.getTranslationY()), view.getRight() + ((int) view.getTranslationX()), view.getBottom() + ((int) view.getTranslationY()));
        }
        android.view.View view2 = (android.view.View) ((java.util.ArrayList) list).get(i17 - 1);
        return new android.graphics.Rect(view2.getRight() + ((int) view2.getTranslationX()), view.getTop() + ((int) view.getTranslationY()), view.getRight() + ((int) view.getTranslationX()), view.getBottom() + ((int) view.getTranslationY()));
    }

    public float g(int i17) {
        int i18;
        ub3.v0 v0Var = this.f145113e;
        if (v0Var.f426141a != 2 || (i18 = this.f145127v) <= 0) {
            return 0.0f;
        }
        int i19 = v0Var.f426142b;
        if (i19 == 3) {
            float f17 = (i18 - 1) * 0.5f;
            float f18 = this.f145128w;
            return (f17 * f18) - (f18 * i17);
        }
        if (i19 != 4) {
            return 0.0f;
        }
        float f19 = this.f145128w;
        return (i17 * f19) - (((i18 - 1) * 0.5f) * f19);
    }

    public android.view.View getEnterView() {
        return this.f145122q;
    }

    public android.view.View getExitView() {
        return this.f145121p;
    }

    public float h(int i17) {
        ub3.v0 v0Var = this.f145113e;
        if (v0Var.f426141a != 1) {
            return 0.0f;
        }
        int i18 = v0Var.f426142b;
        if (i18 == 1) {
            float f17 = (this.f145127v - 1) * 0.5f;
            float f18 = this.f145129x;
            return (f17 * f18) - (f18 * i17);
        }
        if (i18 != 2) {
            return 0.0f;
        }
        float f19 = this.f145129x;
        return (i17 * f19) - (((this.f145127v - 1) * 0.5f) * f19);
    }

    public final void i(int i17) {
        this.f145116h.removeAllUpdateListeners();
        this.f145116h.removeAllListeners();
        java.util.List list = this.f145112d;
        int size = ((java.util.ArrayList) list).size();
        int i18 = this.f145127v;
        if (size < i18) {
            int i19 = i18 - 1;
            this.f145127v = i19;
            if (i19 == 1) {
                android.view.View findViewById = ((android.view.View) ((java.util.ArrayList) list).get(0)).findViewById(com.tencent.mm.R.id.j1z);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            l();
            this.f145116h.addUpdateListener(new ub3.s0(this));
            this.f145116h.addListener(new ub3.e0(this));
        } else {
            android.view.View view = (android.view.View) ((java.util.ArrayList) list).get(i18 - 1);
            this.f145122q = view;
            k(view, this.f145127v - 1);
            addView(this.f145122q, 0);
            if (this.f145115g != null) {
                int i27 = this.f145113e.f426143c;
                if (i27 == 1) {
                    this.f145122q.setTranslationY(-E.heightPixels);
                } else if (i27 == 2) {
                    this.f145122q.setTranslationY(E.heightPixels);
                } else if (i27 == 3) {
                    this.f145122q.setTranslationX(-E.widthPixels);
                } else if (i27 == 4) {
                    this.f145122q.setTranslationX(E.widthPixels);
                }
            }
            android.view.View view2 = this.f145122q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "playShuffle", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f145116h.addUpdateListener(new ub3.f0(this, i17));
            this.f145116h.addListener(new ub3.g0(this));
        }
        this.f145116h.start();
    }

    public final void j(int i17) {
        if (i17 < 0 || i17 >= this.f145127v) {
            return;
        }
        com.tencent.mars.xlog.Log.i("ShuffleView", "select card " + i17);
        if (this.f145117i.isStarted()) {
            this.f145117i.cancel();
        }
        this.f145117i.removeAllUpdateListeners();
        this.f145117i.removeAllListeners();
        this.f145123r = (android.view.View) ((java.util.ArrayList) this.f145112d).get(i17);
        this.f145124s = i17;
        this.f145125t = null;
        this.f145126u = -1;
        if (this.f145113e.f426142b == 4) {
            if (i17 > 0) {
                this.f145117i.addUpdateListener(new ub3.m0(this, i17 - 1, (this.f145127v - 1) - i17));
            } else {
                this.f145117i.addUpdateListener(new ub3.n0(this));
            }
        }
        this.f145117i.start();
    }

    public final void k(android.view.View view, int i17) {
        ub3.v0 v0Var = this.f145113e;
        int i18 = v0Var.f426141a;
        if (i18 == 1) {
            v0Var.getClass();
            view.setScaleX(1.0f - (0.01f * i17));
            view.setTranslationY(h(i17));
        } else if (i18 == 2) {
            view.setScaleY(1.0f - (v0Var.f426144d * i17));
            view.setTranslationX(g(i17));
        }
    }

    public final void l() {
        if (this.f145127v <= 1) {
            this.f145128w = 0.0f;
            this.f145129x = 0.0f;
            return;
        }
        java.util.List list = this.f145112d;
        ((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth();
        ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight();
        int i17 = this.f145113e.f426141a;
        if (i17 != 2) {
            if (i17 == 1) {
                this.f145129x = (((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight() * 1.0f) / this.f145127v;
            }
        } else {
            float width = (((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth() * 1.5f) / this.f145127v;
            this.f145128w = width;
            if (width > ((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth() * 0.23f) {
                this.f145128w = ((android.view.View) ((java.util.ArrayList) list).get(0)).getWidth() * 0.23f;
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        if (this.A) {
            return true;
        }
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        if (this.f145127v <= 0) {
            return false;
        }
        getHeight();
        java.util.List list = this.f145112d;
        ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight();
        int height = ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight() / 7;
        if (y17 < (getHeight() - ((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight()) - (((android.view.View) ((java.util.ArrayList) list).get(0)).getHeight() / 7)) {
            if (this.f145123r == null || motionEvent.getActionMasked() != 0) {
                android.view.View view = this.f145125t;
                if (view != null && view.getTranslationY() == (-this.f145125t.getHeight()) / 7) {
                    ub3.u0 u0Var = this.f145120o;
                    if (u0Var != null) {
                        ((ub3.f) u0Var).b(this.f145126u, this.f145127v);
                    }
                    j(this.f145126u);
                } else if (this.f145125t != null) {
                    e();
                }
            } else {
                ub3.u0 u0Var2 = this.f145120o;
                if (u0Var2 != null) {
                    ((ub3.f) u0Var2).a(this.f145124s, this.f145127v);
                }
                d();
            }
            return false;
        }
        int i17 = 0;
        while (true) {
            if (i17 >= this.f145127v) {
                z17 = false;
                break;
            }
            android.graphics.Rect f17 = f(i17);
            if (f17 != null && f17.contains(x17, y17)) {
                z17 = true;
                break;
            }
            i17++;
        }
        if (!z17) {
            motionEvent.getActionMasked();
            if (this.f145123r == null || motionEvent.getActionMasked() != 0) {
                android.view.View view2 = this.f145125t;
                if (view2 != null && view2.getTranslationY() == (-this.f145125t.getHeight()) / 7) {
                    ub3.u0 u0Var3 = this.f145120o;
                    if (u0Var3 != null) {
                        ((ub3.f) u0Var3).b(this.f145126u, this.f145127v);
                    }
                    j(this.f145126u);
                } else if (this.f145125t != null) {
                    e();
                }
            } else {
                ub3.u0 u0Var4 = this.f145120o;
                if (u0Var4 != null) {
                    ((ub3.f) u0Var4).a(this.f145124s, this.f145127v);
                }
                d();
            }
        }
        if (this.f145127v <= 1) {
            return false;
        }
        android.view.GestureDetector gestureDetector = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mars.xlog.Log.i("ShuffleView", "ret:%s,action:%s", java.lang.Boolean.valueOf(onTouchEvent), java.lang.Integer.valueOf(motionEvent.getActionMasked()));
        if (!onTouchEvent && motionEvent.getActionMasked() == 1) {
            android.view.View view3 = this.f145125t;
            if (view3 != null && view3.getTranslationY() == (-this.f145125t.getHeight()) / 7) {
                ub3.u0 u0Var5 = this.f145120o;
                if (u0Var5 != null) {
                    ((ub3.f) u0Var5).b(this.f145126u, this.f145127v);
                }
                j(this.f145126u);
            } else if (this.f145125t != null) {
                e();
            }
        }
        return true;
    }

    public void setAllShuffleCards(java.util.List<android.view.View> list) {
        java.util.List list2 = this.f145112d;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(list);
        this.f145124s = 0;
        this.f145123r = null;
        this.f145126u = -1;
        this.f145125t = null;
        removeAllViews();
        java.util.ArrayList arrayList = (java.util.ArrayList) list2;
        if (arrayList.size() > 100) {
            this.f145127v = 100;
        } else {
            int size = arrayList.size();
            this.f145127v = size;
            if (size == 1) {
                android.view.View findViewById = ((android.view.View) arrayList.get(0)).findViewById(com.tencent.mm.R.id.j1z);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "fitCards", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/luckymoney/f2f/ui/ShuffleView", "fitCards", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        for (int i17 = this.f145127v - 1; i17 >= 0; i17--) {
            addView((android.view.View) arrayList.get(i17));
        }
        addOnLayoutChangeListener(new ub3.k0(this));
    }

    public void setCardListener(ub3.u0 u0Var) {
        this.f145120o = u0Var;
    }

    public void setEnterAnimator(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.f145115g;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f145115g.cancel();
        }
        this.f145115g = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ub3.j0(this));
        }
    }

    public void setEnterAnimatorListener(ub3.t0 t0Var) {
        this.f145119n = t0Var;
    }

    public void setExitAnimator(android.animation.ValueAnimator valueAnimator) {
        android.animation.ValueAnimator valueAnimator2 = this.f145114f;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
            this.f145114f.cancel();
        }
        this.f145114f = valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new ub3.i0(this));
        }
    }

    public void setExitAnimatorListener(ub3.t0 t0Var) {
        this.f145118m = t0Var;
    }

    public void setShuffleSetting(ub3.v0 v0Var) {
        this.f145113e = v0Var;
        this.f145116h = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(v0Var.f426145e);
        this.f145117i = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(80);
    }
}
