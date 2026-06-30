package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class ww extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f136370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f136371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(x91.h hVar, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar) {
        super(0);
        this.f136370d = hVar;
        this.f136371e = sxVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLinkingDevice mrDevice:");
        x91.h hVar = this.f136370d;
        sb6.append(hVar);
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f136371e;
        sxVar.f135941w = hVar;
        sxVar.f135942x = sxVar.f135943y;
        sxVar.E = c01.id.c();
        sxVar.W6(3);
        return jz5.f0.f302826a;
    }
}
