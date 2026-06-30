package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class y70 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a80 f115162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(com.tencent.mm.plugin.finder.live.plugin.a80 a80Var) {
        super(5);
        this.f115162d = a80Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f115162d.f111830q, "close live result:" + booleanValue);
        return jz5.f0.f302826a;
    }
}
