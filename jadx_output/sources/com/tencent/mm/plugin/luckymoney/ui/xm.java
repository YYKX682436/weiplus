package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class xm extends com.tencent.mm.plugin.luckymoney.ui.rm {

    /* renamed from: e, reason: collision with root package name */
    public final int f147698e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f147699f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f147700g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f147701h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f147702i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f147703m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f147704n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f147705o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147706p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, android.view.View view, int i17) {
        super(view);
        this.f147706p = luckyMoneyPickEnvelopeUI;
        this.f147698e = i17;
        this.f147699f = view.findViewById(com.tencent.mm.R.id.ij_);
        this.f147700g = view.findViewById(com.tencent.mm.R.id.ija);
        this.f147701h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ijc);
        this.f147702i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ije);
        this.f147703m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ijd);
        this.f147704n = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.ijf);
        this.f147705o = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ijg);
        if (i17 == 1) {
            android.view.ViewGroup.LayoutParams layoutParams = this.f147699f.getLayoutParams();
            layoutParams.width = luckyMoneyPickEnvelopeUI.Q;
            layoutParams.height = luckyMoneyPickEnvelopeUI.R;
            this.f147699f.setLayoutParams(layoutParams);
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f147700g.getLayoutParams();
            layoutParams2.width = luckyMoneyPickEnvelopeUI.S;
            layoutParams2.height = luckyMoneyPickEnvelopeUI.T;
            this.f147700g.setLayoutParams(layoutParams2);
            this.f147700g.setMinimumHeight(luckyMoneyPickEnvelopeUI.R);
            android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) this.f147701h.getLayoutParams();
            double d17 = luckyMoneyPickEnvelopeUI.S * 0.7d;
            layoutParams3.width = (int) d17;
            layoutParams3.height = (int) (d17 * 0.871d);
            layoutParams3.topMargin = (int) (luckyMoneyPickEnvelopeUI.T * 0.13d);
            this.f147701h.setLayoutParams(layoutParams3);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18892, 31, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146535w + 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146534v + 1), luckyMoneyPickEnvelopeUI.K, luckyMoneyPickEnvelopeUI.b7(), luckyMoneyPickEnvelopeUI.f146515J, java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.f146524n.getItemCount() - 1), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.a7()), java.lang.Integer.valueOf(luckyMoneyPickEnvelopeUI.k7()), luckyMoneyPickEnvelopeUI.j7());
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void l(com.tencent.mm.plugin.luckymoney.ui.zm zmVar, int i17) {
        this.itemView.setSelected(zmVar.f147792a);
        r45.wv3 wv3Var = zmVar.f147793b;
        if (wv3Var != null) {
            this.f147702i.setText(wv3Var.f389513v);
            this.f147703m.setText(zmVar.f147793b.f389514w);
            com.tencent.mm.ui.bk.r0(this.f147702i.getPaint(), 0.8f);
            com.tencent.mm.ui.bk.r0(this.f147703m.getPaint(), 0.8f);
            if (this.f147698e == 1) {
                this.f147702i.setTextSize(1, 12.0f);
                this.f147703m.setTextSize(1, 10.0f);
            }
            this.f147705o.setClickable(true);
            this.f147705o.setOnTouchListener(new com.tencent.mm.plugin.luckymoney.ui.wm(this, zmVar));
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void n(boolean z17) {
    }
}
