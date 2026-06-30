package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class t0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager f145913d;

    public t0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager) {
        this.f145913d = envelopeStoryVideoManager;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager envelopeStoryVideoManager = this.f145913d;
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = (com.tencent.mm.plugin.luckymoney.story.b1) ((java.util.HashMap) envelopeStoryVideoManager.f145808m).get(java.lang.Integer.valueOf(envelopeStoryVideoManager.f145803e));
        if (motionEvent.getActionMasked() != 0 || b1Var == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        b1Var.f145833m.getGlobalVisibleRect(rect);
        if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeStoryVideoManager", "the videoview are under actionbar ");
            b1Var.f145834n.callOnClick();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryVideoManager$8", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
