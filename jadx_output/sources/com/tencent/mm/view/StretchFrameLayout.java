package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/tencent/mm/view/StretchFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Ljz5/f0;", "setLayoutParams", "Lym5/a6;", "value", "d", "Lym5/a6;", "getLayoutConfig", "()Lym5/a6;", "setLayoutConfig", "(Lym5/a6;)V", "layoutConfig", "", "", "e", "Ljava/util/List;", "getMStretchIds", "()Ljava/util/List;", "setMStretchIds", "(Ljava/util/List;)V", "mStretchIds", "Ljz5/l;", "", "f", "Ljz5/l;", "getMForceStretch", "()Ljz5/l;", "setMForceStretch", "(Ljz5/l;)V", "mForceStretch", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class StretchFrameLayout extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final ym5.t1 f213500g = new ym5.t1();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ym5.a6 layoutConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.util.List mStretchIds;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public jz5.l mForceStretch;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final ym5.a6 getLayoutConfig() {
        return this.layoutConfig;
    }

    public final jz5.l getMForceStretch() {
        return this.mForceStretch;
    }

    public final java.util.List<java.lang.Integer> getMStretchIds() {
        return this.mStretchIds;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.layoutConfig == null) {
            return;
        }
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        q26.h hVar = new q26.h((q26.i) q26.h0.i(new n3.r1(this), new ym5.b6(this)));
        while (hVar.hasNext()) {
            android.view.View view = (android.view.View) hVar.next();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int i37 = ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity;
            int i38 = i37 & 7;
            int i39 = 0;
            int i47 = i38 != 3 ? i38 != 5 ? (i28 - measuredWidth) / 2 : i28 - measuredWidth : 0;
            int i48 = i37 & 112;
            if (i48 != 48) {
                i39 = i48 != 80 ? (i29 - measuredHeight) / 2 : i29 - measuredHeight;
            }
            view.layout(i47, i39, measuredWidth + i47, measuredHeight + i39);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.StretchFrameLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r1 > 0.0d) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r5 > 0.0d) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setLayoutConfig(ym5.a6 r11) {
        /*
            r10 = this;
            r10.layoutConfig = r11
            if (r11 == 0) goto L9c
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            boolean r1 = com.tencent.mm.ui.gk.d(r1)
            r3 = 0
            if (r1 == 0) goto L20
            double r5 = r11.f463200c
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L20
            goto L22
        L20:
            double r5 = r11.f463198a
        L22:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r7 = -2
            if (r1 <= 0) goto L2e
            double r8 = com.tencent.mm.ui.gk.c()
            double r5 = r5 * r8
            int r1 = (int) r5
            goto L2f
        L2e:
            r1 = r7
        L2f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r1 = r1.intValue()
            r0.width = r1
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.content.Context r1 = r10.getContext()
            kotlin.jvm.internal.o.f(r1, r2)
            boolean r1 = com.tencent.mm.ui.gk.d(r1)
            if (r1 == 0) goto L51
            double r1 = r11.f463201d
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L51
            goto L53
        L51:
            double r1 = r11.f463199b
        L53:
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L5d
            double r3 = com.tencent.mm.ui.gk.c()
            double r1 = r1 * r3
            int r7 = (int) r1
        L5d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            int r1 = r1.intValue()
            r0.height = r1
            n3.r1 r0 = new n3.r1
            r0.<init>(r10)
            ym5.c6 r1 = new ym5.c6
            r1.<init>(r10)
            q26.n r0 = q26.h0.i(r0, r1)
            q26.i r0 = (q26.i) r0
            q26.h r1 = new q26.h
            r1.<init>(r0)
        L7c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r2 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r2 == 0) goto L93
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            goto L94
        L93:
            r0 = 0
        L94:
            if (r0 != 0) goto L97
            goto L7c
        L97:
            int r2 = r11.f463202e
            r0.gravity = r2
            goto L7c
        L9c:
            r10.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.StretchFrameLayout.setLayoutConfig(ym5.a6):void");
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public final void setMForceStretch(jz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.mForceStretch = lVar;
    }

    public final void setMStretchIds(java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.mStretchIds = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StretchFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.mStretchIds = kz5.p0.f313996d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.mForceStretch = new jz5.l(bool, bool);
    }
}
