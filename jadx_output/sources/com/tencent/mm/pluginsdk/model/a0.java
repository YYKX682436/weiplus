package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class a0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.a0 f188778d = new com.tencent.mm.pluginsdk.model.a0();

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        java.lang.String userName = com.tencent.mm.pluginsdk.model.b0.g();
        if (!(userName == null || r26.n0.N(userName))) {
            com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
            if (com.tencent.mm.storage.a1.f193731p) {
                com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
                kotlin.jvm.internal.o.g(userName, "userName");
                kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.pluginsdk.model.m(userName, null), 2, null);
                return true;
            }
        }
        com.tencent.mm.pluginsdk.model.b0.f189197a.E();
        return true;
    }
}
