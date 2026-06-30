package com.tencent.mm.plugin.profile.ui.tab.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002$%B\u0019\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B!\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b \u0010#R.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR/\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R/\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/tab/view/BizProfileFollowMoreView;", "Landroid/widget/LinearLayout;", "", "Lkotlin/Function1;", "", "Ljz5/f0;", "p", "Lyz5/l;", "getClickReporter", "()Lyz5/l;", "setClickReporter", "(Lyz5/l;)V", "clickReporter", "", "<set-?>", "r", "Lb06/d;", "getMoreUrl", "()Ljava/lang/String;", "setMoreUrl", "(Ljava/lang/String;)V", "moreUrl", "s", "getFocusBtnWidth", "()Ljava/lang/Integer;", "setFocusBtnWidth", "(Ljava/lang/Integer;)V", "focusBtnWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "as3/a", "as3/b", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class BizProfileFollowMoreView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f154629t = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView.class, "moreUrl", "getMoreUrl()Ljava/lang/String;", 0)), kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView.class, "focusBtnWidth", "getFocusBtnWidth()Ljava/lang/Integer;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f154630d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f154631e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f154632f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f154633g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMProcessBar f154634h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f154635i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f154636m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f154637n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f154638o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public yz5.l clickReporter;

    /* renamed from: q, reason: collision with root package name */
    public as3.b f154640q;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final b06.d moreUrl;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final b06.d focusBtnWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileFollowMoreView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f154637n = new java.util.ArrayList();
        this.clickReporter = as3.c.f13494d;
        this.moreUrl = new as3.j(null, this);
        this.focusBtnWidth = new as3.k(108, this);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488680a13, (android.view.ViewGroup) this, true);
    }

    private final java.lang.Integer getFocusBtnWidth() {
        return (java.lang.Integer) ((b06.b) this.focusBtnWidth).b(this, f154629t[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getMoreUrl() {
        return (java.lang.String) ((b06.b) this.moreUrl).b(this, f154629t[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFocusBtnWidth(java.lang.Integer num) {
        ((b06.b) this.focusBtnWidth).a(this, f154629t[1], num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMoreUrl(java.lang.String str) {
        ((b06.b) this.moreUrl).a(this, f154629t[0], str);
    }

    public final yz5.l getClickReporter() {
        return this.clickReporter;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.String str = this.f154638o;
        if (str == null) {
            java.util.Set set = qv.h.f366860a;
            return;
        }
        java.util.Set set2 = qv.h.f366860a;
        if (set2 != null) {
            ((java.util.HashSet) set2).remove(str);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.akd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154630d = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.akc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f154631e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ake);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f154632f = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.ak6);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f154633g = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.aka);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f154634h = (com.tencent.mm.ui.widget.MMProcessBar) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.akb);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f154635i = (android.widget.TextView) findViewById6;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f154630d;
        if (wxRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(getContext());
        linearLayoutManager.Q(0);
        wxRecyclerView.setLayoutManager(linearLayoutManager);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f154630d;
        if (wxRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView2.N(new as3.e(this));
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView$initView$3
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new as3.a();
            }
        }, this.f154637n, false);
        this.f154636m = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new as3.f(this);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f154630d;
        if (wxRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        wxRecyclerView3.setAdapter(wxRecyclerAdapter);
        android.widget.TextView textView = this.f154632f;
        if (textView != null) {
            textView.setOnClickListener(new as3.g(this));
        } else {
            kotlin.jvm.internal.o.o("moreTv");
            throw null;
        }
    }

    public final void setClickReporter(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.clickReporter = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizProfileFollowMoreView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f154637n = new java.util.ArrayList();
        this.clickReporter = as3.c.f13494d;
        this.moreUrl = new as3.l(null, this);
        this.focusBtnWidth = new as3.m(108, this);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f488680a13, (android.view.ViewGroup) this, true);
    }
}
