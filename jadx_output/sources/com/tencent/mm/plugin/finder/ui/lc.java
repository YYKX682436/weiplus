package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class lc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostRouterUI f129470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129471e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI, java.lang.String str) {
        super(0);
        this.f129470d = finderPostRouterUI;
        this.f129471e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI = this.f129470d;
        if (!finderPostRouterUI.isFinishing() && !finderPostRouterUI.isDestroyed()) {
            finderPostRouterUI.finish();
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_CONTEXT_ID_STRING;
        java.lang.String str = this.f129471e;
        c17.x(u3Var, str);
        com.tencent.mm.plugin.finder.report.s0.f125339a = str;
        return jz5.f0.f302826a;
    }
}
