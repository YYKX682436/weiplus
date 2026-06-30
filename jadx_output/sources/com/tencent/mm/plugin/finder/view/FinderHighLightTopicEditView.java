package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHighLightTopicEditView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FinderHighLightTopicEditView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f131126d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f131127e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMEditText f131128f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f131129g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f131130h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f131131i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f131132m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f131133n;

    public FinderHighLightTopicEditView(android.content.Context context) {
        super(context);
        this.f131133n = "";
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dlp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qsb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131126d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qse);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131127e = textView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qsg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
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
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.qsd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        this.f131128f = mMEditText;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.qsc);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f131129g = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.qsa);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f131130h = findViewById6;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.va(this));
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.finder.view.wa(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.view.xa(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.ya(this));
    }

    public FinderHighLightTopicEditView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131133n = "";
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dlp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qsb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131126d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qse);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131127e = textView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qsg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
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
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.qsd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        this.f131128f = mMEditText;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.qsc);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f131129g = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.qsa);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f131130h = findViewById6;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.va(this));
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.finder.view.wa(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.view.xa(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.ya(this));
    }

    public FinderHighLightTopicEditView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f131133n = "";
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dlp, (android.view.ViewGroup) null);
        addView(inflate, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.qsb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f131126d = findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qse);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f131127e = textView;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.qsg);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
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
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.qsd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        this.f131128f = mMEditText;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.qsc);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f131129g = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.qsa);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f131130h = findViewById6;
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.view.va(this));
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.finder.view.wa(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.view.xa(this));
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.view.ya(this));
    }
}
