package ed5;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f251367a;

    /* renamed from: b, reason: collision with root package name */
    public android.animation.AnimatorSet f251368b;

    /* renamed from: c, reason: collision with root package name */
    public ed5.b f251369c;

    /* renamed from: d, reason: collision with root package name */
    public ed5.c f251370d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.v2 f251371e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f251372f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f251373g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewOverlay f251374h;

    public m(androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f251367a = recyclerView;
    }

    public static final void a(ed5.m mVar) {
        android.animation.AnimatorSet animatorSet = mVar.f251368b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        mVar.f251368b = null;
        ed5.b bVar = mVar.f251369c;
        if (bVar == null) {
            mVar.c();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(bVar.f251347k, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new ed5.k(bVar));
        ofFloat.addListener(new ed5.l(mVar));
        ofFloat.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i17) {
        android.view.View findViewByPosition;
        android.view.Window window;
        android.view.View decorView;
        android.view.ViewOverlay overlay;
        android.graphics.Bitmap bitmap;
        android.animation.AnimatorSet animatorSet = this.f251368b;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f251368b = null;
        c();
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f251367a;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (findViewByPosition = layoutManager.findViewByPosition(i17)) != null && findViewByPosition.getWidth() > 0 && findViewByPosition.getHeight() > 0) {
            android.content.Context context = recyclerView.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (overlay = decorView.getOverlay()) == null) {
                return;
            }
            this.f251373g = findViewByPosition;
            this.f251374h = overlay;
            if (findViewByPosition.getWidth() > 0 && findViewByPosition.getHeight() > 0) {
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    int width = findViewByPosition.getWidth();
                    int height = findViewByPosition.getHeight();
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(height));
                    arrayList.add(java.lang.Integer.valueOf(width));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "captureViewBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "captureViewBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                    findViewByPosition.draw(new android.graphics.Canvas(createBitmap));
                    bitmap = kotlin.Result.m521constructorimpl(createBitmap);
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    bitmap = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                r2 = kotlin.Result.m527isFailureimpl(bitmap) ? null : bitmap;
            }
            android.graphics.Bitmap bitmap2 = r2;
            if (bitmap2 == null) {
                return;
            }
            int[] iArr = new int[2];
            findViewByPosition.getLocationInWindow(iArr);
            int i18 = iArr[0];
            int i19 = iArr[1];
            int width2 = findViewByPosition.getWidth();
            int height2 = findViewByPosition.getHeight();
            int width3 = activity.getWindow().getDecorView().getWidth();
            int height3 = activity.getWindow().getDecorView().getHeight();
            float f17 = (width2 * 0.20000005f) / 2.0f;
            float f18 = (height2 * 0.20000005f) / 2.0f;
            float f19 = 1.0f;
            float f27 = ((float) i18) < f17 ? 0.0f : ((float) ((width3 - i18) - width2)) < f17 ? 1.0f : 0.5f;
            if (i19 < f18) {
                f19 = 0.0f;
            } else if ((height3 - i19) - height2 >= f18) {
                f19 = 0.5f;
            }
            ed5.b bVar = new ed5.b(bitmap2, i18, i19, width2, height2, java.lang.Float.valueOf(f27).floatValue(), java.lang.Float.valueOf(f19).floatValue());
            this.f251369c = bVar;
            overlay.add(bVar);
            ed5.c cVar = new ed5.c(bVar);
            this.f251370d = cVar;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewByPosition, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "animate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewByPosition.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewByPosition, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "animate", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 1.2f);
            ofFloat.setDuration(150L);
            ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat.addUpdateListener(new ed5.j(bVar));
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(1500L);
            android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat3.setDuration(1000L);
            ofFloat3.addUpdateListener(new ed5.g(cVar, overlay));
            ofFloat3.addListener(new ed5.h(cVar, overlay));
            android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(1.2f, 1.0f);
            ofFloat4.setDuration(150L);
            ofFloat4.setInterpolator(new android.view.animation.DecelerateInterpolator());
            ofFloat4.addUpdateListener(new ed5.i(bVar));
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.play(ofFloat).before(ofFloat2);
            animatorSet2.play(ofFloat2).with(ofFloat3);
            animatorSet2.play(ofFloat2).before(ofFloat4);
            animatorSet2.addListener(new ed5.d(this));
            animatorSet2.start();
            this.f251368b = animatorSet2;
            ed5.e eVar = new ed5.e(this);
            recyclerView.P(eVar);
            this.f251371e = eVar;
            ed5.f fVar = new ed5.f(this);
            recyclerView.i(fVar);
            this.f251372f = fVar;
        }
    }

    public final void c() {
        android.view.ViewOverlay viewOverlay = this.f251374h;
        ed5.c cVar = this.f251370d;
        if (cVar != null && cVar.f251350c) {
            if (viewOverlay != null) {
                viewOverlay.remove(cVar);
            }
            cVar.f251350c = false;
        }
        this.f251370d = null;
        ed5.b bVar = this.f251369c;
        if (bVar != null) {
            if (viewOverlay != null) {
                viewOverlay.remove(bVar);
            }
            android.graphics.Bitmap bitmap = bVar.f251337a;
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        this.f251369c = null;
        this.f251374h = null;
        android.view.View view = this.f251373g;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "cleanup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryLocateHighlightAnimator", "cleanup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationZ(0.0f);
        }
        this.f251373g = null;
        androidx.recyclerview.widget.v2 v2Var = this.f251371e;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f251367a;
        if (v2Var != null) {
            recyclerView.U0(v2Var);
        }
        this.f251371e = null;
        androidx.recyclerview.widget.w2 w2Var = this.f251372f;
        if (w2Var != null) {
            recyclerView.V0(w2Var);
        }
        this.f251372f = null;
    }
}
