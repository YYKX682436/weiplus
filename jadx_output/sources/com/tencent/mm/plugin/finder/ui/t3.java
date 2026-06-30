package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class t3 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f129857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f129859f;

    public t3(android.widget.TextView textView, int i17, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI) {
        this.f129857d = textView;
        this.f129858e = i17;
        this.f129859f = finderCreateContactUI;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(this.f129858e);
        android.widget.TextView textView = this.f129857d;
        textView.setText(valueOf);
        textView.setTextColor(this.f129859f.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int i17 = this.f129858e;
        int b17 = com.tencent.mm.ui.tools.v4.b(i17, str);
        java.lang.String valueOf = java.lang.String.valueOf(b17);
        android.widget.TextView textView = this.f129857d;
        textView.setText(valueOf);
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129859f;
        textView.setTextColor(finderCreateContactUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        int i18 = (int) (i17 * 0.1f);
        if (i18 < 1) {
            i18 = 1;
        }
        if (b17 <= i18) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        com.tencent.mm.plugin.finder.ui.a3 a3Var = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
        finderCreateContactUI.d7();
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf(com.tencent.mm.ui.tools.v4.b(this.f129858e, str));
        android.widget.TextView textView = this.f129857d;
        textView.setText(valueOf);
        textView.setVisibility(0);
        textView.setTextColor(this.f129859f.getResources().getColor(com.tencent.mm.R.color.Red_100));
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI = this.f129859f;
        java.lang.String string = finderCreateContactUI.getString(com.tencent.mm.R.string.er8);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.m7(finderCreateContactUI, string, null, null, 6, null);
    }
}
