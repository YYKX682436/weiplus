package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLandscapeSpeedIndicatorView;", "Lcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLandscapeSpeedIndicatorView extends com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView {
    public yz5.a A;

    /* renamed from: x, reason: collision with root package name */
    public boolean f131186x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f131187y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.Runnable f131188z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLandscapeSpeedIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView
    public void e(com.tencent.mm.plugin.finder.view.al state) {
        kotlin.jvm.internal.o.g(state, "state");
        if (this.f131186x && state != com.tencent.mm.plugin.finder.view.al.f131652d) {
            this.f131186x = false;
            j();
        }
        super.e(state);
    }

    public final void i() {
        java.lang.Runnable runnable = this.f131187y;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        java.lang.Runnable runnable2 = this.f131188z;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        this.f131187y = null;
        this.f131188z = null;
        this.A = null;
        boolean z17 = this.f131186x;
        if (z17 && z17) {
            com.tencent.mars.xlog.Log.i("FinderLandscapeSpeedIndicatorView", "hideSlideLockHint");
            this.f131186x = false;
            j();
        }
    }

    public final void j() {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vh9);
        if (textView != null) {
            textView.setText(com.tencent.mm.R.string.p58);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vh_);
        if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.p5e);
        }
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vha);
        if (textView3 != null) {
            textView3.setText(com.tencent.mm.R.string.p5g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(float r9) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showSlideLockHint speed="
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLandscapeSpeedIndicatorView"
            com.tencent.mars.xlog.Log.i(r1, r0)
            boolean r0 = r8.f131186x
            r1 = 1
            r0 = r0 ^ r1
            r8.f131186x = r1
            r8.setCurrentSpeed(r9)
            com.tencent.mm.plugin.finder.view.al r2 = r8.getF131476o()
            com.tencent.mm.plugin.finder.view.al r3 = com.tencent.mm.plugin.finder.view.al.f131652d
            if (r2 == r3) goto L27
            r8.e(r3)
        L27:
            r8.j()
            r2 = 1069547520(0x3fc00000, float:1.5)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L33
            r2 = r1
            goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L3a
            r2 = 2131323400(0x7f096a08, float:1.8265478E38)
            goto L57
        L3a:
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 != 0) goto L42
            r2 = r1
            goto L43
        L42:
            r2 = r3
        L43:
            if (r2 == 0) goto L49
            r2 = 2131323401(0x7f096a09, float:1.826548E38)
            goto L57
        L49:
            r2 = 1077936128(0x40400000, float:3.0)
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 != 0) goto L51
            r2 = r1
            goto L52
        L51:
            r2 = r3
        L52:
            if (r2 == 0) goto L5e
            r2 = 2131323402(0x7f096a0a, float:1.8265482E38)
        L57:
            android.view.View r2 = r8.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L5f
        L5e:
            r2 = 0
        L5f:
            if (r2 != 0) goto L62
            goto L87
        L62:
            android.content.Context r4 = r8.getContext()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            int r6 = (int) r9
            float r7 = (float) r6
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 != 0) goto L6f
            goto L70
        L6f:
            r1 = r3
        L70:
            if (r1 == 0) goto L77
            java.lang.String r9 = java.lang.String.valueOf(r6)
            goto L7b
        L77:
            java.lang.String r9 = java.lang.String.valueOf(r9)
        L7b:
            r5[r3] = r9
            r9 = 2131781487(0x7f10676f, float:1.9194589E38)
            java.lang.String r9 = r4.getString(r9, r5)
            r2.setText(r9)
        L87:
            if (r0 != 0) goto L8c
            r8.b()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderLandscapeSpeedIndicatorView.k(float):void");
    }

    @Override // com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        i();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLandscapeSpeedIndicatorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
