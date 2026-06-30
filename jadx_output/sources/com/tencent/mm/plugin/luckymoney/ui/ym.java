package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ym extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f147749h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147750i;

    public ym(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, int i17) {
        this.f147750i = luckyMoneyPickEnvelopeUI;
        this.f147749h = i17;
    }

    @Override // in5.q0, androidx.recyclerview.widget.f2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(com.tencent.mm.plugin.luckymoney.ui.rm rmVar) {
        if (rmVar instanceof com.tencent.mm.plugin.luckymoney.ui.co) {
            com.tencent.mm.plugin.luckymoney.ui.co coVar = (com.tencent.mm.plugin.luckymoney.ui.co) rmVar;
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = coVar.f146819r;
            if (listScrollPAGView != null && listScrollPAGView.getVisibility() == 0) {
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = coVar.f146819r;
                listScrollPAGView2.n();
                listScrollPAGView2.i(coVar.f146820s);
                coVar.f146820s = null;
            }
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = coVar.f146814m;
            if (listScrollPAGView3 != null && listScrollPAGView3.getVisibility() == 0) {
                listScrollPAGView3.n();
                listScrollPAGView3.i(coVar.f146815n);
                listScrollPAGView3.j(coVar.f146816o);
                coVar.f146815n = null;
                coVar.f146816o = null;
            }
            com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView4 = coVar.f146825x;
            if (listScrollPAGView4 != null && listScrollPAGView4.getVisibility() == 0) {
                listScrollPAGView4.n();
                listScrollPAGView4.i(coVar.f146826y);
                coVar.f146826y = null;
            }
        }
        super.onViewRecycled(rmVar);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f147750i.f146532t).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return ((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) this.f147750i.f146532t).get(i17)).hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.luckymoney.ui.zm zmVar = (com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) this.f147750i.f146532t).get(i17);
        if (zmVar.f147794c) {
            return 3;
        }
        int i18 = zmVar.f147793b.f389506o;
        if (i18 == 3) {
            return 2;
        }
        return i18 == 4 ? 4 : 1;
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        new java.util.ArrayList();
        ((com.tencent.mm.plugin.luckymoney.ui.rm) r0Var).l((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) this.f147750i.f146532t).get(i17), i17);
    }

    @Override // in5.q0
    public void y(in5.r0 r0Var, int i17, java.util.List list) {
        ((com.tencent.mm.plugin.luckymoney.ui.rm) r0Var).l((com.tencent.mm.plugin.luckymoney.ui.zm) ((java.util.ArrayList) this.f147750i.f146532t).get(i17), i17);
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147750i;
        int i18 = this.f147749h;
        if (i17 == 1) {
            return new com.tencent.mm.plugin.luckymoney.ui.co(luckyMoneyPickEnvelopeUI, i18 == 1 ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489245bv2, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489243bv0, viewGroup, false), i18);
        }
        if (i17 == 2) {
            return new com.tencent.mm.plugin.luckymoney.ui.vm(luckyMoneyPickEnvelopeUI, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bux, viewGroup, false), i18);
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22302, 1);
            return new com.tencent.mm.plugin.luckymoney.ui.bn(luckyMoneyPickEnvelopeUI, i18 == 1 ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.buz, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.buy, viewGroup, false), i18);
        }
        if (i17 == 4) {
            return new com.tencent.mm.plugin.luckymoney.ui.xm(luckyMoneyPickEnvelopeUI, i18 == 1 ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489242bu5, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489241bu4, viewGroup, false), i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "wrong type: %s", java.lang.Integer.valueOf(i17));
        return null;
    }
}
