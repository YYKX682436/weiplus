package com.tencent.mm.ui.chatting;

/* loaded from: classes10.dex */
public final class fc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f200510d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ScrollView f200511e;

    /* renamed from: f, reason: collision with root package name */
    public final int f200512f;

    /* renamed from: g, reason: collision with root package name */
    public final int f200513g;

    public fc(android.widget.TextView textView, android.widget.ScrollView scrollView, int i17, int i18) {
        kotlin.jvm.internal.o.g(textView, "textView");
        kotlin.jvm.internal.o.g(scrollView, "scrollView");
        this.f200510d = textView;
        this.f200511e = scrollView;
        this.f200512f = i17;
        this.f200513g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f200510d;
        android.text.Layout layout = textView.getLayout();
        if (layout == null) {
            textView.postDelayed(this, 100L);
            return;
        }
        int lineForOffset = layout.getLineForOffset(this.f200512f);
        int lineForOffset2 = layout.getLineForOffset(this.f200513g);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        textView.getLocationInWindow(iArr);
        android.widget.ScrollView scrollView = this.f200511e;
        scrollView.getLocationInWindow(iArr2);
        int i17 = iArr[1] - iArr2[1];
        int lineTop = (layout.getLineTop(lineForOffset) + layout.getLineBottom(lineForOffset2)) / 2;
        scrollView.scrollTo(0, java.lang.Math.max(0, java.lang.Math.min((lineTop - (scrollView.getHeight() / 2)) + i17, (layout.getHeight() + i17) - scrollView.getHeight())));
    }
}
