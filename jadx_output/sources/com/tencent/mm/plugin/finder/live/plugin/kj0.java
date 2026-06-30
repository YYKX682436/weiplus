package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class kj0 extends com.tencent.mm.plugin.finder.live.plugin.yk0 {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f113263t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(android.view.ViewGroup rootContainer, qo0.c statusMonitor) {
        super(rootContainer, statusMonitor);
        kotlin.jvm.internal.o.g(rootContainer, "rootContainer");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113263t = "FinderLiveVisitorMusicSingSongListPlugin";
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0, com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        if (status != qo0.b.f365415t2) {
            super.M0(status, bundle);
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f113263t, "statusChange - OLD_SONG_LIST_SHOW (forced, bypass isAvailable)");
        K0(0);
        te2.kc kcVar = this.f115208p;
        if (kcVar != null) {
            ((te2.jc) kcVar).m();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public te2.kc t1() {
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new te2.y9(context, S0(), this.f113325g, this);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public te2.lc u1(android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new te2.fa(root, (com.tencent.mm.ui.MMActivity) context, S0(), this.f115208p);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public java.lang.String v1() {
        return this.f113263t;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.yk0
    public boolean w1() {
        boolean z17 = !((mm2.m6) S0().a(mm2.m6.class)).f329248p;
        com.tencent.mars.xlog.Log.i(this.f113263t, "isAvailable - " + z17);
        return z17;
    }
}
