package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class bq extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f117914J;
    public yz5.a K;
    public java.lang.CharSequence L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bq(android.content.Context r8, gk2.e r9, boolean r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r7 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L5
            r10 = 0
        L5:
            r2 = r10
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)
            java.lang.String r10 = "buContext"
            kotlin.jvm.internal.o.g(r9, r10)
            r3 = 0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 4
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.bq.<init>(android.content.Context, gk2.e, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.e8r;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        a0(this.f118183e.getDrawable(com.tencent.mm.R.drawable.d1x));
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.sfg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.sfc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.H = textView;
        com.tencent.mm.ui.fk.b(textView);
        android.widget.TextView textView2 = this.H;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("guidePanelCancelBtn");
            throw null;
        }
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.zp(this));
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.sff);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.I = textView3;
        com.tencent.mm.ui.fk.b(textView3);
        android.widget.TextView textView4 = this.I;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("guidePanelSendBtn");
            throw null;
        }
        textView4.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.aq(this));
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.sfe);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f117914J = (android.widget.TextView) findViewById4;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        android.widget.TextView textView = this.f117914J;
        if (textView != null) {
            textView.setText(this.L);
        } else {
            kotlin.jvm.internal.o.o("guidePanelSampleContentTv");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void s(boolean z17) {
        super.s(z17);
        this.L = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return zl2.r4.f473950a.Y1(this.f118183e);
    }
}
