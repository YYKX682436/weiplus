package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public final class nd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.qd f147234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f147235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f147236g;

    public nd(android.widget.TextView textView, com.tencent.mm.plugin.luckymoney.ui.qd qdVar, int i17, boolean z17) {
        this.f147233d = textView;
        this.f147234e = qdVar;
        this.f147235f = i17;
        this.f147236g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f147233d;
        if (textView == null) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.ui.qd qdVar = this.f147234e;
        androidx.appcompat.app.AppCompatActivity activity = qdVar.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        boolean z17 = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.f146256i2 : false;
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        int measuredWidth = textView.getMeasuredWidth();
        int b17 = ((int) (qdVar.f147347d * 0.61d)) - i65.a.b(qdVar.getContext(), 30);
        int i17 = this.f147235f;
        int i18 = b17 - i17;
        int lineCount = new android.text.StaticLayout(textView.getText(), textView.getPaint(), measuredWidth, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getLineCount();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doMeasureWidth] lineCount: ");
        sb6.append(lineCount);
        sb6.append(", isMax：");
        sb6.append(measuredWidth >= i18);
        sb6.append("，allWidth: ");
        sb6.append(measuredWidth);
        sb6.append("，maxWidth：");
        sb6.append(i18);
        sb6.append(", extraPadding：");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUISkinUIC", sb6.toString());
        if (this.f147236g && z17 && measuredWidth >= i18) {
            layoutParams.width = i18;
        } else {
            layoutParams.width = -2;
        }
        textView.setLayoutParams(layoutParams);
    }
}
