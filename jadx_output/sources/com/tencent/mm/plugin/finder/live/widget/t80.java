package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class t80 extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ga C;
    public final /* synthetic */ pk2.o9 D;
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(com.tencent.mm.plugin.finder.live.widget.ga gaVar, pk2.o9 o9Var, int i17) {
        super(0);
        this.C = gaVar;
        this.D = o9Var;
        this.E = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.o9 o9Var = this.D;
        if (o9Var == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveCoLiveInviteeMoreActionPanel", "invokeOption: helper is null, skip");
        } else {
            try {
                new pk2.c1(o9Var, this.E).A();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveCoLiveInviteeMoreActionPanel", th6, "invokeOption " + pk2.c1.class.getSimpleName() + " crashed", new java.lang.Object[0]);
            }
            com.tencent.mm.plugin.finder.live.widget.e0.t(this.C, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
