package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public final class v9 {
    public v9(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012b A[LOOP:0: B:17:0x0123->B:19:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0145 A[EDGE_INSN: B:20:0x0145->B:21:0x0145 BREAK  A[LOOP:0: B:17:0x0123->B:19:0x012b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014f A[LOOP:1: B:22:0x0149->B:24:0x014f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.storage.v9.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.tencent.wechat.mm.biz.m1 b(rv.e eVar, nm5.b bVar, rv.n3 n3Var) {
        int i17;
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        com.tencent.wechat.mm.biz.m1 m1Var = new com.tencent.wechat.mm.biz.m1();
        boolean k47 = com.tencent.mm.storage.z3.k4(eVar.f399840a.h1());
        int i18 = 2;
        com.tencent.mm.storage.l4 l4Var = eVar.f399840a;
        if (k47) {
            com.tencent.mm.storage.s9[] s9VarArr = com.tencent.mm.storage.s9.f195315d;
            i17 = 2;
        } else if (l4Var.h1().equals("filehelper")) {
            com.tencent.mm.storage.s9[] s9VarArr2 = com.tencent.mm.storage.s9.f195315d;
            i17 = 1;
        } else {
            if (l4Var.h1().equals("notification_messages")) {
                com.tencent.mm.storage.s9[] s9VarArr3 = com.tencent.mm.storage.s9.f195315d;
            } else if (l4Var.h1().equals("schedule_message")) {
                com.tencent.mm.storage.s9[] s9VarArr4 = com.tencent.mm.storage.s9.f195315d;
            } else if (l4Var.h1().equals("appbrandcustomerservicemsg")) {
                com.tencent.mm.storage.s9[] s9VarArr5 = com.tencent.mm.storage.s9.f195315d;
                i17 = 6;
            } else if (l4Var.h1().equals("appbrand_notify_message")) {
                com.tencent.mm.storage.s9[] s9VarArr6 = com.tencent.mm.storage.s9.f195315d;
                i17 = 7;
            } else if (l4Var.h1().equals("opencustomerservicemsg")) {
                com.tencent.mm.storage.s9[] s9VarArr7 = com.tencent.mm.storage.s9.f195315d;
                i17 = 8;
            } else if (com.tencent.mm.storage.z3.N3(l4Var.h1())) {
                com.tencent.mm.storage.s9[] s9VarArr8 = com.tencent.mm.storage.s9.f195315d;
                i17 = 9;
            } else if (l4Var.h1().equals("gh_25d9ac85a4bc")) {
                com.tencent.mm.storage.s9[] s9VarArr9 = com.tencent.mm.storage.s9.f195315d;
                i17 = 10;
            } else if (l4Var.h1().equals("service_officialaccounts")) {
                com.tencent.mm.storage.s9[] s9VarArr10 = com.tencent.mm.storage.s9.f195315d;
                i17 = 11;
            } else if (com.tencent.mm.storage.z3.R4(l4Var.h1())) {
                com.tencent.mm.storage.s9[] s9VarArr11 = com.tencent.mm.storage.s9.f195315d;
                i17 = 102;
            } else if (((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi().n(l4Var.h1(), true).m2()) {
                com.tencent.mm.storage.s9[] s9VarArr12 = com.tencent.mm.storage.s9.f195315d;
                i17 = 103;
            } else {
                com.tencent.mm.storage.s9[] s9VarArr13 = com.tencent.mm.storage.s9.f195315d;
                i17 = 101;
            }
            i17 = 3;
        }
        m1Var.f218313d = i17;
        boolean[] zArr = m1Var.f218319m;
        zArr[1] = true;
        m1Var.f218314e = l4Var.g2() ? 1 : 0;
        zArr[2] = true;
        m1Var.f218315f = (int) (l4Var.w0() / 1000);
        zArr[3] = true;
        int i19 = eVar.f399841b;
        m1Var.f218316g = i19;
        zArr[4] = true;
        if (n3Var == rv.n3.f399885e) {
            i18 = 1;
        } else if (n3Var != rv.n3.f399886f) {
            i18 = 0;
        }
        m1Var.f218317h = i18;
        zArr[5] = true;
        m1Var.f218318i = 0;
        zArr[6] = true;
        java.lang.Object a17 = bVar.a(0);
        kotlin.jvm.internal.o.f(a17, "$1(...)");
        int intValue = ((java.lang.Number) a17).intValue();
        java.lang.Object a18 = bVar.a(1);
        kotlin.jvm.internal.o.f(a18, "$2(...)");
        if ((intValue <= i19 && i19 <= ((java.lang.Number) a18).intValue()) == true) {
            m1Var.f218318i = 1;
            zArr[6] = true;
        } else {
            m1Var.f218318i = 0;
            zArr[6] = true;
        }
        return m1Var;
    }
}
