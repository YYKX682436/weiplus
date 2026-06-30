package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShopCountDownAnimView;", "Landroid/widget/FrameLayout;", "Lr45/t42;", "animInfo", "Ljz5/f0;", "setViewBg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShopCountDownAnimView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f126295d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f126296e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f126297f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f126298g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f126299h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f126300i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f126301m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShopCountDownAnimView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f126295d = "FinderLiveShopCountDownAnimView";
        this.f126296e = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dos, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cut);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.f(findViewById, "also(...)");
        this.f126297f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.cjm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f126298g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.r_f);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f126299h = (com.tencent.mm.view.MMPAGView) findViewById3;
        this.f126300i = kotlinx.coroutines.z0.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x02c8, code lost:
    
        if (r1 != r14) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0198, code lost:
    
        if (r5 == r10) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b9, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ba, code lost:
    
        if (r5 != r14) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01bd, code lost:
    
        r10 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b6, code lost:
    
        if (r5 == r14) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView r38, long r39, r45.t42 r41, java.lang.String r42, kotlin.coroutines.Continuation r43) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView.a(com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView, long, r45.t42, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void setViewBg(r45.t42 t42Var) {
        int parseColor;
        float a17 = com.tencent.mm.ui.zk.a(getContext(), 16);
        java.util.LinkedList list = t42Var.getList(0);
        int size = list.size();
        java.lang.String str = this.f126295d;
        if (size < 3) {
            com.tencent.mars.xlog.Log.e(str, "less than 3 colors");
            return;
        }
        java.util.List<java.lang.String> subList = list.subList(0, 3);
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(subList, 10));
        for (java.lang.String str2 : subList) {
            kotlin.jvm.internal.o.d(str2);
            try {
                parseColor = android.graphics.Color.parseColor(st2.g3.f412326a.w(str2));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "", new java.lang.Object[0]);
                parseColor = android.graphics.Color.parseColor("#CCFF6146");
            }
            arrayList.add(java.lang.Integer.valueOf(parseColor));
        }
        int[] R0 = kz5.n0.R0(arrayList);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadii(new float[]{a17, a17, 0.0f, 0.0f, 0.0f, 0.0f, a17, a17});
        gradientDrawable.setOrientation(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(R0);
        gradientDrawable.setGradientCenter(0.7f, 0.5f);
        setBackground(gradientDrawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.a() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r12, r45.t42 r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.String r0 = "animInfo"
            kotlin.jvm.internal.o.g(r14, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.o.g(r15, r0)
            kotlinx.coroutines.r2 r0 = r11.f126301m
            if (r0 == 0) goto L16
            boolean r0 = r0.a()
            r1 = 1
            if (r0 != r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            java.lang.String r0 = r11.f126295d
            if (r1 == 0) goto L21
            java.lang.String r12 = "on new anim, but last anim hasn't finished yet"
            com.tencent.mars.xlog.Log.e(r0, r12)
            return
        L21:
            xt2.a0 r1 = xt2.a0.f456611a
            r2 = 5
            com.tencent.mm.protobuf.f r2 = r14.getCustom(r2)
            r45.n32 r2 = (r45.n32) r2
            boolean r1 = r1.c(r12, r2, r15)
            if (r1 != 0) goto L4b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "on new anim "
            r12.<init>(r13)
            org.json.JSONObject r13 = r14.toJSON()
            r12.append(r13)
            java.lang.String r13 = ", but anim info is invalid"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.e(r0, r12)
            return
        L4b:
            kotlinx.coroutines.y0 r1 = r11.f126300i
            r2 = 0
            r3 = 0
            xt2.g0 r0 = new xt2.g0
            r10 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r8 = r14
            r9 = r15
            r4.<init>(r5, r6, r8, r9, r10)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.r2 r12 = kotlinx.coroutines.l.d(r1, r2, r3, r4, r5, r6)
            r11.f126301m = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopCountDownAnimView.b(long, r45.t42, java.lang.String):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kotlinx.coroutines.r2 r2Var = this.f126301m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        setVisibility(8);
    }
}
