package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class o7 extends com.tencent.mm.ui.chatting.viewitems.g0 {
    public android.widget.LinearLayout A;
    public android.widget.LinearLayout B;
    public android.widget.ImageView C;
    public final jz5.g D = jz5.h.b(com.tencent.mm.ui.chatting.viewitems.n7.f204905d);

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f205139b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f205140c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMImageView f205141d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f205142e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f205143f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f205144g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f205145h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f205146i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f205147j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.LinearLayout f205148k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f205149l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f205150m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f205151n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f205152o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f205153p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f205154q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f205155r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f205156s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.LinearLayout f205157t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewGroup f205158u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f205159v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.RelativeLayout f205160w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f205161x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewStub f205162y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f205163z;

    public final com.tencent.mm.ui.chatting.viewitems.o7 a(android.view.View view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.f205139b = view.findViewById(com.tencent.mm.R.id.bjy);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.brc);
        android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        if (textView != null) {
            this.userTV = textView;
        }
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = progressBar;
        if (z17) {
            this.f205140c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        } else if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bjs);
        this.f205141d = findViewById2 instanceof com.tencent.mm.ui.MMImageView ? (com.tencent.mm.ui.MMImageView) findViewById2 : null;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.bju);
        this.f205142e = findViewById3 instanceof com.tencent.mm.ui.widget.MMNeat7extView ? (com.tencent.mm.ui.widget.MMNeat7extView) findViewById3 : null;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.bjx);
        this.f205149l = findViewById4 instanceof android.widget.TextView ? (android.widget.TextView) findViewById4 : null;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.f483637bj2);
        this.f205143f = findViewById5 instanceof android.widget.TextView ? (android.widget.TextView) findViewById5 : null;
        android.view.View findViewById6 = view.findViewById(com.tencent.mm.R.id.bjp);
        this.f205144g = findViewById6 instanceof android.widget.TextView ? (android.widget.TextView) findViewById6 : null;
        android.view.View findViewById7 = view.findViewById(com.tencent.mm.R.id.bjm);
        this.f205145h = findViewById7 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById7 : null;
        android.view.View findViewById8 = view.findViewById(com.tencent.mm.R.id.bjo);
        this.f205147j = findViewById8 instanceof android.widget.TextView ? (android.widget.TextView) findViewById8 : null;
        android.view.View findViewById9 = view.findViewById(com.tencent.mm.R.id.bjn);
        this.f205146i = findViewById9 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById9 : null;
        android.view.View findViewById10 = view.findViewById(com.tencent.mm.R.id.bjl);
        this.f205148k = findViewById10 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) findViewById10 : null;
        android.view.View findViewById11 = view.findViewById(com.tencent.mm.R.id.bjq);
        this.f205150m = findViewById11 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById11 : null;
        android.view.View findViewById12 = view.findViewById(com.tencent.mm.R.id.bl6);
        this.f205151n = findViewById12 instanceof com.tencent.mm.ui.widget.MMPinProgressBtn ? (com.tencent.mm.ui.widget.MMPinProgressBtn) findViewById12 : null;
        android.view.View findViewById13 = this.convertView.findViewById(com.tencent.mm.R.id.bkq);
        this.f205152o = findViewById13 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById13 : null;
        android.view.View findViewById14 = this.convertView.findViewById(com.tencent.mm.R.id.f483695br0);
        this.f205153p = findViewById14 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById14 : null;
        android.view.View findViewById15 = view.findViewById(com.tencent.mm.R.id.bj_);
        this.f205154q = findViewById15 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById15 : null;
        android.view.View findViewById16 = view.findViewById(com.tencent.mm.R.id.bix);
        this.f205155r = findViewById16 instanceof android.widget.TextView ? (android.widget.TextView) findViewById16 : null;
        android.view.View findViewById17 = view.findViewById(com.tencent.mm.R.id.bjk);
        this.f205156s = findViewById17 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById17 : null;
        android.view.View findViewById18 = view.findViewById(com.tencent.mm.R.id.bkf);
        this.checkBox = findViewById18 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById18 : null;
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        android.view.View findViewById19 = view.findViewById(com.tencent.mm.R.id.brc);
        this.userTV = findViewById19 instanceof android.widget.TextView ? (android.widget.TextView) findViewById19 : null;
        android.view.View findViewById20 = view.findViewById(com.tencent.mm.R.id.a1l);
        this.f205157t = findViewById20 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) findViewById20 : null;
        android.view.View findViewById21 = view.findViewById(com.tencent.mm.R.id.inu);
        this.f205158u = findViewById21 instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById21 : null;
        android.view.View findViewById22 = view.findViewById(com.tencent.mm.R.id.bjy);
        this.f205159v = findViewById22 instanceof android.widget.LinearLayout ? (android.widget.LinearLayout) findViewById22 : null;
        android.view.View findViewById23 = view.findViewById(com.tencent.mm.R.id.bkg);
        this.clickArea = findViewById23 instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById23 : null;
        this.f205161x = view.findViewById(com.tencent.mm.R.id.biy);
        android.view.View findViewById24 = view.findViewById(com.tencent.mm.R.id.bjr);
        this.f205160w = findViewById24 instanceof android.widget.RelativeLayout ? (android.widget.RelativeLayout) findViewById24 : null;
        android.view.View findViewById25 = view.findViewById(com.tencent.mm.R.id.ken);
        this.f205162y = findViewById25 instanceof android.view.ViewStub ? (android.view.ViewStub) findViewById25 : null;
        android.view.View findViewById26 = view.findViewById(com.tencent.mm.R.id.bkt);
        this.f205163z = findViewById26 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById26 : null;
        this.A = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.bjb);
        this.C = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.js9);
        this.B = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.js8);
        return this;
    }

    public final void b(android.view.View view) {
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$AppMsgFinderLiveThemeHolder", "safeSetGone", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$AppMsgFinderLiveThemeHolder", "safeSetGone", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f205139b;
    }
}
