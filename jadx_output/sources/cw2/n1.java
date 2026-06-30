package cw2;

/* loaded from: classes2.dex */
public final class n1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f223879d;

    public n1(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout) {
        this.f223879d = finderFullSeekBarLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout newSeekBarLayout;
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout newSeekBarLayout2;
        int i17;
        com.tencent.mm.plugin.finder.video.seek.FinderSeekBar seeker;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i18 = com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.f130546x0;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f223879d;
        if ((finderFullSeekBarLayout.x() && !finderFullSeekBarLayout.isSeekMode) || finderFullSeekBarLayout.getRequestNotSeek()) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (finderFullSeekBarLayout.m(view, motionEvent)) {
            android.graphics.Rect rect = finderFullSeekBarLayout.U;
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), rect.top + (rect.height() / 2.0f), motionEvent.getMetaState());
            if (finderFullSeekBarLayout.getBeforeDragStyle() == -1) {
                newSeekBarLayout2 = finderFullSeekBarLayout.getNewSeekBarLayout();
                if ((newSeekBarLayout2 == null || (seeker = newSeekBarLayout2.getSeeker()) == null || seeker.getVisibility() != 0) ? false : true) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    i17 = (((java.lang.Number) t70Var.G1().r()).intValue() == 5 || ((java.lang.Number) t70Var.G1().r()).intValue() == 3) ? 3 : 2;
                } else {
                    i17 = 1;
                }
                finderFullSeekBarLayout.setBeforeDragStyle(i17);
            }
            android.content.Context context = finderFullSeekBarLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.o00) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.o00.class)).P6();
            newSeekBarLayout = finderFullSeekBarLayout.getNewSeekBarLayout();
            if (newSeekBarLayout != null) {
                kotlin.jvm.internal.o.d(obtain);
                newSeekBarLayout.C(obtain);
            }
            z17 = true;
        } else {
            finderFullSeekBarLayout.V = false;
            finderFullSeekBarLayout.setBeforeDragStyle(-1);
            z17 = false;
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            finderFullSeekBarLayout.V = false;
            finderFullSeekBarLayout.setBeforeDragStyle(-1);
            com.tencent.mm.plugin.finder.video.FinderInterceptHorizontalLinearLayout newSeekBarTouchArea = finderFullSeekBarLayout.getNewSeekBarTouchArea();
            if (newSeekBarTouchArea != null) {
                newSeekBarTouchArea.setHorizontalEvent(false);
            }
        }
        if (!finderFullSeekBarLayout.V) {
            finderFullSeekBarLayout.getParent().requestDisallowInterceptTouchEvent(false);
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/finder/video/FinderFullSeekBarLayout$enlargeSeekBarListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
