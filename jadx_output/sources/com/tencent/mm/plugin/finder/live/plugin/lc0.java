package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class lc0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f113382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        super(1);
        this.f113382d = nd0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "#followAnchor-withBiz result=" + ((java.lang.Boolean) obj).booleanValue());
        this.f113382d.u1();
        return jz5.f0.f302826a;
    }
}
