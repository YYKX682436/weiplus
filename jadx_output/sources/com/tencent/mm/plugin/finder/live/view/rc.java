package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class rc extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f116659h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f116660i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f116661m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f116662n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f116663o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rc(android.content.Context r8, zl2.u4 r9, int r10, kotlin.jvm.internal.i r11) {
        /*
            r7 = this;
            r10 = r10 & 2
            if (r10 == 0) goto L6
            zl2.u4 r9 = zl2.u4.f473988d
        L6:
            r3 = r9
            java.lang.String r9 = "context"
            kotlin.jvm.internal.o.g(r8, r9)
            java.lang.String r9 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r9)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            wd2.g r8 = r7.f118384g
            com.tencent.mm.ui.widget.dialog.y1 r8 = r8.f444836c
            android.view.Window r8 = r8.b()
            r9 = 80
            r8.setGravity(r9)
            wd2.g r8 = r7.f118384g
            com.tencent.mm.ui.widget.dialog.y1 r8 = r8.f444836c
            android.view.Window r8 = r8.b()
            r9 = 2131820800(0x7f110100, float:1.9274325E38)
            r8.setWindowAnimations(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.rc.<init>(android.content.Context, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dwd;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f487348s90);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f483482b02);
        android.view.View view = null;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.oc(this));
        } else {
            findViewById = null;
        }
        this.f116662n = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.rel);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.pc(this));
            view = findViewById2;
        }
        this.f116663o = view;
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.ord);
        if (textView2 != null) {
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            android.content.Context context = this.f118381d;
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.mhg);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.mhh);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            int L = r26.n0.L(string, string2, 0, false, 6, null);
            int length = string2.length() + L;
            if (L < 0 || length > string.length()) {
                return;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.FG_1)), 0, spannableString.length(), 17);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.live.view.qc(this), L, length, 33);
            textView2.setText(spannableString);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        yz5.a aVar = this.f116659h;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
