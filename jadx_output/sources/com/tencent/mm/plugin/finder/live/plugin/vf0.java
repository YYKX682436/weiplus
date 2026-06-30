package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ag0 f114715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var) {
        super(0);
        this.f114715d = ag0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var = this.f114715d.f111884z;
        q30Var.getClass();
        if (zl2.r4.f473950a.I0().getBoolean("LINK_RED_DOT_ENABLE_KEY", true) && (view = q30Var.f119477q) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onAcceptLinkMicSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "onAcceptLinkMicSelf", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
