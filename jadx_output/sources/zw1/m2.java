package zw1;

/* loaded from: classes8.dex */
public final class m2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.uk4 f476723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.n2 f476724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476725f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(r45.uk4 uk4Var, zw1.n2 n2Var, int i17) {
        super(false);
        this.f476723d = uk4Var;
        this.f476724e = n2Var;
        this.f476725f = i17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.uk4 uk4Var = this.f476723d;
        objArr[0] = uk4Var != null ? java.lang.Integer.valueOf(uk4Var.f387431d) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh]  onClick item, type:%s", objArr);
        zw1.n2 n2Var = this.f476724e;
        android.widget.TextView textView = (android.widget.TextView) n2Var.findViewById(com.tencent.mm.R.id.f483798sv2);
        boolean z17 = textView != null && textView.getVisibility() == 0;
        int i17 = this.f476725f;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 22, java.lang.Integer.valueOf(i17));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(25983, 23, java.lang.Integer.valueOf(i17));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_PAY_QR_CODE_BOTTOM_NEW_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) n2Var.findViewById(com.tencent.mm.R.id.f483800sv4);
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
            com.tencent.mm.plugin.newtips.model.p Di = rn3.i.Di();
            if (Di != null) {
                Di.a(60);
            }
        }
        n2Var.O6(n2Var.f476736d);
        java.lang.Integer valueOf = uk4Var != null ? java.lang.Integer.valueOf(uk4Var.f387431d) : null;
        if (valueOf != null && valueOf.intValue() == 2) {
            com.tencent.mm.wallet_core.ui.r1.V(n2Var.getContext(), uk4Var.f387433f, false);
            return;
        }
        if (valueOf == null || valueOf.intValue() != 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletCollectQrCodeBottomEntranceUIC", "[refresh] unknow type");
            return;
        }
        java.lang.String str = uk4Var.f387434g;
        java.lang.String str2 = uk4Var.f387435h;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mm.wallet_core.ui.r1.b0(str, str2, 0, 1072);
    }
}
