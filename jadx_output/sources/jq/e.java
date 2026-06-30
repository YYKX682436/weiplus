package jq;

/* loaded from: classes8.dex */
public class e implements qk.n7 {
    public void a(java.lang.String str, qk.h6 h6Var, r45.j4 j4Var, java.util.List list) {
        com.tencent.mm.modelbase.n0 a17;
        try {
            b(j4Var);
            r45.tp tpVar = h6Var.field_businessInfo;
            if (tpVar != null && (a17 = com.tencent.mm.modelbase.l0.a(tpVar.f386636d)) != null) {
                a17.b(h6Var.field_businessInfo);
            }
            com.tencent.mm.modelbase.m0 m0Var = new com.tencent.mm.modelbase.m0();
            m0Var.f70687a = h6Var.field_businessInfo;
            m0Var.f70688b = h6Var.field_functionmsgid;
            long j17 = h6Var.field_actionTime;
            if (j17 == 0) {
                j17 = c01.id.a() / 1000;
            }
            j4Var.f377565o = (int) j17;
            h6Var.field_status = 100;
            h6Var.field_addMsg = j4Var;
            com.tencent.mm.storage.x7.f196331d.z0(str, h6Var);
            com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] item:%s CreateTime:%s", h6Var, java.lang.Integer.valueOf(j4Var.f377565o));
            if (list == null || list.size() <= 0) {
                com.tencent.mm.modelbase.t0 a18 = com.tencent.mm.modelbase.s0.a(java.lang.Integer.valueOf(j4Var.f377560g));
                if (a18 != null) {
                    a18.b1(new com.tencent.mm.modelbase.p0(j4Var, true, (java.lang.Object) m0Var));
                    return;
                }
                return;
            }
            com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgAdd] addMsgList.size:%s ", java.lang.Integer.valueOf(list.size()));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.j4 j4Var2 = (r45.j4) it.next();
                if (j4Var2.f377565o <= 0) {
                    long j18 = h6Var.field_actionTime;
                    if (j18 == 0) {
                        j18 = c01.id.a() / 1000;
                    }
                    j4Var2.f377565o = (int) j18;
                }
                com.tencent.mm.modelbase.s0.a(java.lang.Integer.valueOf(j4Var2.f377560g)).b1(new com.tencent.mm.modelbase.p0(j4Var2, true, (java.lang.Object) m0Var));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", e17, "", new java.lang.Object[0]);
        }
    }

    public r45.j4 b(r45.j4 j4Var) {
        if (j4Var == null) {
            return null;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = j4Var.f377558e;
        objArr[1] = java.lang.Integer.valueOf(j4Var.f377560g);
        objArr[2] = java.lang.Boolean.valueOf(j4Var.f377561h == null);
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgDispatcher", "processAddMsg, fromUser: %s, msgType: %s, content==null: %s", objArr);
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (g17 == null) {
            g17 = "";
        }
        if ("readerapp".equals(g17)) {
            j4Var.f377558e = x51.j1.i("newsapp");
            j4Var.f377560g = 12399999;
        }
        if (!"blogapp".equals(g17) && !"newsapp".equals(g17)) {
            return j4Var;
        }
        j4Var.f377560g = 12399999;
        return j4Var;
    }
}
