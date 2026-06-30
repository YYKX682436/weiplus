package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class k0 extends androidx.recyclerview.widget.k3 {
    public final android.widget.RelativeLayout A;
    public final android.widget.TextView B;
    public final android.widget.RelativeLayout C;
    public final android.widget.CheckBox D;
    public final android.widget.RelativeLayout E;
    public final android.widget.CheckBox F;
    public final android.view.View G;
    public final android.view.View H;
    public android.animation.Animator I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f188020J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f188021d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webwx.ui.r f188022e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.RelativeLayout f188023f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f188024g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f188025h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.RelativeLayout f188026i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f188027m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.RelativeLayout f188028n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.RelativeLayout f188029o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f188030p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f188031q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.RelativeLayout f188032r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f188033s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.LinearLayout f188034t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.RelativeLayout f188035u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f188036v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f188037w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.progress.MMProgressWheel f188038x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f188039y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.RelativeLayout f188040z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, android.view.View itemView, com.tencent.mm.plugin.webwx.ui.r rVar) {
        super(itemView);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f188021d = context;
        this.f188022e = rVar;
        this.f188023f = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.f484073cx0);
        this.f188024g = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.nhu);
        this.f188025h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.nhq);
        this.f188026i = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.gzt);
        this.f188027m = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.msc);
        this.f188028n = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.cwy);
        this.f188029o = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.cwz);
        this.f188030p = itemView.findViewById(com.tencent.mm.R.id.f484076cx3);
        this.f188031q = itemView.findViewById(com.tencent.mm.R.id.byw);
        this.f188032r = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.cwv);
        this.f188033s = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.h7d);
        this.f188034t = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.f485693io2);
        this.f188035u = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.f484077cx4);
        this.f188036v = (com.tencent.mm.ui.widget.imageview.WeImageView) itemView.findViewById(com.tencent.mm.R.id.h76);
        this.f188037w = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f484078cx5);
        this.f188038x = (com.tencent.mm.ui.widget.progress.MMProgressWheel) itemView.findViewById(com.tencent.mm.R.id.cx6);
        this.f188039y = (android.widget.LinearLayout) itemView.findViewById(com.tencent.mm.R.id.cwx);
        this.f188040z = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.cww);
        this.A = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.cx8);
        this.B = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.cx7);
        this.C = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.a9j);
        this.D = (android.widget.CheckBox) itemView.findViewById(com.tencent.mm.R.id.a9h);
        this.E = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.rsg);
        this.F = (android.widget.CheckBox) itemView.findViewById(com.tencent.mm.R.id.rsf);
        this.G = itemView.findViewById(com.tencent.mm.R.id.f485244h05);
        this.H = itemView.findViewById(com.tencent.mm.R.id.f485245h06);
    }

    public static final boolean i(com.tencent.mm.plugin.webwx.ui.k0 k0Var, ug3.k kVar) {
        k0Var.getClass();
        if (!gm0.j1.a()) {
            return false;
        }
        boolean z17 = !k0Var.f188020J;
        k0Var.f188020J = z17;
        k0Var.j(z17);
        int o17 = c01.z1.o();
        int i17 = k0Var.f188020J ? o17 | 8192 : o17 & (-8193);
        ip.l.t(i17);
        c01.d9.b().p().w(40, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.webwx.ui.r rVar = k0Var.f188022e;
        if (rVar != null) {
            ((com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI) rVar).f187982d = true;
        }
        k0Var.l(kVar);
        if (rVar != null) {
            ((com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI) rVar).notifyDataSetChanged();
        }
        return true;
    }

    public final void j(boolean z17) {
        android.widget.RelativeLayout relativeLayout = this.f188032r;
        if (relativeLayout != null) {
            relativeLayout.setTag(java.lang.Boolean.valueOf(z17));
            android.content.Context context = this.f188021d;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f188033s;
            if (z17) {
                relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481266oy);
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            } else {
                relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481267oz);
                weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            }
        }
    }

    public final void k(boolean z17) {
        android.widget.TextView textView = this.f188037w;
        android.content.Context context = this.f188021d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f188036v;
        android.widget.RelativeLayout relativeLayout = this.f188035u;
        if (z17) {
            relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481267oz);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            textView.setText(com.tencent.mm.R.string.f493672l80);
        } else {
            relativeLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481266oy);
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            textView.setText(com.tencent.mm.R.string.f493673l81);
        }
    }

    public final void l(ug3.k kVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(kVar.f427555s)) {
            return;
        }
        this.f188025h.setText(kVar.f427555s);
        int i17 = kVar.f392471n;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f188024g;
        if (i17 == 1) {
            if (this.K) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_display_lock);
                return;
            } else {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_display);
                return;
            }
        }
        if (i17 == 2) {
            if (this.K) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_imac_lock);
                return;
            } else {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_imac);
                return;
            }
        }
        if (i17 == 3) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_pad);
            return;
        }
        if (i17 == 7) {
            weImageView.setImageResource(com.tencent.mm.R.raw.connect_kidwatch);
            return;
        }
        if (i17 == 6) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_car);
            return;
        }
        if (i17 == 8) {
            if (this.f188031q.getVisibility() == 8 || this.f188020J) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_android_pad);
                return;
            } else {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_android_pad);
                return;
            }
        }
        if (i17 == 10) {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_folder);
            return;
        }
        if (i17 == 13) {
            weImageView.setImageResource(com.tencent.mm.R.raw.connect_rtoswatch);
        } else if (i17 == 14) {
            weImageView.setImageResource(com.tencent.mm.R.raw.connect_rtoswatch);
        } else {
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_display);
        }
    }
}
