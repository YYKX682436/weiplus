package com.tencent.mm.view.footer;

/* loaded from: classes10.dex */
public class SelectColorBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public float f213592d;

    /* renamed from: e, reason: collision with root package name */
    public final float f213593e;

    /* renamed from: f, reason: collision with root package name */
    public final float f213594f;

    /* renamed from: g, reason: collision with root package name */
    public final float f213595g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect[] f213596h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f213597i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint f213598m;

    /* renamed from: n, reason: collision with root package name */
    public dn5.f f213599n;

    /* renamed from: o, reason: collision with root package name */
    public final int f213600o;

    /* renamed from: p, reason: collision with root package name */
    public int f213601p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f213602q;

    public SelectColorBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213592d = getResources().getDimension(com.tencent.mm.R.dimen.f480410x5);
        this.f213593e = getResources().getDimension(com.tencent.mm.R.dimen.f480312u9);
        this.f213594f = 5.0f;
        this.f213595g = 6.0f;
        this.f213597i = new int[]{-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092, -7054596, -449092};
        this.f213600o = 0;
        this.f213601p = -1;
        this.f213602q = true;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i25.a.f288086a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f213597i = obtainStyledAttributes.getResources().getIntArray(resourceId);
        }
        this.f213600o = obtainStyledAttributes.getInt(1, 0);
        this.f213593e = obtainStyledAttributes.getDimension(3, getResources().getDimension(com.tencent.mm.R.dimen.f480312u9));
        this.f213592d = obtainStyledAttributes.getDimension(2, getResources().getDimension(com.tencent.mm.R.dimen.f480410x5));
        this.f213594f = obtainStyledAttributes.getDimension(5, 5.0f);
        this.f213595g = obtainStyledAttributes.getDimension(4, 6.0f);
        obtainStyledAttributes.recycle();
        new android.graphics.Paint(1).setColor(-16711936);
        this.f213596h = new android.graphics.Rect[this.f213597i.length];
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f213598m = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f213598m.setStrokeCap(android.graphics.Paint.Cap.ROUND);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        dn5.f fVar;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        int i17 = 0;
        if (action == 0) {
            while (true) {
                android.graphics.Rect[] rectArr = this.f213596h;
                if (i17 >= rectArr.length) {
                    break;
                }
                if (rectArr[i17].contains(x17, y17)) {
                    this.f213601p = i17;
                    break;
                }
                i17++;
            }
        } else if (action == 1 || action == 3) {
            while (true) {
                android.graphics.Rect[] rectArr2 = this.f213596h;
                if (rectArr2 == null || i17 >= rectArr2.length) {
                    break;
                }
                if (rectArr2[i17].contains(x17, y17) && i17 == this.f213601p && (fVar = this.f213599n) != null) {
                    fVar.a(this.f213597i[i17]);
                    break;
                }
                i17++;
            }
            requestLayout();
            postInvalidate();
        }
        return true;
    }

    public int getCurColor() {
        int i17 = this.f213601p;
        int[] iArr = this.f213597i;
        return i17 == -1 ? iArr[2] : iArr[i17];
    }

    public int getDetailHeight() {
        return (int) getResources().getDimension(com.tencent.mm.R.dimen.f480251sk);
    }

    public int getPaddingLeftAndRight() {
        return (int) (this.f213592d * 2.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            super.onDraw(r17)
            r2 = 0
            r1.drawColor(r2)
            int r3 = r16.getMeasuredWidth()
            int r4 = r16.getPaddingLeftAndRight()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r4 = r0.f213593e
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r4 * r5
            int[] r7 = r0.f213597i
            int r8 = r7.length
            float r8 = (float) r8
            float r8 = r8 * r6
            float r3 = r3 - r8
            int r8 = r7.length
            r9 = 1
            int r8 = r8 - r9
            float r8 = (float) r8
            float r3 = r3 / r8
            int r8 = r16.getPaddingLeftAndRight()
            r10 = 2
            int r8 = r8 / r10
            float r8 = (float) r8
            float r8 = r8 + r4
            float r11 = r0.f213594f
            float r8 = r8 + r11
            int r12 = r16.getDetailHeight()
            float r12 = (float) r12
            r13 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r13
            float r12 = r12 / r5
            r5 = r2
        L3b:
            int r13 = r7.length
            if (r5 >= r13) goto L78
            int r13 = r0.f213601p
            r14 = 0
            if (r13 != r5) goto L46
            r0.f213602q = r2
            goto L4c
        L46:
            boolean r13 = r0.f213602q
            if (r13 == 0) goto L4f
            if (r5 != r10) goto L4f
        L4c:
            float r13 = r0.f213595g
            goto L50
        L4f:
            r13 = r14
        L50:
            android.graphics.Paint r15 = r0.f213598m
            r2 = -1
            r15.setColor(r2)
            float r2 = r4 + r11
            float r2 = r2 + r13
            android.graphics.Paint r15 = r0.f213598m
            r1.drawCircle(r8, r12, r2, r15)
            android.graphics.Paint r2 = r0.f213598m
            r15 = r7[r5]
            r2.setColor(r15)
            int r2 = r0.f213600o
            if (r2 != r9) goto L6a
            goto L6b
        L6a:
            r14 = r13
        L6b:
            float r14 = r14 + r4
            android.graphics.Paint r2 = r0.f213598m
            r1.drawCircle(r8, r12, r14, r2)
            float r2 = r6 + r3
            float r8 = r8 + r2
            int r5 = r5 + 1
            r2 = 0
            goto L3b
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.footer.SelectColorBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        float f17 = this.f213593e;
        int[] iArr = this.f213597i;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(this.f213600o == 1 ? (int) ((this.f213592d * (iArr.length - 1)) + (f17 * 2.0f * iArr.length) + getPaddingLeftAndRight()) : (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((int) getResources().getDimension(com.tencent.mm.R.dimen.f480251sk), 1073741824));
        if (this.f213596h == null) {
            this.f213596h = new android.graphics.Rect[iArr.length];
        }
        float f18 = 2.0f * f17;
        float measuredWidth = ((getMeasuredWidth() - getPaddingLeftAndRight()) - (iArr.length * f18)) / (iArr.length - 1);
        int i19 = (int) f18;
        int paddingLeftAndRight = (int) ((getPaddingLeftAndRight() / 2) + f17 + this.f213594f);
        int detailHeight = getDetailHeight() / 2;
        for (int i27 = 0; i27 < iArr.length; i27++) {
            this.f213596h[i27] = new android.graphics.Rect(paddingLeftAndRight - i19, detailHeight - i19, paddingLeftAndRight + i19, detailHeight + i19);
            paddingLeftAndRight = (int) (paddingLeftAndRight + f18 + measuredWidth);
        }
    }

    public void setItemPadding(float f17) {
        this.f213592d = f17;
    }

    public void setSelectColor(int i17) {
        int i18 = 0;
        while (true) {
            int[] iArr = this.f213597i;
            if (i18 >= iArr.length) {
                break;
            }
            if (iArr[i18] == i17) {
                this.f213601p = i18;
                break;
            }
            i18++;
        }
        this.f213602q = false;
        postInvalidate();
    }

    public void setSelectColorListener(dn5.f fVar) {
        this.f213599n = fVar;
    }
}
