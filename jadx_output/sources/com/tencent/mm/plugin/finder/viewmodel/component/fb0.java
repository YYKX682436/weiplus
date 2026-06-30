package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class fb0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(in5.s0 s0Var) {
        super(1);
        this.f134389d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        android.view.View p17;
        ad2.h observer = (ad2.h) obj;
        kotlin.jvm.internal.o.g(observer, "observer");
        xc2.p0 p0Var = observer.f3147h;
        if ((p0Var != null && p0Var.f453256r == 17) && (((i17 = observer.f3150n) == 18 || i17 == 21) && (p17 = this.f134389d.p(com.tencent.mm.R.id.ef7)) != null)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$hideMusicJumperView$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$hideMusicJumperView$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
