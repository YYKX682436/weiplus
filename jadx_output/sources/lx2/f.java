package lx2;

/* loaded from: classes2.dex */
public final class f extends lx2.d {

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f322063k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f322064l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f322065m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView tipsLayout) {
        super(tipsLayout);
        kotlin.jvm.internal.o.g(tipsLayout, "tipsLayout");
        this.f322063k = "friendtab_tl_bubble";
        this.f322064l = "TLRecommendTab";
        this.f322065m = "FriendsTipsBubbleViewHelper";
    }

    @Override // lx2.d
    public r45.qt2 c() {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((jz5.n) this.f322054e).getValue()).W6(1);
    }

    @Override // lx2.d
    public java.lang.String d() {
        return this.f322064l;
    }

    @Override // lx2.d
    public java.lang.String e() {
        return this.f322063k;
    }

    @Override // lx2.d
    public java.lang.String f() {
        return this.f322065m;
    }

    @Override // lx2.d
    public void h() {
        super.h();
        com.tencent.mm.plugin.finder.view.gb gbVar = com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131137h;
        com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131139m = true;
        com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent = new com.tencent.mm.autogen.events.FinderTabSelectedEvent();
        finderTabSelectedEvent.f54329g.f6938a = 1;
        finderTabSelectedEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    @Override // lx2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r8, android.widget.LinearLayout.LayoutParams r9, android.widget.FrameLayout.LayoutParams r10) {
        /*
            r7 = this;
            java.lang.String r0 = "arrow"
            kotlin.jvm.internal.o.g(r8, r0)
            java.lang.String r0 = "arrowParams"
            kotlin.jvm.internal.o.g(r9, r0)
            java.lang.String r0 = "tipsParams"
            kotlin.jvm.internal.o.g(r10, r0)
            r0 = 0
            r9.leftMargin = r0
            r1 = 49
            r9.gravity = r1
            java.lang.String r2 = "context"
            android.content.Context r3 = r7.f322051b
            kotlin.jvm.internal.o.g(r3, r2)
            pf5.z r2 = pf5.z.f353948a
            boolean r4 = r3 instanceof androidx.appcompat.app.AppCompatActivity
            if (r4 == 0) goto L74
            r4 = r3
            androidx.appcompat.app.AppCompatActivity r4 = (androidx.appcompat.app.AppCompatActivity) r4
            pf5.v r2 = r2.a(r4)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.bl> r4 = com.tencent.mm.plugin.finder.viewmodel.component.bl.class
            androidx.lifecycle.c1 r2 = r2.a(r4)
            java.lang.String r4 = "get(...)"
            kotlin.jvm.internal.o.f(r2, r4)
            com.tencent.mm.plugin.finder.viewmodel.component.bl r2 = (com.tencent.mm.plugin.finder.viewmodel.component.bl) r2
            r4 = 35
            com.tencent.mm.plugin.finder.viewmodel.component.gi r4 = r2.X6(r4)
            if (r4 != 0) goto L41
        L3f:
            r4 = r0
            goto L69
        L41:
            r4 = 1
            com.tencent.mm.plugin.finder.viewmodel.component.gi r5 = r2.X6(r4)
            if (r5 != 0) goto L49
            goto L3f
        L49:
            int r2 = r2.r7()
            if (r2 > r4) goto L50
            goto L3f
        L50:
            int r5 = r5.f134527d
            if (r5 < r2) goto L55
            goto L3f
        L55:
            int r6 = r2 % 2
            if (r6 == 0) goto L60
            int r2 = r2 - r4
            int r2 = r2 / 2
            if (r5 != r2) goto L60
            r2 = r4
            goto L61
        L60:
            r2 = r0
        L61:
            r2 = r2 ^ r4
            if (r2 == 0) goto L3f
            com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView r2 = r7.f322050a
            r7.a(r3, r2, r10, r4)
        L69:
            if (r4 != 0) goto L70
            r10.gravity = r1
            r10.setMarginStart(r0)
        L70:
            super.i(r8, r9, r10)
            return
        L74:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Check failed."
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lx2.f.i(android.view.View, android.widget.LinearLayout$LayoutParams, android.widget.FrameLayout$LayoutParams):void");
    }
}
