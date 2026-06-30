package com.tencent.mm.plugin.luckymoney.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.do, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Cdo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jo f146852d;

    public Cdo(com.tencent.mm.plugin.luckymoney.ui.jo joVar) {
        this.f146852d = joVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUIRedDotUIC$doShowNewRedDotStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f146852d.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI");
        ((com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI) activity).d7();
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUIRedDotUIC$doShowNewRedDotStyle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
