package v73;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f433725a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f433726b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f433727c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f433728d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f433729e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f433730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI f433731g;

    public p1(com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI, v73.l1 l1Var) {
        this.f433731g = honeyPaySelectCardTypeUI;
    }

    public final void a(android.view.View view, r45.av3 av3Var) {
        this.f433725a = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f485280h55);
        this.f433726b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h57);
        this.f433727c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485281h56);
        this.f433730f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485279h54);
        this.f433725a.setImageResource(u73.h.c(av3Var.f370275h));
        boolean z17 = av3Var.f370274g;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI = this.f433731g;
        if (z17) {
            this.f433725a.setIconColor(honeyPaySelectCardTypeUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
        } else {
            this.f433725a.setIconColor(honeyPaySelectCardTypeUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478554ao));
        }
        this.f433726b.setText(av3Var.f370271d);
        this.f433727c.setText(av3Var.f370272e);
        if (!av3Var.f370274g) {
            view.setOnClickListener(new v73.o1(this, av3Var));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "disable this card");
        view.setEnabled(false);
        this.f433730f.setVisibility(8);
        this.f433726b.setTextColor(honeyPaySelectCardTypeUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
        this.f433727c.setTextColor(honeyPaySelectCardTypeUI.getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
    }
}
