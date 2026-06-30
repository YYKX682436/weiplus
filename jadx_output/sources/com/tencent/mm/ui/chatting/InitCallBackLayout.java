package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class InitCallBackLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public boolean f198296d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ne f198297e;

    public InitCallBackLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (this.f198296d) {
            return;
        }
        this.f198296d = true;
        com.tencent.mm.ui.chatting.ne neVar = this.f198297e;
        if (neVar != null) {
            ((com.tencent.mm.ui.SplashWelcomeView) neVar).c();
        }
    }

    public void setListener(com.tencent.mm.ui.chatting.ne neVar) {
        this.f198297e = neVar;
    }
}
