package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.ui.otherway.i0 f190963a = new com.tencent.mm.pluginsdk.ui.otherway.i0();

    public final void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "addUseRecord: " + str + ", " + str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        java.lang.Object obj = null;
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null);
        if (N == null) {
            return;
        }
        r45.qk5 qk5Var = new r45.qk5();
        byte[] j17 = N.j(str2);
        if (j17 != null) {
            qk5Var.parseFrom(j17);
        }
        java.util.LinkedList records = qk5Var.f384079d;
        kotlin.jvm.internal.o.f(records, "records");
        java.util.Iterator it = records.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((r45.gv6) next).f375555d, str)) {
                obj = next;
                break;
            }
        }
        r45.gv6 gv6Var = (r45.gv6) obj;
        if (gv6Var != null) {
            gv6Var.f375556e = c01.id.c();
        } else {
            r45.gv6 gv6Var2 = new r45.gv6();
            gv6Var2.f375555d = str;
            gv6Var2.f375556e = c01.id.c();
            records.add(gv6Var2);
        }
        N.H(str2, qk5Var.toByteArray());
        r45.j56 j56Var = new r45.j56();
        byte[] j18 = N.j("shortcut:" + str2);
        if (j18 != null) {
            j56Var.parseFrom(j18);
        }
        java.util.LinkedList linkedList = j56Var.f377596d;
        if (linkedList != null) {
            linkedList.remove(str);
            linkedList.add(0, str);
            while (linkedList.size() > 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "addShortCupApp remove: " + ((java.lang.String) linkedList.remove(linkedList.size() - 1)));
            }
        }
        N.H("shortcut:" + str2, j56Var.toByteArray());
    }

    public final r45.mk5 b(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 N;
        java.lang.Object m521constructorimpl;
        if (str == null || (N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null)) == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "getRecentExposedData: ".concat(str));
        byte[] j17 = N.j(str);
        if (j17 == null) {
            return null;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            r45.mk5 mk5Var = new r45.mk5();
            mk5Var.parseFrom(j17);
            m521constructorimpl = kotlin.Result.m521constructorimpl(mk5Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return (r45.mk5) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
    }
}
