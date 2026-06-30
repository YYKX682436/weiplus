package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class hl implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsMsgUI f168520d;

    public hl(com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI) {
        this.f168520d = snsMsgUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = this.f168520d;
            snsMsgUI.hideVKB();
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.U6(snsMsgUI)[0] = (int) motionEvent.getRawX();
            com.tencent.mm.plugin.sns.ui.SnsMsgUI.U6(snsMsgUI)[1] = (int) motionEvent.getRawY();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$10", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$10");
        return false;
    }
}
