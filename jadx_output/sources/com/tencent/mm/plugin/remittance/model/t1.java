package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class t1 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f157025b = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f157024a = new java.lang.Object();

    public void a(java.lang.String str) {
        java.util.List b17 = b();
        java.util.ArrayList arrayList = (java.util.ArrayList) b17;
        arrayList.add(str);
        if (arrayList.size() > 50) {
            b17 = arrayList.subList(arrayList.size() - 50, arrayList.size());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = b17.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            sb6.append((java.lang.String) it.next());
            if (i17 != b17.size() - 1) {
                sb6.append(",");
            }
            i17++;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, sb6.toString());
    }

    public final java.util.List b() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String[] split = str.split(",");
            if (split.length > 0) {
                arrayList.addAll(java.util.Arrays.asList(split));
            }
        }
        return arrayList;
    }

    public boolean c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        boolean z17;
        ot0.q qVar;
        boolean D0;
        if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(str3) || android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceLocalMsgMgr", "msgxml or toUserName or antiRepeatid is null");
            return false;
        }
        synchronized (this) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) ? false : ((java.util.ArrayList) b()).contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLocalMsgMgr", "it is a duplicate msg");
                z17 = false;
            } else {
                a(str);
                z17 = true;
            }
        }
        if (!z17) {
            return false;
        }
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.d1(str2);
        f9Var.r1(2);
        f9Var.u1(str3);
        f9Var.e1(c01.w9.o(str3));
        f9Var.j1(1);
        f9Var.setType(419430449);
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        if (M9 < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceLocalMsgMgr", fp.k.c() + "insert msg failed :" + M9);
            java.util.ArrayList arrayList = (java.util.ArrayList) b();
            arrayList.remove(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                if (i17 != arrayList.size() - 1) {
                    sb6.append(",");
                }
                i17++;
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_REMITTANCE_PAYMSGID_STRING_SYNC, sb6.toString());
            return false;
        }
        f9Var.setMsgId(M9);
        if (f9Var.k2()) {
            v90.v vVar = (v90.v) i95.n0.c(v90.v.class);
            int a17 = ot0.u.a(f9Var);
            ((u90.a) vVar).getClass();
            com.tencent.mm.modelstat.e.f71505a.a(f9Var, a17);
        } else {
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).getClass();
            com.tencent.mm.modelstat.e.f71505a.b(f9Var);
        }
        ot0.t tVar = new ot0.t();
        tVar.field_xml = f9Var.j();
        if (str2 != null) {
            qVar = ot0.q.v(f9Var.U1());
            if (qVar != null) {
                tVar.field_title = qVar.f348654f;
                tVar.field_description = qVar.f348658g;
            }
        } else {
            qVar = null;
        }
        tVar.field_type = 2000;
        tVar.field_msgId = M9;
        tVar.field_msgTalker = f9Var.Q0();
        tVar.field_msgSvrId = f9Var.I0();
        ot0.t y07 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).y0(str3, M9);
        if (y07 == null || y07.field_msgId != M9) {
            D0 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).D0(tVar);
            if (!D0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceLocalMsgMgr", "PinOpenApi.getAppMessageStorage().insert msg failed id:" + M9);
            }
        } else {
            D0 = ((com.tencent.mm.pluginsdk.model.app.g0) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).Ai()).L0(tVar, new java.lang.String[0]);
        }
        if (qVar != null) {
            rw3.c cVar = new rw3.c();
            cVar.field_locaMsgId = f9Var.getMsgId();
            cVar.field_transferId = qVar.L0;
            cVar.field_receiveStatus = -1;
            cVar.field_isSend = true;
            cVar.field_talker = str3;
            cVar.field_receiverName = str4;
            kw3.p.Ai().Ni().replace(cVar);
        }
        return D0;
    }

    public boolean d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4 = (java.lang.String) this.f157025b.get(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            return c(str, str4, str2, str3);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.RemittanceLocalMsgMgr", "empty transid: %s", str);
        return false;
    }

    public boolean e(java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.j1(0);
        f9Var.r1(6);
        f9Var.u1(str);
        f9Var.d1(str2);
        if (j17 > 0) {
            f9Var.e1(j17);
        } else {
            f9Var.e1(c01.w9.o(str));
        }
        f9Var.setType(10000);
        long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLocalMsgMgr", "sendLocalSysMsg msgId:" + M9);
        return M9 >= 0;
    }
}
