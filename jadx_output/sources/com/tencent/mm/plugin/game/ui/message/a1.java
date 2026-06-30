package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class a1 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f141512d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f141513e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f141514f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f141515g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f141516h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f141517i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f141518m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f141519n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f141520o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f141521p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.c1 f141522q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.game.ui.message.c1 c1Var, android.view.View view) {
        super(view);
        this.f141522q = c1Var;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jsy);
        this.f141512d = viewGroup;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h6y);
        this.f141513e = imageView;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
        this.f141514f = textView;
        this.f141515g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bbg);
        this.f141516h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bcj);
        this.f141517i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.b9f);
        this.f141518m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z);
        this.f141519n = view.findViewById(com.tencent.mm.R.id.gnm);
        this.f141520o = view.findViewById(com.tencent.mm.R.id.k9p);
        this.f141521p = view.findViewById(com.tencent.mm.R.id.ilo);
        viewGroup.setOnLongClickListener(c1Var.f141538f2);
        com.tencent.mm.plugin.game.ui.message.j1 j1Var = c1Var.f141538f2;
        viewGroup.setOnClickListener(j1Var);
        imageView.setOnLongClickListener(j1Var);
        imageView.setOnClickListener(j1Var);
        textView.setOnLongClickListener(j1Var);
        textView.setOnClickListener(j1Var);
    }
}
