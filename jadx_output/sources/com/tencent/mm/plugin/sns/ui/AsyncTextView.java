package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class AsyncTextView extends com.tencent.mm.view.x2c.X2CTextView implements java.lang.Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f166219w = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f166220g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166221h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166222i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f166223m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f166224n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.c1 f166225o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.c1 f166226p;

    /* renamed from: q, reason: collision with root package name */
    public int f166227q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.contact.s f166228r;

    /* renamed from: s, reason: collision with root package name */
    public int f166229s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f166230t;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.String f166231u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.u0 f166232v;

    public AsyncTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166228r = null;
        this.f166229s = 0;
        this.f166230t = false;
        this.f166231u = null;
        this.f166232v = new com.tencent.mm.plugin.sns.ui.u0();
        e(context);
    }

    public final xe0.u0 b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createTimelineTextStatusStyle", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        int b17 = i65.a.b(this.f166220g, 4);
        xe0.r0 a17 = new xe0.r0().a().a();
        a17.f453773a = i65.a.b(this.f166220g, 20);
        a17.f453779g = true;
        a17.f453780h = xe0.p0.f453768e;
        a17.f453789q = new xe0.t0(b17, b17, b17, b17);
        a17.f453790r = new xe0.t0(b17, b17, b17, b17);
        xe0.u0 a18 = a17.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createTimelineTextStatusStyle", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        return a18;
    }

    public final void e(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f166220g = context;
        this.f166229s = com.tencent.mm.ui.zk.a(context, 14);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            int baseline = super.getBaseline();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return baseline;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AsyncTextView", th6, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return onPreDraw;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int length;
        int length2;
        boolean z17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.pluginsdk.ui.span.MMTextAppearanceSpan mMTextAppearanceSpan;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        if (getTag() instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) getTag();
            if (!com.tencent.mm.sdk.platformtools.t8.N0(str, this.f166222i) && !this.f166223m && str.equals(this.f166222i) && !this.f166230t) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                return;
            }
        }
        com.tencent.mm.contact.s sVar = this.f166228r;
        if ((sVar != null && com.tencent.mm.storage.z3.m4(sVar.d1()) && "3552365301".equals(this.f166228r.Q0())) || !this.f166223m || com.tencent.mm.sdk.platformtools.t8.K0(this.f166232v.f170551a)) {
            length = 0;
            length2 = 0;
            z17 = false;
        } else {
            length = this.f166221h.length();
            java.lang.String str2 = " @" + this.f166232v.f170551a;
            this.f166221h += str2;
            length2 = str2.length() + length;
            z17 = true;
        }
        int i17 = this.f166227q == 10 ? 3 : 2;
        com.tencent.mm.pluginsdk.ui.span.d1 d1Var = new com.tencent.mm.pluginsdk.ui.span.d1(this.f166220g, new ca4.h(this.f166223m, this.f166222i, this.f166224n, 1), this.f166225o, i17);
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).aj(getContext(), this.f166221h, getTextSize(), i17));
        f0Var.a(d1Var, this.f166221h, 33);
        if (this.f166228r != null && length != length2 && length2 > length && length >= 0) {
            j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
            android.content.Context context = this.f166220g;
            java.lang.String Q0 = this.f166228r.Q0();
            int i18 = this.f166229s;
            ((l41.q2) b0Var).getClass();
            if ("3552365301".equals(Q0)) {
                android.content.res.ColorStateList e17 = i65.a.e(context, com.tencent.mm.R.color.Orange_100);
                mMTextAppearanceSpan = new com.tencent.mm.pluginsdk.ui.span.MMTextAppearanceSpan(null, 0, i18, e17, e17);
            } else {
                mMTextAppearanceSpan = null;
            }
            f0Var.c(mMTextAppearanceSpan, length, length2, 33);
            if (z17) {
                j41.b0 b0Var2 = (j41.b0) i95.n0.c(j41.b0.class);
                android.content.Context context2 = this.f166220g;
                int i19 = this.f166229s;
                ((l41.q2) b0Var2).getClass();
                android.content.res.ColorStateList e18 = i65.a.e(context2, com.tencent.mm.R.color.Orange_100);
                f0Var.c(new com.tencent.mm.pluginsdk.ui.span.MMTextAppearanceSpan(null, 0, i19, e18, e18), length, length2, 33);
            }
        }
        setText(f0Var, android.widget.TextView.BufferType.SPANNABLE);
        setTag(this.f166222i);
        this.f166231u = this.f166222i;
        if (this.f166223m && (snsInfo = this.f166232v.f170552b) != null && snsInfo.isValidAdHeadStateInfo()) {
            x84.c.a(this, x84.c.b(this.f166232v.f170552b), i65.a.b(this.f166220g, 24), i65.a.b(this.f166220g, 20), i65.a.b(this.f166220g, 4), false);
        } else {
            xe0.v0 v0Var = new xe0.v0();
            if ((this.f166220g instanceof android.app.Activity) && this.f166226p != null) {
                v0Var.f453823c = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.AsyncTextView$$b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i27 = com.tencent.mm.plugin.sns.ui.AsyncTextView.f166219w;
                        com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = com.tencent.mm.plugin.sns.ui.AsyncTextView.this;
                        asyncTextView.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", asyncTextView, array);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$run$2", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array2 = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", asyncTextView, array2);
                        asyncTextView.f166226p.a(view, asyncTextView.f166222i);
                        yj0.a.h(asyncTextView, "com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$run$2", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                        yj0.a.h(asyncTextView, "com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                };
            }
            v0Var.f453822b = b();
            v0Var.f453821a = false;
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).qj(this, this.f166222i, bi4.c.SNS_FEED, bi4.d.OUTLINED, v0Var);
        }
        this.f166230t = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public void setContactInfo(com.tencent.mm.contact.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f166228r = sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContactInfo", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public AsyncTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166228r = null;
        this.f166229s = 0;
        this.f166230t = false;
        this.f166231u = null;
        this.f166232v = new com.tencent.mm.plugin.sns.ui.u0();
        e(context);
    }

    public AsyncTextView(android.content.Context context) {
        super(context);
        this.f166228r = null;
        this.f166229s = 0;
        this.f166230t = false;
        this.f166231u = null;
        this.f166232v = new com.tencent.mm.plugin.sns.ui.u0();
        e(context);
    }
}
