package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class k2 extends com.tencent.mm.plugin.mall.ui.i2 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f148428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUIv2 f148429h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.mall.ui.MallIndexUIv2 mallIndexUIv2, android.content.Context context, android.view.View view) {
        super(mallIndexUIv2, context, view);
        this.f148429h = mallIndexUIv2;
    }

    @Override // com.tencent.mm.plugin.mall.ui.i2
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jkg);
        this.f148428g = linearLayout;
        this.f148408e = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.jkh);
        this.f148409f = (android.widget.TextView) this.f148428g.findViewById(com.tencent.mm.R.id.jki);
        this.f148428g.setOnClickListener(new com.tencent.mm.plugin.mall.ui.j2(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "pay_receiveorpay";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f148428g;
    }
}
