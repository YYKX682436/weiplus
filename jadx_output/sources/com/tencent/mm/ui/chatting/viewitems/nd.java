package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class nd extends com.tencent.mm.pluginsdk.ui.span.y {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnTouchListener f204923m;

    @Override // com.tencent.mm.pluginsdk.ui.span.y, com.tencent.neattextview.textview.view.i, android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.f204923m;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        return super.onTouch(view, motionEvent);
    }
}
