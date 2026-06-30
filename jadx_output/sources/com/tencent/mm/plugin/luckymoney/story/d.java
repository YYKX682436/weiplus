package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145843d;

    public d(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145843d = envelopeAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qk.v vVar = new qk.v();
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145843d;
        vVar.f364027g = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(envelopeAppBarLayout.E1.f381511t));
        java.lang.String str = envelopeAppBarLayout.E1.f381506o;
        if (str == null) {
            str = "";
        }
        vVar.f364030j = str;
        java.lang.String str2 = envelopeAppBarLayout.E1.f381505n;
        vVar.f364031k = str2 != null ? str2 : "";
        vVar.f364155a = 30;
        vVar.f364156b = true;
        com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
        if (q6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "emoticon page service not found");
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((com.tencent.mm.feature.emoji.h4) q6Var).wi(envelopeAppBarLayout.getContext(), vVar);
        gb3.n.a(7);
        gb3.m.a(94, envelopeAppBarLayout.G1);
        com.tencent.mm.plugin.luckymoney.story.g1.f145873n++;
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
