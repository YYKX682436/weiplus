package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class yy extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.dz f120484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(com.tencent.mm.plugin.finder.live.widget.dz dzVar) {
        super(1);
        this.f120484d = dzVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.widget.dz dzVar = this.f120484d;
        dzVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dzVar.f118175n = currentTimeMillis;
        dk2.xf xfVar = dzVar.f118179r;
        if (xfVar != null) {
            ((dk2.r4) xfVar).T(currentTimeMillis, new com.tencent.mm.plugin.finder.live.widget.cz(dzVar));
        }
        return jz5.f0.f302826a;
    }
}
