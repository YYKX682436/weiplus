package zx2;

/* loaded from: classes15.dex */
public class t extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f477071d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f477072e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.drawable.GradientDrawable f477073f;

    /* renamed from: g, reason: collision with root package name */
    public int f477074g;

    /* renamed from: h, reason: collision with root package name */
    public float f477075h;

    /* renamed from: i, reason: collision with root package name */
    public int f477076i;

    /* renamed from: m, reason: collision with root package name */
    public int f477077m;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ValueAnimator f477078n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f477079o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout f477080p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout, android.content.Context context) {
        super(context);
        this.f477080p = finderTabLayout;
        this.f477074g = -1;
        this.f477076i = -1;
        this.f477077m = -1;
        this.f477079o = false;
        setWillNotDraw(false);
        this.f477072e = new android.graphics.Paint();
        this.f477073f = new android.graphics.drawable.GradientDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r11, int r12) {
        /*
            r10 = this;
            android.animation.ValueAnimator r0 = r10.f477078n
            if (r0 == 0) goto Lf
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto Lf
            android.animation.ValueAnimator r0 = r10.f477078n
            r0.cancel()
        Lf:
            android.view.View r0 = r10.getChildAt(r11)
            if (r0 != 0) goto L1a
            r10.e()
            goto Ld1
        L1a:
            boolean r1 = r0 instanceof zx2.w
            if (r1 == 0) goto L2d
            r2 = r0
            zx2.w r2 = (zx2.w) r2
            android.view.View r2 = r2.f477096g
            java.lang.Object r2 = r2.getTag()
            boolean r2 = r2 instanceof zx2.c
            if (r2 == 0) goto L2d
            r2 = 1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout r3 = r10.f477080p
            if (r2 == 0) goto L57
            boolean r1 = r3.H
            if (r1 != 0) goto L4e
            r1 = r0
            zx2.w r1 = (zx2.w) r1
            android.graphics.RectF r2 = r3.f133102f
            boolean r2 = r10.b(r1, r2)
            if (r2 != 0) goto L46
            android.graphics.RectF r2 = r3.f133102f
            r10.c(r1, r2)
        L46:
            android.graphics.RectF r1 = r3.f133102f
            float r2 = r1.left
            int r2 = (int) r2
            float r1 = r1.right
            goto L6c
        L4e:
            int r2 = r0.getLeft()
            int r1 = r0.getRight()
            goto L76
        L57:
            boolean r2 = r3.H
            if (r2 != 0) goto L6e
            if (r1 == 0) goto L6e
            r1 = r0
            zx2.w r1 = (zx2.w) r1
            android.graphics.RectF r2 = r3.f133102f
            r10.c(r1, r2)
            android.graphics.RectF r1 = r3.f133102f
            float r2 = r1.left
            int r2 = (int) r2
            float r1 = r1.right
        L6c:
            int r1 = (int) r1
            goto L76
        L6e:
            int r2 = r0.getLeft()
            int r1 = r0.getRight()
        L76:
            r9 = r1
            r7 = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "indicatorLeft :"
            r1.<init>(r2)
            int r2 = r0.getLeft()
            r1.append(r2)
            java.lang.String r2 = " indicatorRight:"
            r1.append(r2)
            int r0 = r0.getRight()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "Finder.CustomTabLayout"
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r6 = r10.f477076i
            int r8 = r10.f477077m
            if (r6 != r7) goto La3
            if (r8 == r9) goto Ld1
        La3:
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r10.f477078n = r0
            android.animation.TimeInterpolator r1 = r3.V
            r0.setInterpolator(r1)
            long r1 = (long) r12
            r0.setDuration(r1)
            r12 = 2
            float[] r12 = new float[r12]
            r12 = {x00d2: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0.setFloatValues(r12)
            zx2.r r12 = new zx2.r
            r4 = r12
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.addUpdateListener(r12)
            zx2.s r12 = new zx2.s
            r12.<init>(r10, r11)
            r0.addListener(r12)
            r0.start()
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zx2.t.a(int, int):void");
    }

    public final boolean b(zx2.w wVar, android.graphics.RectF rectF) {
        jz5.l lVar;
        if (wVar != null && (wVar.f477096g.getTag() instanceof zx2.c)) {
            zx2.c cVar = (zx2.c) wVar.f477096g.getTag();
            android.view.View view = cVar.f477030k;
            if (view != null) {
                int[] iArr = {0, 0};
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {0, 0};
                int[] iArr3 = {0, 0};
                android.view.View o17 = cVar.o();
                android.view.View m17 = cVar.m();
                if (o17 != null) {
                    o17.getLocationOnScreen(iArr2);
                }
                if (m17 != null) {
                    m17.getLocationOnScreen(iArr3);
                }
                int i17 = iArr2[0];
                int i18 = iArr[0];
                if (i17 < i18) {
                    i17 = i18;
                }
                int width = iArr3[0] + (m17 != null ? m17.getWidth() : 0);
                if (width > iArr[0] + view.getWidth()) {
                    width = iArr[0] + view.getWidth();
                }
                int[] n17 = cVar.n();
                int i19 = width - i17;
                if (i19 <= 0) {
                    i19 = 0;
                }
                int i27 = n17[0];
                int i28 = (i19 - i27) - n17[1];
                if (i28 > 0) {
                    i17 += i27;
                    i19 = i28;
                }
                int left = view.getLeft() + (i17 - iArr[0]);
                int i29 = i19 + left;
                if (i29 > view.getRight()) {
                    i29 = view.getRight();
                }
                lVar = new jz5.l(java.lang.Integer.valueOf(left), java.lang.Integer.valueOf(i29));
            } else {
                lVar = null;
            }
            if (lVar != null) {
                rectF.set(((java.lang.Integer) lVar.f302833d).intValue(), 0.0f, ((java.lang.Integer) lVar.f302834e).intValue(), 0.0f);
                return true;
            }
        }
        return false;
    }

    public final void c(zx2.w wVar, android.graphics.RectF rectF) {
        int contentWidth;
        contentWidth = wVar.getContentWidth();
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477080p;
        if (contentWidth < finderTabLayout.g(24)) {
            contentWidth = finderTabLayout.g(24);
        }
        int left = (wVar.getLeft() + wVar.getRight()) / 2;
        int i17 = contentWidth / 2;
        rectF.set(left - i17, 0.0f, left + i17, 0.0f);
    }

    public void d(int i17, int i18) {
        if (i17 == this.f477076i && i18 == this.f477077m) {
            return;
        }
        this.f477076i = i17;
        this.f477077m = i18;
        com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", "indicatorLeft :" + this.f477076i + " indicatorRight:" + this.f477077m + " gap:" + (this.f477077m - this.f477076i));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(this);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477080p;
        android.graphics.drawable.Drawable drawable = finderTabLayout.f133113s;
        int i17 = 0;
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        int i18 = this.f477071d;
        if (i18 >= 0) {
            intrinsicHeight = i18;
        }
        int i19 = finderTabLayout.E;
        if (i19 == 0) {
            i17 = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
        } else if (i19 == 1) {
            i17 = (getHeight() - intrinsicHeight) / 2;
            intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
        } else if (i19 != 2) {
            intrinsicHeight = i19 != 3 ? 0 : getHeight();
        }
        int i27 = this.f477076i;
        if (i27 >= 0 && this.f477077m > i27) {
            android.graphics.drawable.Drawable drawable2 = finderTabLayout.f133113s;
            if (drawable2 == null) {
                drawable2 = this.f477073f;
            }
            com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", "indicatorLeft :" + this.f477076i + " indicatorRight:" + this.f477077m);
            drawable2.setBounds(this.f477076i, i17, this.f477077m, intrinsicHeight);
            android.graphics.Paint paint = this.f477072e;
            if (paint != null) {
                f3.b.g(drawable2, paint.getColor());
            }
            drawable2.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e() {
        int i17;
        int i18;
        android.view.View childAt = getChildAt(this.f477074g);
        if (childAt == null || childAt.getWidth() <= 0) {
            i17 = -1;
            i18 = -1;
        } else {
            i17 = childAt.getLeft();
            i18 = childAt.getRight();
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477080p;
            if (!finderTabLayout.H && (childAt instanceof zx2.w)) {
                zx2.w wVar = (zx2.w) childAt;
                if (!b(wVar, finderTabLayout.f133102f)) {
                    c(wVar, finderTabLayout.f133102f);
                }
                android.graphics.RectF rectF = finderTabLayout.f133102f;
                i17 = (int) rectF.left;
                i18 = (int) rectF.right;
                com.tencent.mars.xlog.Log.i("Finder.CustomTabLayout", "right - left:" + (i18 - i17));
            }
            if (this.f477075h > 0.0f && this.f477074g < getChildCount() - 1) {
                android.view.View childAt2 = getChildAt(this.f477074g + 1);
                int left = childAt2.getLeft();
                int right = childAt2.getRight();
                if (!finderTabLayout.H && (childAt2 instanceof zx2.w)) {
                    c((zx2.w) childAt2, finderTabLayout.f133102f);
                    android.graphics.RectF rectF2 = finderTabLayout.f133102f;
                    left = (int) rectF2.left;
                    right = (int) rectF2.right;
                }
                float f17 = this.f477075h;
                i17 = (int) ((left * f17) + ((1.0f - f17) * i17));
                i18 = (int) ((right * f17) + ((1.0f - f17) * i18));
            }
        }
        d(i17, i18);
    }

    public float getIndicatorPosition() {
        return this.f477074g + this.f477075h;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.animation.ValueAnimator valueAnimator = this.f477078n;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            e();
        } else {
            this.f477078n.cancel();
            a(this.f477074g, java.lang.Math.round((1.0f - this.f477078n.getAnimatedFraction()) * ((float) this.f477078n.getDuration())));
        }
        if (this.f477079o) {
            return;
        }
        post(new zx2.q(this));
        this.f477079o = true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (android.view.View.MeasureSpec.getMode(i17) == 1073741824) {
            com.tencent.mm.plugin.finder.view.tabcomp.FinderTabLayout finderTabLayout = this.f477080p;
            boolean z17 = true;
            if (finderTabLayout.F == 1 && finderTabLayout.C == 1) {
                int childCount = getChildCount();
                int i19 = 0;
                for (int i27 = 0; i27 < childCount; i27++) {
                    android.view.View childAt = getChildAt(i27);
                    if (childAt.getVisibility() == 0) {
                        i19 = java.lang.Math.max(i19, childAt.getMeasuredWidth());
                    }
                }
                if (i19 <= 0) {
                    return;
                }
                if (i19 * childCount > getMeasuredWidth() - (finderTabLayout.g(16) * 2)) {
                    finderTabLayout.C = 0;
                    finderTabLayout.q(false);
                } else {
                    boolean z18 = false;
                    for (int i28 = 0; i28 < childCount; i28++) {
                        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildAt(i28).getLayoutParams();
                        if (layoutParams.width != i19 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i19;
                            layoutParams.weight = 0.0f;
                            z18 = true;
                        }
                    }
                    z17 = z18;
                }
                if (z17) {
                    super.onMeasure(i17, i18);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i17) {
        super.onRtlPropertiesChanged(i17);
    }

    public void setSelectedIndicatorColor(int i17) {
        android.graphics.Paint paint = this.f477072e;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public void setSelectedIndicatorHeight(int i17) {
        if (this.f477071d != i17) {
            this.f477071d = i17;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }
}
