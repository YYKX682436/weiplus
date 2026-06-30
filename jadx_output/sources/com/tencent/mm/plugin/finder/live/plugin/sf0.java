package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sf0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ag0 f114250d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var) {
        super(0);
        this.f114250d = ag0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.widget.q30 q30Var = this.f114250d.f111884z;
        com.tencent.mm.plugin.finder.live.widget.h30 n17 = q30Var.n();
        com.tencent.mars.xlog.Log.i(q30Var.f119470g, "checkLinkMicGroup state change to " + n17);
        q30Var.q();
        if (n17 == com.tencent.mm.plugin.finder.live.widget.h30.f118523d && (view = q30Var.f119477q) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "checkLinkMicGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorMicEntranceWidget", "checkLinkMicGroup", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jf2.k0 k0Var = (jf2.k0) q30Var.f119469f.U0(jf2.k0.class);
        if (k0Var != null) {
            k0Var.a7("MicEntranceTrigger", true);
        }
        return jz5.f0.f302826a;
    }
}
