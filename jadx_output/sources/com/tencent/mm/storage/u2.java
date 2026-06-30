package com.tencent.mm.storage;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.storage.u2 f195353a = new com.tencent.mm.storage.u2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f195354b = jz5.h.b(com.tencent.mm.storage.t2.f195323d);

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("BizProcessSharedMMKV_");
        sb6.append(gm0.j1.a() ? gm0.j1.b().h() : ((java.lang.Number) ((jz5.n) f195354b).getValue()).intValue());
        return com.tencent.mm.sdk.platformtools.o4.M(sb6.toString());
    }
}
