package com.tencent.mm.ui.tipsbar;

/* loaded from: classes3.dex */
public final class i extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f209939b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f209940c;

    public i(int i17, int i18, float f17) {
        this.f209938a = i17;
        this.f209939b = i18;
        this.f209940c = f17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), (int) (this.f209938a + ((this.f209939b - r0) * this.f209940c)), 0.0f);
    }
}
