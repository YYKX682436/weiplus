package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class k70 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f134928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.l70 f134929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f134931g;

    public k70(boolean z17, com.tencent.mm.plugin.finder.viewmodel.component.l70 l70Var, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f134928d = z17;
        this.f134929e = l70Var;
        this.f134930f = s0Var;
        this.f134931g = baseFinderFeed;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        int integer = ret.getInteger(1);
        boolean z17 = this.f134928d;
        if (integer == 0) {
            com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "modifyFeedSubtitle: isClose = " + z17 + ", success");
            return;
        }
        this.f134929e.V6(this.f134930f, this.f134931g, !z17);
        com.tencent.mars.xlog.Log.i("FinderSubtitleSettingUIC", "modifyFeedSubtitle: isClose = " + z17 + ", fail");
    }
}
