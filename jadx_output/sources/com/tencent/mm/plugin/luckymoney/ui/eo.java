package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class eo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.mo f146885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jo f146886e;

    public eo(com.tencent.mm.plugin.luckymoney.ui.mo moVar, com.tencent.mm.plugin.luckymoney.ui.jo joVar) {
        this.f146885d = moVar;
        this.f146886e = joVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUIRedDotUIC$doShowUpdateRedDotStyle$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f146885d.dismiss();
        com.tencent.mm.plugin.luckymoney.ui.jo joVar = this.f146886e;
        androidx.appcompat.app.AppCompatActivity activity = joVar.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) activity).i7(28);
        androidx.appcompat.app.AppCompatActivity activity2 = joVar.getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) activity2).d7();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUIRedDotUIC$doShowUpdateRedDotStyle$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
