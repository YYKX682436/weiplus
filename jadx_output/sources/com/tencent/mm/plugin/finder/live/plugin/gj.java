package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(1);
        this.f112706d = hmVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            boolean z17 = this.f112706d.f112825J;
            this.f112706d.f112825J = false;
            if (z17) {
                this.f112706d.U1();
            }
        } else {
            this.f112706d.K0(8);
            com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112706d;
            hmVar.E1 = null;
            qo0.c.a(hmVar.f112827p, qo0.b.T1, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
