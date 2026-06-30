package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes10.dex */
public class LuckyMoneyStoryViewPager extends com.tencent.mm.view.RecyclerHorizontalViewPager {
    public LuckyMoneyStoryViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.view.RecyclerHorizontalViewPager, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 3 ? super.dispatchTouchEvent(android.view.MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState())) : super.dispatchTouchEvent(motionEvent);
    }
}
