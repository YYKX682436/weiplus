package el2;

/* loaded from: classes3.dex */
public final class j1 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final android.view.View.OnClickListener H;
    public android.widget.TextView I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j1(android.content.Context r8, android.view.View.OnClickListener r9, zl2.u4 r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r7 = this;
            r11 = r11 & 4
            if (r11 == 0) goto L6
            zl2.u4 r10 = zl2.u4.f473988d
        L6:
            r3 = r10
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)
            java.lang.String r10 = "onAddClick"
            kotlin.jvm.internal.o.g(r9, r10)
            java.lang.String r10 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r10)
            r2 = 0
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.H = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.j1.<init>(android.content.Context, android.view.View$OnClickListener, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.ams;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.fii);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.I = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.fik);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById2);
        android.widget.TextView textView = this.I;
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        } else {
            kotlin.jvm.internal.o.o("addBtn");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        super.V(e0Var, z17, i17);
        android.widget.TextView textView = this.I;
        if (textView != null) {
            textView.setOnClickListener(this.H);
        } else {
            kotlin.jvm.internal.o.o("addBtn");
            throw null;
        }
    }
}
