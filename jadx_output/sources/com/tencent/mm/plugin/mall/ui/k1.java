package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class k1 extends com.tencent.mm.plugin.mall.ui.i1 {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f148426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallIndexUI f148427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.mall.ui.MallIndexUI mallIndexUI, android.content.Context context, android.view.View view) {
        super(mallIndexUI, context, view);
        this.f148427h = mallIndexUI;
    }

    @Override // com.tencent.mm.plugin.mall.ui.i1
    public void a(android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.jkg);
        this.f148426g = linearLayout;
        this.f148405e = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.jkh);
        this.f148406f = (android.widget.TextView) this.f148426g.findViewById(com.tencent.mm.R.id.jki);
        this.f148426g.setOnClickListener(new com.tencent.mm.plugin.mall.ui.j1(this));
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return "pay_receiveorpay";
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        return this.f148426g;
    }
}
