package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes9.dex */
public final class g2 implements com.tencent.mm.ui.base.preference.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f129284a;

    public g2(com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f129284a = checkBoxPreference;
    }

    @Override // com.tencent.mm.ui.base.preference.d
    public final void a(android.view.View view) {
        com.tencent.mm.plugin.finder.view.b0 b0Var = com.tencent.mm.plugin.finder.view.CollapsibleTextView.f130818x;
        android.widget.TextView textView = this.f129284a.U;
        kotlin.jvm.internal.o.f(textView, "getSummaryTextView(...)");
        b0Var.a(textView);
    }
}
