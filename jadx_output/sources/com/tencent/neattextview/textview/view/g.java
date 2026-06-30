package com.tencent.neattextview.textview.view;

/* loaded from: classes14.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextPaint f215202d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f215203e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f215204f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f215205g;

    public g(java.lang.String str, android.text.TextPaint textPaint) {
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.f215202d = textPaint2;
        this.f215205g = false;
        textPaint2.set(textPaint);
        this.f215203e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        float[] fArr = new float[this.f215203e.length()];
        this.f215204f = fArr;
        this.f215202d.getTextWidths(this.f215203e, fArr);
        this.f215205g = true;
    }
}
