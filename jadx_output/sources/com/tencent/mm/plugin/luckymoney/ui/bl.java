package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class bl implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f146759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.gl f146760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f146761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f146762g;

    public bl(int i17, com.tencent.mm.plugin.luckymoney.ui.gl glVar, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f146759d = i17;
        this.f146760e = glVar;
        this.f146761f = imageView;
        this.f146762g = imageView2;
    }

    @Override // ym5.w1
    public void a(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        int i17 = this.f146759d;
        android.widget.ImageView imageView = this.f146761f;
        com.tencent.mm.plugin.luckymoney.ui.gl glVar = this.f146760e;
        if (i17 != 2) {
            android.view.View view = glVar.f146957e;
            if (view == null) {
                kotlin.jvm.internal.o.o("pagLl");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(4);
            return;
        }
        android.view.View view2 = glVar.f146959g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("pagWidgetLl");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/view/MMPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = glVar.f146959g;
        if (view3 != null) {
            view3.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.al(this.f146762g, imageView), 100L);
        } else {
            kotlin.jvm.internal.o.o("pagWidgetLl");
            throw null;
        }
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
    }

    @Override // ym5.w1
    public void e(com.tencent.mm.view.MMPAGView mMPAGView) {
    }
}
