package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class s0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f141625d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f141626e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f141627f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f141628g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f141629h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f141630i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f141631m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f141632n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f141633o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f141634p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f141635q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f141636r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.t0 f141637s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(com.tencent.mm.plugin.game.ui.message.t0 t0Var, android.view.View view) {
        super(view);
        this.f141637s = t0Var;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jsy);
        this.f141625d = viewGroup;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h6y);
        this.f141626e = imageView;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
        this.f141627f = textView;
        this.f141628g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jry);
        this.f141629h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m4i);
        this.f141630i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486683m45);
        this.f141631m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483931ci2);
        this.f141632n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z);
        this.f141633o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nec);
        this.f141634p = view.findViewById(com.tencent.mm.R.id.gnm);
        this.f141635q = view.findViewById(com.tencent.mm.R.id.k9p);
        this.f141636r = view.findViewById(com.tencent.mm.R.id.ilo);
        viewGroup.setOnLongClickListener(t0Var.f141643f2);
        com.tencent.mm.plugin.game.ui.message.j1 j1Var = t0Var.f141643f2;
        viewGroup.setOnClickListener(j1Var);
        imageView.setOnLongClickListener(j1Var);
        imageView.setOnClickListener(j1Var);
        textView.setOnLongClickListener(j1Var);
        textView.setOnClickListener(j1Var);
    }
}
