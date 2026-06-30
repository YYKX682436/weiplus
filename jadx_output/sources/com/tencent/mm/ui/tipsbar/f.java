package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class f extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f209933b;

    public f(int i17, float f17) {
        this.f209932a = i17;
        this.f209933b = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int height = view.getHeight();
        outline.setRoundRect(0, 0, view.getWidth(), (int) (this.f209932a + ((height - r1) * this.f209933b)), 0.0f);
    }
}
