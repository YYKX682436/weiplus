package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class pe extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.oe f205255h = new com.tencent.mm.ui.chatting.viewitems.oe(null);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f205256i = jz5.h.b(com.tencent.mm.ui.chatting.viewitems.le.f204461d);

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.ting.widget.MusicView f205257b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f205258c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f205259d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f205260e;

    /* renamed from: f, reason: collision with root package name */
    public int f205261f;

    /* renamed from: g, reason: collision with root package name */
    public int f205262g;

    public final com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View convertView, boolean z17) {
        kotlin.jvm.internal.o.g(convertView, "convertView");
        super.create(convertView);
        this.clickArea = convertView.findViewById(com.tencent.mm.R.id.bpl);
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.bpm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.brc);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.userTV = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = convertView.findViewById(com.tencent.mm.R.id.q3t);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f205257b = (com.tencent.mm.plugin.ting.widget.MusicView) findViewById3;
        android.view.View findViewById4 = convertView.findViewById(com.tencent.mm.R.id.bps);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f205258c = (android.widget.LinearLayout) findViewById4;
        android.view.View findViewById5 = convertView.findViewById(com.tencent.mm.R.id.bpt);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMRoundCornerImageView");
        this.f205259d = (com.tencent.mm.ui.widget.MMRoundCornerImageView) findViewById5;
        android.view.View findViewById6 = convertView.findViewById(com.tencent.mm.R.id.bpu);
        kotlin.jvm.internal.o.e(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        this.f205260e = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = convertView.findViewById(com.tencent.mm.R.id.bkf);
        kotlin.jvm.internal.o.e(findViewById7, "null cannot be cast to non-null type android.widget.CheckBox");
        this.checkBox = (android.widget.CheckBox) findViewById7;
        this.maskView = convertView.findViewById(com.tencent.mm.R.id.bpa);
        android.view.View findViewById8 = convertView.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = findViewById8 instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById8 : null;
        android.widget.TextView textView = this.f205260e;
        if (textView == null) {
            kotlin.jvm.internal.o.o("musicSourceTV");
            throw null;
        }
        if (textView == null) {
            kotlin.jvm.internal.o.o("musicSourceTV");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        if (!z17) {
            android.view.View findViewById9 = convertView.findViewById(com.tencent.mm.R.id.bqz);
            kotlin.jvm.internal.o.e(findViewById9, "null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f205261f = com.tencent.mm.ui.chatting.w5.h(convertView.getContext());
        this.f205262g = i65.a.b(convertView.getContext(), 28);
        return this;
    }
}
