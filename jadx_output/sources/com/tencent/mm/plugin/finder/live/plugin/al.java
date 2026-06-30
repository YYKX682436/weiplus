package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class al extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f111903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f111903d = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            ((it2.x) ((rs5.f) i95.n0.c(rs5.f.class))).Ai();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f111903d.f112831r, th6, "preloadCustomGiftService failed.", new java.lang.Object[0]);
        }
        return jz5.f0.f302826a;
    }
}
