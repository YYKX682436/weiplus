package com.tencent.mm.ui.chatting.view;

/* loaded from: classes4.dex */
public class FoldableChatTextItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public n3.q f202842d;

    public FoldableChatTextItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setTagObject(android.view.MotionEvent motionEvent) {
        setTag(com.tencent.mm.R.id.ohu, new int[]{(int) motionEvent.getRawX(), (int) motionEvent.getRawY()});
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        setTagObject(motionEvent);
        n3.q qVar = this.f202842d;
        if (qVar != null) {
            qVar.a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setFoldTextListener(com.tencent.mm.ui.chatting.view.d0 d0Var) {
    }

    public void setMaxHeight(int i17) {
    }

    public void setOnGestureListener(android.view.GestureDetector.OnGestureListener onGestureListener) {
        this.f202842d = new n3.q(getContext(), onGestureListener);
    }

    public FoldableChatTextItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
