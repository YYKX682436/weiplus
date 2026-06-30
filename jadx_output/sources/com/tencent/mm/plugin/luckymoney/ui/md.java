package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class md implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f147182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qd f147184g;

    public md(android.widget.TextView textView, boolean z17, android.widget.TextView textView2, com.tencent.mm.plugin.luckymoney.ui.qd qdVar) {
        this.f147181d = textView;
        this.f147182e = z17;
        this.f147183f = textView2;
        this.f147184g = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String obj;
        android.widget.TextView textView = this.f147181d;
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (this.f147182e) {
            android.widget.TextView textView2 = this.f147183f;
            if (textView2 != null && textView2.getVisibility() == 0) {
                java.lang.CharSequence text = textView2.getText();
                java.lang.String str2 = "";
                if (text == null || (str = text.toString()) == null) {
                    str = "";
                }
                android.text.TextPaint paint = textView2.getPaint();
                int measureText = paint != null ? (int) paint.measureText(str) : 0;
                java.lang.CharSequence text2 = textView.getText();
                if (text2 != null && (obj = text2.toString()) != null) {
                    str2 = obj;
                }
                android.text.TextPaint paint2 = textView.getPaint();
                int measureText2 = paint2 != null ? (int) paint2.measureText(str2) : 0;
                com.tencent.mm.plugin.luckymoney.ui.qd qdVar = this.f147184g;
                int b17 = measureText2 + i65.a.b(qdVar.getContext(), 16);
                int b18 = (((int) (qdVar.f147347d * 0.61d)) - i65.a.b(qdVar.getContext(), 6)) - measureText;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doLimitedDescTextWidth] isOver：");
                sb6.append(b17 >= b18);
                sb6.append("，allWidth: ");
                sb6.append(b17);
                sb6.append("，maxWidth：");
                sb6.append(b18);
                sb6.append(", targetWidth：");
                sb6.append(measureText);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUISkinUIC", sb6.toString());
                if (b17 >= b18) {
                    if (layoutParams != null) {
                        layoutParams.width = b18;
                    }
                } else if (layoutParams != null) {
                    layoutParams.width = -2;
                }
                textView.setLayoutParams(layoutParams);
                return;
            }
        }
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        textView.setLayoutParams(layoutParams);
    }
}
