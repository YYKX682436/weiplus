package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class vj implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsInfoFlip f170693d;

    public vj(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        this.f170693d = snsInfoFlip;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsInfoFlip$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f170693d;
            if (com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip) instanceof android.view.View) {
                android.graphics.PointF c18 = e04.i3.c((android.view.View) com.tencent.mm.plugin.sns.ui.SnsInfoFlip.B(snsInfoFlip), motionEvent.getRawX(), motionEvent.getRawY());
                if (c18 != null) {
                    c17.i("key_basescanui_touch_normalize_x", java.lang.Float.valueOf(c18.x));
                    c17.i("key_basescanui_touch_normalize_y", java.lang.Float.valueOf(c18.y));
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoFlip", "get touchCoordinate is invalid");
                    c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
                    c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(motionEvent.getRawX()));
                    c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(motionEvent.getRawY()));
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$7");
        return false;
    }
}
