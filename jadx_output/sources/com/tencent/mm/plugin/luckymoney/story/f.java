package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145850d;

    public f(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145850d = envelopeAppBarLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[jump ecs] click");
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145850d;
        if (envelopeAppBarLayout.E1.F == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnvelopeAppBarLayout", "[jump ecs] no jump_info");
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(new pq.a(envelopeAppBarLayout.getContext()), envelopeAppBarLayout.E1.F, null);
        gb3.n.a(7);
        gb3.m.a(98, envelopeAppBarLayout.G1);
        com.tencent.mm.plugin.luckymoney.story.g1.f145873n++;
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
