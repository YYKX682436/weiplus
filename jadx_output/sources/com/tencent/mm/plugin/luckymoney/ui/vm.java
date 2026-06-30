package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class vm extends com.tencent.mm.plugin.luckymoney.ui.rm {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f147565e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f147566f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f147567g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f147568h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f147569i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f147570m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f147571n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f147572o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ProgressBar f147573p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f147574q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f147575r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f147576s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ProgressBar f147577t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f147578u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ImageView f147579v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f147580w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f147581x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f147582y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f147583z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, android.view.View view, int i17) {
        super(view);
        this.f147583z = luckyMoneyPickEnvelopeUI;
        this.f147565e = view.findViewById(com.tencent.mm.R.id.f485672ik5);
        this.f147576s = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ij9);
        this.f147566f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ik_);
        this.f147569i = view.findViewById(com.tencent.mm.R.id.ikh);
        this.f147567g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ike);
        this.f147568h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ij7);
        this.f147570m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ikt);
        this.f147571n = view.findViewById(com.tencent.mm.R.id.ikz);
        this.f147572o = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.iks);
        this.f147573p = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ij6);
        this.f147574q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ikx);
        this.f147575r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ika);
        this.f147578u = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.ikf);
        this.f147579v = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ik7);
        this.f147580w = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ikg);
        this.f147581x = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ik8);
        this.f147582y = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ik6);
        com.tencent.mm.wallet_core.ui.r1.d(this.f147581x);
        com.tencent.mm.wallet_core.ui.r1.d(this.f147582y);
        java.lang.String o17 = com.tencent.mm.sdk.platformtools.m2.o(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0), com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (o17 == null || o17.length() <= 0 || (!o17.equals("zh_CN") && !o17.equals("zh_TW") && !o17.equals("zh_HK"))) {
            this.f147578u.setBackgroundResource(com.tencent.mm.R.drawable.ccz);
            this.f147578u.setText(com.tencent.mm.R.string.gmm);
        }
        this.f147577t = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ikr);
        if (com.tencent.mm.ui.bk.C()) {
            this.f147576s.setBackgroundResource(com.tencent.mm.R.drawable.amo);
        } else {
            this.f147576s.setBackgroundResource(com.tencent.mm.R.drawable.amm);
        }
        this.f147576s.setEnabled(false);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void l(com.tencent.mm.plugin.luckymoney.ui.zm zmVar, int i17) {
        this.itemView.setSelected(zmVar.f147792a);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f147568h, c01.z1.r(), 0.06f);
        android.widget.TextView textView = this.f147570m;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI = this.f147583z;
        textView.setText(luckyMoneyPickEnvelopeUI.getString(com.tencent.mm.R.string.god, ((ke0.e) xVar).bj(luckyMoneyPickEnvelopeUI.getContext(), c01.z1.l(), i65.a.h(luckyMoneyPickEnvelopeUI.getContext(), com.tencent.mm.R.dimen.f479929j9))));
        this.f147566f.setImageBitmap(null);
        android.view.View view = this.f147571n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.wv3 wv3Var = zmVar.f147793b;
        if (wv3Var != null) {
            this.f147567g.setText(wv3Var.f389498d);
            this.f147581x.setText(zmVar.f147793b.f389498d);
            r45.wv3 wv3Var2 = zmVar.f147793b;
            if (wv3Var2.f389501g != null) {
                o(wv3Var2, false);
            }
            this.f147571n.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.sm(this, zmVar));
            if (com.tencent.mm.sdk.platformtools.t8.K0(zmVar.f147793b.f389502h)) {
                this.f147575r.setText("");
            } else {
                this.f147575r.setText(zmVar.f147793b.f389502h);
                this.f147575r.setVisibility(0);
            }
            android.widget.TextView textView2 = this.f147582y;
            if (textView2 != null) {
                textView2.setText(zmVar.f147793b.C);
            }
            android.view.View view2 = this.f147571n;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH", "setData", "(Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$EnvelopeModel;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.rm
    public void n(boolean z17) {
    }

    public final void o(r45.wv3 wv3Var, boolean z17) {
        if (z17) {
            this.f147572o.setVisibility(8);
            this.f147573p.setVisibility(0);
            this.f147574q.setVisibility(8);
        } else if ("0".equals(wv3Var.f389500f)) {
            return;
        } else {
            this.f147577t.setVisibility(0);
        }
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj(this.f147566f, wv3Var, new com.tencent.mm.plugin.luckymoney.ui.um(this, wv3Var), 0, 0, 0);
    }
}
