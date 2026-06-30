package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class m2 extends com.tencent.mm.plugin.mall.ui.i2 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f148445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f148446h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, android.content.Context context, android.view.View view) {
        super(mallIndexUIv2, context, view);
        this.f148447i = mallIndexUIv2;
        this.f148446h = false;
    }

    @Override // com.tencent.mm.plugin.mall.ui.i2
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jkk);
        this.f148445g = linearLayout;
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f487643pb0);
        com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2 = this.f148447i;
        mallIndexUIv2.f148256f = textView;
        mallIndexUIv2.f148290J = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) this.f148445g.findViewById(com.tencent.mm.R.id.f487644pb1);
        mallIndexUIv2.K = (android.widget.ProgressBar) this.f148445g.findViewById(com.tencent.mm.R.id.pcr);
        mallIndexUIv2.f148293z = (android.widget.RelativeLayout) this.f148445g.findViewById(com.tencent.mm.R.id.paz);
        if (j65.e.b()) {
            mallIndexUIv2.f148256f.setAlpha(1.0f);
            mallIndexUIv2.f148290J.setAlpha(1.0f);
        }
        mallIndexUIv2.mo133getLifecycle().a(mallIndexUIv2.f148290J);
        mallIndexUIv2.f148290J.setLoadingPb(mallIndexUIv2.K);
        mallIndexUIv2.f148290J.setPrefixSymbol("¥");
        mallIndexUIv2.f148290J.setTextColor(-1);
        mallIndexUIv2.f148290J.setTextSize(i65.a.b(mallIndexUIv2.getContext(), 15));
        this.f148408e = (android.widget.ImageView) this.f148445g.findViewById(com.tencent.mm.R.id.jkl);
        this.f148409f = (android.widget.TextView) this.f148445g.findViewById(com.tencent.mm.R.id.jkn);
        this.f148445g.setOnClickListener(new com.tencent.mm.plugin.mall.ui.l2(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "wallet";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f148445g;
    }
}
