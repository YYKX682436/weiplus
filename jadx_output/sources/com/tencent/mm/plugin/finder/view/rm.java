package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class rm extends ed2.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f132965d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.om f132966e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f132967f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f132968g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f132969h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f132970i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f132971j;

    /* renamed from: k, reason: collision with root package name */
    public int f132972k;

    /* renamed from: l, reason: collision with root package name */
    public int f132973l;

    /* renamed from: m, reason: collision with root package name */
    public long f132974m;

    /* renamed from: n, reason: collision with root package name */
    public int f132975n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f132976o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f132977p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm(android.content.Context context, com.tencent.mm.plugin.finder.view.om omVar) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f132965d = context;
        this.f132966e = omVar;
        this.f132973l = i65.a.b(context, 16);
        this.f132974m = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b_k, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.oqc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f132968g = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.ovk);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f132969h = findViewById2;
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.jge);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f132970i = findViewById3;
        setOutsideTouchable(true);
        getContentView().setOnClickListener(new com.tencent.mm.plugin.finder.view.nm(this));
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderTipsBubbleWindow$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.rm rmVar = com.tencent.mm.plugin.finder.view.rm.this;
                    rmVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) rmVar.f132965d).mo133getLifecycle().c(this);
                }
            });
        }
        this.f132976o = new com.tencent.mm.plugin.finder.view.pm(this);
        this.f132977p = new java.util.ArrayList();
    }

    public final void a(int i17, float f17) {
        this.f132968g.setTextSize(i17, f17);
    }

    public final void b() {
        android.view.View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(android.view.View anchor) {
        jz5.l lVar;
        android.view.View contentView;
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!this.f132971j) {
            getContentView().measure(0, 0);
            this.f132971j = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        setWidth(measuredWidth);
        setHeight(measuredHeight);
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        android.content.Context context = this.f132965d;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(context);
        boolean z17 = this.f132967f;
        android.view.View view = this.f132969h;
        int i17 = a17.f197135a;
        if (z17) {
            int i18 = (iArr[1] - measuredHeight) - this.f132972k;
            int width = (iArr[0] + (anchor.getWidth() / 2)) - (measuredWidth / 2);
            int i19 = this.f132975n;
            if (width < i19) {
                width = i19;
            }
            int i27 = i17 - measuredWidth;
            if (width > i27) {
                width = i27;
            }
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (view.getMeasuredWidth() / 2));
            if (layoutParams2.getMarginStart() < 0) {
                layoutParams2.getMarginStart();
                anchor.getWidth();
                view.getMeasuredWidth();
                dismiss();
                return;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i18));
        } else {
            int i28 = (iArr[1] - measuredHeight) - this.f132972k;
            int i29 = i17 - measuredWidth;
            int i37 = i29 - this.f132973l;
            if (i37 < 0) {
                i37 = 0;
            }
            if (i37 <= i29) {
                i29 = i37;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - i29) - (view.getMeasuredWidth() / 2));
            if (layoutParams4.getMarginStart() < 0) {
                layoutParams4.getMarginStart();
                anchor.getWidth();
                view.getMeasuredWidth();
                dismiss();
                return;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28));
        }
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        setAnimationStyle(com.tencent.mm.R.style.f494610rl);
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if ((activity == null || activity.isFinishing()) ? false : true) {
            showAtLocation(anchor, 0, intValue, intValue2);
        }
        if (this.f132974m > 0 && (contentView = getContentView()) != null) {
            contentView.postDelayed(new com.tencent.mm.plugin.finder.view.qm(this.f132976o), this.f132974m);
        }
        kotlin.jvm.internal.o.f(java.lang.String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17.f197136b), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
    }

    public final void d(android.view.View anchor) {
        jz5.l lVar;
        android.view.View contentView;
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!this.f132971j) {
            getContentView().measure(0, 0);
            this.f132971j = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int height = anchor.getHeight();
        int width = anchor.getWidth();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(this.f132965d);
        boolean z17 = this.f132967f;
        int i17 = a17.f197135a;
        if (z17) {
            int i18 = iArr[1] - this.f132972k;
            int width2 = (iArr[0] + (anchor.getWidth() / 2)) - (measuredWidth / 2);
            int i19 = this.f132975n;
            if (width2 < i19) {
                width2 = i19;
            }
            int i27 = i17 - measuredWidth;
            if (width2 > i27) {
                width2 = i27;
            }
            lVar = new jz5.l(java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(i18));
        } else {
            lVar = new jz5.l(java.lang.Integer.valueOf(((i17 - measuredWidth) - this.f132973l) - width), java.lang.Integer.valueOf(iArr[1] - this.f132972k));
        }
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        setAnimationStyle(com.tencent.mm.R.style.f494610rl);
        showAtLocation(anchor, 0, intValue, height + intValue2);
        if (this.f132974m > 0 && (contentView = getContentView()) != null) {
            contentView.postDelayed(new com.tencent.mm.plugin.finder.view.qm(this.f132976o), this.f132974m);
        }
        kotlin.jvm.internal.o.f(java.lang.String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17.f197136b), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
    }

    @Override // ed2.o, db5.d5, android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        android.view.View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new com.tencent.mm.plugin.finder.view.qm(this.f132976o));
        }
        java.util.ArrayList arrayList = this.f132977p;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((android.widget.PopupWindow.OnDismissListener) it.next()).onDismiss();
        }
        arrayList.clear();
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.f132977p.add(onDismissListener);
        }
    }

    public /* synthetic */ rm(android.content.Context context, com.tencent.mm.plugin.finder.view.om omVar, int i17, kotlin.jvm.internal.i iVar) {
        this(context, (i17 & 2) != 0 ? null : omVar);
    }
}
