package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class a extends in5.s0 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f143336n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f143337o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f143338p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f143339q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.CheckBox f143340r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f143341s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f143342t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View convertView) {
        super(convertView);
        kotlin.jvm.internal.o.g(convertView, "convertView");
        android.content.Context context = convertView.getContext();
        android.view.View findViewById = convertView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f143337o = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = convertView.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f143338p = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = convertView.findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f143339q = (android.widget.TextView) findViewById3;
        this.f143336n = convertView.findViewById(com.tencent.mm.R.id.che);
        android.view.View findViewById4 = convertView.findViewById(com.tencent.mm.R.id.mie);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.widget.CheckBox");
        this.f143340r = (android.widget.CheckBox) findViewById4;
        android.widget.ImageView imageView = (android.widget.ImageView) convertView.findViewById(com.tencent.mm.R.id.c8h);
        android.view.View findViewById5 = convertView.findViewById(com.tencent.mm.R.id.kjo);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        this.f143342t = (android.widget.TextView) findViewById5;
        this.f143341s = convertView.findViewById(com.tencent.mm.R.id.c8i);
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.sns_label_more_btn, context.getResources().getColor(com.tencent.mm.R.color.FG_4)));
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        convertView.setTag(this);
    }
}
