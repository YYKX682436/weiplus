package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class SplashImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f197089d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ne f197090e;

    public SplashImageView(android.content.Context context) {
        super(context);
        setBackgroundDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.cgq));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        setBackgroundDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.cgq));
        if (this.f197089d) {
            return;
        }
        this.f197089d = true;
        com.tencent.mm.ui.chatting.ne neVar = this.f197090e;
        if (neVar != null) {
            ((com.tencent.mm.ui.SplashWelcomeView) neVar).c();
        }
    }

    public void setOnDrawListener(com.tencent.mm.ui.chatting.ne neVar) {
        this.f197090e = neVar;
    }

    public SplashImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.cgq));
    }

    public SplashImageView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setBackgroundDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.cgq));
    }
}
