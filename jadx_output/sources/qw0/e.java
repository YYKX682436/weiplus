package qw0;

/* loaded from: classes3.dex */
public final class e implements hv0.j {

    /* renamed from: a, reason: collision with root package name */
    public float f367067a;

    @Override // hv0.j
    public void a(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(animView, "animView");
        kotlin.jvm.internal.o.g(backgroundView, "backgroundView");
        kotlin.jvm.internal.o.g(onTranslation, "onTranslation");
        kotlin.jvm.internal.o.g(end, "end");
        w9.c cVar = w9.c.f444039a;
        android.graphics.drawable.Drawable background = backgroundView.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        java.lang.Integer valueOf = colorDrawable != null ? java.lang.Integer.valueOf(colorDrawable.getColor()) : null;
        float f17 = this.f367067a;
        animView.animate().setInterpolator(new android.view.animation.AccelerateInterpolator(1.5f)).translationY(f17).withEndAction(new qw0.a(end)).setUpdateListener(new qw0.b(animView, valueOf, backgroundView, cVar, 0, onTranslation, f17)).setDuration(300L).start();
    }

    @Override // hv0.j
    public void b(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel panel, android.view.View animView, android.view.View backgroundView, yz5.p onTranslation, yz5.a end) {
        kotlin.jvm.internal.o.g(panel, "panel");
        kotlin.jvm.internal.o.g(animView, "animView");
        kotlin.jvm.internal.o.g(backgroundView, "backgroundView");
        kotlin.jvm.internal.o.g(onTranslation, "onTranslation");
        kotlin.jvm.internal.o.g(end, "end");
        w9.c cVar = w9.c.f444039a;
        android.graphics.drawable.Drawable background = backgroundView.getBackground();
        android.graphics.drawable.ColorDrawable colorDrawable = background instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) background : null;
        java.lang.Integer valueOf = colorDrawable != null ? java.lang.Integer.valueOf(colorDrawable.getColor()) : null;
        float panelHeight = panel.getPanelHeight();
        if (this.f367067a == 0.0f) {
            this.f367067a = panelHeight;
        }
        float f17 = panelHeight - this.f367067a;
        animView.setTranslationY(panelHeight);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(animView, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/anim/ComposingAddTitlePanelAnimation", "startOpenAnimation", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(animView, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/anim/ComposingAddTitlePanelAnimation", "startOpenAnimation", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel;Landroid/view/View;Landroid/view/View;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        animView.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(f17).alpha(1.0f).withEndAction(new qw0.c(end)).setUpdateListener(new qw0.d(valueOf, backgroundView, cVar, 0, onTranslation, panelHeight)).setDuration(300L).start();
    }
}
