package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f213998e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.String str, kotlinx.coroutines.q qVar) {
        super(0);
        this.f213997d = str;
        this.f213998e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17;
        com.tencent.mm.wallet_core.model.z1 z1Var = com.tencent.mm.wallet_core.model.z1.f214041a;
        java.lang.String str = this.f213997d;
        java.util.HashSet hashSet = com.tencent.mm.wallet_core.model.z1.f214042b;
        synchronized (hashSet) {
            if (hashSet.contains(str)) {
                z17 = false;
            } else {
                hashSet.add(str);
                z17 = true;
            }
        }
        if (z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) this.f213998e).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
