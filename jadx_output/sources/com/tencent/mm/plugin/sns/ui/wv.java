package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wv implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI f171465d;

    public wv(com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f171465d = snsWsFoldDetailUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI snsWsFoldDetailUI = this.f171465d;
        if (actionMasked == 0) {
            int i17 = com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            com.tencent.mm.plugin.sns.ui.l1 l1Var = snsWsFoldDetailUI.f167628h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            l1Var.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            com.tencent.mm.plugin.sns.ui.l1 l1Var2 = snsWsFoldDetailUI.f167628h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            com.tencent.mm.plugin.sns.ui.zx zxVar = l1Var2.f169712m;
            zxVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            if (zxVar.f171725f) {
                zxVar.f171725f = false;
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(zxVar.f171731l, 30L);
                zxVar.f171726g = 10;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        } else if (actionMasked == 1) {
            snsWsFoldDetailUI.a1();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        return false;
    }
}
