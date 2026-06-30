package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class h6 extends com.tencent.mm.plugin.luckymoney.ui.i6 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f146981f;

    public h6(android.content.Context context) {
        super(context);
        this.f146981f = context;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.luckymoney.ui.g6 g6Var;
        if (view == null) {
            view = this.f147018e.inflate(com.tencent.mm.R.layout.bup, viewGroup, false);
            g6Var = new com.tencent.mm.plugin.luckymoney.ui.g6(this);
            g6Var.f146928a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j37);
            g6Var.f146929b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j38);
            g6Var.f146930c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485793j31);
            g6Var.f146932e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f485794j32);
            g6Var.f146931d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485796j34);
            view.setTag(g6Var);
        } else {
            g6Var = (com.tencent.mm.plugin.luckymoney.ui.g6) view.getTag();
        }
        com.tencent.mm.plugin.luckymoney.model.o4 item = getItem(i17);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(item.f145511v);
        android.content.Context context = this.f146981f;
        if (K0) {
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, g6Var.f146928a, item.f145496d);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = item.f145496d + item.f145511v;
            float textSize = g6Var.f146928a.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = item.f145496d;
            float textSize2 = g6Var.f146928a.getTextSize();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7("#FA9D3B", new com.tencent.mm.plugin.luckymoney.ui.f6(this)), j18.length(), j17.length(), 18);
            g6Var.f146928a.setText(spannableStringBuilder);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(item.f145512w)) {
            g6Var.f146932e.setVisibility(8);
        } else {
            g6Var.f146932e.setVisibility(0);
            g6Var.f146932e.setText(item.f145512w);
        }
        g6Var.f146929b.setText(item.f145499g);
        g6Var.f146930c.setText(context.getString(com.tencent.mm.R.string.gna, com.tencent.mm.wallet_core.ui.r1.o(item.f145498f / 100.0d)));
        int i18 = item.f145500h;
        if (i18 == 1) {
            g6Var.f146931d.setImageResource(com.tencent.mm.R.drawable.c_h);
            g6Var.f146931d.setVisibility(0);
        } else if (i18 == 2) {
            g6Var.f146931d.setImageResource(com.tencent.mm.R.drawable.c__);
            g6Var.f146931d.setVisibility(0);
        } else if (i18 == 3) {
            g6Var.f146931d.setImageResource(com.tencent.mm.R.raw.lucky_money_exclusive_hb);
            g6Var.f146931d.setVisibility(0);
        } else {
            g6Var.f146931d.setVisibility(8);
        }
        return view;
    }
}
