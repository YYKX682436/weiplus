package com.tencent.mm.ui.tools;

/* loaded from: classes14.dex */
public class PressImageView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f210139d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Runnable f210140e;

    /* renamed from: f, reason: collision with root package name */
    public final int f210141f;

    public PressImageView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210141f = 90;
        this.f210139d = new com.tencent.mm.sdk.platformtools.n3();
        this.f210140e = new com.tencent.mm.ui.tools.e8(this);
        super.setOnTouchListener(new com.tencent.mm.ui.tools.f8(this));
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (isPressed()) {
            canvas.drawARGB(this.f210141f, 0, 0, 0);
        }
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        iz5.a.g(null, false);
    }
}
