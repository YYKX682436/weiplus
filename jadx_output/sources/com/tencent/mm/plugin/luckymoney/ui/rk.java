package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public abstract class rk {
    public static void a(android.content.Context context, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.luckymoney.model.o6 o6Var, com.tencent.mm.plugin.luckymoney.ui.ok okVar) {
        if (o6Var == null) {
            return;
        }
        b(context, viewGroup, o6Var, okVar, o6Var.f145519f);
    }

    public static void b(android.content.Context context, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.luckymoney.model.o6 o6Var, com.tencent.mm.plugin.luckymoney.ui.ok okVar, java.lang.String str) {
        r45.xv3 xv3Var;
        int i17;
        int i18;
        int i19;
        int i27;
        if (viewGroup == null || o6Var == null) {
            return;
        }
        if (o6Var.f145517d == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", "operInfo enable:" + o6Var.f145517d);
            viewGroup.setVisibility(8);
            return;
        }
        if (!o6Var.f145519f.equalsIgnoreCase(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyOperationViewMgr", "not match type:" + o6Var.f145519f + ", " + str);
            viewGroup.setVisibility(8);
            return;
        }
        if (str.equalsIgnoreCase("Text") || str.equalsIgnoreCase("Native")) {
            com.tencent.mm.plugin.luckymoney.ui.qk qkVar = new com.tencent.mm.plugin.luckymoney.ui.qk();
            qkVar.f147355a = okVar;
            if (com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145518e)) {
                return;
            }
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bv9, viewGroup, true);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485818j71);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485817j70);
            if (com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145522i)) {
                imageView.setVisibility(8);
            } else {
                com.tencent.mm.plugin.luckymoney.model.m5.u(imageView, o6Var.f145522i, null, false);
                imageView.setVisibility(0);
            }
            com.tencent.mm.plugin.luckymoney.ui.ok okVar2 = qkVar.f147355a;
            if (okVar2 == null || (i18 = okVar2.f147284b) == Integer.MIN_VALUE) {
                textView.setTextSize(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2));
            } else {
                textView.setTextSize(0, i18);
            }
            textView.setGravity(17);
            textView.setText(o6Var.f145518e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145520g)) {
                textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo));
                textView.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.pk(qkVar, o6Var, context));
            }
            com.tencent.mm.plugin.luckymoney.ui.ok okVar3 = qkVar.f147355a;
            if (okVar3 != null && (i17 = okVar3.f147283a) != Integer.MIN_VALUE) {
                textView.setTextColor(i17);
            }
            viewGroup.setVisibility(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 14, 0, 0, 0, 1, java.lang.Integer.valueOf(o6Var.f145521h));
            com.tencent.mm.plugin.luckymoney.ui.ok okVar4 = qkVar.f147355a;
            if (okVar4 != null) {
                o45.eg.a(okVar4.f147286d, 0);
                r45.wv3 wv3Var = qkVar.f147355a.f147288f;
                if (wv3Var == null || (xv3Var = wv3Var.f389501g) == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390480g)) {
                    return;
                }
                gb3.m.a(65, qkVar.f147355a.f147288f.f389501g.f390480g);
                return;
            }
            return;
        }
        if (str.equalsIgnoreCase("Pic")) {
            com.tencent.mm.plugin.luckymoney.ui.kk kkVar = new com.tencent.mm.plugin.luckymoney.ui.kk();
            kkVar.f147110a = okVar;
            if (com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145518e)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyOperationViewMgr", "BannerPicOperationView attach iconUrl null");
                viewGroup.setVisibility(8);
                return;
            }
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            com.tencent.mm.plugin.luckymoney.model.m5.u(imageView2, o6Var.f145518e, null, false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145520g)) {
                imageView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.jk(kkVar, o6Var, context));
            }
            imageView2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(imageView2);
            viewGroup.setVisibility(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 14, 0, 0, 0, 1, java.lang.Integer.valueOf(o6Var.f145521h));
            com.tencent.mm.plugin.luckymoney.ui.ok okVar5 = kkVar.f147110a;
            if (okVar5 != null) {
                o45.eg.a(okVar5.f147286d, 0);
                return;
            }
            return;
        }
        if (str.equalsIgnoreCase("Appid")) {
            com.tencent.mm.plugin.luckymoney.ui.nk nkVar = new com.tencent.mm.plugin.luckymoney.ui.nk();
            nkVar.f147245a = okVar;
            if (com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145518e)) {
                return;
            }
            android.widget.TextView textView2 = new android.widget.TextView(context);
            com.tencent.mm.plugin.luckymoney.ui.ok okVar6 = nkVar.f147245a;
            if (okVar6 == null || (i27 = okVar6.f147283a) == Integer.MIN_VALUE) {
                textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a_w));
            } else {
                textView2.setTextColor(i27);
            }
            com.tencent.mm.plugin.luckymoney.ui.ok okVar7 = nkVar.f147245a;
            if (okVar7 == null || (i19 = okVar7.f147284b) == Integer.MIN_VALUE) {
                textView2.setTextSize(0, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479853h2));
            } else {
                textView2.setTextSize(0, i19);
            }
            textView2.setGravity(17);
            textView2.setText(o6Var.f145518e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(o6Var.f145520g)) {
                textView2.setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.mk(nkVar, o6Var, context));
            }
            viewGroup.addView(textView2, new android.view.ViewGroup.LayoutParams(-2, -2));
            viewGroup.setVisibility(0);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 14, 0, 0, 0, 1, java.lang.Integer.valueOf(o6Var.f145521h));
        }
    }
}
