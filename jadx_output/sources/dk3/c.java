package dk3;

/* loaded from: classes8.dex */
public final class c implements ak3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk3.e f234447a;

    public c(dk3.e eVar) {
        this.f234447a = eVar;
    }

    @Override // ak3.a
    public void a(android.view.MotionEvent event) {
        boolean contains;
        android.animation.Animator animator;
        android.widget.ImageView imageView;
        android.animation.Animator animator2;
        android.widget.ImageView imageView2;
        kotlin.jvm.internal.o.g(event, "event");
        dk3.e eVar = this.f234447a;
        if (eVar.f234449a.a()) {
            return;
        }
        eVar.f234462n = event.getX();
        boolean z17 = eVar.f234457i;
        if (eVar.f234458j) {
            com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView = eVar.f234452d;
            int rawX = (int) event.getRawX();
            int rawY = (int) event.getRawY();
            if (floatMultiTaskIndicatorView == null) {
                contains = false;
            } else {
                int[] iArr = new int[2];
                floatMultiTaskIndicatorView.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                contains = new android.graphics.Rect(i17, i18, floatMultiTaskIndicatorView.getWidth() + i17, floatMultiTaskIndicatorView.getHeight() + i18).contains(rawX, rawY);
            }
            eVar.f234457i = contains;
        } else {
            eVar.f234457i = false;
        }
        boolean z18 = eVar.f234457i;
        if (eVar.f234458j && z18 != z17) {
            if (z18) {
                android.widget.FrameLayout.LayoutParams layoutParams = eVar.f234455g;
                if (layoutParams != null) {
                    layoutParams.bottomMargin = eVar.f234454f;
                }
                if (layoutParams != null) {
                    layoutParams.rightMargin = eVar.f234453e;
                }
                com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = eVar.f234452d;
                if (floatMultiTaskIndicatorView2 != null) {
                    floatMultiTaskIndicatorView2.setLayoutParams(layoutParams);
                }
            }
            com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView3 = eVar.f234452d;
            if (floatMultiTaskIndicatorView3 != null) {
                boolean z19 = eVar.f234457i;
                int i19 = com.tencent.mm.R.raw.icons_multi_task_star_line_regular;
                if (z19) {
                    android.os.Vibrator vibrator = floatMultiTaskIndicatorView3.f150415g;
                    if (vibrator != null) {
                        vibrator.vibrate(10L);
                    }
                    android.widget.ImageView imageView3 = floatMultiTaskIndicatorView3.indicatorImageView;
                    if (imageView3 != null) {
                        android.graphics.drawable.Drawable drawable = floatMultiTaskIndicatorView3.f150419n;
                        if (drawable == null) {
                            android.content.res.Resources resources = floatMultiTaskIndicatorView3.getResources();
                            if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
                                i19 = com.tencent.mm.R.raw.multitask_indicator_scale_icon;
                            }
                            drawable = m95.a.e(resources, i19, 0.0f);
                        }
                        imageView3.setImageDrawable(drawable);
                    }
                    if (floatMultiTaskIndicatorView3.a() && (imageView2 = floatMultiTaskIndicatorView3.indicatorImageView) != null) {
                        imageView2.setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.getColor(floatMultiTaskIndicatorView3.getContext(), com.tencent.mm.R.color.adh), android.graphics.PorterDuff.Mode.SRC_IN));
                    }
                    android.animation.Animator animator3 = floatMultiTaskIndicatorView3.f150416h;
                    if ((animator3 != null && animator3.isRunning()) && (animator2 = floatMultiTaskIndicatorView3.f150416h) != null) {
                        animator2.cancel();
                    }
                    android.widget.ImageView imageView4 = floatMultiTaskIndicatorView3.f150412d;
                    if (imageView4 != null) {
                        imageView4.setScaleX(com.tencent.mm.plugin.multitask.q0.f150490g);
                    }
                    android.widget.ImageView imageView5 = floatMultiTaskIndicatorView3.f150412d;
                    if (imageView5 != null) {
                        imageView5.setScaleY(com.tencent.mm.plugin.multitask.q0.f150490g);
                    }
                    android.widget.ImageView imageView6 = floatMultiTaskIndicatorView3.indicatorImageView;
                    if (imageView6 != null) {
                        imageView6.setScaleX(com.tencent.mm.plugin.multitask.q0.f150490g);
                    }
                    android.widget.ImageView imageView7 = floatMultiTaskIndicatorView3.indicatorImageView;
                    if (imageView7 != null) {
                        imageView7.setScaleY(com.tencent.mm.plugin.multitask.q0.f150490g);
                    }
                } else {
                    android.widget.ImageView imageView8 = floatMultiTaskIndicatorView3.indicatorImageView;
                    if (imageView8 != null) {
                        android.graphics.drawable.Drawable drawable2 = floatMultiTaskIndicatorView3.f150419n;
                        if (drawable2 == null) {
                            android.content.res.Resources resources2 = floatMultiTaskIndicatorView3.getResources();
                            if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
                                i19 = com.tencent.mm.R.raw.multitask_indicator_scale_icon;
                            }
                            drawable2 = m95.a.e(resources2, i19, 0.0f);
                        }
                        imageView8.setImageDrawable(drawable2);
                    }
                    if (floatMultiTaskIndicatorView3.a() && (imageView = floatMultiTaskIndicatorView3.indicatorImageView) != null) {
                        imageView.setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.getColor(floatMultiTaskIndicatorView3.getContext(), com.tencent.mm.R.color.adh), android.graphics.PorterDuff.Mode.SRC_IN));
                    }
                    android.animation.Animator animator4 = floatMultiTaskIndicatorView3.f150417i;
                    if ((animator4 != null && animator4.isRunning()) && (animator = floatMultiTaskIndicatorView3.f150417i) != null) {
                        animator.cancel();
                    }
                    android.widget.ImageView imageView9 = floatMultiTaskIndicatorView3.f150412d;
                    if (imageView9 != null) {
                        imageView9.setScaleX(1.0f);
                    }
                    android.widget.ImageView imageView10 = floatMultiTaskIndicatorView3.f150412d;
                    if (imageView10 != null) {
                        imageView10.setScaleY(1.0f);
                    }
                    android.widget.ImageView imageView11 = floatMultiTaskIndicatorView3.indicatorImageView;
                    if (imageView11 != null) {
                        imageView11.setScaleX(1.0f);
                    }
                    android.widget.ImageView imageView12 = floatMultiTaskIndicatorView3.indicatorImageView;
                    if (imageView12 != null) {
                        imageView12.setScaleY(1.0f);
                    }
                }
            }
        }
        eVar.f234461m = event.getRawX();
    }

    @Override // ak3.a
    public void c(int i17, int i18) {
        kk3.g gVar;
        dk3.e eVar = this.f234447a;
        if (eVar.f234449a.a() || i17 != 1 || (gVar = eVar.f234451c) == null) {
            return;
        }
        jk3.v vVar = ((jk3.l) gVar).f300092a;
        ak3.c cVar = vVar.f300111d;
        if (cVar != null) {
            cVar.g();
        }
        ak3.c cVar2 = vVar.f300111d;
        vVar.f300123p = cVar2 != null ? cVar2.getBitmap() : null;
    }

    @Override // ak3.a
    public boolean d(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        return false;
    }

    @Override // ak3.a
    public int e() {
        return 0;
    }

    @Override // ak3.a
    public boolean enableSwipeBack() {
        return true;
    }

    @Override // ak3.a
    public void f(float f17) {
        com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView;
        dk3.e eVar = this.f234447a;
        if (eVar.f234449a.a() || eVar.f234459k) {
            return;
        }
        if (eVar.f234460l < 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            eVar.f234460l = java.lang.System.currentTimeMillis();
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        long j17 = eVar.f234460l;
        boolean z19 = eVar.f234458j;
        if (!((eVar.f234457i || (f17 >= 0.1f && f17 < 0.9f)) && java.lang.System.currentTimeMillis() - eVar.f234460l > 200)) {
            eVar.b();
            return;
        }
        if (!eVar.f234458j) {
            eVar.d();
        }
        if (!eVar.f234457i) {
            if (eVar.f234463o == -1) {
                eVar.f234463o = eVar.f234462n;
            }
            android.view.ViewGroup a17 = eVar.f234450b.a();
            int width = a17 != null ? a17.getWidth() : i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a);
            float f18 = eVar.f234462n;
            long j18 = eVar.f234463o;
            float f19 = width;
            float f27 = (f18 - ((float) j18)) / f19;
            int i17 = com.tencent.mm.plugin.multitask.q0.f150489f;
            float f28 = ((float) ((width - i17) - j18)) / f19;
            if (f28 < 0.0f) {
                f28 = f27;
            }
            float f29 = f27 / f28;
            float f37 = f29 >= 0.0f ? f29 : 0.0f;
            if (f37 > 1.0f) {
                f37 = 1.0f;
            }
            int i18 = (int) (f37 * i17);
            if (eVar.f234456h) {
                eVar.f234454f = (-i17) + i18;
                eVar.f234453e = (eVar.a() - i17) + i18;
            } else {
                eVar.f234453e = (-i17) + i18;
                eVar.f234454f = (eVar.a() - i17) + i18;
            }
            android.widget.FrameLayout.LayoutParams layoutParams = eVar.f234455g;
            if (layoutParams != null) {
                layoutParams.bottomMargin = eVar.f234454f;
            }
            if (layoutParams != null) {
                layoutParams.rightMargin = eVar.f234453e;
            }
            com.tencent.mm.plugin.multitask.animation.swipeahead.FloatMultiTaskIndicatorView floatMultiTaskIndicatorView2 = eVar.f234452d;
            if (floatMultiTaskIndicatorView2 != null) {
                floatMultiTaskIndicatorView2.setLayoutParams(layoutParams);
            }
        }
        if (eVar.f234458j || (floatMultiTaskIndicatorView = eVar.f234452d) == null) {
            return;
        }
        floatMultiTaskIndicatorView.setVisibility(0);
        eVar.f234458j = true;
    }

    @Override // ak3.a
    public boolean g() {
        return false;
    }

    @Override // ak3.a
    public int h(boolean z17) {
        android.graphics.Point point;
        int i17;
        dk3.e eVar = this.f234447a;
        if (eVar.f234449a.a()) {
            return 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onSwipeReleased, willSwipeBack:%s, isIndicatorHit:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(eVar.f234457i));
        eVar.f234462n = 0.0f;
        eVar.f234463o = -1L;
        eVar.f234460l = -1L;
        eVar.f234459k = z17;
        eVar.b();
        if (!z17) {
            eVar.f234457i = false;
            return 1;
        }
        if (!eVar.f234457i) {
            return 1;
        }
        eVar.f234457i = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatMultiTaskIndicatorController", "onSwipeReleased, swipe to float ball");
        kk3.g gVar = eVar.f234451c;
        java.lang.Integer num = null;
        if (gVar != null) {
            float f17 = eVar.f234461m;
            jk3.v vVar = ((jk3.l) gVar).f300092a;
            if (vVar.a() && vVar.s()) {
                i17 = 1;
            } else {
                vVar.j();
                if (vVar.Z()) {
                    r45.kr4 kr4Var = vVar.f300079c;
                    r45.er4 er4Var = kr4Var != null ? (r45.er4) kr4Var.getCustom(6) : null;
                    if (er4Var != null) {
                        er4Var.set(0, 7L);
                    }
                    r45.kr4 kr4Var2 = vVar.f300079c;
                    r45.er4 er4Var2 = kr4Var2 != null ? (r45.er4) kr4Var2.getCustom(6) : null;
                    if (er4Var2 != null) {
                        er4Var2.set(1, java.lang.Long.valueOf(vVar.s() ? 1L : 2L));
                    }
                    android.graphics.Point Bi = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Bi();
                    vVar.f300128u = true;
                    ak3.c cVar = vVar.f300111d;
                    if (cVar != null) {
                        android.graphics.Bitmap bitmap = vVar.f300123p;
                        kk3.d dVar = vVar.f300112e;
                        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                        com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493669l73);
                        if (cVar.c()) {
                            point = Bi;
                            cVar.f(new ck3.o(dVar, Bi, cVar, bitmap, false, f17, true, false));
                        } else {
                            point = Bi;
                            com.tencent.mm.sdk.platformtools.u3.h(new ck3.p(dVar));
                        }
                    } else {
                        point = Bi;
                    }
                    jk3.v.N(vVar, 7);
                    com.tencent.mars.xlog.Log.i("MicroMsg.PageMultiTaskHelper", "swipePageToMultiTask ballPosition: {" + java.lang.Integer.valueOf(point.x) + ' ' + java.lang.Integer.valueOf(point.y) + '}');
                    i17 = 3;
                } else {
                    i17 = 2;
                }
            }
            num = java.lang.Integer.valueOf(i17);
        }
        if (num == null) {
            return 1;
        }
        int intValue = num.intValue();
        if (intValue != 2) {
            return intValue;
        }
        eVar.f234459k = false;
        return 2;
    }
}
