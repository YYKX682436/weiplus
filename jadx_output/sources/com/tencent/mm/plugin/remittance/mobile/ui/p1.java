package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes5.dex */
public class p1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        super(false);
        this.f156705d = mobileRemittanceUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "DelayOption View show bottomView");
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156705d;
        mobileRemittanceUI.showCircleStWcKb();
        mobileRemittanceUI.S = mobileRemittanceUI.T;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(mobileRemittanceUI.getContext(), 1, 3);
        z2Var.m(mobileRemittanceUI.getContext().getString(com.tencent.mm.R.string.gx6), mobileRemittanceUI.getContext().getString(com.tencent.mm.R.string.gx9));
        android.view.ViewGroup viewGroup = null;
        android.view.View inflate = android.view.View.inflate(mobileRemittanceUI.getContext(), com.tencent.mm.R.layout.f489303c22, null);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc)).getPaint(), 0.8f);
        android.view.View inflate2 = android.view.View.inflate(mobileRemittanceUI.getContext(), com.tencent.mm.R.layout.f489302c21, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.cgi);
        com.tencent.mm.plugin.remittance.mobile.ui.m1 m1Var = new com.tencent.mm.plugin.remittance.mobile.ui.m1(mobileRemittanceUI, z2Var);
        com.tencent.mm.plugin.remittance.mobile.ui.n1 n1Var = new com.tencent.mm.plugin.remittance.mobile.ui.n1(mobileRemittanceUI, z2Var);
        z2Var.D = m1Var;
        z2Var.E = n1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.remittance.mobile.ui.o1 o1Var = new com.tencent.mm.plugin.remittance.mobile.ui.o1(mobileRemittanceUI, arrayList);
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) mobileRemittanceUI.f156621n;
            if (i17 >= arrayList2.size()) {
                z2Var.s(inflate);
                z2Var.j(inflate2);
                z2Var.C();
                mobileRemittanceUI.W6(7);
                return;
            }
            r45.bd0 bd0Var = (r45.bd0) arrayList2.get(i17);
            android.view.View inflate3 = mobileRemittanceUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.f489304c23, viewGroup);
            android.widget.TextView textView = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.jnd);
            textView.setText(bd0Var.f370673d);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate3.findViewById(com.tencent.mm.R.id.jnc);
            imageView.getDrawable().setColorFilter(mobileRemittanceUI.getResources().getColor(com.tencent.mm.R.color.f478502m), android.graphics.PorterDuff.Mode.SRC_ATOP);
            if (mobileRemittanceUI.T == i17) {
                imageView.setVisibility(0);
                textView.setContentDescription(mobileRemittanceUI.getString(com.tencent.mm.R.string.hhu) + bd0Var.f370673d);
            } else {
                imageView.setVisibility(8);
            }
            imageView.setTag(java.lang.Integer.valueOf(i17));
            inflate3.setTag(imageView);
            inflate3.setOnClickListener(o1Var);
            linearLayout.addView(inflate3);
            arrayList.add(inflate3);
            i17++;
            viewGroup = null;
        }
    }
}
