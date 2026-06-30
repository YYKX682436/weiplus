package dn5;

/* loaded from: classes10.dex */
public class e extends dn5.c {
    public android.graphics.Bitmap E;
    public android.graphics.Bitmap F;
    public android.graphics.Bitmap G;
    public android.graphics.Bitmap H;
    public android.graphics.Bitmap I;

    /* renamed from: J, reason: collision with root package name */
    public android.graphics.Bitmap f242058J;
    public android.graphics.Bitmap K;
    public android.graphics.Bitmap L;
    public android.graphics.Bitmap M;
    public android.graphics.Bitmap N;
    public android.graphics.Bitmap P;
    public android.graphics.Bitmap Q;
    public android.graphics.Bitmap R;
    public android.graphics.Bitmap S;
    public android.graphics.Rect[] T;
    public android.graphics.Rect[] U;
    public android.graphics.Paint V;
    public boolean W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f242059l1;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f242060p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f242061p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f242062x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f242063y0;

    public e(android.content.Context context, l45.q qVar) {
        super(context, qVar);
        this.T = new android.graphics.Rect[2];
        this.U = new android.graphics.Rect[4];
        this.f242059l1 = true;
        this.f242061p1 = -1;
    }

    @Override // dn5.c
    public void a() {
        super.a();
        if (getCurFeatureType() == qk.g6.MOSAIC) {
            if (this.T == null) {
                this.T = new android.graphics.Rect[2];
            }
            if (this.f242052v == null) {
                this.f242052v = new android.graphics.Rect();
            }
            float measuredWidth = ((((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f242045o.getWidth()) - this.L.getWidth()) - this.I.getWidth()) / 3.0f;
            int width = (int) ((this.K.getWidth() / 2) + measuredWidth);
            int detailHeight = ((getDetailHeight() - this.K.getWidth()) / 2) + (this.K.getWidth() / 2);
            int width2 = this.K.getWidth() * 2;
            int i17 = detailHeight - width2;
            int i18 = detailHeight + width2;
            this.T[0] = new android.graphics.Rect(width - width2, i17, width + width2, i18);
            int width3 = (int) (width + measuredWidth + this.K.getWidth());
            this.T[1] = new android.graphics.Rect(width3 - width2, i17, width3 + width2, i18);
            int measuredWidth2 = (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - (this.f242045o.getWidth() / 2);
            this.f242052v.set(measuredWidth2 - this.f242045o.getWidth(), 0, measuredWidth2 + this.f242045o.getWidth(), getDetailHeight());
            return;
        }
        if (getCurFeatureType() == qk.g6.CROP_PHOTO) {
            if (this.U == null) {
                this.U = new android.graphics.Rect[4];
            }
            int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480258sr);
            float height = (dimension / 2) - (this.N.getHeight() / 2);
            float dimension2 = ((getResources().getDimension(com.tencent.mm.R.dimen.f480413x8) / 2.0f) - (this.S.getHeight() / 2)) + dimension;
            int height2 = (int) (height + (this.S.getHeight() / 2));
            int paddingLeftAndRight = (int) (((getPaddingLeftAndRight() * 1.0f) / 2.0f) + (this.S.getHeight() / 2));
            int height3 = this.S.getHeight();
            int i19 = paddingLeftAndRight - height3;
            int i27 = paddingLeftAndRight + height3;
            this.U[0] = new android.graphics.Rect(i19, height2 - height3, i27, height2 + height3);
            int height4 = (int) (dimension2 + (this.S.getHeight() / 2));
            int i28 = height4 - height3;
            int i29 = height4 + height3;
            this.U[1] = new android.graphics.Rect(i19, i28, i27, i29);
            int measuredWidth3 = (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - (this.S.getHeight() / 2);
            this.U[2] = new android.graphics.Rect(measuredWidth3 - height3, i28, measuredWidth3 + height3, i29);
            int measuredWidth4 = getMeasuredWidth() / 2;
            this.U[3] = new android.graphics.Rect(measuredWidth4 - height3, i28, measuredWidth4 + height3, i29);
        }
    }

    @Override // dn5.c
    public android.graphics.Bitmap b(qk.g6 g6Var, boolean z17) {
        if (g6Var == qk.g6.CROP_PHOTO) {
            return z17 ? this.H : this.G;
        }
        if (g6Var == qk.g6.MOSAIC) {
            return z17 ? this.E : this.F;
        }
        return null;
    }

    @Override // dn5.c
    public void c(android.graphics.Canvas canvas) {
        super.c(canvas);
        if (getCurFeatureType() == qk.g6.MOSAIC) {
            android.graphics.Paint paint = new android.graphics.Paint();
            if (i()) {
                paint.setAlpha(255);
            } else {
                paint.setAlpha(160);
            }
            canvas.drawBitmap((this.f242053w && i()) ? this.f242046p : this.f242045o, (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - this.f242045o.getWidth(), (getDetailHeight() - this.f242045o.getHeight()) / 2, paint);
            float measuredWidth = ((((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f242045o.getWidth()) - this.L.getWidth()) - this.I.getWidth()) / 3.0f;
            float detailHeight = ((getDetailHeight() - this.L.getHeight()) * 1.0f) / 2.0f;
            if (this.f242059l1) {
                this.f242061p1 = 0;
                this.f242059l1 = false;
            }
            int i17 = this.f242061p1;
            if (i17 == 0) {
                canvas.drawBitmap(this.f242058J, measuredWidth, detailHeight, (android.graphics.Paint) null);
                canvas.drawBitmap(this.K, measuredWidth + measuredWidth + this.L.getWidth(), detailHeight, (android.graphics.Paint) null);
                return;
            } else if (i17 != 1) {
                canvas.drawBitmap(this.I, measuredWidth, detailHeight, (android.graphics.Paint) null);
                canvas.drawBitmap(this.K, measuredWidth + measuredWidth + this.L.getWidth(), detailHeight, (android.graphics.Paint) null);
                return;
            } else {
                canvas.drawBitmap(this.I, measuredWidth, detailHeight, (android.graphics.Paint) null);
                canvas.drawBitmap(this.L, measuredWidth + measuredWidth + r2.getWidth(), detailHeight, (android.graphics.Paint) null);
                return;
            }
        }
        if (getCurFeatureType() == qk.g6.CROP_PHOTO) {
            int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480258sr);
            float f17 = dimension;
            canvas.drawLine(0.0f, f17, getMeasuredWidth(), f17, this.f242054x);
            float dimension2 = ((getResources().getDimension(com.tencent.mm.R.dimen.f480413x8) / 2.0f) - (this.S.getHeight() / 2)) + f17;
            float paddingLeftAndRight = (getPaddingLeftAndRight() * 1.0f) / 2.0f;
            float height = (dimension / 2) - (this.N.getHeight() / 2);
            if (this.f242060p0) {
                canvas.drawBitmap(this.N, paddingLeftAndRight, height, (android.graphics.Paint) null);
            } else {
                canvas.drawBitmap(this.M, paddingLeftAndRight, height, (android.graphics.Paint) null);
            }
            if (this.f242062x0) {
                canvas.drawBitmap(this.Q, (getMeasuredWidth() - paddingLeftAndRight) - this.S.getWidth(), dimension2, (android.graphics.Paint) null);
            } else {
                canvas.drawBitmap(this.P, (getMeasuredWidth() - paddingLeftAndRight) - this.S.getWidth(), dimension2, (android.graphics.Paint) null);
            }
            if (this.W) {
                canvas.drawBitmap(this.R, paddingLeftAndRight, dimension2, (android.graphics.Paint) null);
            } else {
                canvas.drawBitmap(this.S, paddingLeftAndRight, dimension2, (android.graphics.Paint) null);
            }
            float dimension3 = getResources().getDimension(com.tencent.mm.R.dimen.f480257sq) * 2.0f;
            float dimension4 = (getResources().getDimension(com.tencent.mm.R.dimen.f480413x8) / 2.0f) + ((getResources().getDimension(com.tencent.mm.R.dimen.f480257sq) - 8.0f) / 2.0f) + f17;
            float measuredWidth2 = getMeasuredWidth() / 2;
            if (this.f242063y0) {
                this.V.setColor(-1);
                this.V.setAlpha(160);
                canvas.drawText(getResources().getString(com.tencent.mm.R.string.blz), measuredWidth2 - (dimension3 / 2.0f), dimension4, this.V);
            } else if (i()) {
                this.V.setColor(-1);
                this.V.setAlpha(255);
                canvas.drawText(getResources().getString(com.tencent.mm.R.string.blz), measuredWidth2 - (dimension3 / 2.0f), dimension4, this.V);
            } else {
                this.V.setColor(-1);
                this.V.setAlpha(100);
                canvas.drawText(getResources().getString(com.tencent.mm.R.string.blz), measuredWidth2 - (dimension3 / 2.0f), dimension4, this.V);
            }
        }
    }

    @Override // dn5.c
    public void g() {
        super.g();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.V = paint;
        paint.setTextSize(getResources().getDimension(com.tencent.mm.R.dimen.f480257sq));
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cbm));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.I = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cbl));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f242058J = decodeResource2;
        android.content.res.Resources resources3 = getResources();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cbo));
        arrayList3.add(resources3);
        java.lang.Object obj3 = new java.lang.Object();
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
        yj0.a.e(obj3, decodeResource3, "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.K = decodeResource3;
        android.content.res.Resources resources4 = getResources();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.cbn));
        arrayList4.add(resources4);
        java.lang.Object obj4 = new java.lang.Object();
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(obj4, arrayList4.toArray(), "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
        yj0.a.e(obj4, decodeResource4, "com/tencent/mm/view/footer/PhotoFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.L = decodeResource4;
        this.F = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.mosaic_unselected));
        this.E = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.mosaic_selected));
        this.G = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.crop_unselected));
        this.H = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.crop_selected));
        this.M = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.rotation_normal));
        this.N = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.rotation_press));
        this.Q = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.sure_crop_press));
        this.P = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.sure_crop_normal));
        this.R = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.cancel_crop_press));
        this.S = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.cancel_crop_normal));
    }

    @Override // dn5.c
    public int getDetailHeight() {
        float dimension;
        int detailHeight = super.getDetailHeight();
        if (detailHeight == 0) {
            if (getCurFeatureType() == qk.g6.MOSAIC) {
                dimension = getResources().getDimension(com.tencent.mm.R.dimen.f480412x7);
            } else if (getCurFeatureType() == qk.g6.CROP_PHOTO) {
                dimension = getResources().getDimension(com.tencent.mm.R.dimen.f480413x8) + getResources().getDimension(com.tencent.mm.R.dimen.f480258sr);
            }
            return (int) dimension;
        }
        return detailHeight;
    }

    @Override // dn5.c
    public void h(android.graphics.Canvas canvas) {
        if (this.f242056z) {
            return;
        }
        if (getCurFeatureType() != qk.g6.CROP_PHOTO) {
            super.h(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // dn5.c
    public boolean j(int i17) {
        boolean j17 = super.j(i17);
        int ordinal = f(i17).ordinal();
        if (ordinal == 4 || ordinal == 5) {
            return true;
        }
        return j17;
    }

    @Override // dn5.c
    public void k(int i17, int i18) {
        super.k(i17, i18);
        int ordinal = f(this.f242047q).ordinal();
        int i19 = 0;
        if (ordinal == 4) {
            while (true) {
                android.graphics.Rect[] rectArr = this.T;
                if (i19 >= rectArr.length) {
                    return;
                }
                android.graphics.Rect rect = rectArr[i19];
                if (rect == null) {
                    com.tencent.mars.xlog.Log.e("PhotoFooterView", "[onDetailTouchDispatch] detailRect is null! %s", java.lang.Integer.valueOf(i19));
                }
                if (rect != null && rect.contains(i17, i18)) {
                    this.f242061p1 = i19;
                    return;
                }
                i19++;
            }
        } else {
            if (ordinal != 5) {
                return;
            }
            while (true) {
                android.graphics.Rect[] rectArr2 = this.U;
                if (i19 >= rectArr2.length) {
                    return;
                }
                android.graphics.Rect rect2 = rectArr2[i19];
                if (rect2 != null && rect2.contains(i17, i18)) {
                    if (i19 == 0) {
                        this.f242060p0 = true;
                        return;
                    }
                    if (i19 == 1) {
                        this.W = true;
                        return;
                    } else if (i19 == 2) {
                        this.f242062x0 = true;
                        return;
                    } else {
                        if (i19 == 3) {
                            this.f242063y0 = true;
                            return;
                        }
                        return;
                    }
                }
                i19++;
            }
        }
    }

    @Override // dn5.c
    public void l(int i17, int i18) {
        super.l(i17, i18);
        int ordinal = f(this.f242047q).ordinal();
        int i19 = 0;
        if (ordinal == 4) {
            while (true) {
                android.graphics.Rect[] rectArr = this.T;
                if (rectArr == null || i19 >= rectArr.length) {
                    return;
                }
                android.graphics.Rect rect = rectArr[i19];
                if (rect != null && rect.contains(i17, i18) && i19 == this.f242061p1) {
                    l45.n nVar = (l45.n) getPresenter();
                    nVar.getClass();
                    new l45.a(nVar).b(qk.g6.MOSAIC, i19, null);
                    this.f242048r = this.f242047q;
                    return;
                }
                i19++;
            }
        } else {
            if (ordinal != 5) {
                return;
            }
            int i27 = 0;
            while (true) {
                android.graphics.Rect[] rectArr2 = this.U;
                if (rectArr2 == null || i27 >= rectArr2.length) {
                    return;
                }
                android.graphics.Rect rect2 = rectArr2[i27];
                if (rect2 != null && rect2.contains(i17, i18)) {
                    if ((i27 == 0 && this.f242060p0) || ((i27 == 1 && this.W) || ((i27 == 2 && this.f242062x0) || (i27 == 3 && this.f242063y0)))) {
                        l45.n nVar2 = (l45.n) getPresenter();
                        nVar2.getClass();
                        new l45.a(nVar2).b(qk.g6.CROP_PHOTO, i27, null);
                        this.f242048r = this.f242047q;
                    }
                    this.f242060p0 = false;
                    this.W = false;
                    this.f242062x0 = false;
                    this.f242063y0 = false;
                    return;
                }
                i27++;
            }
        }
    }

    @Override // dn5.c, android.view.View
    public void onMeasure(int i17, int i18) {
        if (getCurFeatureType() != qk.g6.CROP_PHOTO) {
            super.onMeasure(i17, i18);
            return;
        }
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        setMeasuredDimension(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getDetailHeight(), 1073741824));
        a();
    }
}
