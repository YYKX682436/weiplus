package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R0\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "", "color", "Ljz5/f0;", "setTab2Color", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "onClick", "Lkotlin/Function1;", "n", "Lyz5/l;", "getOnTabSelectedListener", "()Lyz5/l;", "setOnTabSelectedListener", "(Lyz5/l;)V", "onTabSelectedListener", "", "value", "getTab1Text", "()Ljava/lang/String;", "setTab1Text", "(Ljava/lang/String;)V", "tab1Text", "getTab2Text", "setTab2Text", "tab2Text", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveTextIndicator extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f116111o = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f116112d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f116113e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f116114f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f116115g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f116116h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f116117i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f116118m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.l onTabSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveTextIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.b08, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fnd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f116112d = textView;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fng);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById2;
        this.f116113e = textView2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.fnf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116114f = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.fni);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f116115g = findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.fne);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f116116h = findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.fnh);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f116117i = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.fnc);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f116118m = findViewById7;
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vd2.x5.f436012g);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            textView.setText(obtainStyledAttributes.getString(0));
            textView2.setText(obtainStyledAttributes.getString(1));
            obtainStyledAttributes.recycle();
        }
        textView.setAlpha(1.0f);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        findViewById7.post(new com.tencent.mm.plugin.finder.live.view.ob(this));
    }

    public final void a(boolean z17) {
        android.view.View view = this.f116114f;
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab1RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab1RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(boolean z17) {
        android.view.View view = this.f116115g;
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab2RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab2RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final yz5.l getOnTabSelectedListener() {
        return this.onTabSelectedListener;
    }

    public final java.lang.String getTab1Text() {
        java.lang.String obj;
        java.lang.CharSequence text = this.f116112d.getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final java.lang.String getTab2Text() {
        java.lang.String obj;
        java.lang.CharSequence text = this.f116113e.getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTextIndicator", "onAttachedToWindow tab1Tv.measuredWidth:" + this.f116112d.getMeasuredWidth());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        yz5.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fnd) {
            yz5.l lVar2 = this.onTabSelectedListener;
            if (lVar2 != null) {
                lVar2.invoke(0);
            }
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fng && (lVar = this.onTabSelectedListener) != null) {
            lVar.invoke(1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setOnTabSelectedListener(yz5.l lVar) {
        this.onTabSelectedListener = lVar;
    }

    public final void setTab1Text(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f116112d.setText(value);
    }

    public final void setTab2Color(int i17) {
        this.f116112d.setTextColor(i17);
        this.f116113e.setTextColor(i17);
        this.f116118m.setBackgroundColor(i17);
    }

    public final void setTab2Text(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f116113e.setText(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveTextIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
