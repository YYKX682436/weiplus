package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class r4 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f117357h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r4(android.content.Context r8, zl2.u4 r9, int r10, kotlin.jvm.internal.i r11) {
        /*
            r7 = this;
            r11 = 2
            r10 = r10 & r11
            if (r10 == 0) goto L6
            zl2.u4 r9 = zl2.u4.f473988d
        L6:
            r3 = r9
            java.lang.String r9 = "context"
            kotlin.jvm.internal.o.g(r8, r9)
            java.lang.String r9 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r9)
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.orientation
            if (r9 != r11) goto L20
            r9 = 1
            goto L21
        L20:
            r9 = 0
        L21:
            r2 = r9
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.r4.<init>(android.content.Context, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.aoq;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int n() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.obi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.obk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById2);
        ng5.a.a((android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.hlm), c01.z1.r());
        ng5.a.a((android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.hlh), c01.z1.r());
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.r6c);
        if (imageView != null) {
            this.f117357h = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.q4(imageView, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public boolean r() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        kotlinx.coroutines.r2 r2Var = this.f117357h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
