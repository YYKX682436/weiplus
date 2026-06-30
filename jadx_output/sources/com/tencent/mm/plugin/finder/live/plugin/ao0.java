package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ao0 implements ke2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin f111912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f111913b;

    public ao0(com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin, int i17) {
        this.f111912a = finderVisitorRoleChooserPlugin;
        this.f111913b = i17;
    }

    @Override // ke2.l0
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f111912a;
        com.tencent.mars.xlog.Log.i(finderVisitorRoleChooserPlugin.getTAG(), "[CgiFinderLiveSwitchIdentity] failed");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.xn0(finderVisitorRoleChooserPlugin));
    }

    @Override // ke2.l0
    public void b(r45.jb2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.FinderVisitorRoleChooserPlugin finderVisitorRoleChooserPlugin = this.f111912a;
        java.lang.String tag = finderVisitorRoleChooserPlugin.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CgiFinderLiveSwitchIdentity] success USERINFO_FINDER_LIVE_VISITOR_ROLE_INT_SYNC ");
        int i17 = this.f111913b;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.zn0(finderVisitorRoleChooserPlugin, i17));
    }
}
