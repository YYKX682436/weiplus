package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.watchdogs.i f153039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.performance.watchdogs.i iVar) {
        super(0);
        this.f153039d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.matrix.util.StatusInfo.f53126o.a(android.os.Process.myPid()).f53130g);
        long longValue = valueOf.longValue();
        com.tencent.mars.xlog.Log.i(this.f153039d.f153056c, "rss = " + longValue);
        return valueOf;
    }
}
