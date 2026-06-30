package yk0;

/* loaded from: classes10.dex */
public abstract class a extends xk0.f {
    public boolean A;
    public boolean B;
    public final int C;
    public final float[] D;
    public boolean E;
    public boolean F;

    public a(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, boolean z17, boolean z18) {
        super(context, matrix, str, rect, rect2);
        this.A = z17;
        this.B = z18;
        this.C = 25;
        this.D = new float[8];
    }

    public final float A() {
        android.graphics.Rect rect = this.f454954i;
        float min = (java.lang.Math.min(rect.width(), rect.height()) * 0.95f) / java.lang.Math.max(this.f454952g.getWidth(), this.f454952g.getHeight());
        float width = (rect.width() * 1.0f) / this.f454952g.getWidth();
        float height = (rect.height() * 1.0f) / this.f454952g.getHeight();
        if (width < height) {
            width = height;
        }
        return min > width ? width : min;
    }

    public final void B(float[] points, float f17, float f18) {
        float f19;
        float f27;
        float f28;
        float f29;
        kotlin.jvm.internal.o.g(points, "points");
        android.graphics.PointF pointF = this.f454955m;
        android.graphics.Bitmap bitmap = this.f454952g;
        int width = bitmap != null ? bitmap.getWidth() : 0;
        android.graphics.Bitmap bitmap2 = this.f454952g;
        int height = bitmap2 != null ? bitmap2.getHeight() : 0;
        float f37 = this.C / f17;
        float E = E();
        float f38 = E / f17;
        float f39 = 2 * f37;
        float f47 = (height + f39) * f17;
        if ((width + f39) * f17 < E) {
            float f48 = pointF.x;
            float f49 = f38 / 2.0f;
            f19 = f48 - f49;
            f27 = f48 + f49;
        } else {
            float f57 = pointF.x;
            float f58 = width / 2;
            f19 = (f57 - f58) - f37;
            f27 = f57 + f58 + f37;
        }
        if (f47 < E) {
            float f59 = pointF.y;
            float f66 = f38 / 2.0f;
            f28 = f59 - f66;
            f29 = f59 + f66;
        } else {
            float f67 = pointF.y;
            float f68 = height / 2;
            float f69 = f67 - f68;
            float f76 = f67 + f68 + f37;
            f28 = f69 - f37;
            f29 = f76;
        }
        F();
        points[0] = f19;
        points[1] = f28;
        points[2] = f27;
        points[3] = f28;
        points[4] = f19;
        points[5] = f29;
        points[6] = f27;
        points[7] = f29;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(f18, pointF.x, pointF.y);
        matrix.postScale(f17, f17, pointF.x, pointF.y);
        matrix.mapPoints(points);
    }

    public final jz5.l C(float[] floatArray) {
        kotlin.jvm.internal.o.g(floatArray, "floatArray");
        float f17 = Float.MAX_VALUE;
        float f18 = Float.MIN_VALUE;
        for (float f19 : floatArray) {
            if (f19 < f17) {
                f17 = f19;
            }
            if (f19 > f18) {
                f18 = f19;
            }
        }
        return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18));
    }

    public final int E() {
        return java.lang.Math.min(com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x / 3, this.f454954i.width() / 3);
    }

    public abstract java.lang.String F();

    public boolean G() {
        return true;
    }

    @Override // xk0.f
    public void g(float f17, float f18, float f19, int i17) {
        this.f454952g = p();
        this.f454962t = A();
        android.graphics.Rect rect = this.f454954i;
        this.f454963u = (rect.width() * 0.1f) / this.f454952g.getWidth();
        this.f454956n = i17;
        this.f454958p = f19;
        float z17 = z(this.f454957o);
        this.f454957o = z17;
        if (z17 < this.f454963u) {
            this.f454963u = z17;
        }
        com.tencent.mars.xlog.Log.i(F(), "commit bitmapSize:[" + this.f454952g.getWidth() + ',' + this.f454952g.getHeight() + "], xy:[" + f17 + ',' + f18 + "], MaxInteract:" + rect + ", mScale:" + this.f454957o + ", MAX_SCALE:" + this.f454962t + ", MIN_SCALE:" + this.f454963u + ", mInitScale=" + this.f454958p);
        v(f17, f18);
        this.E = false;
    }

    @Override // xk0.f
    public void h(float f17, float f18, int i17, float f19, int i18) {
        this.f454952g = p();
        this.f454962t = A();
        android.graphics.Rect rect = this.f454954i;
        this.f454963u = (rect.width() * 0.1f) / this.f454952g.getWidth();
        this.f454958p = 1.0f;
        this.f454956n = i17;
        this.f454957o = f19;
        float z17 = z(f19);
        if (z17 < this.f454963u) {
            this.f454963u = z17;
        }
        if (f19 < this.f454963u) {
            this.f454963u = f19;
        }
        com.tencent.mars.xlog.Log.i(F(), "commit bitmapSize:[" + this.f454952g.getWidth() + ',' + this.f454952g.getHeight() + "], xy:[" + f17 + ',' + f18 + "], MaxInteract:" + rect + ", mScale:" + f19 + ", MAX_SCALE:" + this.f454962t + ", MIN_SCALE:" + this.f454963u + ", safeInitCommitScale=" + z17 + ", mInitScale=" + this.f454958p);
        v(f17, f18);
        this.E = false;
    }

    @Override // xk0.f
    public void i(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (G()) {
            F();
            this.f454952g.hashCode();
            canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
            float f17 = this.f454962t;
            float f18 = this.f454957o;
            if (f17 < f18) {
                this.f454957o = f17;
            } else {
                float f19 = this.f454963u;
                if (f19 > f18) {
                    this.f454957o = f19;
                }
            }
            canvas.save();
            android.graphics.PointF pointF = this.f454955m;
            canvas.translate(pointF.x, pointF.y);
            canvas.rotate(this.f454956n);
            float f27 = this.f454957o;
            canvas.scale(f27, f27);
            canvas.setDensity(this.f454952g.getDensity());
            canvas.clipRect(((-this.f454952g.getWidth()) / 2) + 0.0f, ((-this.f454952g.getHeight()) / 2) + 0.0f, (this.f454952g.getWidth() / 2) - 0.0f, (this.f454952g.getHeight() / 2) - 0.0f);
            canvas.drawBitmap(this.f454952g, (-r0.getWidth()) / 2, (-this.f454952g.getHeight()) / 2, (android.graphics.Paint) null);
            canvas.restore();
            canvas.setDrawFilter(null);
        }
        if (this.F) {
            this.F = false;
        }
    }

    @Override // xk0.f
    public android.graphics.Bitmap j(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        return bitmap;
    }

    @Override // xk0.f
    public boolean k() {
        return this.B;
    }

    @Override // xk0.f
    public boolean l() {
        return this.A;
    }

    @Override // xk0.f
    public float m() {
        return 0.0f;
    }

    @Override // xk0.f
    public int n() {
        android.graphics.Bitmap bitmap = this.f454952g;
        return java.lang.Math.max(bitmap != null ? bitmap.getHeight() : 0, E());
    }

    @Override // xk0.f
    public int o() {
        android.graphics.Bitmap bitmap = this.f454952g;
        return java.lang.Math.max(bitmap != null ? bitmap.getWidth() : 0, E());
    }

    @Override // xk0.f
    public void r(android.graphics.Rect rect, boolean z17) {
        if (z17) {
            float f17 = this.f454957o;
            float f18 = this.f454956n;
            float[] fArr = this.D;
            B(fArr, f17, f18);
            if (rect != null) {
                if (fArr.length == 8) {
                    jz5.l C = C(new float[]{fArr[0], fArr[2], fArr[4], fArr[6]});
                    jz5.l C2 = C(new float[]{fArr[1], fArr[3], fArr[5], fArr[7]});
                    rect.left = (int) ((java.lang.Number) C.f302833d).floatValue();
                    rect.top = (int) ((java.lang.Number) C2.f302833d).floatValue();
                    rect.right = (int) ((java.lang.Number) C.f302834e).floatValue();
                    rect.bottom = (int) ((java.lang.Number) C2.f302834e).floatValue();
                    return;
                }
                return;
            }
            return;
        }
        float f19 = this.f454957o;
        float f27 = this.f454956n;
        if (rect != null) {
            android.graphics.PointF pointF = this.f454955m;
            android.graphics.Bitmap bitmap = this.f454952g;
            int width = bitmap != null ? bitmap.getWidth() : 0;
            android.graphics.Bitmap bitmap2 = this.f454952g;
            int height = bitmap2 != null ? bitmap2.getHeight() : 0;
            float f28 = pointF.x;
            float f29 = width / 2;
            float f37 = pointF.y;
            float f38 = height / 2;
            android.graphics.RectF rectF = new android.graphics.RectF(f28 - f29, f37 - f38, f28 + f29, f37 + f38);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.postRotate(f27, pointF.x, pointF.y);
            matrix.postScale(f19, f19, pointF.x, pointF.y);
            matrix.mapRect(rectF);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
        F();
        java.util.Objects.toString(rect);
    }

    @Override // xk0.f
    public void y(float f17, float f18, float f19, int i17) {
        int i18;
        int i19;
        float f27 = this.f454957o;
        int i27 = this.f454956n;
        super.y(f17, f18, f19, i17);
        F();
        android.graphics.PointF pointF = this.f454955m;
        float f28 = pointF.x;
        float f29 = pointF.y;
        android.graphics.Rect rect = this.f454954i;
        if (rect == null || kotlin.jvm.internal.o.b(this.f454953h, rect)) {
            return;
        }
        android.graphics.Rect rect2 = new android.graphics.Rect();
        r(rect2, false);
        rect2.set(java.lang.Math.min(rect2.left, rect2.right), java.lang.Math.min(rect2.top, rect2.bottom), java.lang.Math.max(rect2.left, rect2.right), java.lang.Math.max(rect2.top, rect2.bottom));
        if (rect.contains(rect2)) {
            return;
        }
        float f37 = -f18;
        float f38 = -f17;
        int i28 = rect2.top;
        int i29 = rect.top;
        if (i28 <= i29 || (i18 = rect2.bottom) >= (i19 = rect.bottom)) {
            if (rect2.left > rect.left && rect2.right < rect.right) {
                f38 = 0.0f;
            }
        } else if ((rect2.left <= rect.left || rect2.right >= rect.right) && i28 > i29 && i18 < i19) {
            f37 = 0.0f;
        }
        this.f454955m.offset(f38, f37);
        if (!(0.0f == f27)) {
            this.f454957o = f27;
        }
        this.f454956n = i27;
        F();
        float f39 = this.f454955m.x;
    }

    public float z(float f17) {
        int width = this.f454952g.getWidth();
        int i17 = this.C;
        int i18 = width + (i17 * 2);
        int height = this.f454952g.getHeight() + (i17 * 2);
        float width2 = this.f454954i.width() / 3.0f;
        return i18 > height ? width2 / i18 : width2 / height;
    }
}
