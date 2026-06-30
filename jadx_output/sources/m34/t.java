package m34;

/* loaded from: classes4.dex */
public class t implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323375d;

    public t(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323375d = videoPlayView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 1) {
            com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323375d;
            if (videoPlayView.f162520t.getVisibility() == 0) {
                videoPlayView.d();
            } else {
                videoPlayView.g();
            }
        } else {
            motionEvent.getAction();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sight/decode/ui/VideoPlayView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
