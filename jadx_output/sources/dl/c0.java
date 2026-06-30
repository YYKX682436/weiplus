package dl;

/* loaded from: classes10.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f235061b;

    /* renamed from: c, reason: collision with root package name */
    public final float f235062c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Rect f235063d;

    /* renamed from: e, reason: collision with root package name */
    public final dl.t f235064e;

    /* renamed from: h, reason: collision with root package name */
    public float f235067h;

    /* renamed from: i, reason: collision with root package name */
    public float f235068i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Rect f235069j;

    /* renamed from: k, reason: collision with root package name */
    public float f235070k;

    /* renamed from: l, reason: collision with root package name */
    public float f235071l;

    /* renamed from: m, reason: collision with root package name */
    public float f235072m;

    /* renamed from: n, reason: collision with root package name */
    public float f235073n;

    /* renamed from: o, reason: collision with root package name */
    public int f235074o;

    /* renamed from: p, reason: collision with root package name */
    public int f235075p;

    /* renamed from: q, reason: collision with root package name */
    public int f235076q;

    /* renamed from: r, reason: collision with root package name */
    public int f235077r;

    /* renamed from: a, reason: collision with root package name */
    public final int f235060a = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.f480149po);

    /* renamed from: f, reason: collision with root package name */
    public int f235065f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f235066g = false;

    public c0(dl.t tVar, float f17, android.graphics.Rect rect) {
        this.f235062c = f17;
        this.f235064e = tVar;
        this.f235063d = rect;
        this.f235061b = tVar.C;
    }

    public final void a(int i17, int i18, android.graphics.Rect rect) {
        float f17 = i17 - rect.top;
        float f18 = this.f235062c;
        int i19 = (int) (f17 * f18);
        android.graphics.Rect rect2 = this.f235061b;
        android.graphics.Rect rect3 = this.f235063d;
        if (i18 == 8) {
            int centerX = rect.centerX();
            int i27 = i19 / 2;
            this.f235077r = centerX - i27;
            this.f235076q = i27 + centerX;
            if (centerX < rect2.centerX()) {
                if (this.f235077r < rect2.left) {
                    com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "change direct to right_bottom");
                    a(i17, 12, rect);
                    return;
                }
            } else if (this.f235076q > rect2.right) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "change direct to RIGHT_TOP");
                a(i17, 9, rect);
                return;
            }
            rect3.left = this.f235077r;
            rect3.right = this.f235076q;
            rect3.bottom = i17;
            return;
        }
        if (i18 == 9) {
            this.f235077r = rect.right - i19;
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustBottom RIGHT_BOTTOM :" + rect3);
            int i28 = this.f235077r;
            int i29 = rect2.left;
            if (i28 >= i29) {
                rect3.left = i28;
                rect3.bottom = i17;
                return;
            } else {
                int i37 = rect.right - i29;
                rect3.left = i29;
                rect3.bottom = (int) (rect.top + (i37 / f18));
                return;
            }
        }
        if (i18 != 12) {
            return;
        }
        this.f235076q = rect.left + i19;
        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustBottom RIGHT_BOTTOM" + rect3);
        int i38 = this.f235076q;
        int i39 = rect2.right;
        if (i38 <= i39) {
            rect3.right = i38;
            rect3.bottom = i17;
        } else {
            int i47 = i39 - rect.left;
            rect3.right = i39;
            rect3.bottom = (int) (rect3.top + (i47 / f18));
        }
    }

    public final void b(int i17, int i18, android.graphics.Rect rect) {
        int i19 = rect.right;
        float f17 = this.f235062c;
        int i27 = (int) ((i19 - i17) / f17);
        android.graphics.Rect rect2 = this.f235061b;
        android.graphics.Rect rect3 = this.f235063d;
        if (i18 == 1) {
            float centerY = rect.centerY();
            float f18 = i27 / 2;
            this.f235074o = (int) (centerY - f18);
            this.f235075p = (int) (f18 + centerY);
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustLeft :" + rect3 + " LEFT");
            if (centerY >= rect2.centerY()) {
                if (this.f235075p > rect2.bottom) {
                    b(i17, 3, rect);
                    return;
                }
            } else if (this.f235074o < rect2.top) {
                b(i17, 9, rect);
                return;
            }
            rect3.top = this.f235074o;
            rect3.bottom = this.f235075p;
            rect3.left = i17;
            return;
        }
        if (i18 == 3) {
            int i28 = rect.bottom - i27;
            this.f235074o = i28;
            int i29 = rect2.top;
            if (i28 <= i29) {
                rect3.top = i29;
                rect3.left = (int) (i19 - ((r12 - i29) * f17));
            } else {
                rect3.top = i28;
                rect3.left = i17;
            }
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustLeft :" + rect3 + " LEFT_TOP");
            return;
        }
        if (i18 != 9) {
            return;
        }
        this.f235075p = rect.top + i27;
        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustLeft :" + rect3 + " LEFT_BOTTOM");
        int i37 = this.f235075p;
        int i38 = rect2.bottom;
        if (i37 < i38) {
            rect3.bottom = i37;
            rect3.left = i17;
        } else {
            int i39 = i38 - rect.top;
            rect3.bottom = i38;
            rect3.left = (int) (rect.right - (i39 * f17));
        }
    }

    public final void c(int i17, int i18, android.graphics.Rect rect) {
        float f17 = i17 - rect.left;
        float f18 = this.f235062c;
        int i19 = (int) (f17 / f18);
        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustRight delta:" + i19);
        android.graphics.Rect rect2 = this.f235061b;
        android.graphics.Rect rect3 = this.f235063d;
        if (i18 == 4) {
            int centerY = rect.centerY();
            int i27 = i19 / 2;
            this.f235074o = centerY - i27;
            this.f235075p = i27 + centerY;
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustRight right mBoxRect :" + rect3);
            if (centerY > rect2.centerY()) {
                if (this.f235075p > rect2.bottom) {
                    c(i17, 6, rect);
                    return;
                }
            } else if (this.f235074o < rect2.top) {
                c(i17, 12, rect);
                return;
            }
            rect3.right = i17;
            rect3.top = this.f235074o;
            rect3.bottom = this.f235075p;
            return;
        }
        if (i18 == 6) {
            this.f235074o = rect.bottom - i19;
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustRight RIGHT_TOP mBoxRect :" + rect3);
            int i28 = this.f235074o;
            int i29 = rect2.top;
            if (i28 >= i29) {
                rect3.top = i28;
                rect3.right = i17;
                return;
            } else {
                int i37 = rect.bottom - i29;
                rect3.top = i29;
                rect3.right = (int) (rect3.left + (i37 * f18));
                return;
            }
        }
        if (i18 != 12) {
            return;
        }
        this.f235075p = rect.top + i19;
        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "adjustRight RIGHT_BOTTOM mBoxRect.top :" + rect3);
        int i38 = rect3.bottom;
        int i39 = rect2.bottom;
        if (i38 <= i39) {
            rect3.bottom = this.f235075p;
            rect3.right = i17;
        } else {
            int i47 = i39 - rect.top;
            rect3.bottom = i39;
            rect3.right = rect3.left + i47;
        }
    }

    public final void d(int i17, int i18, android.graphics.Rect rect) {
        int i19 = rect.bottom;
        float f17 = this.f235062c;
        int i27 = (int) ((i19 - i17) * f17);
        android.graphics.Rect rect2 = this.f235063d;
        android.graphics.Rect rect3 = this.f235061b;
        if (i18 == 2) {
            int centerX = rect.centerX();
            int i28 = i27 / 2;
            this.f235077r = centerX - i28;
            this.f235076q = i28 + centerX;
            if (centerX < rect3.centerX()) {
                if (this.f235077r < rect3.left) {
                    d(i17, 6, rect);
                    return;
                }
            } else if (this.f235076q > rect3.right) {
                d(i17, 3, rect);
                return;
            }
            rect2.left = this.f235077r;
            rect2.right = this.f235076q;
            rect2.top = i17;
            return;
        }
        if (i18 == 3) {
            int i29 = rect.right - i27;
            this.f235077r = i29;
            int i37 = rect3.left;
            if (i29 < i37) {
                rect2.left = i37;
                rect2.top = (int) (i19 - ((r10 - i37) / f17));
                return;
            } else {
                rect2.left = i29;
                rect2.top = i17;
                return;
            }
        }
        if (i18 != 6) {
            return;
        }
        int i38 = i27 + rect.left;
        this.f235076q = i38;
        int i39 = rect2.right;
        int i47 = rect3.right;
        if (i39 <= i47) {
            rect2.right = i38;
            rect2.top = i17;
        } else {
            rect2.right = i47;
            rect2.top = (int) (i19 - ((i47 - r10) / f17));
        }
    }

    public final void e(int i17, int i18, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f235063d;
        int i19 = rect2.bottom;
        android.graphics.Rect rect3 = this.f235061b;
        int i27 = rect3.bottom;
        if (i19 <= i27) {
            if (i17 > i27 - i19) {
                a(i27, i18, rect);
            } else {
                a(i19 + i17, i18, rect);
            }
            int i28 = rect2.bottom;
            int i29 = rect2.top;
            int i37 = this.f235060a;
            if (i28 < (i37 * 2) + i29) {
                a(i29 + (i37 * 2), i18, rect);
            }
            int i38 = rect2.bottom;
            if (i38 > rect3.bottom) {
                a(i38, i18, rect);
            }
            android.graphics.RectF curImageRect = ((l45.n) this.f235064e.f235039a).f316460a.getBaseBoardView().getCurImageRect();
            if (i18 > 8) {
                l(curImageRect, i18);
            } else {
                l(curImageRect, 8);
                l(curImageRect, 1);
                l(curImageRect, 4);
            }
            j(curImageRect, 8);
        }
    }

    public final void f(int i17, int i18, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f235063d;
        int i19 = rect2.left;
        android.graphics.Rect rect3 = this.f235061b;
        int i27 = rect3.left;
        if (i19 >= i27) {
            if (i17 > i19 - i27) {
                b(i27, i18, rect);
            } else {
                b(i19 - i17, i18, rect);
            }
        }
        int i28 = rect2.left;
        int i29 = rect2.right;
        int i37 = this.f235060a;
        if (i28 > i29 - (i37 * 2)) {
            b(i29 - (i37 * 2), i18, rect);
        }
        int i38 = rect2.left;
        int i39 = rect3.left;
        if (i38 < i39) {
            b(i39, i18, rect);
        }
        android.graphics.RectF curImageRect = ((l45.n) this.f235064e.f235039a).f316460a.getBaseBoardView().getCurImageRect();
        if (i18 > 1) {
            l(curImageRect, i18);
        } else {
            l(curImageRect, 1);
            l(curImageRect, 8);
            l(curImageRect, 2);
        }
        j(curImageRect, 1);
    }

    public final void g(int i17, int i18, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f235063d;
        int i19 = rect2.right;
        android.graphics.Rect rect3 = this.f235061b;
        int i27 = rect3.right;
        if (i19 <= i27) {
            if (i17 > i27 - i19) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "changeRight outof bound:");
                c(rect3.right, i18, rect);
            } else {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "changeRight normal eventPosDelta: " + i17);
                c(rect2.right + i17, i18, rect);
            }
        }
        int i28 = rect2.right;
        int i29 = rect2.left;
        int i37 = this.f235060a;
        if (i28 < i29 + (i37 * 2)) {
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "changeRight < 2 padding>: " + rect2.right);
            c(rect2.left + (i37 * 2), i18, rect);
        }
        if (rect2.right > rect3.right) {
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "changeRight after out of bound>: " + rect2.right);
            c(rect3.right, i18, rect);
        }
        android.graphics.RectF curImageRect = ((l45.n) this.f235064e.f235039a).f316460a.getBaseBoardView().getCurImageRect();
        if (i18 > 4) {
            l(curImageRect, i18);
        } else {
            l(curImageRect, 4);
            l(curImageRect, 8);
            l(curImageRect, 2);
        }
        j(curImageRect, 4);
    }

    public final void h(int i17, int i18, android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f235063d;
        int i19 = rect2.top;
        android.graphics.Rect rect3 = this.f235061b;
        int i27 = rect3.top;
        if (i19 >= i27) {
            if (i17 > i19 - i27) {
                d(i27, i18, rect);
            } else {
                d(i19 - i17, i18, rect);
            }
        }
        int i28 = rect2.top;
        int i29 = rect2.bottom;
        int i37 = this.f235060a;
        if (i28 > i29 - (i37 * 2)) {
            d(i29 - (i37 * 2), i18, rect);
        }
        int i38 = rect2.top;
        int i39 = rect3.top;
        if (i38 < i39) {
            d(i39, i18, rect);
        }
        android.graphics.RectF curImageRect = ((l45.n) this.f235064e.f235039a).f316460a.getBaseBoardView().getCurImageRect();
        if (i18 > 2) {
            l(curImageRect, i18);
        } else {
            l(curImageRect, 2);
            l(curImageRect, 1);
            l(curImageRect, 4);
        }
        j(curImageRect, 2);
    }

    public final android.graphics.Matrix i() {
        return ((l45.n) this.f235064e.f235039a).f316460a.getBaseBoardView().getMainMatrix();
    }

    public final void j(android.graphics.RectF rectF, int i17) {
        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage cropDirection:" + i17);
        android.graphics.Rect rect = this.f235061b;
        android.graphics.Rect rect2 = this.f235063d;
        if (i17 == 1) {
            if (rect2.width() > rectF.width() && rect2.left > rect.left) {
                float width = rect2.width() / rectF.width();
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage LEFT 11 :" + width);
                i().postScale(width, width, (float) rect2.right, (float) rect2.centerY());
            }
            if (rect2.height() > rectF.height()) {
                float height = rect2.height() / rectF.height();
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage LEFT 22 :" + height);
                i().postScale(height, height, (float) rect2.right, (float) rect2.centerY());
                return;
            }
            return;
        }
        if (i17 == 2) {
            if (rect2.height() > rectF.height() && rect2.top > rect.top) {
                float height2 = rect2.height() / rectF.height();
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage TOP 11 :" + height2);
                i().postScale(height2, height2, (float) rect2.centerX(), (float) rect2.bottom);
            }
            if (rect2.width() > rectF.width()) {
                float width2 = rect2.width() / rectF.width();
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage TOP 22 :" + width2);
                i().postScale(width2, width2, (float) rect2.centerX(), (float) rect2.bottom);
                return;
            }
            return;
        }
        if (i17 == 4) {
            if (rect2.width() > rectF.width() && rect2.right < rect.right) {
                float width3 = rect2.width() / rectF.width();
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage RIGHT 11 :" + width3);
                i().postScale(width3, width3, (float) rect2.left, (float) rect2.centerY());
            }
            if (rect2.height() > rectF.height()) {
                float height3 = rect2.height() / rectF.height();
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage RIGHT 22 :" + height3);
                i().postScale(height3, height3, (float) rect2.left, (float) rect2.centerY());
                return;
            }
            return;
        }
        if (i17 != 8) {
            return;
        }
        if (rect2.height() > rectF.height() && rect2.bottom < rect.bottom) {
            float height4 = rect2.height() / rectF.height();
            i().postScale(height4, height4, rect2.centerX(), rect2.top);
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage bottom 11 :" + height4);
        }
        if (rect2.width() > rectF.width()) {
            float width4 = rect2.width() / rectF.width();
            i().postScale(width4, width4, rect2.centerX(), rect2.top);
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "scaleImage bottom 22 :" + width4);
        }
    }

    public final void k(android.graphics.RectF rectF, float f17, int i17) {
        com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage cropDirection:" + i17 + " eventPosDelta:" + f17);
        android.graphics.Rect rect = this.f235063d;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage LEFT begin");
            float f18 = rectF.left;
            int i18 = (int) f18;
            float f19 = this.f235072m;
            if (i18 < ((int) f19) || ((int) f18) < rect.left) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage LEFT else");
                return;
            }
            if (f17 > f18 - f19) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage left mEdgeLeft - imageRect.left:" + (this.f235072m - rectF.left));
                i().postTranslate(this.f235072m - rectF.left, 0.0f);
                return;
            }
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage left eventPosDelta:" + f17);
            i().postTranslate(f17, 0.0f);
            return;
        }
        if (i17 == 2) {
            float f27 = rectF.top;
            int i19 = (int) f27;
            float f28 = this.f235070k;
            if (i19 < ((int) f28) || ((int) f27) < rect.top) {
                return;
            }
            if (f17 > f27 - f28) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage imageRect.top - mEdgeTop - imageRect.left:" + (rectF.top - this.f235070k));
                i().postTranslate(0.0f, this.f235070k - rectF.top);
                return;
            }
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage top eventPosDelta:" + f17);
            i().postTranslate(0.0f, f17);
            return;
        }
        if (i17 == 4) {
            float f29 = rectF.right;
            int i27 = (int) f29;
            float f37 = this.f235073n;
            if (i27 > ((int) f37) || ((int) f29) > rect.right) {
                return;
            }
            if (f17 > f37 - f29) {
                i().postTranslate(this.f235073n - rectF.right, 0.0f);
                return;
            } else {
                i().postTranslate(f17, 0.0f);
                return;
            }
        }
        if (i17 != 8) {
            return;
        }
        float f38 = rectF.bottom;
        int i28 = (int) f38;
        float f39 = this.f235071l;
        if (i28 > ((int) f39) || ((int) f38) > rect.bottom) {
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage bottom else :" + f17);
        } else {
            if (f17 > f39 - f38) {
                com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage bottom 11:" + (this.f235071l - rectF.bottom));
                i().postTranslate(0.0f, this.f235071l - rectF.bottom);
                return;
            }
            com.tencent.mars.xlog.Log.i("FixRatioCropHelper", "translateImage bottom 22:" + f17);
            i().postTranslate(0.0f, f17);
        }
    }

    public final void l(android.graphics.RectF rectF, int i17) {
        int i18 = i17 & 1;
        android.graphics.Rect rect = this.f235063d;
        if (i18 == 1) {
            k(rectF, rect.left - this.f235069j.left, 1);
        }
        if ((i17 & 4) == 4) {
            k(rectF, rect.right - this.f235069j.right, 4);
        }
        if ((i17 & 2) == 2) {
            k(rectF, rect.top - this.f235069j.top, 2);
        }
        if ((i17 & 8) == 8) {
            k(rectF, rect.bottom - this.f235069j.bottom, 8);
        }
    }
}
