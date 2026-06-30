package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ei extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f132007b;

    /* renamed from: c, reason: collision with root package name */
    public final long f132008c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f132009d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f132010e;

    /* renamed from: f, reason: collision with root package name */
    public final long f132011f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f132012g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f132013h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f132014i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f132015j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f132016k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f132017l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(android.content.Context context, long j17, java.lang.String str, int i17, java.util.Map map, java.lang.String str2, long j18, com.tencent.mm.protobuf.g gVar, int i18, kotlin.jvm.internal.i iVar) {
        super(context);
        java.lang.String bypassData = (i18 & 32) != 0 ? "" : str2;
        com.tencent.mm.protobuf.g gVar2 = (i18 & 128) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        this.f132007b = context;
        this.f132008c = j17;
        this.f132009d = str;
        this.f132010e = map;
        this.f132011f = j18;
        this.f132015j = new java.util.ArrayList();
        this.f132016k = new java.util.ArrayList();
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488779ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderProductFeedbackWindow$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.ei eiVar = com.tencent.mm.plugin.finder.view.ei.this;
                    eiVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) eiVar.f132007b).mo133getLifecycle().c(this);
                }
            });
        }
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.e0w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f132012g = textView;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.e0x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f132013h = textView2;
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.e0y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.f132014i = textView3;
        textView.setVisibility(8);
        textView2.setVisibility(0);
        textView3.setVisibility(8);
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f493761oy5));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById4 = getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById5 = getContentView().findViewById(com.tencent.mm.R.id.gdw);
        ((android.widget.TextView) getContentView().findViewById(com.tencent.mm.R.id.e0j)).setVisibility(8);
        flowLayout.removeAllViews();
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f493758oy2);
        kotlin.jvm.internal.o.d(string);
        android.view.View a17 = a(string, 1);
        flowLayout.addView(a17);
        a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.xh(a17, this));
        hc2.v0.e(a17, "product_feed_good", 40, 0, false, false, map, null, 92, null);
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f493756oy0);
        kotlin.jvm.internal.o.d(string2);
        android.view.View a18 = a(string2, 0);
        flowLayout.addView(a18);
        a18.setOnClickListener(new com.tencent.mm.plugin.finder.view.yh(a18, this));
        hc2.v0.e(a18, "product_feed_nointerest", 40, 0, false, false, map, null, 92, null);
        if (findViewById4 != null) {
            android.widget.TextView textView4 = (android.widget.TextView) findViewById4.findViewById(com.tencent.mm.R.id.tya);
            if (textView4 != null) {
                textView4.setText(context.getResources().getString(com.tencent.mm.R.string.f493759oy3));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.view.zh(this));
            hc2.v0.e(findViewById4, "product_complaint", 40, 0, false, false, map, null, 92, null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        new db2.w(j17, str, 8, nyVar != null ? nyVar.V6() : null, null, false, 0, gVar2, 48, null).l().H(new com.tencent.mm.plugin.finder.view.ai(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final android.view.View a(java.lang.String str, int i17) {
        android.content.Context context = this.f132007b;
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

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f132007b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
    }
}
