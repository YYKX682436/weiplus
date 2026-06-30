package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class d5 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f146832d;

    public d5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f146832d = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 f2Var, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        boolean z17;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView;
        com.tencent.mm.plugin.luckymoney.ui.t4 t4Var;
        int color;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "click envelope: %s", java.lang.Integer.valueOf(i17));
        in5.c cVar = (in5.c) ((in5.s0) k3Var).f293125i;
        if (cVar instanceof com.tencent.mm.plugin.luckymoney.ui.i5) {
            r45.wv3 wv3Var = ((com.tencent.mm.plugin.luckymoney.ui.i5) cVar).f147015d;
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI.C;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f146832d;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(luckyMoneyHistoryEnvelopeUI.getContext()).inflate(com.tencent.mm.R.layout.bv6, (android.view.ViewGroup) luckyMoneyHistoryEnvelopeUI.f146132s, false);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.j69);
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.j5w);
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.j6c);
            android.widget.ImageView imageView3 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.j67);
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.j68);
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.j6e);
            android.widget.ImageView imageView4 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.j5v);
            android.widget.ImageView imageView5 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.j5z);
            android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.f485811j60);
            android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.j5y);
            com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.j5x);
            if (mMPAGView2 != null) {
                mMPAGView2.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
            }
            android.view.View findViewById4 = viewGroup.findViewById(com.tencent.mm.R.id.f485813j62);
            com.tencent.mm.view.MMPAGView mMPAGView3 = (com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.f485812j61);
            if (mMPAGView3 != null) {
                mMPAGView = mMPAGView2;
                z17 = true;
                mMPAGView3.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
            } else {
                mMPAGView = mMPAGView2;
                z17 = true;
            }
            com.tencent.mm.view.MMPAGView mMPAGView4 = mMPAGView;
            com.tencent.mm.plugin.luckymoney.ui.s4 s4Var = new com.tencent.mm.plugin.luckymoney.ui.s4(luckyMoneyHistoryEnvelopeUI, wv3Var, findViewById4, findViewById2, imageView4, findViewById, viewGroup2, findViewById3);
            android.view.View findViewById5 = viewGroup.findViewById(com.tencent.mm.R.id.quu);
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = (com.tencent.mm.chatting.component.ListScrollPAGView) viewGroup.findViewById(com.tencent.mm.R.id.qut);
            com.tencent.mm.plugin.luckymoney.ui.t4 t4Var2 = new com.tencent.mm.plugin.luckymoney.ui.t4(luckyMoneyHistoryEnvelopeUI);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup.findViewById(com.tencent.mm.R.id.j6f);
            android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.j6g);
            textView.setText(com.tencent.mm.R.string.gjq);
            textView2.setText(luckyMoneyHistoryEnvelopeUI.getString(com.tencent.mm.R.string.god, ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(luckyMoneyHistoryEnvelopeUI.getContext(), c01.z1.l(), i65.a.h(luckyMoneyHistoryEnvelopeUI.getContext(), com.tencent.mm.R.dimen.a4r))));
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView3, c01.z1.r(), 0.06f);
            viewGroup3.setVisibility(8);
            imageView4.setVisibility(0);
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj(imageView4, wv3Var, null, 0, 0, 0);
            r45.xv3 xv3Var = wv3Var.f389501g;
            if (xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390485o) || com.tencent.mm.sdk.platformtools.t8.K0(wv3Var.f389501g.f390486p)) {
                imageView = imageView5;
                imageView.setVisibility(8);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams.topMargin = i65.a.b(luckyMoneyHistoryEnvelopeUI.getContext(), 24);
                weImageView.setLayoutParams(layoutParams);
            } else {
                sp5.c.b(imageView5);
                imageView = imageView5;
                imageView.setVisibility(0);
                ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).bj(imageView, wv3Var, null, 0, 0);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) weImageView.getLayoutParams();
                layoutParams2.topMargin = 0;
                weImageView.setLayoutParams(layoutParams2);
            }
            kotlinx.coroutines.y0 b17 = com.tencent.mm.wallet_core.model.z1.f214041a.b();
            if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).aj()) {
                imageView2 = imageView;
                listScrollPAGView = listScrollPAGView2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Q1.a(wv3Var, findViewById3, mMPAGView4, findViewById4, mMPAGView3, s4Var, b17);
            } else {
                imageView2 = imageView;
                listScrollPAGView = listScrollPAGView2;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.b7(wv3Var, findViewById3, mMPAGView4, findViewById4, mMPAGView3, s4Var, b17);
            }
            r45.xv3 xv3Var2 = wv3Var.f389501g;
            if (xv3Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var2.F)) {
                t4Var = t4Var2;
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyHistoryEnvelopeUI", "[renderEnvelopeAtmosphereDynamic] data is null ,return ");
            } else {
                listScrollPAGView.a(t4Var2);
                listScrollPAGView.setScaleMode(3);
                listScrollPAGView.setRepeatCount(0);
                listScrollPAGView.b(new com.tencent.mm.plugin.luckymoney.ui.w4(luckyMoneyHistoryEnvelopeUI));
                t4Var = t4Var2;
                imageView4.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.x4(luckyMoneyHistoryEnvelopeUI, findViewById, wv3Var, findViewById5, listScrollPAGView, b17, imageView4), 50L);
            }
            button.setClickable(false);
            java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
            if (o17 == null || o17.length() <= 0 || !(o17.equals("zh_CN") || o17.equals("zh_TW") || o17.equals("zh_HK"))) {
                button.setBackgroundResource(com.tencent.mm.R.drawable.ccz);
                button.setText(com.tencent.mm.R.string.gmm);
            } else {
                button.setBackgroundResource(com.tencent.mm.R.drawable.c3t);
            }
            viewGroup.setFocusable(false);
            viewGroup.setClickable(true);
            viewGroup.setImportantForAccessibility(2);
            viewGroup2.setFocusable(true);
            button.setImportantForAccessibility(2);
            weImageView.setEnableColorFilter(false);
            weImageView.setImageResource(com.tencent.mm.R.drawable.alt);
            if (com.tencent.mm.ui.bk.C()) {
                color = luckyMoneyHistoryEnvelopeUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8);
                viewGroup.setBackgroundResource(com.tencent.mm.R.color.BW_0_Alpha_0_8);
            } else {
                color = luckyMoneyHistoryEnvelopeUI.getResources().getColor(com.tencent.mm.R.color.f479354x8);
                viewGroup.setBackgroundResource(com.tencent.mm.R.color.f479354x8);
            }
            com.tencent.mm.ui.widget.dialog.k2 k2Var = new com.tencent.mm.ui.widget.dialog.k2(luckyMoneyHistoryEnvelopeUI.getContext(), com.tencent.mm.R.style.f494257i7);
            k2Var.setContentView(viewGroup);
            k2Var.getWindow().setLayout(-1, -1);
            k2Var.getWindow().getDecorView().setSystemUiVisibility(k2Var.getWindow().getDecorView().getWindowSystemUiVisibility() | 1024);
            k2Var.getWindow().setStatusBarColor(color);
            k2Var.setOnShowListener(new com.tencent.mm.plugin.luckymoney.ui.u4(luckyMoneyHistoryEnvelopeUI, k2Var));
            k2Var.show();
            com.tencent.mm.plugin.luckymoney.model.m5.A(viewGroup2);
            com.tencent.mm.plugin.luckymoney.model.m5.A(imageView2);
            weImageView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.v4(luckyMoneyHistoryEnvelopeUI, k2Var, mMPAGView4, s4Var, mMPAGView3, listScrollPAGView, t4Var, b17));
        }
    }
}
