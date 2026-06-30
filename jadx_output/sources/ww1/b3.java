package ww1;

/* loaded from: classes15.dex */
public class b3 {
    public android.widget.TextView A;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView B;
    public android.widget.LinearLayout C;
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView D;
    public android.widget.TextView E;
    public android.widget.TextView F;
    public android.widget.ImageView G;
    public android.widget.RelativeLayout H;
    public android.widget.RelativeLayout I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f450120J;
    public android.view.View K;
    public com.tencent.mm.wallet_core.ui.WalletTextView L;
    public androidx.recyclerview.widget.RecyclerView M;
    public ww1.x2 N;
    public android.widget.LinearLayout O;
    public android.widget.LinearLayout P;
    public com.tencent.mm.ui.widget.imageview.WeImageView Q;
    public android.widget.TextView R;
    public android.widget.LinearLayout S;
    public android.widget.Button T;
    public android.widget.Button U;
    public android.widget.RelativeLayout V;
    public android.widget.LinearLayout W;
    public com.tencent.mm.ui.widget.imageview.WeImageView X;
    public android.widget.LinearLayout Y;
    public android.widget.TextView Z;

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f450121a;

    /* renamed from: a0, reason: collision with root package name */
    public android.widget.LinearLayout f450122a0;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.RelativeLayout f450123b;

    /* renamed from: b0, reason: collision with root package name */
    public android.widget.RelativeLayout f450124b0;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.RelativeLayout f450125c;

    /* renamed from: c0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f450126c0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f450127d;

    /* renamed from: d0, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f450128d0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f450129e;

    /* renamed from: e0, reason: collision with root package name */
    public android.widget.TextView f450130e0;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f450131f;

    /* renamed from: f0, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f450132f0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f450133g;

    /* renamed from: g0, reason: collision with root package name */
    public android.widget.TextView f450134g0;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f450135h;

    /* renamed from: h0, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f450136h0;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f450137i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.RelativeLayout f450138j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f450139k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f450140l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f450141m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.RelativeLayout f450142n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f450143o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.LinearLayout f450144p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.WalletTextView f450145q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f450146r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f450147s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.RelativeLayout f450148t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f450149u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f450150v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f450151w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f450152x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.RelativeLayout f450153y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f450154z;

    public void a(android.view.View view, android.content.Context context, int i17) {
        this.f450121a = view;
        this.f450123b = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c5r);
        this.f450125c = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c5q);
        this.f450131f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c5v);
        this.f450133g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c5t);
        this.f450135h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.put);
        this.f450127d = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c5s);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c5u);
        this.f450129e = weImageView;
        weImageView.setRotation(270.0f);
        this.f450125c.setBackgroundResource(com.tencent.mm.R.drawable.f481303pz);
        this.f450123b.setBackgroundResource(com.tencent.mm.R.drawable.f481301px);
        if (i17 == 2) {
            this.f450131f.setText(context.getString(com.tencent.mm.R.string.b_r));
            this.f450127d.setImageResource(com.tencent.mm.R.raw.icon_outlined_collect_mch);
        } else {
            this.f450131f.setText(context.getString(com.tencent.mm.R.string.b_t));
            this.f450127d.setImageResource(com.tencent.mm.R.raw.icon_outlined_collect_personal);
        }
        this.f450138j = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c2i);
        this.f450137i = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c2j);
        this.f450139k = view.findViewById(com.tencent.mm.R.id.c4k);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c5p);
        this.f450140l = textView;
        com.tencent.mm.wallet_core.ui.r1.d(textView);
        this.f450141m = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.q0j);
        this.f450142n = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.q0g);
        this.f450143o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.q0k);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.q0h)).setRotation(90.0f);
        this.f450148t = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c4u);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.c4t);
        this.f450149u = imageView;
        if (i17 == 2) {
            imageView.setContentDescription(context.getString(com.tencent.mm.R.string.b_q));
        } else {
            imageView.setContentDescription(context.getString(com.tencent.mm.R.string.b_s));
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f450148t.getLayoutParams();
        layoutParams.width = i65.a.b(context, 206);
        layoutParams.height = i65.a.b(context, 206);
        this.f450148t.setLayoutParams(layoutParams);
        this.f450144p = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c2s);
        this.f450145q = (com.tencent.mm.wallet_core.ui.WalletTextView) view.findViewById(com.tencent.mm.R.id.c2q);
        this.f450146r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c2o);
        this.f450147s = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c2p);
        this.f450150v = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c5g);
        this.f450151w = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c5o);
        this.f450152x = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c4n);
        this.f450153y = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.sv9);
        this.f450154z = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.sv_);
        this.A = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.sva);
        this.B = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.sv8);
        this.C = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c28);
        this.D = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.c27);
        this.E = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c2g);
        this.F = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c2h);
        this.G = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.c2f);
        this.H = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c2e);
        this.I = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c2d);
        this.f450120J = view.findViewById(com.tencent.mm.R.id.c2c);
        this.K = view.findViewById(com.tencent.mm.R.id.c2b);
        this.L = (com.tencent.mm.wallet_core.ui.WalletTextView) view.findViewById(com.tencent.mm.R.id.c2_);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view.findViewById(com.tencent.mm.R.id.c29);
        this.M = recyclerView;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        this.O = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c49);
        this.P = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.pus);
        this.Q = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c4a);
        this.R = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c4c);
        this.S = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483817rg5);
        this.T = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.c4_);
        this.U = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.c4b);
        this.V = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c2x);
        this.W = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483803c30);
        this.X = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c2z);
        this.Y = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.c2w);
        this.Z = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c2y);
        this.f450122a0 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483819c51);
        this.f450124b0 = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.c4w);
        this.f450130e0 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.c4z);
        this.f450126c0 = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c4x);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.c4y);
        this.f450128d0 = weImageView2;
        weImageView2.setRotation(270.0f);
        if (i17 == 2) {
            this.f450130e0.setText(context.getString(com.tencent.mm.R.string.b_r));
            this.f450126c0.setImageResource(com.tencent.mm.R.raw.icon_outlined_collect_mch);
        } else {
            this.f450130e0.setText(context.getString(com.tencent.mm.R.string.b_t));
            this.f450126c0.setImageResource(com.tencent.mm.R.raw.icon_outlined_collect_personal);
        }
        this.f450132f0 = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view.findViewById(com.tencent.mm.R.id.c4v);
        this.f450134g0 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483820c52);
        this.f450136h0 = (com.tencent.mm.wallet_core.ui.WalletTextView) view.findViewById(com.tencent.mm.R.id.f483818c50);
    }
}
