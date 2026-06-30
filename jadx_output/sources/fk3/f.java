package fk3;

/* loaded from: classes8.dex */
public final class f extends ek3.b implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public int f263550a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f263551b = -1;

    /* renamed from: c, reason: collision with root package name */
    public float f263552c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f263553d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f263554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk3.o f263555f;

    public f(fk3.o oVar) {
        this.f263555f = oVar;
    }

    @Override // ek3.b
    public int a(android.view.View view, int i17, int i18) {
        return 0;
    }

    @Override // ek3.b
    public int b(android.view.View view) {
        return 1;
    }

    @Override // ek3.b
    public void c(android.view.View view, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewCaptured");
        if (this.f263554e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewCaptured, isFinish!");
            return;
        }
        this.f263555f.b(3, false, false);
        this.f263550a = -1;
        this.f263551b = -1;
    }

    @Override // ek3.b
    public void d(int i17) {
    }

    @Override // ek3.b
    public void e(android.view.View view, int i17, int i18, int i19, int i27) {
    }

    @Override // ek3.b
    public void f(android.view.View view, float f17, float f18, float f19, float f27) {
        if (this.f263554e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewReleased, isFinish!");
            return;
        }
        if (java.lang.Math.abs(f17) > 400 && i(this.f263552c)) {
            this.f263554e = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "onViewReleased, auto add multitask!");
            return;
        }
        fk3.o oVar = this.f263555f;
        com.tencent.mm.sdk.platformtools.u3.h(new fk3.d(oVar));
        oVar.f263590f = -1L;
        android.view.View contentView = oVar.c().getContentView();
        if (contentView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        oVar.c();
        ((ak3.i) oVar.c()).t(true);
    }

    @Override // ek3.b
    public void g(float f17, float f18, int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect;
        fk3.o oVar = this.f263555f;
        ek3.e eVar = oVar.f263588d;
        if (eVar != null) {
            if (eVar != null && eVar.getWidth() == 0) {
                return;
            }
            ek3.d dVar = oVar.f263587c;
            if ((dVar != null ? dVar.f253607v : null) == null) {
                return;
            }
            ek3.e eVar2 = oVar.f263588d;
            int width = eVar2 != null ? eVar2.getWidth() : 0;
            ek3.e eVar3 = oVar.f263588d;
            int height = eVar3 != null ? eVar3.getHeight() : 0;
            if (this.f263553d == null) {
                this.f263553d = al3.a.c(oVar.f263588d);
            }
            if (this.f263550a == -1 && this.f263551b == -1) {
                ek3.e eVar4 = oVar.f263588d;
                this.f263550a = eVar4 != null ? (int) eVar4.getTranslationX() : 0;
                ek3.e eVar5 = oVar.f263588d;
                this.f263551b = eVar5 != null ? (int) eVar5.getTranslationY() : 0;
            }
            float f19 = width;
            float f27 = (f17 / f19) / 3;
            ek3.d dVar2 = oVar.f263587c;
            if (dVar2 == null || (rect = dVar2.f253607v) == null) {
                rect = new android.graphics.Rect();
            }
            float width2 = rect.width() / f19;
            int width3 = rect.left + (rect.width() / 2);
            int height2 = rect.top + (rect.height() / 2);
            if (f27 > 1.0f) {
                f27 = 1.0f;
            } else if (f27 < 0.0f) {
                f27 = 0.0f;
            }
            float f28 = 1;
            float f29 = f28 - width2;
            float f37 = 1.0f - (f27 * f29);
            if (f37 > 1.0f) {
                f37 = 1.0f;
            } else if (f37 < 0.0f) {
                f37 = 0.0f;
            }
            float f38 = (f28 - f37) / f29;
            float f39 = f38 <= 1.0f ? f38 < 0.0f ? 0.0f : f38 : 1.0f;
            float f47 = width3;
            android.graphics.Rect rect2 = this.f263553d;
            float width4 = f47 - ((rect2 != null ? rect2.left : 0) + ((rect2 != null ? rect2.width() : 0) / 2));
            float f48 = height2;
            android.graphics.Rect rect3 = this.f263553d;
            float height3 = f48 - ((rect3 != null ? rect3.top : 0) + ((rect3 != null ? rect3.height() : 0) / 2));
            float f49 = this.f263550a + (width4 * width2 * f39);
            float f57 = this.f263551b + (height3 * width2 * f39);
            this.f263552c = f39;
            if (f39 >= 0.16f && !this.f263554e) {
                this.f263554e = true;
                if (i(f39)) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new fk3.e(oVar));
                return;
            }
            float f58 = height;
            float height4 = (((f58 * width2) - rect.height()) / 2) * f39 * (f28 / width2);
            float f59 = f58 - height4;
            ek3.e eVar6 = oVar.f263588d;
            if (eVar6 != null) {
                eVar6.setMaskAlpha((int) (255 * f39));
            }
            ek3.e eVar7 = oVar.f263588d;
            if (eVar7 != null) {
                eVar7.a(0.0f, height4, f19, f59);
            }
            int i28 = ek3.e.f253609u;
            float f66 = (ek3.e.f253609u * f39) / f37;
            ek3.e eVar8 = oVar.f263588d;
            if (eVar8 != null) {
                eVar8.b(f66, f66, f66, f66, f66, f66, f66, f66);
            }
            ek3.e eVar9 = oVar.f263588d;
            if (eVar9 != null) {
                eVar9.setPivotX(f47);
            }
            ek3.e eVar10 = oVar.f263588d;
            if (eVar10 != null) {
                eVar10.setPivotY(f48);
            }
            ek3.e eVar11 = oVar.f263588d;
            if (eVar11 != null) {
                eVar11.setTranslationX(f49);
            }
            ek3.e eVar12 = oVar.f263588d;
            if (eVar12 != null) {
                eVar12.setTranslationY(f57);
            }
            ek3.e eVar13 = oVar.f263588d;
            if (eVar13 != null) {
                eVar13.setScaleX(f37);
            }
            ek3.e eVar14 = oVar.f263588d;
            if (eVar14 != null) {
                eVar14.setScaleY(f37);
            }
            ek3.e eVar15 = oVar.f263588d;
            if (eVar15 != null) {
                eVar15.postInvalidate();
            }
        }
    }

    @Override // ek3.b
    public boolean h(android.view.View view, int i17) {
        ek3.d dVar = this.f263555f.f263587c;
        if (dVar == null) {
            return false;
        }
        if (!(((dVar.f253596k & 1) << i17) != 0)) {
            return false;
        }
        int[] iArr = dVar.f253593h;
        return ((iArr != null ? iArr[i17] : 0) & 1) != 0;
    }

    public final boolean i(float f17) {
        android.graphics.Rect rect;
        float f18;
        float f19;
        fk3.o oVar = this.f263555f;
        ek3.e eVar = oVar.f263588d;
        android.graphics.Bitmap contentBitmap = eVar != null ? eVar.getContentBitmap() : null;
        if (eVar == null || contentBitmap == null) {
            return false;
        }
        jk3.e eVar2 = oVar.f263586b;
        boolean f27 = eVar2 != null ? eVar2.f() : false;
        int width = (int) (contentBitmap.getWidth() * 1.0f);
        int height = (int) (contentBitmap.getHeight() * 1.0f);
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, width, height);
        ek3.d dVar = oVar.f263587c;
        if (dVar == null || (rect = dVar.f253607v) == null) {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect3 = rect;
        int width2 = rect3.left + (rect3.width() / 2);
        int height2 = rect3.top + (rect3.height() / 2);
        int width3 = rect3.width();
        if (f27) {
            f18 = width3;
            f19 = height;
        } else {
            f18 = width3;
            f19 = width;
        }
        float f28 = f18 / f19;
        float height3 = (f27 ? rect3.height() : rect3.width()) / width;
        float width4 = (width2 - (rect2.left + (rect2.width() / 2))) * f28;
        float height4 = (height2 - (rect2.top + (rect2.height() / 2))) * f28;
        int i17 = f27 ? 90 : 0;
        if (f27) {
            eVar.setGradientOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        }
        oa5.b.b(eVar).k(new fk3.a(f17, f27, width, height, f28, rect3, height3, eVar, width2, height2, i17)).o(new fk3.c(eVar, oVar, contentBitmap)).e(f28).f(f28).m(width4).n(height4).h(new android.view.animation.AccelerateInterpolator()).g(250L).l();
        return true;
    }

    @Override // db5.d
    public void onComplete(boolean z17) {
    }
}
