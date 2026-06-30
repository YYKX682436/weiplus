package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gm implements gx2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f134539d;

    public gm(android.widget.TextView textView) {
        this.f134539d = textView;
    }

    @Override // gx2.b
    public android.graphics.Rect G6(gx2.q drawer) {
        kotlin.jvm.internal.o.g(drawer, "drawer");
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f134539d.getGlobalVisibleRect(rect);
        return rect;
    }
}
