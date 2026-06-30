package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class gb {
    public gb(kotlin.jvm.internal.i iVar) {
    }

    public static int a(com.tencent.mm.plugin.finder.view.gb gbVar, android.content.Context context, float f17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            gbVar.getClass();
            f17 = com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131142p;
        }
        gbVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        if (f17 <= 0.0f) {
            return 0;
        }
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        try {
            try {
                int b17 = gbVar.b(context, f17);
                f0Var.f310116d = b17;
                return b17;
            } catch (java.lang.RuntimeException e17) {
                if (com.tencent.mm.sdk.platformtools.u3.e() || java.lang.Thread.currentThread().isInterrupted()) {
                    hc2.c.a(e17, "getBubbleSingleLineMaxWords_main");
                } else {
                    try {
                        kotlinx.coroutines.l.f(null, new com.tencent.mm.plugin.finder.view.fb(f0Var, context, f17, null), 1, null);
                    } catch (java.lang.InterruptedException e18) {
                        hc2.c.a(e18, "getBubbleSingleLineMaxWords_blocking");
                    }
                }
                return f0Var.f310116d;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public final int b(android.content.Context context, float f17) {
        int i17;
        boolean z17;
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) ((jz5.n) com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131141o).getValue()).get(java.lang.Float.valueOf(f17));
        boolean z18 = false;
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        if (intValue > 0) {
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", "measureBubbleSingleLineMaxWords cacheMaxWords=" + intValue + '!');
            }
            return intValue;
        }
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z19 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z19 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488821aj5, (android.view.ViewGroup) null, false);
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.f484136d52) : null;
        float paddingLeft = ((i18 * f17) - (findViewById != null ? findViewById.getPaddingLeft() : 0)) - (findViewById != null ? findViewById.getPaddingRight() : 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("我");
        for (int i19 = 0; i19 < 40; i19++) {
            sb6.append("我");
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setMaxWidth(a06.d.b(paddingLeft));
        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        android.text.SpannableString spannableString = new android.text.SpannableString(sb6);
        spannableString.setSpan(new com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.AlignAbsoluteSizeSpan(com.tencent.mm.plugin.finder.assist.h4.c(com.tencent.mm.plugin.finder.assist.h4.f102221a, 0.0f, 1, null), 0.5f, 0), 0, spannableString.length(), 33);
        textView.setText(spannableString);
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int ellipsisStart = textView.getLayout().getEllipsisStart(0);
        ((java.util.HashMap) ((jz5.n) com.tencent.mm.plugin.finder.view.FinderHomeTabRedDotTipsBubbleView.f131141o).getValue()).put(java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(ellipsisStart));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("measureBubbleSingleLineMaxWords maxWords:");
        sb7.append(ellipsisStart);
        sb7.append(" maxWidth:");
        sb7.append(paddingLeft);
        sb7.append(",dslContainer.padding:");
        sb7.append(findViewById != null ? java.lang.Integer.valueOf(findViewById.getPaddingLeft()) : null);
        sb7.append('-');
        sb7.append(findViewById != null ? java.lang.Integer.valueOf(findViewById.getPaddingRight()) : null);
        com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", sb7.toString());
        return ellipsisStart;
    }
}
