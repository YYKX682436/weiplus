package db5;

/* loaded from: classes15.dex */
public interface f0 {
    void a(float f17, float f18, float f19);

    float b(float f17, float f18);

    void c(float f17, float f18);

    void d(float f17, float f18);

    void e(boolean z17);

    void f();

    boolean g();

    float getDoubleTabScale();

    int getImageHeight();

    android.graphics.Matrix getImageMatrix();

    android.graphics.PointF getImageViewMatrixScale();

    android.graphics.PointF getImageViewMatrixTranslation();

    int getImageWidth();

    float getScale();

    float getScaleRate();

    void h();

    void i();

    boolean j();

    android.graphics.PointF l(android.graphics.PointF pointF, int i17, int i18);

    android.graphics.PointF m(android.graphics.PointF pointF);

    void n(float f17, boolean z17);

    void o();

    void p(float f17, float f18, float f19);

    void r(int i17, int i18);

    void setAnimationScale(float f17);

    void setBitmapPlaceHolder(android.graphics.Bitmap bitmap);

    void setCanRefresh(boolean z17);

    void setCustomScaleRate(java.lang.Float f17);

    void setImageViewMatrix(android.graphics.Matrix matrix);

    void setMaxZoomLimit(float f17);

    void setOnZoomScaleChangedListener(db5.e0 e0Var);
}
