package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class g2 extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f132130b;

    /* renamed from: c, reason: collision with root package name */
    public final long f132131c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f132132d;

    /* renamed from: e, reason: collision with root package name */
    public final long f132133e;

    /* renamed from: f, reason: collision with root package name */
    public final int f132134f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.ky0 f132135g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f132136h;

    /* renamed from: i, reason: collision with root package name */
    public int f132137i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f132138j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f132139k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.TextView f132140l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f132141m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f132142n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.content.Context context, long j17, java.lang.String str, long j18, int i17, r45.ky0 advertisementInfo, yz5.l lVar) {
        super(context);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(advertisementInfo, "advertisementInfo");
        this.f132130b = context;
        this.f132131c = j17;
        this.f132132d = str;
        this.f132133e = j18;
        this.f132134f = i17;
        this.f132135g = advertisementInfo;
        this.f132136h = lVar;
        this.f132137i = 3;
        this.f132141m = new java.util.ArrayList();
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488779ae0, (android.view.ViewGroup) null));
        java.lang.String string = advertisementInfo.getString(3);
        string = string == null ? "" : string;
        android.view.View contentView = getContentView();
        kotlin.jvm.internal.o.f(contentView, "getContentView(...)");
        dy1.a.i(contentView, "ad_comment_feedback");
        android.view.View contentView2 = getContentView();
        kotlin.jvm.internal.o.f(contentView2, "getContentView(...)");
        dy1.a.a(contentView2, new com.tencent.mm.plugin.finder.view.y1(this, string));
        android.view.View contentView3 = getContentView();
        kotlin.jvm.internal.o.f(contentView3, "getContentView(...)");
        dy1.a.l(contentView3, 160, 25496);
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderAdFeedbackWindow$2
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.g2 g2Var = com.tencent.mm.plugin.finder.view.g2.this;
                    g2Var.dismiss();
                    ((com.tencent.mm.ui.MMActivity) g2Var.f132130b).mo133getLifecycle().c(this);
                }
            });
        }
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.e0w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f132138j = textView;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.e0x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f132139k = textView2;
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.e0y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.f132140l = textView3;
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(8);
        textView.setText(context.getResources().getString(com.tencent.mm.R.string.cp6));
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f491302cp4));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById4 = getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById5 = getContentView().findViewById(com.tencent.mm.R.id.gdw);
        ((android.widget.TextView) getContentView().findViewById(com.tencent.mm.R.id.e0j)).setVisibility(8);
        java.lang.String string2 = advertisementInfo.getString(8);
        if (!(string2 == null || string2.length() == 0) && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) advertisementInfo.getCustom(9)) != null) {
            java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                r45.c74 c74Var = (r45.c74) ((r45.wf6) obj).getCustom(5);
                if ((c74Var != null ? c74Var.getString(1) : null) != null) {
                    break;
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null) {
                java.lang.CharSequence text = textView.getText();
                kotlin.jvm.internal.o.e(text, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = (java.lang.String) text;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str2);
                r45.c74 c74Var2 = (r45.c74) wf6Var.getCustom(5);
                sb6.append(c74Var2 != null ? c74Var2.getString(1) : null);
                android.text.SpannableString spannableString = new android.text.SpannableString(sb6.toString());
                com.tencent.mm.plugin.finder.view.a2 a2Var = new com.tencent.mm.plugin.finder.view.a2(this, finderJumpInfo);
                android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                spannableString.setSpan(a2Var, str2.length(), spannableString.length(), 33);
                spannableString.setSpan(foregroundColorSpan, str2.length(), spannableString.length(), 33);
                textView.setText(spannableString);
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        flowLayout.removeAllViews();
        java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.f491300cp2);
        kotlin.jvm.internal.o.d(string3);
        android.view.View a17 = a(string3, 1);
        flowLayout.addView(a17);
        a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.c2(a17, this));
        java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.f491298cp0);
        kotlin.jvm.internal.o.d(string4);
        android.view.View a18 = a(string4, 0);
        flowLayout.addView(a18);
        a18.setOnClickListener(new com.tencent.mm.plugin.finder.view.d2(a18, this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContentView().findViewById(com.tencent.mm.R.id.gdv).setOnClickListener(new com.tencent.mm.plugin.finder.view.z1(this));
    }

    public final android.view.View a(java.lang.String str, int i17) {
        android.content.Context context = this.f132130b;
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
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(this.f132141m);
        android.content.Context context = this.f132130b;
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
        android.content.Context context = this.f132130b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
        if (this.f132137i == 0) {
            this.f132137i = 3;
        }
    }
}
