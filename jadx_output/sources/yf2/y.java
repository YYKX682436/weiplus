package yf2;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.z f461816d;

    public y(yf2.z zVar) {
        this.f461816d = zVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostButtonController$setupClickListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        yf2.z zVar = this.f461816d;
        if (zVar.f461823p) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostButtonController$setupClickListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            android.widget.TextView textView = zVar.f461821n;
            if (textView != null) {
                textView.setAlpha(0.7f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = zVar.f461822o;
            if (weImageView != null) {
                weImageView.setAlpha(0.7f);
            }
        } else if (action == 1 || action == 3) {
            android.widget.TextView textView2 = zVar.f461821n;
            if (textView2 != null) {
                textView2.setAlpha(1.0f);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = zVar.f461822o;
            if (weImageView2 != null) {
                weImageView2.setAlpha(1.0f);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLivePostButtonController$setupClickListeners$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
