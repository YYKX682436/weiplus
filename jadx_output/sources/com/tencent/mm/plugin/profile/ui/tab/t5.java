package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes3.dex */
public final class t5 extends android.view.ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
