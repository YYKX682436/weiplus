package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ik {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f118678a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f118679b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f118680c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f118681d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f118682e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f118683f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f118684g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f118685h;

    public ik(com.tencent.mm.ui.MMActivity activity, android.view.ViewGroup licenseContainer, yz5.a aVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(licenseContainer, "licenseContainer");
        this.f118678a = activity;
        this.f118679b = licenseContainer;
        this.f118680c = aVar;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) licenseContainer.findViewById(com.tencent.mm.R.id.fgg);
        this.f118681d = liveBottomSheetPanel;
        android.widget.TextView tipTv = (android.widget.TextView) licenseContainer.findViewById(com.tencent.mm.R.id.fgi);
        this.f118682e = tipTv;
        android.widget.TextView textView = (android.widget.TextView) licenseContainer.findViewById(com.tencent.mm.R.id.fgf);
        android.widget.TextView textView2 = (android.widget.TextView) licenseContainer.findViewById(com.tencent.mm.R.id.fgk);
        android.view.View findViewById = licenseContainer.findViewById(com.tencent.mm.R.id.fgd);
        this.f118683f = findViewById;
        android.view.View findViewById2 = licenseContainer.findViewById(com.tencent.mm.R.id.fge);
        this.f118684g = findViewById2;
        liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(activity).y);
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.widget.ek(this));
        android.view.ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += com.tencent.mm.ui.bl.c(licenseContainer.getContext());
        kotlin.jvm.internal.o.f(tipTv, "tipTv");
        b(tipTv);
        textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.fk(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.gk(this));
        com.tencent.mm.ui.fk.a(textView2);
        com.tencent.mm.ui.fk.a(textView);
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.hk(this));
    }

    public final void a() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel contentGroup = this.f118681d;
        kotlin.jvm.internal.o.f(contentGroup, "contentGroup");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(contentGroup, null, 1, null);
    }

    public final void b(android.widget.TextView textView) {
        android.text.SpannableString h17 = com.tencent.mm.plugin.finder.assist.b3.f102022a.h(this.f118678a, com.tencent.mm.R.string.dgj, this.f118685h);
        textView.setHighlightColor(textView.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(h17);
    }
}
