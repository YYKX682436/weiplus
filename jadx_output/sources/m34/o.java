package m34;

/* loaded from: classes15.dex */
public class o implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar f323367d;

    public o(com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar) {
        this.f323367d = snsAdNativeLandingPagesVideoPlayerLoadingBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int currentTimeByBarPoint;
        int currentTimeByBarPoint2;
        int barLen;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar = this.f323367d;
        if (action == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "ontouch down");
            snsAdNativeLandingPagesVideoPlayerLoadingBar.f162500q = false;
            snsAdNativeLandingPagesVideoPlayerLoadingBar.f162501r = motionEvent.getX();
            m34.e eVar = snsAdNativeLandingPagesVideoPlayerLoadingBar.f162490d;
            if (eVar != null) {
                eVar.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.getLayoutParams();
            layoutParams.leftMargin = com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(snsAdNativeLandingPagesVideoPlayerLoadingBar, layoutParams.leftMargin + ((int) (x17 - snsAdNativeLandingPagesVideoPlayerLoadingBar.f162501r)));
            snsAdNativeLandingPagesVideoPlayerLoadingBar.f162494h.setLayoutParams(layoutParams);
            currentTimeByBarPoint2 = snsAdNativeLandingPagesVideoPlayerLoadingBar.getCurrentTimeByBarPoint();
            if (snsAdNativeLandingPagesVideoPlayerLoadingBar.f162498o > 0) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) snsAdNativeLandingPagesVideoPlayerLoadingBar.f162492f.getLayoutParams();
                barLen = snsAdNativeLandingPagesVideoPlayerLoadingBar.getBarLen();
                layoutParams2.width = (int) (((currentTimeByBarPoint2 * 1.0d) / snsAdNativeLandingPagesVideoPlayerLoadingBar.f162498o) * barLen);
                snsAdNativeLandingPagesVideoPlayerLoadingBar.f162492f.setLayoutParams(layoutParams2);
            }
            snsAdNativeLandingPagesVideoPlayerLoadingBar.f162496m.setText(snsAdNativeLandingPagesVideoPlayerLoadingBar.f(currentTimeByBarPoint2 / 60) + ":" + snsAdNativeLandingPagesVideoPlayerLoadingBar.f(currentTimeByBarPoint2 % 60));
            snsAdNativeLandingPagesVideoPlayerLoadingBar.f162500q = true;
        } else if (snsAdNativeLandingPagesVideoPlayerLoadingBar.f162500q) {
            currentTimeByBarPoint = snsAdNativeLandingPagesVideoPlayerLoadingBar.getCurrentTimeByBarPoint();
            if (snsAdNativeLandingPagesVideoPlayerLoadingBar.f162490d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "current time : " + currentTimeByBarPoint);
                snsAdNativeLandingPagesVideoPlayerLoadingBar.f162490d.a(currentTimeByBarPoint);
            }
            snsAdNativeLandingPagesVideoPlayerLoadingBar.f162500q = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sight/decode/ui/SnsAdNativeLandingPagesVideoPlayerLoadingBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
