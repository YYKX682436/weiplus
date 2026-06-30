package df1;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar f229645d;

    public g(com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar videoPlayerSeekBar) {
        this.f229645d = videoPlayerSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar videoPlayerSeekBar = this.f229645d;
        if (action == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Video.VideoPlayerSeekBar", "ontouch down");
            videoPlayerSeekBar.f83639s = false;
            videoPlayerSeekBar.f83640t = motionEvent.getX();
            oe1.i1 i1Var = videoPlayerSeekBar.f83627d;
            if (i1Var != null) {
                i1Var.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) videoPlayerSeekBar.f83631h.getLayoutParams();
            int s17 = com.tencent.mm.plugin.appbrand.jsapi.video.progressbar.VideoPlayerSeekBar.s(videoPlayerSeekBar, layoutParams.leftMargin + ((int) (x17 - videoPlayerSeekBar.f83640t)), videoPlayerSeekBar.f83651y);
            layoutParams.leftMargin = s17;
            videoPlayerSeekBar.f83631h.setLayoutParams(layoutParams);
            int i17 = videoPlayerSeekBar.f83651y.value;
            if (videoPlayerSeekBar.f83635o > 0) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) videoPlayerSeekBar.f83629f.getLayoutParams();
                layoutParams2.width = s17;
                videoPlayerSeekBar.f83629f.setLayoutParams(layoutParams2);
            }
            videoPlayerSeekBar.f83633m.setText(videoPlayerSeekBar.p(i17 / 60) + ":" + videoPlayerSeekBar.p(i17 % 60));
            videoPlayerSeekBar.f83639s = true;
        } else {
            int i18 = videoPlayerSeekBar.f83636p;
            if (videoPlayerSeekBar.f83639s) {
                i18 = videoPlayerSeekBar.f83651y.value;
                videoPlayerSeekBar.f83636p = i18;
            }
            if (videoPlayerSeekBar.f83627d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Video.VideoPlayerSeekBar", "current time : " + i18);
                videoPlayerSeekBar.f83627d.a(i18);
            }
            videoPlayerSeekBar.f83639s = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/jsapi/video/progressbar/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
