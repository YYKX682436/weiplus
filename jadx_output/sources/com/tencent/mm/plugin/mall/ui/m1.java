package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class m1 extends com.tencent.mm.plugin.mall.ui.i1 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f148443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI, android.content.Context context, android.view.View view) {
        super(mallIndexUI, context, view);
        this.f148444h = mallIndexUI;
    }

    @Override // com.tencent.mm.plugin.mall.ui.i1
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jkk);
        this.f148443g = linearLayout;
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.f487643pb0);
        com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI = this.f148444h;
        mallIndexUI.f148241f = textView;
        mallIndexUI.F = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) this.f148443g.findViewById(com.tencent.mm.R.id.f487644pb1);
        mallIndexUI.G = (android.widget.ProgressBar) this.f148443g.findViewById(com.tencent.mm.R.id.pcr);
        mallIndexUI.mo133getLifecycle().a(mallIndexUI.F);
        mallIndexUI.F.setLoadingPb(mallIndexUI.G);
        mallIndexUI.F.setPrefixSymbol("¥");
        mallIndexUI.F.setTextColor(-1);
        mallIndexUI.F.setTextSize(i65.a.b(mallIndexUI.getContext(), 15));
        this.f148405e = (android.widget.ImageView) this.f148443g.findViewById(com.tencent.mm.R.id.jkl);
        this.f148406f = (android.widget.TextView) this.f148443g.findViewById(com.tencent.mm.R.id.jkn);
        this.f148443g.setOnClickListener(new com.tencent.mm.plugin.mall.ui.l1(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "wallet";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f148443g;
    }
}
