package la;

/* loaded from: classes15.dex */
public class c extends android.graphics.drawable.Drawable {

    /* renamed from: m, reason: collision with root package name */
    public final la.h f317430m;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.PorterDuffColorFilter f317439v;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f317418a = new android.graphics.Paint();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Matrix[] f317419b = new android.graphics.Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Matrix[] f317420c = new android.graphics.Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final la.g[] f317421d = new la.g[4];

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Matrix f317422e = new android.graphics.Matrix();

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f317423f = new android.graphics.Path();

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.PointF f317424g = new android.graphics.PointF();

    /* renamed from: h, reason: collision with root package name */
    public final la.g f317425h = new la.g();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Region f317426i = new android.graphics.Region();

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Region f317427j = new android.graphics.Region();

    /* renamed from: k, reason: collision with root package name */
    public final float[] f317428k = new float[2];

    /* renamed from: l, reason: collision with root package name */
    public final float[] f317429l = new float[2];

    /* renamed from: n, reason: collision with root package name */
    public boolean f317431n = false;

    /* renamed from: o, reason: collision with root package name */
    public float f317432o = 1.0f;

    /* renamed from: p, reason: collision with root package name */
    public int f317433p = -16777216;

    /* renamed from: q, reason: collision with root package name */
    public final int f317434q = 5;

    /* renamed from: r, reason: collision with root package name */
    public final int f317435r = 10;

    /* renamed from: s, reason: collision with root package name */
    public int f317436s = 255;

    /* renamed from: t, reason: collision with root package name */
    public final float f317437t = 1.0f;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Paint.Style f317438u = android.graphics.Paint.Style.FILL_AND_STROKE;

    /* renamed from: w, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f317440w = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: x, reason: collision with root package name */
    public android.content.res.ColorStateList f317441x = null;

    public c(la.h hVar) {
        this.f317430m = null;
        this.f317430m = hVar;
        for (int i17 = 0; i17 < 4; i17++) {
            this.f317419b[i17] = new android.graphics.Matrix();
            this.f317420c[i17] = new android.graphics.Matrix();
            this.f317421d[i17] = new la.g();
        }
    }

    public final float a(int i17, int i18, int i19) {
        int i27 = (i17 + 1) % 4;
        android.graphics.PointF pointF = this.f317424g;
        b(i17, i18, i19, pointF);
        float f17 = pointF.x;
        float f18 = pointF.y;
        b(i27, i18, i19, pointF);
        return (float) java.lang.Math.atan2(pointF.y - f18, pointF.x - f17);
    }

    public final void b(int i17, int i18, int i19, android.graphics.PointF pointF) {
        if (i17 == 1) {
            pointF.set(i18, 0.0f);
            return;
        }
        if (i17 == 2) {
            pointF.set(i18, i19);
        } else if (i17 != 3) {
            pointF.set(0.0f, 0.0f);
        } else {
            pointF.set(0.0f, i19);
        }
    }

    public final void c(int i17, int i18, android.graphics.Path path) {
        int i19;
        android.graphics.Matrix[] matrixArr;
        float[] fArr;
        android.graphics.Matrix[] matrixArr2;
        la.g[] gVarArr;
        android.graphics.Path path2;
        android.graphics.Path path3;
        la.h hVar;
        path.rewind();
        la.h hVar2 = this.f317430m;
        if (hVar2 == null) {
            path2 = path;
        } else {
            int i27 = 0;
            while (true) {
                matrixArr = this.f317420c;
                fArr = this.f317428k;
                matrixArr2 = this.f317419b;
                gVarArr = this.f317421d;
                if (i27 >= 4) {
                    break;
                }
                android.graphics.PointF pointF = this.f317424g;
                b(i27, i17, i18, pointF);
                int i28 = ((i27 - 1) + 4) % 4;
                b(i28, i17, i18, pointF);
                float f17 = pointF.x;
                float f18 = pointF.y;
                int i29 = i27 + 1;
                b(i29 % 4, i17, i18, pointF);
                float f19 = pointF.x;
                float f27 = pointF.y;
                b(i27, i17, i18, pointF);
                la.h hVar3 = hVar2;
                float f28 = pointF.x;
                float f29 = pointF.y;
                java.lang.Math.atan2(f18 - f29, f17 - f28);
                java.lang.Math.atan2(f27 - f29, f19 - f28);
                la.g gVar = gVarArr[i27];
                float a17 = a(i28, i17, i18) + 1.5707964f;
                matrixArr2[i27].reset();
                matrixArr2[i27].setTranslate(pointF.x, pointF.y);
                matrixArr2[i27].preRotate((float) java.lang.Math.toDegrees(a17));
                la.g gVar2 = gVarArr[i27];
                fArr[0] = gVar2.f317454c;
                fArr[1] = gVar2.f317455d;
                matrixArr2[i27].mapPoints(fArr);
                float a18 = a(i27, i17, i18);
                matrixArr[i27].reset();
                matrixArr[i27].setTranslate(fArr[0], fArr[1]);
                matrixArr[i27].preRotate((float) java.lang.Math.toDegrees(a18));
                i27 = i29;
                hVar2 = hVar3;
            }
            la.h hVar4 = hVar2;
            int i37 = 0;
            for (i19 = 4; i37 < i19; i19 = 4) {
                la.g gVar3 = gVarArr[i37];
                fArr[0] = gVar3.f317452a;
                fArr[1] = gVar3.f317453b;
                matrixArr2[i37].mapPoints(fArr);
                if (i37 == 0) {
                    float f37 = fArr[0];
                    float f38 = fArr[1];
                    path3 = path;
                    path3.moveTo(f37, f38);
                } else {
                    path3 = path;
                    path3.lineTo(fArr[0], fArr[1]);
                }
                la.g gVar4 = gVarArr[i37];
                android.graphics.Matrix matrix = matrixArr2[i37];
                java.util.ArrayList arrayList = (java.util.ArrayList) gVar4.f317456e;
                int size = arrayList.size();
                for (int i38 = 0; i38 < size; i38++) {
                    ((la.f) arrayList.get(i38)).a(matrix, path3);
                }
                int i39 = i37 + 1;
                int i47 = i39 % 4;
                la.g gVar5 = gVarArr[i37];
                fArr[0] = gVar5.f317454c;
                fArr[1] = gVar5.f317455d;
                matrixArr2[i37].mapPoints(fArr);
                la.g gVar6 = gVarArr[i47];
                float f39 = gVar6.f317452a;
                float[] fArr2 = this.f317429l;
                fArr2[0] = f39;
                fArr2[1] = gVar6.f317453b;
                matrixArr2[i47].mapPoints(fArr2);
                float hypot = (float) java.lang.Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1]);
                la.g gVar7 = this.f317425h;
                gVar7.f317452a = 0.0f;
                gVar7.f317453b = 0.0f;
                gVar7.f317454c = 0.0f;
                gVar7.f317455d = 0.0f;
                ((java.util.ArrayList) gVar7.f317456e).clear();
                la.b bVar = la.h.f317457b;
                if (i37 == 1 || i37 == 2 || i37 == 3) {
                    hVar = hVar4;
                } else {
                    hVar = hVar4;
                    bVar = hVar.f317458a;
                }
                bVar.a(hypot, this.f317432o, gVar7);
                android.graphics.Matrix matrix2 = matrixArr[i37];
                java.util.ArrayList arrayList2 = (java.util.ArrayList) gVar7.f317456e;
                int size2 = arrayList2.size();
                for (int i48 = 0; i48 < size2; i48++) {
                    ((la.f) arrayList2.get(i48)).a(matrix2, path3);
                }
                i37 = i39;
                hVar4 = hVar;
            }
            path2 = path;
            path.close();
        }
        float f47 = this.f317437t;
        if (f47 == 1.0f) {
            return;
        }
        android.graphics.Matrix matrix3 = this.f317422e;
        matrix3.reset();
        matrix3.setScale(f47, f47, i17 / 2, i18 / 2);
        path2.transform(matrix3);
    }

    public final void d() {
        android.content.res.ColorStateList colorStateList = this.f317441x;
        if (colorStateList == null || this.f317440w == null) {
            this.f317439v = null;
        } else {
            this.f317439v = new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.f317440w);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = this.f317418a;
        paint.setColorFilter(this.f317439v);
        int alpha = paint.getAlpha();
        int i17 = this.f317436s;
        paint.setAlpha(((i17 + (i17 >>> 7)) * alpha) >>> 8);
        paint.setStrokeWidth(0.0f);
        paint.setStyle(this.f317438u);
        int i18 = this.f317434q;
        if (i18 > 0 && this.f317431n) {
            paint.setShadowLayer(this.f317435r, 0.0f, i18, this.f317433p);
        }
        if (this.f317430m != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            android.graphics.Path path = this.f317423f;
            c(width, height, path);
            canvas.drawPath(path, paint);
        } else {
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
        }
        paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        android.graphics.Rect bounds = getBounds();
        android.graphics.Region region = this.f317426i;
        region.set(bounds);
        int width = bounds.width();
        int height = bounds.height();
        android.graphics.Path path = this.f317423f;
        c(width, height, path);
        android.graphics.Region region2 = this.f317427j;
        region2.setPath(path, region);
        region.op(region2, android.graphics.Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f317436s = i17;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f317418a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i17) {
        setTintList(android.content.res.ColorStateList.valueOf(i17));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.f317441x = colorStateList;
        d();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f317440w = mode;
        d();
        invalidateSelf();
    }
}
