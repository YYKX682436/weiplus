package com.tencent.mm.ui.bizchat;

/* loaded from: classes9.dex */
public class BizChatSearchListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public hb5.z f197925d;

    public BizChatSearchListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        hb5.z zVar = this.f197925d;
        if (zVar != null) {
            ((com.tencent.mm.ui.bizchat.BizChatSearchUI) zVar).hideVKB();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setOnTouchListener(hb5.z zVar) {
        this.f197925d = zVar;
    }

    public BizChatSearchListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
