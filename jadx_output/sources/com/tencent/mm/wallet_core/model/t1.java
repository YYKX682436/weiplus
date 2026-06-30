package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f213992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(yz5.a aVar) {
        super(1);
        this.f213992d = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.HashSet hashSet = com.tencent.mm.wallet_core.model.z1.f214042b;
        yz5.a aVar = this.f213992d;
        synchronized (hashSet) {
            com.tencent.mm.wallet_core.model.z1.f214043c.remove(aVar);
        }
        return jz5.f0.f302826a;
    }
}
