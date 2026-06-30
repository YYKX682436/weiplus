package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class q1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.y1 f175070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f175071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow f175072f;

    public q1(com.tencent.mm.plugin.topstory.ui.home.y1 y1Var, android.graphics.Rect rect, com.tencent.mm.plugin.topstory.ui.widget.TopStoryTipsPopupWindow topStoryTipsPopupWindow) {
        this.f175070d = y1Var;
        this.f175071e = rect;
        this.f175072f = topStoryTipsPopupWindow;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/home/TopStoryTabBubbleUIC$doShowTips$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 4) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.graphics.Rect rect = this.f175071e;
            boolean contains = rect.contains(rawX, rawY);
            com.tencent.mm.plugin.topstory.ui.home.y1 y1Var = this.f175070d;
            y1Var.f175114e = contains;
            motionEvent.getRawX();
            motionEvent.getRawY();
            java.util.Objects.toString(rect);
            boolean z17 = y1Var.f175114e;
            this.f175072f.dismiss();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryTabBubbleUIC$doShowTips$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
