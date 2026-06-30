package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes13.dex */
public final class n2 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f144449a;

    public n2(boolean z17) {
        this.f144449a = z17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        if (this.f144449a) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        } else {
            float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + b17), b17);
        }
    }
}
