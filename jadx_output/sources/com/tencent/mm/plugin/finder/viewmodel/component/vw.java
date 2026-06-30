package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class vw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x91.h f136272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.sx f136273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f136274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(x91.h hVar, com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar, boolean z17) {
        super(0);
        this.f136272d = hVar;
        this.f136273e = sxVar;
        this.f136274f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBreakDevice mrDevice:");
        x91.h hVar = this.f136272d;
        sb6.append(hVar);
        sb6.append(", selectedDevice:");
        com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = this.f136273e;
        sb6.append(sxVar.f135941w);
        sb6.append(", isFromClick=");
        sb6.append(this.f136274f);
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", sb6.toString());
        if (kotlin.jvm.internal.o.b(hVar, sxVar.f135941w)) {
            if (hVar != null) {
                hVar.h();
                hVar.i();
                hVar.f452654h = null;
            }
            sxVar.f135941w = null;
            sxVar.f135942x = 0L;
            if (sxVar.h().getVisibility() == 0) {
                if (sxVar.S6().isEmpty()) {
                    sxVar.W6(0);
                } else {
                    sxVar.W6(2);
                    sxVar.L = 0;
                    jz5.n nVar = (jz5.n) sxVar.M;
                    ((com.tencent.mm.sdk.platformtools.b4) nVar.getValue()).d();
                    ((com.tencent.mm.sdk.platformtools.b4) nVar.getValue()).c(0L, 3000L);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
