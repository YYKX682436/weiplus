package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class p4 extends android.view.ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f174164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f174165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity f174166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174167e;

    public p4(int i17, int i18, float f17, com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity textStatusCardFeedsActivity, int i19) {
        this.f174163a = i17;
        this.f174164b = i18;
        this.f174165c = f17;
        this.f174166d = textStatusCardFeedsActivity;
        this.f174167e = i19;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(android.view.View view, android.graphics.Outline outline) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(outline, "outline");
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            float f17 = this.f174165c;
            view.setScaleX((((this.f174163a / view.getWidth()) - 1.0f) * f17) + 1.0f);
            view.setScaleY((((this.f174164b / view.getHeight()) - 1.0f) * f17) + 1.0f);
            if (f17 >= 0.6f) {
                com.tencent.mm.plugin.textstatus.ui.h4 h4Var = com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity.f173478o;
                this.f174166d.W6().setAlpha(((f17 - 0.6f) / 0.4f) * 1.0f);
            }
        }
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f174167e);
    }
}
