package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes5.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f135859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f135860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f135861f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(com.tencent.mm.ui.widget.MMEditText mMEditText, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC) {
        super(0);
        this.f135859d = mMEditText;
        this.f135860e = s0Var;
        this.f135861f = finderBulletUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f135859d;
        java.lang.String obj = mMEditText.getText().toString();
        com.tencent.mm.plugin.finder.viewmodel.component.u4 u4Var = com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.A;
        int b17 = com.tencent.mm.ui.tools.v4.b(com.tencent.mm.plugin.finder.viewmodel.component.u4.a(u4Var) * 2, obj) / 2;
        in5.s0 s0Var = this.f135860e;
        if (b17 < 0) {
            android.content.Context context = s0Var.f293121e;
            db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.f492525gu5, java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.viewmodel.component.u4.a(u4Var))), 0).show();
        } else {
            java.lang.String obj2 = r26.n0.u0(obj).toString();
            if (obj2.length() > 0) {
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f135861f;
                java.lang.Object obj3 = s0Var.f293125i;
                kotlin.jvm.internal.o.f(obj3, "getAssociatedObject(...)");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj3;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC2 = this.f135861f;
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.S6(finderBulletUIC, obj2, s0Var, baseFinderFeed, 0, finderBulletUIC2.f133509v, 8, null);
                mMEditText.setText((java.lang.CharSequence) null);
                com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.X6(finderBulletUIC2, s0Var, false, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
