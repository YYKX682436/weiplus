package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes9.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f187126a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f187127b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.neattextview.textview.view.NeatTextView f187128c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f187129d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f187130e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f187131f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f187132g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f187133h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f187134i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ImageView f187135j;

    public c5(com.tencent.mm.plugin.webview.ui.tools.widget.l5 l5Var, android.view.View itemView) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f187126a = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.ase);
        this.f187127b = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.asd);
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) itemView.findViewById(com.tencent.mm.R.id.asb);
        this.f187128c = neatTextView;
        this.f187129d = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.asc);
        this.f187130e = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.ajj);
        this.f187131f = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.ajl);
        this.f187132g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.ajo);
        this.f187133h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.ajm);
        this.f187134i = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.aot);
        this.f187135j = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.aou);
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.d(context);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478195d8, typedValue, true);
        neatTextView.setTextColor(b3.l.getColor(context, typedValue.resourceId));
    }
}
