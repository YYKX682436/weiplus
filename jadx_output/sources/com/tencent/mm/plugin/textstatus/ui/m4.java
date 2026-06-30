package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class m4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f174087b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f174088c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f174089d;

    public m4(int i17, int i18, float f17, int i19) {
        this.f174086a = i17;
        this.f174087b = i18;
        this.f174088c = f17;
        this.f174089d = i19;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        int width = view.getWidth();
        float f17 = this.f174088c;
        if (width != 0 && view.getHeight() != 0) {
            float width2 = this.f174086a / view.getWidth();
            float height = this.f174087b / view.getHeight();
            view.setScaleX(width2 + ((1.0f - width2) * f17));
            view.setScaleY(height + ((1.0f - height) * f17));
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (((double) f17) >= 0.9d ? java.lang.Float.valueOf(0.0f) : java.lang.Integer.valueOf(this.f174089d)).floatValue());
    }
}
