package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes3.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f145690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f145693g;

    public x2(android.view.View view, int i17, java.lang.String str, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f145690d = view;
        this.f145691e = i17;
        this.f145692f = str;
        this.f145693g = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.View view = this.f145690d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/model/LuckyMoneyEnvelopeLogicNew$renderFullAtmosphereDynamic$2$downloadComplete$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(150L)) != null) {
            duration.start();
        }
        com.tencent.mm.plugin.luckymoney.model.n3.f145460a.h(this.f145691e, this.f145692f, this.f145693g);
    }
}
