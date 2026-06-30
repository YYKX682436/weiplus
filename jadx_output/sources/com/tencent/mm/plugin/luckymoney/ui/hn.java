package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class hn implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147004d;

    public hn(com.tencent.mm.plugin.luckymoney.ui.co coVar) {
        this.f147004d = coVar;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147004d;
        android.view.View view = coVar.f146818q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$14", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$NormalVH$14", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        coVar.f146822u.setBackgroundResource(com.tencent.mm.R.color.a9e);
        coVar.f146811g.setVisibility(4);
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
