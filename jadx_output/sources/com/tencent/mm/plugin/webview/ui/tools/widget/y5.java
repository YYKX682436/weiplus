package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes5.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        super(0);
        this.f187613d = z5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int navHeightByDisplay;
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187613d;
        com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter mPSmileyFooter = (com.tencent.mm.plugin.webview.ui.tools.widget.MPSmileyFooter) z5Var.findViewById(com.tencent.mm.R.id.jsc);
        navHeightByDisplay = z5Var.getNavHeightByDisplay();
        mPSmileyFooter.setExtraAddHeight(navHeightByDisplay);
        mPSmileyFooter.setFobbidenWhenLandscape(true);
        android.content.Context context = mPSmileyFooter.f187042g;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((android.view.ViewGroup) com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.c2l, mPSmileyFooter)).findViewById(com.tencent.mm.R.id.f482835p9);
        mPSmileyFooter.f187045m = weImageView;
        weImageView.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.widget.s4(mPSmileyFooter));
        com.tencent.mm.api.SmileyPanel c17 = qk.w9.c(context, z5Var.f187629w);
        mPSmileyFooter.f187043h = c17;
        c17.setEntranceScene(2);
        mPSmileyFooter.f187043h.setSearchSource(6);
        mPSmileyFooter.f187043h.setVisibility(8);
        mPSmileyFooter.f187046n = (android.widget.LinearLayout) mPSmileyFooter.findViewById(com.tencent.mm.R.id.f486963n12);
        mPSmileyFooter.f187046n.setOnClickListener(null);
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(mPSmileyFooter.getContext());
        mPSmileyFooter.f187048p = g17;
        mPSmileyFooter.f187046n.addView(mPSmileyFooter.f187043h, -1, g17);
        mPSmileyFooter.f187043h.c();
        mPSmileyFooter.f187043h.i();
        mPSmileyFooter.i();
        mPSmileyFooter.f187043h.setOnTextOperationListener(new com.tencent.mm.plugin.webview.ui.tools.widget.t4(mPSmileyFooter));
        return mPSmileyFooter;
    }
}
