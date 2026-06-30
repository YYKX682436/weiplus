package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lu extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v65.n f135087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f135088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mu f135089f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu(v65.n nVar, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout, com.tencent.mm.plugin.finder.viewmodel.component.mu muVar) {
        super(1);
        this.f135087d = nVar;
        this.f135088e = finderVideoLayout;
        this.f135089f = muVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", "waitBeforeFinWatchInterval cancel!");
        this.f135087d.a(java.lang.Boolean.FALSE);
        this.f135088e.T(this.f135089f);
        return jz5.f0.f302826a;
    }
}
