package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class ol implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f205212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205213e;

    public ol(android.widget.TextView textView, java.lang.String str) {
        this.f205212d = textView;
        this.f205213e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f205212d;
        android.text.TextPaint paint = textView.getPaint();
        kotlin.jvm.internal.o.f(paint, "getPaint(...)");
        if (paint.measureText(this.f205213e) > (textView.getMeasuredWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) {
            textView.setMinLines(2);
        } else {
            textView.setMinLines(0);
        }
    }
}
