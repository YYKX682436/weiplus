package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes5.dex */
public final class h1 extends android.text.style.ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f154344d;

    public h1(int i17) {
        this.f154344d = i17;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(android.graphics.Canvas canvas, java.lang.CharSequence charSequence, int i17, int i18, float f17, int i19, int i27, int i28, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.o.g(paint, "paint");
        return this.f154344d;
    }
}
