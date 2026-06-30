package dn5;

/* loaded from: classes10.dex */
public abstract class c extends android.view.View {
    public static final int[] D = {-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092};
    public int A;
    public int B;
    public boolean C;

    /* renamed from: d, reason: collision with root package name */
    public final float f242037d;

    /* renamed from: e, reason: collision with root package name */
    public final l45.q f242038e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f242039f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f242040g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f242041h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Bitmap f242042i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f242043m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f242044n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f242045o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f242046p;

    /* renamed from: q, reason: collision with root package name */
    public int f242047q;

    /* renamed from: r, reason: collision with root package name */
    public int f242048r;

    /* renamed from: s, reason: collision with root package name */
    public int f242049s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Rect[] f242050t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Rect[] f242051u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Rect f242052v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f242053w;

    /* renamed from: x, reason: collision with root package name */
    public android.graphics.Paint f242054x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Paint f242055y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f242056z;

    public c(android.content.Context context, l45.q qVar) {
        super(context);
        this.f242037d = getResources().getDimension(com.tencent.mm.R.dimen.f480410x5);
        this.f242047q = -1;
        this.f242048r = -1;
        this.f242049s = -1;
        this.f242056z = false;
        this.A = -1;
        this.B = -1;
        this.C = true;
        setId(com.tencent.mm.R.id.afb);
        this.f242038e = qVar;
        g();
    }

    public void a() {
        if (this.f242050t == null) {
            this.f242050t = new android.graphics.Rect[getFeatureCount()];
        }
        int iconWidth = (int) (this.f242037d + (getIconWidth() / 2.0f));
        int iconWidth2 = (int) getIconWidth();
        for (int i17 = 0; i17 < getFeatureCount(); i17++) {
            this.f242050t[i17] = new android.graphics.Rect(iconWidth - iconWidth2, getDetailHeight(), iconWidth + iconWidth2, getDetailHeight() + getMeasuredHeight());
            iconWidth = (int) (iconWidth + getWidthSpacing() + getIconWidth());
        }
        if (f(this.f242047q) == qk.g6.DOODLE) {
            if (this.f242051u == null) {
                this.f242051u = new android.graphics.Rect[8];
            }
            if (this.f242052v == null) {
                this.f242052v = new android.graphics.Rect();
            }
            float dimension = getResources().getDimension(com.tencent.mm.R.dimen.f480312u9);
            float f17 = dimension * 2.0f;
            float f18 = 8;
            float measuredWidth = (((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f242045o.getWidth()) - (f17 * f18)) / f18;
            int i18 = (int) f17;
            int paddingLeftAndRight = (int) ((getPaddingLeftAndRight() / 2) + dimension + 5.0f);
            int detailHeight = (int) (((getDetailHeight() - f17) / 2.0f) + dimension);
            for (int i19 = 0; i19 < 8; i19++) {
                this.f242051u[i19] = new android.graphics.Rect(paddingLeftAndRight - i18, detailHeight - i18, paddingLeftAndRight + i18, detailHeight + i18);
                paddingLeftAndRight = (int) (paddingLeftAndRight + measuredWidth + f17);
            }
            int measuredWidth2 = (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - (this.f242045o.getWidth() / 2);
            this.f242052v.set(measuredWidth2 - this.f242045o.getWidth(), 0, measuredWidth2 + this.f242045o.getWidth(), getDetailHeight());
        }
    }

    public abstract android.graphics.Bitmap b(qk.g6 g6Var, boolean z17);

    public void c(android.graphics.Canvas canvas) {
        float b17;
        if (f(this.f242047q) == qk.g6.DOODLE) {
            float dimension = getResources().getDimension(com.tencent.mm.R.dimen.f480312u9);
            float f17 = dimension * 2.0f;
            float f18 = 8;
            float measuredWidth = (((getMeasuredWidth() - getPaddingLeftAndRight()) - this.f242045o.getWidth()) - (f17 * f18)) / f18;
            float paddingLeftAndRight = (getPaddingLeftAndRight() / 2) + dimension + cm5.h.b(1.5f);
            float detailHeight = ((getDetailHeight() - f17) / 2.0f) + dimension;
            int i17 = 0;
            while (i17 < 8) {
                if (this.B == i17) {
                    b17 = cm5.h.b(2.0f);
                    this.C = false;
                } else {
                    b17 = (this.C && i17 == 2) ? cm5.h.b(2.0f) : 0.0f;
                }
                this.f242055y.setColor(-1);
                canvas.drawCircle(paddingLeftAndRight, detailHeight, cm5.h.b(1.5f) + dimension + b17, this.f242055y);
                this.f242055y.setColor(D[i17]);
                canvas.drawCircle(paddingLeftAndRight, detailHeight, b17 + dimension, this.f242055y);
                paddingLeftAndRight += measuredWidth + f17;
                i17++;
            }
            android.graphics.Paint paint = new android.graphics.Paint();
            if (i()) {
                paint.setAlpha(255);
            } else {
                paint.setAlpha(160);
            }
            canvas.drawBitmap((this.f242053w && i()) ? this.f242046p : this.f242045o, (getMeasuredWidth() - (getPaddingLeftAndRight() / 2)) - this.f242045o.getWidth(), (getDetailHeight() - this.f242045o.getHeight()) / 2, paint);
        }
    }

    public android.graphics.Bitmap d(qk.g6 g6Var, boolean z17) {
        int ordinal = g6Var.ordinal();
        android.graphics.Bitmap bitmap = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : z17 ? this.f242044n : this.f242043m : z17 ? this.f242042i : this.f242041h : z17 ? this.f242040g : this.f242039f;
        return bitmap == null ? b(g6Var, z17) : bitmap;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i17 = 0;
            while (true) {
                if (i17 >= getFeatureCount()) {
                    break;
                }
                if (this.f242050t[i17].contains(x17, y17)) {
                    this.A = i17;
                    postInvalidate();
                    break;
                }
                if (getDetailHeight() > 0) {
                    android.graphics.Rect rect = this.f242052v;
                    if (rect == null || !rect.contains(x17, y17)) {
                        k(x17, y17);
                    } else {
                        this.f242053w = true;
                        postInvalidate();
                    }
                }
                i17++;
            }
        } else if (action == 1 || action == 3) {
            int i18 = 0;
            while (true) {
                if (i18 >= getFeatureCount()) {
                    break;
                }
                if (this.f242050t[i18].contains(x17, y17) && this.A == i18) {
                    if (j(i18)) {
                        int i19 = this.A;
                        if (i19 != this.f242047q) {
                            this.f242047q = i19;
                        } else {
                            this.f242047q = -1;
                        }
                    }
                    if (!this.f242056z) {
                        this.f242049s = this.f242048r;
                        if (j(i18)) {
                            this.f242048r = this.f242047q;
                            l45.n nVar = (l45.n) getPresenter();
                            nVar.getClass();
                            new l45.a(nVar).a(f(this.f242047q));
                        } else {
                            this.f242048r = i18;
                            l45.n nVar2 = (l45.n) getPresenter();
                            nVar2.getClass();
                            new l45.a(nVar2).a(f(i18));
                        }
                    }
                }
                i18++;
            }
            if (getDetailHeight() > 0) {
                android.graphics.Rect rect2 = this.f242052v;
                if (rect2 != null && rect2.contains(x17, y17) && this.f242053w) {
                    l45.n nVar3 = (l45.n) getPresenter();
                    nVar3.getClass();
                    new l45.a(nVar3).b(f(this.f242047q), -1, null);
                } else {
                    l(x17, y17);
                }
            }
            this.f242053w = false;
            this.A = -1;
            requestLayout();
            postInvalidate();
        }
        return true;
    }

    public int e(int i17) {
        if (i17 < 0 || i17 >= 8) {
            return -65536;
        }
        return D[i17];
    }

    public qk.g6 f(int i17) {
        return (i17 < 0 || i17 >= getFeatureCount()) ? qk.g6.DEFAULT : ((l45.n) getPresenter()).f316460a.getFeatures()[i17];
    }

    public void g() {
        new android.graphics.Paint(1).setColor(-16711936);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f242054x = paint;
        paint.setColor(getResources().getColor(com.tencent.mm.R.color.f478898k7));
        this.f242054x.setStrokeWidth(0.6f);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.f242055y = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f242055y.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.f242046p = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.undo_press));
        this.f242045o = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.undo_normal));
        this.f242039f = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.doodle_unselected));
        this.f242040g = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.doodle_selected));
        this.f242041h = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.text_unselected));
        this.f242042i = com.tencent.mm.sdk.platformtools.x.K0(getResources().getDrawable(com.tencent.mm.R.raw.text_selected));
        android.content.res.Resources resources = getResources();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.emoji_unselected));
        arrayList.add(resources);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.e(obj, decodeResource, "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f242043m = decodeResource;
        android.content.res.Resources resources2 = getResources();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.emoji_selected));
        arrayList2.add(resources2);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
        yj0.a.e(obj2, decodeResource2, "com/tencent/mm/view/footer/BaseFooterView", "initBitmap", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
        this.f242044n = decodeResource2;
    }

    public qk.g6 getCurFeatureType() {
        return f(this.f242048r);
    }

    public int getDetailHeight() {
        if (f(this.f242047q) == qk.g6.DOODLE) {
            return (int) getResources().getDimension(com.tencent.mm.R.dimen.f480412x7);
        }
        return 0;
    }

    public int getFeatureCount() {
        return ((l45.n) getPresenter()).f316460a.getFeatures().length;
    }

    public float getHeightSpacing() {
        return ((getMeasuredHeight() - getDetailHeight()) - getIconWidth()) / 2.0f;
    }

    public float getIconWidth() {
        if (d(qk.g6.DOODLE, false) == null) {
            return 0.0f;
        }
        return r0.getWidth();
    }

    public int getPaddingLeftAndRight() {
        return (int) (this.f242037d * 2.0f);
    }

    public l45.q getPresenter() {
        return this.f242038e;
    }

    public float getWidthSpacing() {
        return ((getMeasuredWidth() - (getFeatureCount() * getIconWidth())) - getPaddingLeftAndRight()) / (getFeatureCount() - 1);
    }

    public void h(android.graphics.Canvas canvas) {
        if (getDetailHeight() > 0) {
            canvas.drawLine(0.0f, getDetailHeight(), getMeasuredWidth(), getDetailHeight(), this.f242054x);
            c(canvas);
        }
        float heightSpacing = getHeightSpacing() + getDetailHeight();
        float f17 = this.f242037d;
        int i17 = 0;
        while (i17 < getFeatureCount()) {
            android.graphics.Bitmap d17 = d(((l45.n) getPresenter()).f316460a.getFeatures()[i17], this.A == i17 || i17 == this.f242047q);
            if (d17 != null) {
                canvas.drawBitmap(d17, f17, heightSpacing, (android.graphics.Paint) null);
            }
            f17 += getWidthSpacing() + getIconWidth();
            i17++;
        }
    }

    public boolean i() {
        dl.b d17 = ((l45.n) getPresenter()).d(getCurFeatureType());
        if (d17 == null) {
            return false;
        }
        return d17.o();
    }

    public boolean j(int i17) {
        int ordinal = f(i17).ordinal();
        if (ordinal == 1) {
            return true;
        }
        if (ordinal == 2 || ordinal != 3) {
        }
        return false;
    }

    public void k(int i17, int i18) {
        if (f(this.f242047q).ordinal() != 1 || this.f242051u == null) {
            return;
        }
        int i19 = 0;
        while (true) {
            android.graphics.Rect[] rectArr = this.f242051u;
            if (i19 >= rectArr.length) {
                return;
            }
            if (rectArr[i19].contains(i17, i18)) {
                this.B = i19;
                this.C = false;
                return;
            }
            i19++;
        }
    }

    public void l(int i17, int i18) {
        if (f(this.f242047q).ordinal() != 1) {
            return;
        }
        int i19 = 0;
        while (true) {
            android.graphics.Rect[] rectArr = this.f242051u;
            if (rectArr == null || i19 >= rectArr.length) {
                return;
            }
            if (rectArr[i19].contains(i17, i18) && i19 == this.B) {
                l45.n nVar = (l45.n) getPresenter();
                nVar.getClass();
                new l45.a(nVar).b(qk.g6.DOODLE, i19, null);
                return;
            }
            i19++;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0);
        h(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f480413x8);
        if (getDetailHeight() > 0) {
            dimension += getDetailHeight();
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(dimension, 1073741824));
        a();
    }

    public void setCurFeatureType(qk.g6 g6Var) {
        int i17 = 0;
        while (true) {
            if (i17 >= getFeatureCount()) {
                i17 = -1;
                break;
            } else if (((l45.n) getPresenter()).f316460a.getFeatures()[i17] == g6Var) {
                break;
            } else {
                i17++;
            }
        }
        if (j(i17)) {
            this.f242047q = i17;
        } else {
            this.f242047q = -1;
        }
        this.f242048r = i17;
        requestLayout();
        invalidate();
    }

    public void setFooterVisible(boolean z17) {
        if (z17) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477723k);
            loadAnimation.setAnimationListener(new dn5.a(this));
            startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477724l);
            loadAnimation2.setAnimationListener(new dn5.b(this));
            startAnimation(loadAnimation2);
        }
    }

    public void setHideFooter(boolean z17) {
        this.f242056z = z17;
    }
}
