package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class v3 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f210836a;

    /* renamed from: b, reason: collision with root package name */
    public float f210837b;

    public v3(int i17, int i18, float f17) {
        this.f210836a = new android.graphics.Rect(0, 0, i17, i18);
        this.f210837b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setRoundRect(this.f210836a, this.f210837b);
    }
}
