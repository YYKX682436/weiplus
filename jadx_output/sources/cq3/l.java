package cq3;

/* loaded from: classes4.dex */
public final class l implements vg3.r4 {
    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PocketMoneyNewXMLListener", "will insert sysmsg from:" + str);
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null) {
                return;
            }
            if (str2.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.PocketMoneyNewXMLListener", "content null, cannot to insert sysmsg!");
                return;
            }
            java.lang.String c17 = c(c(str2, str), str3);
            com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(0);
            f9Var.u1(str);
            f9Var.r1(6);
            f9Var.d1(c17);
            f9Var.e1(c01.w9.m(str, java.lang.System.currentTimeMillis() / 1000));
            f9Var.setType(10000);
            f9Var.f1(f9Var.w0() | 8);
            long M9 = cj6.M9(f9Var);
            if (M9 <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PocketMoneyNewXMLListener", "failed to insert sysmsg");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PocketMoneyNewXMLListener", "sysmsg inserted: " + M9);
        }
    }

    public final java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        if ((str2.length() > 0 ? str2 : null) == null) {
            return str;
        }
        java.lang.String str3 = "$" + str2 + '$';
        java.lang.String x17 = com.tencent.mm.wallet_core.ui.r1.x(str2);
        kotlin.jvm.internal.o.f(x17, "getDisplayName(...)");
        return r26.i0.t(str, str3, x17, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    @Override // vg3.r4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(java.lang.String r10, java.util.Map r11, com.tencent.mm.modelbase.p0 r12) {
        /*
            r9 = this;
            if (r11 == 0) goto Lcf
            java.lang.String r10 = ".sysmsg.paymsg.PayMsgType"
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Lcf
            java.lang.Integer r10 = r26.h0.h(r10)
            if (r10 == 0) goto Lcf
            int r12 = r10.intValue()
            r0 = 52
            r1 = 1
            r2 = 0
            if (r12 != r0) goto L1e
            r12 = r1
            goto L1f
        L1e:
            r12 = r2
        L1f:
            r0 = 0
            if (r12 == 0) goto L23
            goto L24
        L23:
            r10 = r0
        L24:
            if (r10 == 0) goto Lcf
            r10.intValue()
            java.lang.String r10 = ".sysmsg.paymsg.systip"
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r12 = "MicroMsg.PocketMoneyNewXMLListener"
            if (r10 == 0) goto L46
            int r3 = r10.length()
            if (r3 != 0) goto L3d
            r3 = r1
            goto L3e
        L3d:
            r3 = r2
        L3e:
            if (r3 == 0) goto L41
            goto L46
        L41:
            java.lang.String r10 = java.net.URLDecoder.decode(r10)
            goto L4c
        L46:
            java.lang.String r10 = "MSG_TYPE_POCKET_MONEY requires sysmsg.paymsg.systip!"
            com.tencent.mars.xlog.Log.e(r12, r10)
            r10 = r0
        L4c:
            if (r10 != 0) goto L4f
            return
        L4f:
            java.lang.String r3 = ".sysmsg.paymsg.paymsgid"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            if (r3 == 0) goto L8f
            int r6 = r3.length()
            if (r6 != 0) goto L62
            goto L63
        L62:
            r1 = r2
        L63:
            if (r1 == 0) goto L66
            goto L8f
        L66:
            dq3.a r1 = new dq3.a
            r1.<init>()
            r1.field_payMsgId = r3
            java.lang.Class<bq3.l> r3 = bq3.l.class
            i95.m r3 = i95.n0.c(r3)
            java.lang.String r6 = "getService(...)"
            kotlin.jvm.internal.o.f(r3, r6)
            bq3.l r3 = (bq3.l) r3
            java.lang.String[] r2 = new java.lang.String[r2]
            dq3.b r3 = r3.f23581d
            r3.get(r1, r2)
            long r2 = r1.field_msgId
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L8d
            java.lang.String r1 = "failed to find pocket money record, discard sysmsg inserting"
            com.tencent.mars.xlog.Log.e(r12, r1)
            goto L94
        L8d:
            r0 = r1
            goto L94
        L8f:
            java.lang.String r1 = "MSG_TYPE_POCKET_MONEY requires sysmsg.paymsg.paymsgid!"
            com.tencent.mars.xlog.Log.e(r12, r1)
        L94:
            if (r0 != 0) goto L97
            return
        L97:
            java.lang.String r1 = ".sysmsg.paymsg.fromusername"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ".sysmsg.paymsg.tousername"
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            boolean r2 = c01.z1.J(r1)
            if (r2 == 0) goto Laf
            r3 = r11
            goto Lb0
        Laf:
            r3 = r1
        Lb0:
            pt0.e0 r6 = pt0.f0.f358209b1
            long r7 = r0.field_msgId
            com.tencent.mm.storage.f9 r0 = r6.n(r3, r7)
            long r6 = r0.getMsgId()
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto Lc6
            java.lang.String r10 = "failed to find pocket money bubble msg, discard sysmsg inserting"
            com.tencent.mars.xlog.Log.e(r12, r10)
            return
        Lc6:
            if (r2 == 0) goto Lcc
            r9.b(r3, r10, r1)
            goto Lcf
        Lcc:
            r9.b(r3, r10, r11)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cq3.l.h0(java.lang.String, java.util.Map, com.tencent.mm.modelbase.p0):void");
    }
}
