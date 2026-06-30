package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class o0 extends androidx.recyclerview.widget.k3 {
    public final android.view.View A;
    public final android.view.View B;
    public android.graphics.drawable.GradientDrawable C;
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView D;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f141594d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerRelativeLayout f141595e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f141596f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f141597g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f141598h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f141599i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f141600m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f141601n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.Button f141602o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f141603p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f141604q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f141605r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f141606s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f141607t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f141608u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f141609v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f141610w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f141611x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f141612y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f141613z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView, android.view.View view) {
        super(view);
        this.D = interactiveMsgMRecycleView;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.jsy);
        this.f141594d = viewGroup;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h6y);
        this.f141596f = imageView;
        this.f141595e = (com.tencent.mm.ui.widget.RoundCornerRelativeLayout) view.findViewById(com.tencent.mm.R.id.f485297h74);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
        this.f141597g = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gog);
        this.f141598h = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.prj);
        this.f141599i = textView3;
        this.f141600m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jry);
        this.f141601n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486683m45);
        this.f141602o = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.m3p);
        this.f141604q = view.findViewById(com.tencent.mm.R.id.gm6);
        this.f141611x = view.findViewById(com.tencent.mm.R.id.gmc);
        this.f141613z = view.findViewById(com.tencent.mm.R.id.gm8);
        this.f141612y = view.findViewById(com.tencent.mm.R.id.gm7);
        this.f141603p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483931ci2);
        this.f141606s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z);
        this.f141605r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482504gc);
        this.f141607t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.nec);
        this.f141608u = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.klt);
        this.f141610w = view.findViewById(com.tencent.mm.R.id.gnm);
        this.A = view.findViewById(com.tencent.mm.R.id.k9p);
        this.B = view.findViewById(com.tencent.mm.R.id.ilo);
        this.f141609v = view.findViewById(com.tencent.mm.R.id.gmb);
        viewGroup.setOnLongClickListener(interactiveMsgMRecycleView.f141497j2);
        viewGroup.setOnClickListener(interactiveMsgMRecycleView.f141497j2);
        imageView.setOnLongClickListener(interactiveMsgMRecycleView.f141497j2);
        imageView.setOnClickListener(interactiveMsgMRecycleView.f141497j2);
        textView.setOnLongClickListener(interactiveMsgMRecycleView.f141497j2);
        textView.setOnClickListener(interactiveMsgMRecycleView.f141497j2);
        textView2.setOnClickListener(interactiveMsgMRecycleView.f141497j2);
        textView3.setOnClickListener(interactiveMsgMRecycleView.f141497j2);
        textView2.setOnLongClickListener(interactiveMsgMRecycleView.f141497j2);
        textView3.setOnLongClickListener(interactiveMsgMRecycleView.f141497j2);
    }
}
