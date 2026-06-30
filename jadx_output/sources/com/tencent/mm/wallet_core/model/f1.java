package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f213893a = "";

    /* renamed from: b, reason: collision with root package name */
    public static long f213894b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f213895c = "";

    public static java.lang.String a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f213893a) || z65.c.a()) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = f213895c;
            objArr[1] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.H1(f213894b) > 300);
            objArr[2] = java.lang.Long.valueOf(f213894b);
            com.tencent.mars.xlog.Log.i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", objArr);
        }
        return f213893a;
    }

    public static void b(java.lang.String str) {
        f213893a = str;
        f213894b = java.lang.System.currentTimeMillis() / 1000;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f213895c = com.tencent.mm.sdk.platformtools.z3.b(true);
    }
}
