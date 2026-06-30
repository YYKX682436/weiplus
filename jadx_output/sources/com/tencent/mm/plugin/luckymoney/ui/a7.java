package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class a7 extends com.tencent.mm.plugin.luckymoney.ui.i6 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f146695f;

    public a7(android.content.Context context) {
        super(context);
        this.f146695f = null;
        this.f146695f = context;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.luckymoney.ui.z6 z6Var;
        if (view == null) {
            view = this.f147018e.inflate(com.tencent.mm.R.layout.bur, viewGroup, false);
            z6Var = new com.tencent.mm.plugin.luckymoney.ui.z6(this);
            z6Var.f147765a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j3b);
            z6Var.f147768d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j3_);
            z6Var.f147766b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j3a);
            z6Var.f147767c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j39);
            view.setTag(z6Var);
        } else {
            z6Var = (com.tencent.mm.plugin.luckymoney.ui.z6) view.getTag();
        }
        com.tencent.mm.plugin.luckymoney.model.o4 item = getItem(i17);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(item.f145511v);
        android.content.Context context = this.f146695f;
        if (K0) {
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, z6Var.f147765a, item.f145501i);
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = item.f145501i + item.f145511v;
            float textSize = z6Var.f147765a.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = item.f145501i;
            float textSize2 = z6Var.f147765a.getTextSize();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7("#FA9D3B", new com.tencent.mm.plugin.luckymoney.ui.x6(this)), j18.length(), j17.length(), 18);
            z6Var.f147765a.setText(spannableStringBuilder);
        }
        z6Var.f147766b.setText(item.f145502m);
        z6Var.f147767c.setText(context.getString(com.tencent.mm.R.string.gjc, com.tencent.mm.wallet_core.ui.r1.o(item.f145503n / 100.0d)));
        z6Var.f147767c.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.y6(this, z6Var), 20L);
        java.lang.String string = context.getString(com.tencent.mm.R.string.gnt, java.lang.Long.valueOf(item.f145505p), java.lang.Long.valueOf(item.f145504o));
        if (item.f145506q == 5) {
            string = context.getString(com.tencent.mm.R.string.gnu) + " " + string;
        }
        z6Var.f147768d.setText(string);
        return view;
    }
}
