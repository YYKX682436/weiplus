package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class si extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f133040b;

    /* renamed from: c, reason: collision with root package name */
    public final long f133041c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f133042d;

    /* renamed from: e, reason: collision with root package name */
    public final long f133043e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qy0 f133044f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f133045g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f133046h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f133047i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f133048j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.List f133049k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f133050l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(android.content.Context context, long j17, java.lang.String str, long j18, int i17, r45.qy0 promotionInfo, yz5.l lVar) {
        super(context);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(promotionInfo, "promotionInfo");
        this.f133040b = context;
        this.f133041c = j17;
        this.f133042d = str;
        this.f133043e = j18;
        this.f133044f = promotionInfo;
        this.f133045g = lVar;
        this.f133049k = new java.util.ArrayList();
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488779ae0, (android.view.ViewGroup) null));
        setClippingEnabled(false);
        setOutsideTouchable(true);
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.view.FinderPromotionFeedbackWindow$1
                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
                public final void onDestroy() {
                    com.tencent.mm.plugin.finder.view.si siVar = com.tencent.mm.plugin.finder.view.si.this;
                    siVar.dismiss();
                    ((com.tencent.mm.ui.MMActivity) siVar.f133040b).mo133getLifecycle().c(this);
                }
            });
        }
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.e0w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f133046h = textView;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.e0x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f133047i = textView2;
        android.view.View findViewById3 = getContentView().findViewById(com.tencent.mm.R.id.e0y);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById3;
        this.f133048j = textView3;
        textView.setVisibility(0);
        textView2.setVisibility(0);
        textView3.setVisibility(8);
        textView.setText(context.getResources().getString(com.tencent.mm.R.string.cp6));
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f491302cp4));
        com.tencent.mm.ui.base.FlowLayout flowLayout = (com.tencent.mm.ui.base.FlowLayout) getContentView().findViewById(com.tencent.mm.R.id.lko);
        android.view.View findViewById4 = getContentView().findViewById(com.tencent.mm.R.id.gdv);
        android.view.View findViewById5 = getContentView().findViewById(com.tencent.mm.R.id.gdw);
        ((android.widget.TextView) getContentView().findViewById(com.tencent.mm.R.id.e0j)).setVisibility(8);
        java.lang.String string = promotionInfo.getString(3);
        if (!(string == null || string.length() == 0) && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) promotionInfo.getCustom(2)) != null) {
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
                com.tencent.mm.plugin.finder.view.mi miVar = new com.tencent.mm.plugin.finder.view.mi(this, finderJumpInfo);
                android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                spannableString.setSpan(miVar, str2.length(), spannableString.length(), 33);
                spannableString.setSpan(foregroundColorSpan, str2.length(), spannableString.length(), 33);
                textView.setText(spannableString);
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        flowLayout.removeAllViews();
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f491300cp2);
        kotlin.jvm.internal.o.d(string2);
        android.view.View a17 = a(string2, 1);
        flowLayout.addView(a17);
        a17.setOnClickListener(new com.tencent.mm.plugin.finder.view.oi(a17, this));
        java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.f491298cp0);
        kotlin.jvm.internal.o.d(string3);
        android.view.View a18 = a(string3, 0);
        flowLayout.addView(a18);
        a18.setOnClickListener(new com.tencent.mm.plugin.finder.view.pi(a18, this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderPromotionFeedbackWindow", "initFirstPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getContentView().findViewById(com.tencent.mm.R.id.gdv).setOnClickListener(new com.tencent.mm.plugin.finder.view.li(this));
    }

    public final android.view.View a(java.lang.String str, int i17) {
        android.content.Context context = this.f133040b;
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
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(this.f133049k);
        android.content.Context context = this.f133040b;
        if (L0) {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.coz));
            textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481063jr));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.coy));
            textView.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk));
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478491c));
        }
    }

    @Override // db5.d5, android.widget.PopupWindow
    public void dismiss() {
        android.view.Window window;
        android.content.Context context = this.f133040b;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(2);
        }
        super.dismiss();
    }
}
