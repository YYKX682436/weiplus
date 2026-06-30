package com.tencent.mm.plugin.lite.ui;

/* loaded from: classes3.dex */
public final class w extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
        outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + b17), b17);
    }
}
