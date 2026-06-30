package z26;

/* loaded from: classes15.dex */
public class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ me.imid.swipebacklayout.lib.SwipeBackLayout f469829d;

    public c(me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout) {
        this.f469829d = swipeBackLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = this.f469829d;
        if (swipeBackLayout.f325888g == null) {
            return;
        }
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = swipeBackLayout.f325893o;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = swipeBackLayout.f325893o.iterator();
        while (it.hasNext()) {
            ((z26.e) it.next()).c(swipeBackLayout.f325888g, swipeBackLayout.f325891m + ((int) swipeBackLayout.C), swipeBackLayout.f325892n + ((int) floatValue));
        }
    }
}
