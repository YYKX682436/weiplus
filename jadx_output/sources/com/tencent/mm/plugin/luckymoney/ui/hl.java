package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class hl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jl f147002d;

    public hl(com.tencent.mm.plugin.luckymoney.ui.jl jlVar) {
        this.f147002d = jlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.jl jlVar = this.f147002d;
        android.widget.TextView textView = jlVar.f147071i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("tempLabelTv");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        androidx.appcompat.app.AppCompatActivity activity = jlVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        int i17 = ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew) activity).f146509m;
        androidx.appcompat.app.AppCompatActivity activity2 = jlVar.getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew");
        int i18 = i17 - ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew) activity2).f146510n;
        android.widget.TextView textView2 = jlVar.f147071i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("tempLabelTv");
            throw null;
        }
        layoutParams2.topMargin = i18 - textView2.getHeight();
        android.widget.TextView textView3 = jlVar.f147071i;
        if (textView3 != null) {
            textView3.setLayoutParams(layoutParams2);
        } else {
            kotlin.jvm.internal.o.o("tempLabelTv");
            throw null;
        }
    }
}
