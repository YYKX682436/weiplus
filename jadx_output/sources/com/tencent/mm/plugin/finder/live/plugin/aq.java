package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class aq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f111928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f111929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f111930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f111931g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f111932h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, java.lang.String str, ce2.i iVar, int i17, long j17) {
        super(0);
        this.f111928d = dqVar;
        this.f111929e = str;
        this.f111930f = iVar;
        this.f111931g = i17;
        this.f111932h = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f111928d;
        dqVar.C1();
        android.content.Context context = dqVar.f365323d.getContext();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showWecoinNotEnoughDialog comboId:");
        java.lang.String str = this.f111929e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
        com.tencent.mm.ui.widget.dialog.k0 k0Var = dqVar.U;
        if ((k0Var != null && k0Var.i()) || zl2.r4.R1(zl2.r4.f473950a, this.f111929e, dqVar.T, false, 4, null)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("showWecoinNotEnoughDialog isShowing:");
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = dqVar.U;
            sb7.append(k0Var2 != null ? java.lang.Boolean.valueOf(k0Var2.i()) : null);
            sb7.append(",notEnoughWecoinComboId:");
            sb7.append(dqVar.T);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb7.toString());
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488942aw1, null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate;
            roundedCornerFrameLayout.b(com.tencent.mm.ui.zk.a(context, 12), com.tencent.mm.ui.zk.a(context, 12), 0.0f, 0.0f);
            android.widget.TextView textView = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.g4e);
            android.widget.TextView textView2 = (android.widget.TextView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.f484451eb4);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            kotlin.jvm.internal.o.d(textView2);
            com.tencent.mm.ui.fk.a(textView2);
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            ce2.i iVar = this.f111930f;
            if (iVar == null) {
                textView.setText(context.getString(com.tencent.mm.R.string.dib));
                textView2.setVisibility(8);
            } else {
                float P0 = iVar.P0() * this.f111931g;
                long j17 = this.f111932h;
                if (j17 < 0) {
                    j17 = 0;
                }
                int i17 = (int) (P0 - ((float) j17));
                f0Var.f310116d = i17;
                if (i17 <= 0) {
                    textView2.setVisibility(8);
                    textView.setText(context.getString(com.tencent.mm.R.string.dib));
                } else {
                    textView.setText(context.getString(com.tencent.mm.R.string.dia));
                    textView2.setVisibility(0);
                    textView2.setText(java.lang.String.valueOf(f0Var.f310116d));
                }
            }
            android.widget.Button button = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.khs);
            android.widget.Button button2 = (android.widget.Button) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.b5i);
            button.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.xp(dqVar, context, f0Var, k0Var3));
            button2.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.yp(k0Var3));
            k0Var3.f211872n = new com.tencent.mm.plugin.finder.live.plugin.zp(k0Var3, roundedCornerFrameLayout);
            k0Var3.e(true);
            k0Var3.v();
            dqVar.U = k0Var3;
            dqVar.T = str;
        }
        return jz5.f0.f302826a;
    }
}
