package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145819d;

    public b(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145819d = envelopeAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145819d;
        if (envelopeAppBarLayout.N1) {
            r45.nm5 nm5Var = envelopeAppBarLayout.E1;
            com.tencent.mm.wallet_core.ui.r1.b0(nm5Var.f381506o, nm5Var.f381505n, 0, 1100);
            gb3.n.a(7);
            gb3.m.a(90, envelopeAppBarLayout.G1);
            com.tencent.mm.plugin.luckymoney.story.g1.f145873n++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
