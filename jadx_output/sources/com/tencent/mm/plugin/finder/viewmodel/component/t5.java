package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class t5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f135979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135981f;

    public t5(android.widget.TextView textView, in5.s0 s0Var, boolean z17) {
        this.f135979d = textView;
        this.f135980e = s0Var;
        this.f135981f = z17;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        kotlin.jvm.internal.o.g(s17, "s");
        int b17 = com.tencent.mm.ui.tools.v4.b(com.tencent.mm.plugin.finder.viewmodel.component.u4.a(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A) * 2, s17.toString()) / 2;
        boolean z17 = b17 >= 0 && b17 < 6;
        in5.s0 s0Var = this.f135980e;
        android.widget.TextView textView = this.f135979d;
        if (z17) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(b17));
            }
            if (textView != null) {
                textView.setTextColor(s0Var.f293121e.getResources().getColor(this.f135981f ? com.tencent.mm.R.color.BW_0_Alpha_0_5 : com.tencent.mm.R.color.f479252u4));
                return;
            }
            return;
        }
        if (b17 >= 0) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(b17));
        }
        if (textView != null) {
            textView.setTextColor(s0Var.f293121e.getResources().getColor(com.tencent.mm.R.color.Red_100));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
