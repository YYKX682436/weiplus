package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class s2 extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f132994b;

    /* renamed from: c, reason: collision with root package name */
    public final long f132995c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f132996d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f132997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f132998f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f132999g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f133000h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.i3 f133001i;

    /* renamed from: j, reason: collision with root package name */
    public int f133002j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f133003k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f133004l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f133005m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f133006n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f133007o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.a f133008p;

    /* renamed from: q, reason: collision with root package name */
    public int f133009q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f133010r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(android.content.Context context, long j17, java.lang.String str, java.util.LinkedList dislikeReasonList, int i17, java.lang.String reportExtraData, java.lang.String bypassData, r45.i3 businessType) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dislikeReasonList, "dislikeReasonList");
        kotlin.jvm.internal.o.g(reportExtraData, "reportExtraData");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        this.f132994b = context;
        this.f132995c = j17;
        this.f132996d = str;
        this.f132997e = dislikeReasonList;
        this.f132998f = i17;
        this.f132999g = reportExtraData;
        this.f133000h = bypassData;
        this.f133001i = businessType;
        this.f133002j = 3;
        this.f133006n = new java.util.ArrayList();
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488779ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderBaseAdFeedbackWindow$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.s2 s2Var = com.tencent.mm.plugin.finder.view.s2.this;
                    s2Var.dismiss();
                    ((com.tencent.mm.ui.MMActivity) s2Var.f132994b).mo133getLifecycle().c(this);
                }
            });
        }
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.e0w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f133003k = textView;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.e0x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f133004l = textView2;
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.e0y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.f133005m = textView3;
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(8);
        textView.setText(context.getResources().getString(com.tencent.mm.R.string.cp6));
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f491302cp4));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById4 = getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById5 = getContentView().findViewById(com.tencent.mm.R.id.gdw);
        ((android.widget.TextView) getContentView().findViewById(com.tencent.mm.R.id.e0j)).setVisibility(8);
        flowLayout.removeAllViews();
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f491300cp2);
        kotlin.jvm.internal.o.d(string);
        android.view.View a17 = a(string, 1);
        flowLayout.addView(a17);
        a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.o2(a17, this));
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f491298cp0);
        kotlin.jvm.internal.o.d(string2);
        android.view.View a18 = a(string2, 0);
        flowLayout.addView(a18);
        a18.setOnClickListener(new com.tencent.mm.plugin.finder.view.p2(a18, this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderBaseAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContentView().findViewById(com.tencent.mm.R.id.gdv).setOnClickListener(new com.tencent.mm.plugin.finder.view.m2(this));
    }

    public final android.view.View a(java.lang.String str, int i17) {
        android.content.Context context = this.f132994b;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ady, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lks);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.lkn);
        if (i17 == 0) {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(context.getResources().getDrawable(com.tencent.mm.R.raw.finder_ad_feedback_no_interesting));
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else if (i17 != 1) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(context.getResources().getDrawable(com.tencent.mm.R.raw.finder_ad_feedback_approve));
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        textView.setText(str);
        return inflate;
    }

    public final void b(android.widget.TextView textView) {
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(this.f133006n);
        android.content.Context context = this.f132994b;
        if (L0) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.coz));
            textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481063jr));
        } else {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.coy));
            textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk));
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f132994b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
        if (this.f133002j == 0) {
            this.f133002j = 3;
        }
    }
}
