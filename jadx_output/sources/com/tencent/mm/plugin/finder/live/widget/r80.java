package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class r80 extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.s80 C;
    public final /* synthetic */ pk2.o9 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r80(com.tencent.mm.plugin.finder.live.widget.s80 s80Var, pk2.o9 o9Var) {
        super(0);
        this.C = s80Var;
        this.D = o9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            new pk2.j6(this.D, 3).A();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderLiveAssistantMoreActionPanel", th6, "invokeOption " + pk2.j6.class.getSimpleName() + " crashed", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.finder.live.widget.e0.t(this.C, false, 1, null);
        return jz5.f0.f302826a;
    }
}
