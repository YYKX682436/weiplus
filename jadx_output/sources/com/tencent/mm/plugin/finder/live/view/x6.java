package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class x6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116800d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView) {
        super(0);
        this.f116800d = finderLiveMiniView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f116800d.f116039n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView$refreshData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/view/FinderLiveMiniView$refreshData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
