package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f180906b = true;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet_core.utils.i1 f180905a = new com.tencent.mm.plugin.wallet_core.utils.i1();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f180907c = new java.util.HashSet();

    /* JADX WARN: Removed duplicated region for block: B:53:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.wallet_core.utils.i1 r21, com.tencent.mm.storage.f9 r22, com.tencent.mm.plugin.wallet_core.utils.e1 r23) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.utils.i1.a(com.tencent.mm.plugin.wallet_core.utils.i1, com.tencent.mm.storage.f9, com.tencent.mm.plugin.wallet_core.utils.e1):void");
    }

    public final boolean b(com.tencent.mm.storage.f9 f9Var) {
        return (!(f9Var != null && f9Var.k2()) || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) || com.tencent.mm.sdk.platformtools.t8.K0(f9Var.Q0())) ? false : true;
    }

    public final boolean c(com.tencent.mm.storage.f9 f9Var) {
        if (kotlin.jvm.internal.o.b("gh_3dfda90e39d6", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b("gh_b4af18eac3d5", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b("gh_f0a92aa7146c", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        if (kotlin.jvm.internal.o.b("gh_e087bb5b95e6", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        com.tencent.mm.plugin.wallet_core.utils.d1[] d1VarArr = com.tencent.mm.plugin.wallet_core.utils.d1.f180867d;
        if (kotlin.jvm.internal.o.b("gh_f77aa7ace25f", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        com.tencent.mm.plugin.wallet_core.utils.d1[] d1VarArr2 = com.tencent.mm.plugin.wallet_core.utils.d1.f180867d;
        if (kotlin.jvm.internal.o.b("gh_2ab5b6aa7926", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        com.tencent.mm.plugin.wallet_core.utils.d1[] d1VarArr3 = com.tencent.mm.plugin.wallet_core.utils.d1.f180867d;
        if (kotlin.jvm.internal.o.b("gh_63cd0e2fbb0a", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        com.tencent.mm.plugin.wallet_core.utils.d1[] d1VarArr4 = com.tencent.mm.plugin.wallet_core.utils.d1.f180867d;
        if (kotlin.jvm.internal.o.b("gh_943c579390b7", f9Var != null ? f9Var.Q0() : null)) {
            return true;
        }
        com.tencent.mm.plugin.wallet_core.utils.d1[] d1VarArr5 = com.tencent.mm.plugin.wallet_core.utils.d1.f180867d;
        return kotlin.jvm.internal.o.b("gh_6efce7e1896f", f9Var != null ? f9Var.Q0() : null);
    }

    public final void d(java.util.List list, com.tencent.mm.plugin.wallet_core.utils.e1 reportType) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(reportType, "reportType");
        boolean z17 = false;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
                com.tencent.mm.plugin.wallet_core.utils.i1 i1Var = f180905a;
                if (i1Var.c(f9Var) || i1Var.b(f9Var)) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            z17 = true;
        }
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.wallet_core.utils.g1(arrayList, reportType), "WcPayMessageReporter-WxPluginMessage");
        }
    }
}
