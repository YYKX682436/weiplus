package sj3;

/* loaded from: classes5.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.u1 f408703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f408704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f408705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f408706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408707h;

    public q1(sj3.u1 u1Var, android.graphics.Bitmap bitmap, int i17, int i18, java.lang.String str) {
        this.f408703d = u1Var;
        this.f408704e = bitmap;
        this.f408705f = i17;
        this.f408706g = i18;
        this.f408707h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        sj3.u1 u1Var = this.f408703d;
        android.widget.ImageView imageView = u1Var.f408758f;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
        }
        android.graphics.Bitmap bitmap = u1Var.f408770r;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            android.graphics.Bitmap bitmap2 = u1Var.f408770r;
            kotlin.jvm.internal.o.d(bitmap2);
            int height = bitmap2.getHeight();
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = u1Var.f408756d;
            kotlin.jvm.internal.o.d(videoView);
            int measuredWidth = videoView.getMeasuredWidth();
            int measuredHeight = videoView.getMeasuredHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(measuredHeight));
            arrayList.add(java.lang.Integer.valueOf(measuredWidth));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawPrevBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawPrevBitmap", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            int i17 = u1Var.f408771s;
            int i18 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
            if (i17 == 12) {
                matrix.setRotate(270.0f, width / 2.0f, height / 2.0f);
            } else if (i17 == 4) {
                matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
            }
            if (u1Var.f408772t == 16) {
                matrix.postScale(-1.0f, 1.0f);
                matrix.postTranslate(width, 0.0f);
            }
            matrix.postScale(canvas.getWidth() / height, canvas.getHeight() / width);
            android.graphics.Bitmap bitmap3 = u1Var.f408770r;
            kotlin.jvm.internal.o.d(bitmap3);
            canvas.drawBitmap(bitmap3, matrix, u1Var.f408766n);
            android.widget.ImageView imageView2 = u1Var.f408758f;
            if (imageView2 != null) {
                imageView2.setImageBitmap(createBitmap);
            }
        }
        android.widget.ImageView imageView3 = u1Var.f408758f;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        android.widget.ImageView imageView4 = u1Var.f408758f;
        if (imageView4 != null) {
            imageView4.clearAnimation();
        }
        android.widget.ImageView imageView5 = u1Var.f408758f;
        if (imageView5 == null || (animate = imageView5.animate()) == null || (duration = animate.setDuration(300L)) == null || (alpha = duration.alpha(0.0f)) == null) {
            return;
        }
        alpha.setListener(new sj3.p1(this.f408703d, this.f408704e, this.f408705f, this.f408706g, this.f408707h));
    }
}
