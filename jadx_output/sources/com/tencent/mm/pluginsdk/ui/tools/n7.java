package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public class n7 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar f191795d;

    public n7(com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar) {
        this.f191795d = videoPlayerSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = this.f191795d;
        if (action == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerSeekBar", "ontouch down");
            int i17 = com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar.D;
            videoPlayerSeekBar.f162483s = false;
            videoPlayerSeekBar.f162484t = motionEvent.getX();
            m34.e eVar = videoPlayerSeekBar.f162471d;
            if (eVar != null) {
                eVar.b();
            }
        } else if (motionEvent.getAction() == 2) {
            float x17 = motionEvent.getX();
            int i18 = com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar.D;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) videoPlayerSeekBar.f162475h.getLayoutParams();
            int s17 = com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar.s(videoPlayerSeekBar, layoutParams.leftMargin + ((int) (x17 - videoPlayerSeekBar.f162484t)), videoPlayerSeekBar.f191445y);
            layoutParams.leftMargin = s17;
            videoPlayerSeekBar.f162475h.setLayoutParams(layoutParams);
            int i19 = videoPlayerSeekBar.f191445y.value;
            if (videoPlayerSeekBar.f162479o > 0) {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) videoPlayerSeekBar.f162473f.getLayoutParams();
                layoutParams2.width = s17;
                videoPlayerSeekBar.f162473f.setLayoutParams(layoutParams2);
            }
            videoPlayerSeekBar.setPlayTimeText(i19);
            m34.e eVar2 = videoPlayerSeekBar.f162471d;
            if (eVar2 != null) {
                eVar2.d(i19);
            }
            videoPlayerSeekBar.f162483s = true;
        } else {
            int i27 = com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar.D;
            int i28 = videoPlayerSeekBar.f162480p;
            if (videoPlayerSeekBar.f162483s) {
                i28 = videoPlayerSeekBar.f191445y.value;
                videoPlayerSeekBar.f162480p = i28;
            }
            if (videoPlayerSeekBar.f162471d != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayerSeekBar", "current time : " + i28);
                videoPlayerSeekBar.f162471d.a(i28);
            }
            videoPlayerSeekBar.f162483s = false;
        }
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/tools/VideoPlayerSeekBar$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
