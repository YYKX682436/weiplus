package gk3;

/* loaded from: classes8.dex */
public final class f extends ek3.b implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public int f272496a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f272497b = -1;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f272498c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f272499d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272500e;

    public f(gk3.m mVar) {
        this.f272500e = mVar;
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
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "onViewCaptured");
        this.f272500e.b(3, false);
        this.f272496a = -1;
        this.f272497b = -1;
        this.f272499d = false;
    }

    @Override // ek3.b
    public void d(int i17) {
    }

    @Override // ek3.b
    public void e(android.view.View view, int i17, int i18, int i19, int i27) {
    }

    @Override // ek3.b
    public void f(android.view.View view, float f17, float f18, float f19, float f27) {
        if (this.f272499d) {
            return;
        }
        if (java.lang.Math.abs(f17) > 400 && i(0.0f)) {
            this.f272499d = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "onViewReleased, auto add multitask!");
            return;
        }
        gk3.m mVar = this.f272500e;
        com.tencent.mm.sdk.platformtools.u3.h(new gk3.d(mVar));
        mVar.f272531g = -1L;
        android.view.View contentView = mVar.c().getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS$ViewDragCallback", "onViewReleased", "(Landroid/view/View;FFFF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ek3.b
    public void g(float f17, float f18, int i17, int i18, int i19, int i27) {
        android.graphics.Rect rect;
        gk3.m mVar = this.f272500e;
        ek3.e eVar = mVar.f272528d;
        if (eVar != null) {
            if (eVar != null && eVar.getWidth() == 0) {
                return;
            }
            ek3.d dVar = mVar.f272527c;
            if ((dVar != null ? dVar.f253607v : null) == null) {
                return;
            }
            ek3.e eVar2 = mVar.f272528d;
            int width = eVar2 != null ? eVar2.getWidth() : 0;
            ek3.e eVar3 = mVar.f272528d;
            int height = eVar3 != null ? eVar3.getHeight() : 0;
            if (this.f272498c == null) {
                this.f272498c = al3.a.c(mVar.f272528d);
            }
            if (this.f272496a == -1 && this.f272497b == -1) {
                ek3.e eVar4 = mVar.f272528d;
                this.f272496a = eVar4 != null ? (int) eVar4.getTranslationX() : 0;
                ek3.e eVar5 = mVar.f272528d;
                this.f272497b = eVar5 != null ? (int) eVar5.getTranslationY() : 0;
            }
            float f19 = width;
            float f27 = (f17 / f19) / 3;
            ek3.d dVar2 = mVar.f272527c;
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
            }
            float f38 = (f28 - f37) / f29;
            float f39 = f38 <= 1.0f ? f38 < 0.0f ? 0.0f : f38 : 1.0f;
            float f47 = width3;
            android.graphics.Rect rect2 = this.f272498c;
            float width4 = f47 - ((rect2 != null ? rect2.left : 0) + ((rect2 != null ? rect2.width() : 0) / 2));
            float f48 = height2;
            android.graphics.Rect rect3 = this.f272498c;
            float height3 = f48 - ((rect3 != null ? rect3.top : 0) + ((rect3 != null ? rect3.height() : 0) / 2));
            float f49 = this.f272496a + (width4 * width2 * f39);
            float f57 = this.f272497b + (height3 * width2 * f39);
            if (f39 >= 0.16f && !this.f272499d) {
                this.f272499d = true;
                if (i(f39)) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new gk3.e(mVar));
                return;
            }
            float f58 = height;
            float height4 = (((f58 * width2) - rect.height()) / 2) * f39 * (f28 / width2);
            float f59 = f58 - height4;
            ek3.e eVar6 = mVar.f272528d;
            if (eVar6 != null) {
                eVar6.setMaskAlpha((int) (255 * f39));
            }
            ek3.e eVar7 = mVar.f272528d;
            if (eVar7 != null) {
                eVar7.a(0.0f, height4, f19, f59);
            }
            int i28 = ek3.e.f253609u;
            float f66 = (ek3.e.f253609u * f39) / f37;
            ek3.e eVar8 = mVar.f272528d;
            if (eVar8 != null) {
                eVar8.b(f66, f66, f66, f66, f66, f66, f66, f66);
            }
            ek3.e eVar9 = mVar.f272528d;
            if (eVar9 != null) {
                eVar9.setPivotX(f47);
            }
            ek3.e eVar10 = mVar.f272528d;
            if (eVar10 != null) {
                eVar10.setPivotY(f48);
            }
            ek3.e eVar11 = mVar.f272528d;
            if (eVar11 != null) {
                eVar11.setTranslationX(f49);
            }
            ek3.e eVar12 = mVar.f272528d;
            if (eVar12 != null) {
                eVar12.setTranslationY(f57);
            }
            ek3.e eVar13 = mVar.f272528d;
            if (eVar13 != null) {
                eVar13.setScaleX(f37);
            }
            ek3.e eVar14 = mVar.f272528d;
            if (eVar14 != null) {
                eVar14.setScaleY(f37);
            }
            ek3.e eVar15 = mVar.f272528d;
            if (eVar15 != null) {
                eVar15.postInvalidate();
            }
        }
    }

    @Override // ek3.b
    public boolean h(android.view.View view, int i17) {
        ek3.d dVar = this.f272500e.f272527c;
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
        gk3.m mVar = this.f272500e;
        ek3.e eVar = mVar.f272528d;
        android.graphics.Bitmap contentBitmap = eVar != null ? eVar.getContentBitmap() : null;
        if (eVar == null || contentBitmap == null) {
            return false;
        }
        int width = (int) (contentBitmap.getWidth() * 1.0f);
        int height = (int) (contentBitmap.getHeight() * 1.0f);
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, width, height);
        ek3.d dVar = mVar.f272527c;
        if (dVar == null || (rect = dVar.f253607v) == null) {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect3 = rect;
        float width2 = rect3.width() / width;
        oa5.b.b(eVar).k(new gk3.a(f17, width, height, width2, rect3, eVar, rect3.left + (rect3.width() / 2), rect3.top + (rect3.height() / 2))).o(new gk3.c(mVar, contentBitmap)).e(width2).f(width2).m((r9 - (rect2.left + (rect2.width() / 2))) * width2).n((r10 - (rect2.top + (rect2.height() / 2))) * width2).h(new android.view.animation.AccelerateInterpolator()).g(250L).l();
        return true;
    }

    @Override // db5.d
    public void onComplete(boolean z17) {
    }
}
