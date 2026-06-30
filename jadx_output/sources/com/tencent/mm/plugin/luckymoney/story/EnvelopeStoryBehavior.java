package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes15.dex */
public class EnvelopeStoryBehavior extends com.google.android.material.appbar.AppBarLayout.Behavior implements android.view.View.OnTouchListener {
    public float A;
    public float B;
    public final android.os.Vibrator C;
    public boolean D;
    public final int E;
    public boolean F;
    public boolean G;
    public com.google.android.material.appbar.g H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f145797J;
    public boolean K;
    public boolean L;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145798x;

    /* renamed from: y, reason: collision with root package name */
    public int f145799y;

    /* renamed from: z, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f145800z;

    public EnvelopeStoryBehavior() {
        this.f145799y = 0;
        this.C = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        this.E = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 300);
        this.F = false;
        this.G = false;
        this.I = false;
        this.f145797J = false;
        this.K = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: J */
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        this.f145798x = (com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout) appBarLayout;
        this.f145800z = (androidx.recyclerview.widget.RecyclerView) coordinatorLayout.findViewById(com.tencent.mm.R.id.izx);
        this.f145799y = (int) (coordinatorLayout.getHeight() / 10.0f);
        if (coordinatorLayout instanceof com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout) {
            ((java.util.ArrayList) ((com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout) coordinatorLayout).D).add(this);
        }
        super.g(coordinatorLayout, appBarLayout, i17);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: K */
    public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i17, int i18, int[] iArr, int i19) {
        super.l(coordinatorLayout, appBarLayout, view, i17, i18, iArr, i19);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: L */
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        int i29;
        if (i28 == 1 && this.K) {
            if (i18 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryBehavior", "stop verticalRecyclerView scroll!");
                this.f145800z.f1();
                return;
            }
            return;
        }
        int totalScrollRange = (this.f145798x.getTotalScrollRange() - java.lang.Math.abs(y())) + java.lang.Math.abs(i27);
        float totalScrollRange2 = this.f145798x.getTotalScrollRange();
        float f17 = 0.0f;
        if (totalScrollRange2 != 0.0f) {
            float f18 = totalScrollRange;
            if (f18 <= totalScrollRange2) {
                f17 = (totalScrollRange2 - f18) / totalScrollRange2;
            }
        } else {
            f17 = 0.7f;
        }
        if (totalScrollRange > 0) {
            double d17 = 1.0f - f17;
            i29 = (int) (i27 * ((float) (((float) (d17 * 0.2d * d17)) + 0.8d)));
        } else {
            i29 = i27;
        }
        super.o(coordinatorLayout, appBarLayout, view, i17, i18, i19, i29, i28);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: M */
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, android.view.View view2, int i17, int i18) {
        return super.u(coordinatorLayout, appBarLayout, view, view2, i17, i18);
    }

    public void P() {
        if (this.f145798x == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeStoryBehavior", "[animateToMiddle] appBarLayout == null");
            return;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimator.setDuration(200L);
        valueAnimator.setIntValues(y(), -(this.f145798x.getTotalScrollRange() - this.E));
        valueAnimator.addListener(new com.tencent.mm.plugin.luckymoney.story.i0(this));
        valueAnimator.addUpdateListener(new com.tencent.mm.plugin.luckymoney.story.j0(this));
        valueAnimator.start();
    }

    public final void Q() {
        if ((this.K && y() + this.f145798x.getTotalScrollRange() <= this.f145799y) || (this.f145797J && java.lang.Math.abs(y()) >= this.f145799y)) {
            this.f145798x.d(false, true, true);
            return;
        }
        if (this.f145798x.getTotalScrollRange() - java.lang.Math.abs(y()) == this.E) {
            return;
        }
        this.f145798x.d(true, true, true);
    }

    public final void R() {
        int y17 = y();
        int totalScrollRange = this.f145798x.getTotalScrollRange();
        boolean z17 = this.L;
        int i17 = this.E;
        if (z17) {
            if (totalScrollRange - java.lang.Math.abs(y17) < i17) {
                this.f145798x.d(false, true, true);
                return;
            } else if (this.G) {
                P();
                return;
            } else {
                Q();
                return;
            }
        }
        if (this.K) {
            if (y() + this.f145798x.getTotalScrollRange() <= this.f145799y) {
                this.f145798x.d(false, true, true);
                return;
            } else {
                P();
                return;
            }
        }
        if (!this.f145797J || java.lang.Math.abs(y()) < this.f145799y) {
            Q();
        } else if (totalScrollRange - java.lang.Math.abs(y17) >= i17 || this.I) {
            P();
        } else {
            this.f145798x.d(false, true, true);
        }
    }

    public final boolean S() {
        return java.lang.Math.abs(y()) <= 0;
    }

    public final boolean T() {
        return this.f145798x.getTotalScrollRange() == java.lang.Math.abs(y());
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        g(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, i17);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f17, float f18, boolean z17) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f17, float f18) {
        return (S() || T()) ? false : true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr, int i19) {
        super.l(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, view2, i17, i18, iArr, i19);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        int i17 = this.E;
        boolean z17 = true;
        if (action == 0) {
            this.A = motionEvent.getX();
            this.B = motionEvent.getY();
            this.D = false;
            this.f145797J = S();
            this.K = T();
            if (!(this.f145798x.getTotalScrollRange() - java.lang.Math.abs(y()) == i17) && (this.K || this.f145797J)) {
                z17 = false;
            }
            this.L = z17;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.F) {
                R();
            } else {
                com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145798x;
                if (envelopeAppBarLayout != null && this.G) {
                    envelopeAppBarLayout.d(false, true, true);
                } else if (!S() && !T()) {
                    Q();
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float y17 = motionEvent.getY() - this.B;
            if (this.f145798x != null && !this.G && y17 > 0.0f && y() != 0 && y() + this.f145798x.getTotalScrollRange() >= this.f145799y && this.L && !this.D && y() + i17 >= this.f145799y) {
                this.D = true;
                this.C.vibrate(10L);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        return super.u(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, view2, view3, i17, i18);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
        if (motionEvent.getAction() == 1) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getActionMasked() == 2) {
            float y17 = motionEvent.getY();
            float x17 = motionEvent.getX();
            float f17 = y17 - this.B;
            if (f17 > 0.0f) {
                float totalScrollRange = this.f145798x.getTotalScrollRange();
                double d17 = 1.0f - (totalScrollRange != 0.0f ? f17 > totalScrollRange ? 0.0f : (totalScrollRange - f17) / totalScrollRange : 0.5f);
                float f18 = (float) (((float) (d17 * 0.2d * d17)) + 0.3d);
                motionEvent.getY();
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setTranslate(0.0f, (-f17) * f18);
                motionEvent.transform(matrix);
            } else {
                if (java.lang.Math.abs(f17) / java.lang.Math.abs(x17 - this.A) < 0.57d) {
                    return false;
                }
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.F) {
                R();
            } else {
                com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145798x;
                if (envelopeAppBarLayout != null && this.G) {
                    envelopeAppBarLayout.d(false, true, true);
                } else if (!S() && !T()) {
                    Q();
                }
            }
        }
        return super.x(coordinatorLayout, appBarLayout, motionEvent);
    }

    public EnvelopeStoryBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f145799y = 0;
        this.C = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        this.E = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 300);
        this.F = false;
        this.G = false;
        this.I = false;
        this.f145797J = false;
        this.K = false;
    }
}
