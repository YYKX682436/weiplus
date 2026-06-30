package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes8.dex */
public class b5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI f178106d;

    public b5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI, com.tencent.mm.plugin.wallet.balance.ui.lqt.s4 s4Var) {
        this.f178106d = walletLqtPlanHomeUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f178106d.f178033q.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.n85) this.f178106d.f178033q.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI = this.f178106d;
        if (view == null) {
            view = android.view.LayoutInflater.from(walletLqtPlanHomeUI.getContext()).inflate(com.tencent.mm.R.layout.btp, viewGroup, false);
            view.setTag(new com.tencent.mm.plugin.wallet.balance.ui.lqt.d5(walletLqtPlanHomeUI, view));
        }
        r45.n85 n85Var = (r45.n85) walletLqtPlanHomeUI.f178033q.get(i17);
        com.tencent.mm.plugin.wallet.balance.ui.lqt.d5 d5Var = (com.tencent.mm.plugin.wallet.balance.ui.lqt.d5) view.getTag();
        com.tencent.mm.wallet_core.ui.WalletTextView walletTextView = d5Var.f178139b;
        walletTextView.b();
        java.math.BigDecimal i18 = com.tencent.mm.wallet_core.ui.r1.i("" + n85Var.f381164e, "100", 2, java.math.RoundingMode.HALF_UP);
        double intValue = (double) i18.intValue();
        double doubleValue = i18.doubleValue();
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI walletLqtPlanHomeUI2 = d5Var.f178148k;
        if (intValue == doubleValue) {
            java.lang.String str = "" + i18.intValue();
            walletLqtPlanHomeUI2.getClass();
            if (!str.contains(".")) {
                str = str.concat(".00");
            }
            walletTextView.setText(str);
        } else {
            java.lang.String bigDecimal = i18.toString();
            walletLqtPlanHomeUI2.getClass();
            if (!bigDecimal.contains(".")) {
                bigDecimal = bigDecimal.concat(".00");
            }
            walletTextView.setText(bigDecimal);
        }
        java.lang.String format = java.lang.String.format("%s %s(%s)", n85Var.f381174r, n85Var.f381176t, n85Var.f381166g);
        android.widget.TextView textView = d5Var.f178142e;
        textView.setText(format);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(n85Var.f381175s);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(c1Var);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = d5Var.f178147j;
        if (d17 != null) {
            cdnImageView.setImageBitmap(d17);
        }
        r45.ro6 ro6Var = n85Var.f381169m;
        android.widget.TextView textView2 = d5Var.f178143f;
        if (ro6Var == null || com.tencent.mm.sdk.platformtools.t8.K0(ro6Var.f385065d)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(n85Var.f381169m.f385065d);
            if (com.tencent.mm.sdk.platformtools.t8.K0(n85Var.f381169m.f385066e)) {
                textView2.setTextColor(walletLqtPlanHomeUI2.getResources().getColor(com.tencent.mm.R.color.BW_50));
            } else {
                textView2.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(n85Var.f381169m.f385066e, true));
            }
            textView2.setVisibility(0);
        }
        d5Var.f178146i.setVisibility(8);
        d5Var.f178144g.setVisibility(8);
        if (n85Var.f381170n != null) {
            d5Var.f178141d.setOnClickListener(new com.tencent.mm.plugin.wallet.balance.ui.lqt.c5(d5Var, n85Var));
        }
        int i19 = n85Var.f381173q;
        android.widget.ImageView imageView = d5Var.f178140c;
        android.widget.TextView textView3 = d5Var.f178145h;
        if (i19 != 1) {
            textView3.setVisibility(0);
            textView.setAlpha(0.2f);
            walletTextView.setAlpha(0.2f);
            cdnImageView.setAlpha(0.3f);
            imageView.setAlpha(1.0f);
        } else {
            textView3.setVisibility(8);
            textView.setAlpha(1.0f);
            walletTextView.setAlpha(1.0f);
            cdnImageView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
        }
        return view;
    }
}
