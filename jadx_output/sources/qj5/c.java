package qj5;

/* loaded from: classes5.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f363967d;

    public c(qj5.n nVar) {
        this.f363967d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View decorView;
        android.view.View decorView2;
        float f17;
        qj5.n nVar = this.f363967d;
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView = nVar.E2;
        if (zoomImageView == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        float width = zoomImageView.getWidth();
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView2 = nVar.E2;
        if (zoomImageView2 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        float height = zoomImageView2.getHeight();
        qj5.o oVar = nVar.f363983q2;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("containerDialog");
            throw null;
        }
        android.view.Window window = oVar.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        float width2 = decorView.getWidth();
        qj5.o oVar2 = nVar.f363983q2;
        if (oVar2 == null) {
            kotlin.jvm.internal.o.o("containerDialog");
            throw null;
        }
        android.view.Window window2 = oVar2.getWindow();
        if (window2 == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        float height2 = decorView2.getHeight();
        if (nVar.h()) {
            if (width > 0.0f) {
                f17 = width2 / width;
            }
            f17 = 0.0f;
        } else {
            if (height > 0.0f) {
                f17 = height2 / height;
            }
            f17 = 0.0f;
        }
        if (!((java.lang.Float.isInfinite(f17) || java.lang.Float.isNaN(f17)) ? false : true) || f17 <= 0.0f) {
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView3 = nVar.E2;
            if (zoomImageView3 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            zoomImageView3.setScaleX(1.0f);
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView4 = nVar.E2;
            if (zoomImageView4 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            zoomImageView4.setScaleY(1.0f);
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView5 = nVar.E2;
            if (zoomImageView5 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            zoomImageView5.setTranslationX(0.0f);
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView6 = nVar.E2;
            if (zoomImageView6 != null) {
                zoomImageView6.setTranslationY(0.0f);
                return;
            } else {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
        }
        float f18 = width / 2.0f;
        float f19 = height / 2.0f;
        float f27 = width2 / 2.0f;
        float f28 = height2 / 2.0f;
        if (nVar.h()) {
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView7 = nVar.E2;
            if (zoomImageView7 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            float f29 = f27 - f18;
            if (zoomImageView7 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = zoomImageView7.getLayoutParams();
            zoomImageView7.setTranslationX(f29 - ((layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.leftMargin : 0));
        } else {
            com.tencent.mm.zoomimage.ZoomImageView zoomImageView8 = nVar.E2;
            if (zoomImageView8 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            float f37 = f28 - f19;
            if (zoomImageView8 == null) {
                kotlin.jvm.internal.o.o("imageView");
                throw null;
            }
            zoomImageView8.setTranslationY(f37 - com.tencent.mm.ui.kk.b(zoomImageView8));
        }
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView9 = nVar.E2;
        if (zoomImageView9 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView9.setScaleX(f17);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView10 = nVar.E2;
        if (zoomImageView10 == null) {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
        zoomImageView10.setScaleY(f17);
        com.tencent.mm.zoomimage.ZoomImageView zoomImageView11 = nVar.E2;
        if (zoomImageView11 != null) {
            zoomImageView11.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(300L).setInterpolator(new android.view.animation.DecelerateInterpolator()).start();
        } else {
            kotlin.jvm.internal.o.o("imageView");
            throw null;
        }
    }
}
