package qs3;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366354d;

    public j(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366354d = radarMemberView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.Button confirmBtn;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366354d;
        confirmBtn = radarMemberView.getConfirmBtn();
        if (view != confirmBtn && motionEvent.getAction() == 1) {
            if (radarMemberView.getVisibility() == 0) {
                radarMemberView.c();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
