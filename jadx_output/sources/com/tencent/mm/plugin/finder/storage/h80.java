package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class h80 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.k80 f126878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(com.tencent.mm.plugin.finder.storage.k80 k80Var) {
        super(1);
        this.f126878d = k80Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.xb1 it = (r45.xb1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("FinderConfigInitExptData", com.tencent.mm.plugin.finder.storage.k80.a(this.f126878d, "before callback config "));
        java.util.concurrent.ConcurrentHashMap c17 = this.f126878d.c();
        com.tencent.mm.plugin.finder.storage.k80 k80Var = this.f126878d;
        synchronized (c17) {
            for (java.util.Map.Entry entry : c17.entrySet()) {
                k80Var.d(((com.tencent.mm.plugin.finder.storage.g80) entry.getValue()).f126815a, ((com.tencent.mm.plugin.finder.storage.g80) entry.getValue()).f126816b, ((com.tencent.mm.plugin.finder.storage.g80) entry.getValue()).f126817c);
                com.tencent.mars.xlog.Log.i("FinderConfigInitExptData", com.tencent.mm.plugin.finder.storage.k80.a(k80Var, "after callback config "));
            }
        }
        return jz5.f0.f302826a;
    }
}
