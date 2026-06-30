package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes3.dex */
public class b0 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f150935a;

    public b0(int i17) {
        this.f150935a = 0;
        this.f150935a = i17;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(new android.graphics.Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), this.f150935a);
    }
}
