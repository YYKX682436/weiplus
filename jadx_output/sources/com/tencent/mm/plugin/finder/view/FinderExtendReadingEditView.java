package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderExtendReadingEditView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderExtendReadingEditView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f131036d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f131037e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f131038f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f131039g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f131040h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f131041i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f131042m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f131043n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f131044o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f131045p;

    public FinderExtendReadingEditView(android.content.Context context) {
        super(context);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.agp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ecq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131038f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.eco);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131039g = textView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f131040h = textView2;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ecn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131045p = (android.widget.LinearLayout) findViewById4;
        d92.f fVar = d92.f.f227470a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView2.setTextSize(1, fVar.d(context2, 15.0f, false));
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        textView.setTextSize(1, fVar.d(context3, 16.0f, false));
        dq4.c cVar = dq4.c.f242369a;
        cVar.f(textView2);
        cVar.f(textView);
        cVar.f(findViewById);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ljs);
        findViewById5.post(new com.tencent.mm.plugin.finder.view.c9(findViewById5, this));
        findViewById5.setOnClickListener(com.tencent.mm.plugin.finder.view.d9.f131883d);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.ecr);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        this.f131041i = mMEditText;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.ecs);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131042m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.ecp);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131043n = findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.ect);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f131044o = (android.widget.TextView) findViewById9;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.e9(this));
        findViewById8.setOnClickListener(new com.tencent.mm.plugin.finder.view.f9(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.g9(this));
        b();
        a();
    }

    public final void a() {
        java.lang.String obj = this.f131041i.getText().toString();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(obj);
        android.widget.TextView textView = this.f131039g;
        if (K0) {
            textView.setOnClickListener(null);
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478987mq));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481555wh);
        } else {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.view.h9(this, obj));
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481557wj);
        }
    }

    public final void b() {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0("");
        android.widget.TextView textView = this.f131044o;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f131041i;
        android.widget.TextView textView2 = this.f131042m;
        if (K0 || !(!com.tencent.mm.sdk.platformtools.t8.K0(""))) {
            textView2.setVisibility(8);
            if (mMEditText.getVisibility() == 0) {
                textView.setVisibility(0);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(mMEditText.getText().toString(), "")) {
            textView2.setVisibility(8);
            return;
        }
        if (getVisibility() == 0) {
            textView2.setVisibility(0);
            textView.setVisibility(8);
        }
        textView2.setText(getContext().getString(com.tencent.mm.R.string.cu8, ""));
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.view.i9(this, ""));
    }

    public FinderExtendReadingEditView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.agp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ecq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131038f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.eco);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131039g = textView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f131040h = textView2;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ecn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131045p = (android.widget.LinearLayout) findViewById4;
        d92.f fVar = d92.f.f227470a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView2.setTextSize(1, fVar.d(context2, 15.0f, false));
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        textView.setTextSize(1, fVar.d(context3, 16.0f, false));
        dq4.c cVar = dq4.c.f242369a;
        cVar.f(textView2);
        cVar.f(textView);
        cVar.f(findViewById);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ljs);
        findViewById5.post(new com.tencent.mm.plugin.finder.view.c9(findViewById5, this));
        findViewById5.setOnClickListener(com.tencent.mm.plugin.finder.view.d9.f131883d);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.ecr);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        this.f131041i = mMEditText;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.ecs);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131042m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.ecp);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131043n = findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.ect);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f131044o = (android.widget.TextView) findViewById9;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.e9(this));
        findViewById8.setOnClickListener(new com.tencent.mm.plugin.finder.view.f9(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.g9(this));
        b();
        a();
    }

    public FinderExtendReadingEditView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.agp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ecq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131038f = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.eco);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131039g = textView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f131040h = textView2;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.ecn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f131045p = (android.widget.LinearLayout) findViewById4;
        d92.f fVar = d92.f.f227470a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        textView2.setTextSize(1, fVar.d(context2, 15.0f, false));
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        textView.setTextSize(1, fVar.d(context3, 16.0f, false));
        dq4.c cVar = dq4.c.f242369a;
        cVar.f(textView2);
        cVar.f(textView);
        cVar.f(findViewById);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.ljs);
        findViewById5.post(new com.tencent.mm.plugin.finder.view.c9(findViewById5, this));
        findViewById5.setOnClickListener(com.tencent.mm.plugin.finder.view.d9.f131883d);
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.ecr);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById6;
        this.f131041i = mMEditText;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.ecs);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f131042m = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.ecp);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f131043n = findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.ect);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f131044o = (android.widget.TextView) findViewById9;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.e9(this));
        findViewById8.setOnClickListener(new com.tencent.mm.plugin.finder.view.f9(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.g9(this));
        b();
        a();
    }
}
