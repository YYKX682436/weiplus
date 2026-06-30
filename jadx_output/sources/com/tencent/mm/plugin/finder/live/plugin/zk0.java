package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class zk0 extends com.tencent.mm.plugin.finder.live.plugin.yk0 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f115353t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk0(android.view.ViewGroup rootContainer, qo0.c statusMonitor) {
        super(rootContainer, statusMonitor);
        kotlin.jvm.internal.o.g(rootContainer, "rootContainer");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115353t = "FinderLiveVisitorSingSongNewPanelPlugin";
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public te2.kc t1() {
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new te2.m9(context, S0(), this.f113325g, this);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public te2.lc u1(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new te2.t9(root, (com.tencent.mm.ui.MMActivity) context, S0(), this.f115208p);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public java.lang.String v1() {
        return this.f115353t;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public boolean w1() {
        return ((mm2.m6) S0().a(mm2.m6.class)).f329248p;
    }
}
