package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.t f112358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(te2.t tVar) {
        super(0);
        this.f112358d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f112358d.f418415d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "hideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftCardViewCallback", "hideCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
