package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class vd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.yd f136242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f136243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.tencent.mm.plugin.finder.viewmodel.component.yd ydVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f136242d = ydVar;
        this.f136243e = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qk.f9.e(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), this.f136242d.getActivity(), bw5.ar0.TingScene_FinderTimeline, null, 0, 0, pm0.v.u(this.f136243e.getItemId()), 4, null);
        return java.lang.Boolean.TRUE;
    }
}
