package lz3;

/* loaded from: classes15.dex */
public abstract class b implements lz3.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f322365a;

    /* renamed from: b, reason: collision with root package name */
    public lz3.c f322366b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lz3.e
    public void e(lz3.c animationInfo) {
        kotlin.jvm.internal.o.g(animationInfo, "animationInfo");
        this.f322366b = animationInfo;
        android.view.View view = animationInfo.f322367a;
        this.f322365a = view;
        if (view instanceof db5.f0) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            db5.f0 f0Var = (db5.f0) view;
            android.graphics.PointF imageViewMatrixScale = f0Var.getImageViewMatrixScale();
            android.graphics.PointF imageViewMatrixTranslation = f0Var.getImageViewMatrixTranslation();
            lz3.d dVar = animationInfo.f322371e;
            dVar.f322373a.set(imageViewMatrixScale != null ? imageViewMatrixScale.x : 1.0f, imageViewMatrixScale != null ? imageViewMatrixScale.y : 1.0f);
            dVar.f322374b.set(imageViewMatrixTranslation != null ? imageViewMatrixTranslation.x : 0.0f, imageViewMatrixTranslation != null ? imageViewMatrixTranslation.y : 0.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseOCRImageAnimator", "onShowStart start scale: %s, translation: %s", dVar.f322373a, dVar.f322374b);
            int imageWidth = f0Var.getImageWidth();
            int imageHeight = f0Var.getImageHeight();
            android.graphics.PointF pointF = animationInfo.f322370d;
            float f17 = pointF.x;
            float f18 = pointF.y;
            float f19 = imageWidth;
            float f27 = imageHeight;
            float f28 = (f19 * 1.0f) / f27;
            float f29 = f17 * 1.0f;
            float f37 = f29 / f18;
            lz3.d dVar2 = animationInfo.f322372f;
            if (f28 > f37) {
                animationInfo.f322368b = false;
                android.graphics.PointF pointF2 = dVar2.f322373a;
                float f38 = f29 / f19;
                pointF2.x = f38;
                pointF2.y = f38;
                android.graphics.PointF pointF3 = dVar2.f322374b;
                pointF3.x = 0.0f;
                pointF3.y = (f18 - (f38 * f27)) / 2.0f;
            } else {
                animationInfo.f322368b = true;
                android.graphics.PointF pointF4 = dVar2.f322373a;
                float f39 = (f18 * 1.0f) / f27;
                pointF4.x = f39;
                pointF4.y = f39;
                android.graphics.PointF pointF5 = dVar2.f322374b;
                pointF5.x = (f17 - (f39 * f19)) / 2.0f;
                pointF5.y = 0.0f;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseOCRImageAnimator", "onShowStart target scale: %s, translation: %s, isLongImage: %b", dVar2.f322373a, dVar2.f322374b, java.lang.Boolean.valueOf(animationInfo.f322368b));
        }
    }
}
