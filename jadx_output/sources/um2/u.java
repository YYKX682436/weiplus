package um2;

/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f428969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fe2.q f428971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.os.Bundle bundle, um2.x5 x5Var, fe2.q qVar) {
        super(0);
        this.f428969d = bundle;
        this.f428970e = x5Var;
        this.f428971f = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1.getBoolean("PARAM_IS_ENTERING_COMMENT") == true) goto L8;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            r0 = 0
            android.os.Bundle r1 = r7.f428969d
            if (r1 == 0) goto Lf
            java.lang.String r2 = "PARAM_IS_ENTERING_COMMENT"
            boolean r1 = r1.getBoolean(r2)
            r2 = 1
            if (r1 != r2) goto Lf
            goto L10
        Lf:
            r2 = r0
        L10:
            r1 = 2
            r3 = 12
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            um2.x5 r5 = r7.f428970e
            fe2.q r6 = r7.f428971f
            if (r2 == 0) goto L57
            int r0 = r5.f429029d1
            if (r0 != 0) goto L45
            android.view.ViewGroup r0 = r6.f365323d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.o.e(r0, r2)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.bottomMargin
            r5.f429029d1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "lxltest2 originCommentViewPagerBottomMargin:"
            r0.<init>(r2)
            int r2 = r5.f429029d1
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r5.f429032f
            com.tencent.mars.xlog.Log.i(r2, r0)
        L45:
            android.view.ViewGroup r0 = r6.f365323d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            kotlin.jvm.internal.o.e(r0, r4)
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r0.addRule(r3)
            r0.removeRule(r1)
            goto L79
        L57:
            android.view.ViewGroup r2 = r6.f365323d
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            kotlin.jvm.internal.o.e(r2, r4)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r2.removeRule(r3)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r5.f429084w0
            if (r3 == 0) goto L6d
            int r0 = r3.getId()
        L6d:
            r2.addRule(r1, r0)
            int r0 = r5.f429029d1
            r2.bottomMargin = r0
            android.view.ViewGroup r0 = r6.f365323d
            r0.requestLayout()
        L79:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.u.invoke():java.lang.Object");
    }
}
