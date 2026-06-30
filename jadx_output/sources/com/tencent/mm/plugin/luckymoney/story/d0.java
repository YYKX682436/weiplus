package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145844d;

    public d0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145844d = envelopeAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145844d;
        if (envelopeAppBarLayout.N1) {
            com.tencent.mm.wallet_core.ui.r1.V(envelopeAppBarLayout.getContext(), envelopeAppBarLayout.E1.f381505n, true);
            gb3.n.a(7);
            gb3.m.a(96, envelopeAppBarLayout.G1);
            com.tencent.mm.plugin.luckymoney.story.g1.f145873n++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
