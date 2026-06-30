package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.i f153047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.performance.watchdogs.i iVar) {
        super(0);
        this.f153047d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.matrix.util.PssInfo.f53113s.b().f53114d);
        long longValue = valueOf.longValue();
        com.tencent.mars.xlog.Log.i(this.f153047d.f153056c, "pss = " + longValue);
        return valueOf;
    }
}
