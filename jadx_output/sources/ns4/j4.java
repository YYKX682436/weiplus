package ns4;

/* loaded from: classes8.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f339559a;

    /* renamed from: b, reason: collision with root package name */
    public final ns4.k4 f339560b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.y1 f339561c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f339562d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f339563e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f339564f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f339565g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f339566h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.CheckBox f339567i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f339568j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.Button f339569k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.Button f339570l;

    public j4(android.content.Context context, ns4.k4 parameter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parameter, "parameter");
        this.f339559a = context;
        this.f339560b = parameter;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
        this.f339561c = y1Var;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489616d64, null);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.cgr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f339562d = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.h5n);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f339563e = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f339564f = textView;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.cgi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById4;
        this.f339565g = textView2;
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.f482790o2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f339566h = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.btf);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f339567i = (android.widget.CheckBox) findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.lci);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f339568j = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.b5j);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f339569k = (android.widget.Button) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.c_3);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f339570l = (android.widget.Button) findViewById9;
        y1Var.k(inflate);
        y1Var.f212038t = new ns4.f4(this);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = this.f339563e;
        if (cdnImageView == null) {
            kotlin.jvm.internal.o.o("icon");
            throw null;
        }
        cdnImageView.setImageDrawable(context.getDrawable(com.tencent.mm.R.raw.webeans));
        java.lang.String str = parameter.f339578a.f378568d;
        boolean z17 = str == null || str.length() == 0;
        r45.ka7 ka7Var = parameter.f339578a;
        if (!z17) {
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView2 = this.f339563e;
            if (cdnImageView2 == null) {
                kotlin.jvm.internal.o.o("icon");
                throw null;
            }
            cdnImageView2.setUrl(ka7Var.f378568d);
        }
        android.widget.TextView textView3 = this.f339564f;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            throw null;
        }
        textView3.setText(ka7Var.f378569e);
        android.widget.TextView textView4 = this.f339565g;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("content");
            throw null;
        }
        textView4.setText(ka7Var.f378570f);
        android.widget.TextView textView5 = this.f339568j;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("protocol");
            throw null;
        }
        textView5.setText(ka7Var.f378571g);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView textView6 = this.f339568j;
        if (textView6 == null) {
            kotlin.jvm.internal.o.o("protocol");
            throw null;
        }
        ((ke0.e) xVar).getClass();
        android.text.SpannableString p17 = com.tencent.mm.pluginsdk.ui.span.c0.p(textView6, 1, false, null);
        android.widget.TextView textView7 = this.f339568j;
        if (textView7 == null) {
            kotlin.jvm.internal.o.o("protocol");
            throw null;
        }
        textView7.setText(p17);
        android.widget.TextView textView8 = this.f339568j;
        if (textView8 == null) {
            kotlin.jvm.internal.o.o("protocol");
            throw null;
        }
        textView8.setClickable(true);
        android.widget.TextView textView9 = this.f339568j;
        if (textView9 == null) {
            kotlin.jvm.internal.o.o("protocol");
            throw null;
        }
        textView9.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
        android.widget.TextView textView10 = this.f339568j;
        if (textView10 == null) {
            kotlin.jvm.internal.o.o("protocol");
            throw null;
        }
        textView10.setOnClickListener(new ns4.g4(this));
        android.widget.Button button = this.f339569k;
        if (button == null) {
            kotlin.jvm.internal.o.o("cancel_button");
            throw null;
        }
        button.setOnClickListener(new ns4.h4(this));
        android.widget.Button button2 = this.f339570l;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        button2.setOnClickListener(new ns4.i4(this));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.LinearLayout linearLayout = this.f339562d;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(linearLayout, "tyt_vip_pay_renewal_panel");
        android.widget.LinearLayout linearLayout2 = this.f339562d;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar.rj(linearLayout2);
        android.widget.LinearLayout linearLayout3 = this.f339562d;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar.gk(linearLayout3, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f301566b)));
        android.widget.LinearLayout linearLayout4 = this.f339562d;
        if (linearLayout4 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar.ik(linearLayout4, 32, 25955);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.Button button3 = this.f339570l;
        if (button3 == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        cy1.a aVar2 = (cy1.a) rVar2;
        aVar2.pk(button3, "tyt_vip_renewal_panel_agree");
        android.widget.LinearLayout linearLayout5 = this.f339562d;
        if (linearLayout5 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar2.gk(linearLayout5, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f301566b)));
        android.widget.Button button4 = this.f339570l;
        if (button4 == null) {
            kotlin.jvm.internal.o.o("confirm_button");
            throw null;
        }
        aVar2.ik(button4, 8, 25955);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.widget.Button button5 = this.f339569k;
        if (button5 == null) {
            kotlin.jvm.internal.o.o("cancel_button");
            throw null;
        }
        cy1.a aVar3 = (cy1.a) rVar3;
        aVar3.pk(button5, "tyt_vip_renewal_panel_disagree");
        android.widget.LinearLayout linearLayout6 = this.f339562d;
        if (linearLayout6 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        aVar3.gk(linearLayout6, kz5.b1.e(new jz5.l("buy_vip_session", js4.r.f301566b)));
        android.widget.Button button6 = this.f339569k;
        if (button6 != null) {
            aVar3.ik(button6, 8, 25955);
        } else {
            kotlin.jvm.internal.o.o("cancel_button");
            throw null;
        }
    }
}
